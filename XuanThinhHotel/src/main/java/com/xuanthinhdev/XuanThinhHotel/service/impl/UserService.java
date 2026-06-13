package com.xuanthinhdev.XuanThinhHotel.service.impl;

import com.xuanthinhdev.XuanThinhHotel.dto.LoginRequest;
import com.xuanthinhdev.XuanThinhHotel.dto.Response;
import com.xuanthinhdev.XuanThinhHotel.entity.User;
import com.xuanthinhdev.XuanThinhHotel.exception.OurException;
import com.xuanthinhdev.XuanThinhHotel.repo.UserRepository;
import com.xuanthinhdev.XuanThinhHotel.service.interfac.IUserService;
import com.xuanthinhdev.XuanThinhHotel.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JWTUtils jwtUtils;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public Response register(User user) {
        Response response = new Response();
        try {
            if(user.getRole() == null || user.getRole().isBlank()){
                user.setRole("USER");
            }

            if(userRepository.existsByEmail(user.getEmail())){
                throw new OurException(user.getEmail() +"Already Exist");
            }
            user.setPassword(passwordEncoder.encode(user.getPassword()));

        } catch (OurException e) {
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Response login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public Response getAllUsers() {
        return null;
    }

    @Override
    public Response getUserBookingHistory(String userId) {
        return null;
    }

    @Override
    public Response deleteUser(String userId) {
        return null;
    }

    @Override
    public Response getUserById(String userId) {
        return null;
    }

    @Override
    public Response getMyInfo(String userID) {
        return null;
    }
}
