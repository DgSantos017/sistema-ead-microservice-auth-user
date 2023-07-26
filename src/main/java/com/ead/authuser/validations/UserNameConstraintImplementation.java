package com.ead.authuser.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameConstraintImplementation implements ConstraintValidator<UserNameConstraint, String> {

    @Override
    public void initialize(UserNameConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        if(username == null || username.trim().isEmpty() || username.contains(" ")){
            return false;
        }
        return true;
    }
}
