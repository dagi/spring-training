package cz.sweb.pichlik.springaop.profiling;

import org.aspectj.lang.ProceedingJoinPoint;


/**
 * Pointcut and advice type are declared in XML see <code>META-INF/profilingContext-springdef.xml</code>
 */
public class ProfilingAspectBean {

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
