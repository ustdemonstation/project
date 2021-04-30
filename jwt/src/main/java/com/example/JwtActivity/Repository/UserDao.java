package com.example.JwtActivity.Repository;

import com.example.JwtActivity.Model.DaoUser;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<DaoUser,Integer>
{
    DaoUser findByEmail(String email);
}
