package com.restoran.booking.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;
import com.restoran.booking.dto.ApiResponse;


@RestController
public class BookingController {
    @GetMapping("/")
    public ApiResponse getStatus() {
        return new ApiResponse(true, "API is running");
    }
    
}
