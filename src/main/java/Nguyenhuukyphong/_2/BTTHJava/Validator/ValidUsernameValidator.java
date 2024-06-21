package Nguyenhuukyphong._2.BTTHJava.Validator;


import Nguyenhuukyphong._2.BTTHJava.Validator.annotation.ValidUsername;
import Nguyenhuukyphong._2.BTTHJava.repository.IUserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void initialize(ValidUsername constraintAnnotation) {
        // Initialization logic if needed
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (userRepository == null) {
            return true;
        }
        return userRepository.findByUsername(username) == null;
    }
}
