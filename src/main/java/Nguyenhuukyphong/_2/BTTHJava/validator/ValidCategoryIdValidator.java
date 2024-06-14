package Nguyenhuukyphong._2.BTTHJava.validator;

import Nguyenhuukyphong._2.BTTHJava.entity.Category;
import Nguyenhuukyphong._2.BTTHJava.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}
