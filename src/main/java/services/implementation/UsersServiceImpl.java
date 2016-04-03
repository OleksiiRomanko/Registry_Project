package services.implementation;

import models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UsersRepository;
import services.UsersService;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public Users addUsers(Users users) {

        Users savedUser = usersRepository.saveAndFlush(users);
        return savedUser;
    }

    @Override
    public void deleteUsers(int id) {
        usersRepository.delete(id);
    }

    @Override
    public Users getByName(String name) {
        return usersRepository.findByName(name);
    }

    @Override
    public Users editUsers(Users users) {
        return usersRepository.saveAndFlush(users);
    }

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }
}
