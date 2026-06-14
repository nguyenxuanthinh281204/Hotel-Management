package com.xuanthinhdev.XuanThinhHotel.service.interfac;

import com.xuanthinhdev.XuanThinhHotel.dto.LoginRequest;
import com.xuanthinhdev.XuanThinhHotel.dto.Response;
import com.xuanthinhdev.XuanThinhHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);


}
