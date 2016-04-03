package services;

import models.Users;

import java.util.List;

public interface UsersService  {

    Users addUsers(Users users);
    void deleteUsers(int id);
    Users getByName(String name);
    Users editUsers(Users users);
    List<Users> getAll();
}
