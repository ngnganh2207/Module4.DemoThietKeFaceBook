package service;

import model.User;

import java.util.ArrayList;

public interface IUserService {
    ArrayList<User> findAll();
    User findById(int id);
    User save(User user);
    void remove(User user);
}
