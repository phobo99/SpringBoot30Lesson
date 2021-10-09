package vn.techmaster.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.techmaster.security.model.CustomUserDetail;
import vn.techmaster.security.model.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findUserByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException("Ko tim thay user");
        }
        return new CustomUserDetail(user);
    }

    @Autowired
    private UserService userService;
}
