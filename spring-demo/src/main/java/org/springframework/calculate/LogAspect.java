package org.springframework.calculate;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspect {

	@Pointcut("execution(* org.springframework.calculate.CalculateService.*(..))")
	public void pointCut(){}

	@Before(value = "pointCut()")
	public void methodBefore(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("目标执行方法【"+name+"】的 前置 通知");
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
}
