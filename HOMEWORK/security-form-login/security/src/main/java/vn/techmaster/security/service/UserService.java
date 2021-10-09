package vn.techmaster.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.techmaster.security.model.User;
import vn.techmaster.security.repository.UserRepo;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public void createUser(User user) {
        userRepo.save(user);
    }

    public User findUserByEmail(String email){
        return userRepo.findByEmail(email);
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }
}
