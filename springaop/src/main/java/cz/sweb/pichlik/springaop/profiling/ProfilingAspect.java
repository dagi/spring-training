package cz.sweb.pichlik.springaop.profiling;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ProfilingAspect {

    @Around("execution(* cz.sweb.pichlik.springaop.dao.UserStorageDao.*(..))")
    public Object tracingMethod(ProceedingJoinPoint call) throws Throwable{
        long start = System.nanoTime();
        try{
            return call.proceed();
        }finally{
            long time = System.nanoTime() - start;
            System.out.println("Invocation time:"+ time + "ns");
        }
    }
}
