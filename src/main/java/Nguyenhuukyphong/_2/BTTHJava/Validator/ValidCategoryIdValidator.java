package Nguyenhuukyphong._2.BTTHJava.Validator;


import Nguyenhuukyphong._2.BTTHJava.Validator.annotation.ValidCategoryId;
import Nguyenhuukyphong._2.BTTHJava.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null ;
    }
}
