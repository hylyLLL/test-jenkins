//package com.oschina.testjenkins.aspect;
//
//import com.oschina.TableB;
//import com.oschina.TableBMapper;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.BeanPropertyBindingResult;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 日志切面
// *
// * @Auther: king.zhang(张义)
// * @Date: 2018/12/13 17:32
// * @Description:
// */
//@Aspect
//@Component
//public class LogAopAspect {
//    private Logger logger = LoggerFactory.getLogger(LogAopAspect.class);
//
//
//    //配置接入点,如果不知道怎么配置,可以百度一下规则
//    @Pointcut(value = "@annotation(com.oschina.testjenkins.aspect.SystemLog)")
//    private void cutService() {
//        logger.info("log记录------------------------");
//    }
//
//    @Autowired
//    private TableBMapper tableBMapper;
//
//    //定义一个切入点
//    @Around("cutService()")
//    public Object recordSysLog(ProceedingJoinPoint point) throws Throwable {
//        logger.info("进入环绕通知------------------------------");
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//
//        String platformKey = request.getRequestURI().replaceFirst("/", "");
//        int position = platformKey.indexOf("/");
//        position = position <= 0 ? 0 : position;
//        platformKey = platformKey.substring(0, position);
//
//        // 拦截的实体类，就是当前正在执行的controller
//        Object target = point.getTarget();
//        // 拦截的方法名称。当前正在执行的方法
//        String methodName = point.getSignature().getName();
//        // 拦截的方法参数
//        if (!request.getRequestURI().contains("login")) {
//            List<Object> newArg = new ArrayList<>();
//            for (Object arg : point.getArgs()) {
//                if (arg instanceof BeanPropertyBindingResult || arg instanceof HttpServletResponse) {
//                    continue;
//                }
//                newArg.add(arg);
//            }
//        }
//        Signature sig = point.getSignature();
//        MethodSignature msig = null;
//        if (!(sig instanceof MethodSignature)) {
//            throw new IllegalArgumentException("该注解只能用于方法");
//        }
//        msig = (MethodSignature) sig;
//        Class[] parameterTypes = msig.getMethod().getParameterTypes();
//        Object object = null;
//        // 获得被拦截的方法
//        Method method = null;
//        try {
//            method = target.getClass().getMethod(methodName, parameterTypes);
//        } catch (NoSuchMethodException | SecurityException e1) {
//            e1.printStackTrace();
//        }
//        if (null != method) {
//            SystemLog systemlog = method.getAnnotation(SystemLog.class);
//            try {
//                object = point.proceed();
//            } catch (Throwable throwable) {
//                String message = throwable.getMessage();
//                System.out.println("发生异常");
//                TableB tableB = new TableB();
//                tableB.setB("异常后");
//                tableBMapper.insert(tableB);
//                throw throwable;
//            }
//        } else {
//            object = point.proceed();
//        }
//         logger.info("退出方法{}--------------------", request.getRequestURI());
//        return object;
//    }
//}
