package com.rikkei.ss11.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<ValidPhone, String> {

    private static final String PHONE_PATTERN = "^0\\d{9}$";

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext context) {
        if (phone == null || phone.trim().isEmpty()) {
            return false;
        }
        return phone.matches(PHONE_PATTERN);
    }
}
