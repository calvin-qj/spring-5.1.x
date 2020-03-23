package org.springframework.calculate;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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


	@Around(value = "pointCut()")
	public void methodAround(JoinPoint joinPoint){
		try {
			String name = joinPoint.getSignature().getName();
			((ProceedingJoinPoint) joinPoint).proceed();
			System.out.println("目标执行方法【"+name+"】的 环绕 通知");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}

	@After(value = "pointCut()")
	public void methodAfter(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("目标执行方法【"+name+"】的 后置 通知");
	}

	@AfterReturning(value = "pointCut()")
	public void methodReturn(JoinPoint joinPoint ){
		String name = joinPoint.getSignature().getName();
		System.out.println("目标执行方法【"+name+"】的 返回 通知");
	}

	@AfterThrowing(value = "pointCut()" ,throwing = "ex")
	public void methodThrow(JoinPoint joinPoint,Exception ex){
		String name = joinPoint.getSignature().getName();
		System.out.println("目标执行方法【"+name+"】的 异常 通知");
	}
}
