package org.springframework.calculate;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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

	@After(value = "pointCut()")
	public void methodAfter(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("目标执行方法【"+name+"】的 后置 通知");
	}

	@AfterReturning(value = "pointCut()",returning = "result")
	public void methodAfter(JoinPoint joinPoint ,Object result){
		String name = joinPoint.getSignature().getName();
		System.out.println("目标执行方法【"+name+"】的 返回 通知");
	}

	@AfterThrowing(value = "pointCut()" ,throwing = "ex")
	public void methodThrow(JoinPoint joinPoint,Exception ex){
		String name = joinPoint.getSignature().getName();
		System.out.println("目标执行方法【"+name+"】的 异常 通知");
	}
}
