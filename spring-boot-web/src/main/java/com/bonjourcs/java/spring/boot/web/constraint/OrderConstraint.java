package com.bonjourcs.java.spring.boot.web.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/26
 */
@Constraint(validatedBy = {OrderConstraintValidator.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface OrderConstraint {

    String message() default "";

    String pattern() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
