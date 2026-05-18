package com.xuanthinhdev.XuanThinhHotel.service;

import com.xuanthinhdev.XuanThinhHotel.exception.OurException;
import com.xuanthinhdev.XuanThinhHotel.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class CustomerUserDetailsService implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow(()-> new OurException("Username/email not found"));
    }
}
