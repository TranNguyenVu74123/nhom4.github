package com.bookstore.validator

import com.bookstore.entity.User
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class ValidUserIdValidator : ConstraintValidator<ValidUserId?, User?> {
    override fun isValid(user: User?, constraintValidatorContext: ConstraintValidatorContext): Boolean {
        if (user == null) {
            return true
        }
        return user.id != 0L
    }
}
