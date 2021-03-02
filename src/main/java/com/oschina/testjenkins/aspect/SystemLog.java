package com.oschina.testjenkins.aspect;

/**
 * 系统日志注解
 *
 * @Auther: king.zhang(张义)
 * @Date: 2018/12/13 17:39
 * @Description:
 */


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {
    String module() default "";

    String methods() default "";

    LogType logType();//日志类型,0操作日志,1登录日志

    OperateType operateType();//操作类型,0:查询,1:添加,2:修改,3:删除,4:导出
}
