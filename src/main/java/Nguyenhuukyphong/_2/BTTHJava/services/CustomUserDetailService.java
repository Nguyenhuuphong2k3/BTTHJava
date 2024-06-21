package Nguyenhuukyphong._2.BTTHJava.services;



import Nguyenhuukyphong._2.BTTHJava.entity.CustomUserDetails;
import Nguyenhuukyphong._2.BTTHJava.entity.User;
import Nguyenhuukyphong._2.BTTHJava.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user, userRepository);
    }
}

