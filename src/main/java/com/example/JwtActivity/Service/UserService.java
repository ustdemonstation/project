package com.example.JwtActivity.Service;

import com.example.JwtActivity.Model.DaoUser;

import java.util.List;

public interface UserService
{
    DaoUser addUser(DaoUser daoUser);
    public List<DaoUser> getAllUsers();
    public DaoUser updateUser(DaoUser daoUser);
    public void deleteUser(int id);
}
