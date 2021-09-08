package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repository.IUserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
//UserDetailsService-> security
public class UserService implements IUserService, UserDetailsService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public ArrayList<User> findAll() {
        return (ArrayList<User>) iUserRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return iUserRepository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return iUserRepository.save(user);
    }

    @Override
    public void remove(User user) {
        iUserRepository.delete(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = iUserRepository.findByName(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(user.getRole());

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                user.getName(),
                user.getPassWord(),
                authorities
        );

        return userDetails;
    }
}
