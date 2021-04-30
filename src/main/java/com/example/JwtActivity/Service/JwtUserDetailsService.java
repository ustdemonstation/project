package com.example.JwtActivity.Service;

import com.example.JwtActivity.Model.DaoUser;
import com.example.JwtActivity.Model.UserDto;
import com.example.JwtActivity.Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService
{
    @Autowired
    private UserDao userDao;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        DaoUser user= userDao.findByEmail(email);
        if(user==null)
        {
            throw new UsernameNotFoundException("user not found" +email);
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),new ArrayList<>());
    }
    public DaoUser save(UserDto userDto)
    {
        DaoUser newUser=new DaoUser();
        newUser.setEmail(userDto.getEmail());
        newUser.setFirstName(userDto.getFirstName());
        newUser.setLastName(userDto.getLastName());
        newUser.setAge(userDto.getAge());
        newUser.setPhoneNumber(userDto.getPhoneNumber());
        newUser.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userDao.save(newUser);
    }
}
