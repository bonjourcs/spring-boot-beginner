package com.bonjourcs.java.spring.boot.web.constraint;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/26
 */
public class OrderConstraintValidator implements ConstraintValidator<OrderConstraint, String> {

    private Pattern pattern = null;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if (!StringUtils.isEmpty(s)) {
            return pattern.matcher(s).matches();
        }

        return true;
    }

    @Override
    public void initialize(OrderConstraint constraintAnnotation) {

        String regexp = constraintAnnotation.pattern();
        if (!StringUtils.isEmpty(regexp)) {
            pattern = Pattern.compile(regexp);
        }

    }

}
