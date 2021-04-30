package com.example.JwtActivity.Service;

import com.example.JwtActivity.Model.DaoUser;
import com.example.JwtActivity.Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    private UserDao repository;
    @Autowired
    public UserServiceImpl(UserDao repository) {
        this.repository = repository;
    }


    @Override
    public DaoUser addUser(DaoUser daoUser) {
        return repository.save(daoUser);
    }

    @Override
    public List<DaoUser> getAllUsers() {
        return(List<DaoUser>) repository.findAll();
    }

    @Override
    public DaoUser updateUser(DaoUser daoUser) {
        return repository.save(daoUser);
    }

    @Override
    public void deleteUser(int id) {
     repository.deleteById(id);
    }
}
