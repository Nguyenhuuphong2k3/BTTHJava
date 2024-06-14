package Nguyenhuukyphong._2.BTTHJava.validator;

import Nguyenhuukyphong._2.BTTHJava.repository.IUserRepository;
import Nguyenhuukyphong._2.BTTHJava.validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (username == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}
