package com.libray.mng.services;

import com.libray.mng.model.Users;
import com.libray.mng.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> users= usersRepository.findByUsername(username);
        users.orElseThrow(()->new UsernameNotFoundException("Not Found:"+ username));
        return users.map(MyUserDetails::new).get();
    }
}
