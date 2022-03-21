package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
	private Logger log = LoggerFactory.getLogger(AspectConfig.class);

	@Pointcut("execution(* com.aop.aspect.*.*(..))")
	public void statePointCut() {
		// Empty
	}

	@Pointcut("execution(* com.aop.aspect.*.get*(..))")
	public void getStatePointCut() {
		// Empty
	}

	@Pointcut("execution(* com.aop.aspect.*.set*(..))")
	public void setStatePointCut() {
		// Empty
	}

	@Before(value = "execution(* com.aop.aspect.*.*(..))")
	public void logStatementBefore(JoinPoint joinPoint) {
		log.info("Executing {}", joinPoint);
	}

	@Before("statePointCut()")
	public void beforeMethod(JoinPoint joinPoint) {

		System.err.println("test ....");
//		// Method Information
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		log.info("Signature {}", signature);

	}
}
