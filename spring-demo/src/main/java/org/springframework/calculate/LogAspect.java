package org.springframework.calculate;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

	@Pointcut("execution(* org.springframework.calculate.CalculateService.*(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		System.out.println("出发开始,参数是："+ Arrays.asList(args));
	}
	@After("pointCut()")
	public void logEnd(JoinPoint joinPoint){
		System.out.println("出发结束");
	}

	@AfterReturning(value = "pointCut()" ,returning = "result")
	public void logReturn(JoinPoint joinPoint,Object result){
		System.out.println("返回正常，返回结果："+result);
	}

	@AfterThrowing(value = "pointCut()" ,throwing = "e")
	public void logException(JoinPoint joinPoint,Exception e){
		System.out.println("返回一场,一场信息="+e.getMessage());
	}
}
