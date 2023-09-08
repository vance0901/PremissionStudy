package com.vance.premissionstudy.permission.annotation;

import com.vance.premissionstudy.permission.MyPermissionActivity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限拒绝注解
 */
@Target(ElementType.METHOD)  // 方法上
@Retention(RetentionPolicy.RUNTIME) // 运行时
public @interface PermissionDenied {

    int requestCode() default MyPermissionActivity.PARAM_PERMSSION_CODE_DEFAULT;

}
