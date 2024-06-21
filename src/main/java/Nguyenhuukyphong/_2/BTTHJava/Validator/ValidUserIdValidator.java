package Nguyenhuukyphong._2.BTTHJava.Validator;


import Nguyenhuukyphong._2.BTTHJava.Validator.annotation.ValidUserId;
import Nguyenhuukyphong._2.BTTHJava.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
