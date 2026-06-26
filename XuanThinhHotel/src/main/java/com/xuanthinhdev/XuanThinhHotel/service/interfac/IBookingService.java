package com.xuanthinhdev.XuanThinhHotel.service.interfac;

import com.xuanthinhdev.XuanThinhHotel.dto.Response;
import com.xuanthinhdev.XuanThinhHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking BookingRequest);

    Response findBookingByConfirmationCode(String confirmation);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
