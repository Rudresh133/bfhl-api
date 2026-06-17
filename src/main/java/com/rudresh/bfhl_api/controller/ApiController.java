package com.rudresh.bfhl_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rudresh.bfhl_api.dto.RequestDto;
import com.rudresh.bfhl_api.dto.ResponseDto;
import com.rudresh.bfhl_api.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/bfhl")
    public ResponseDto process(
            @RequestBody RequestDto request,
            @RequestHeader(value = "X-Request-Id", required = false) String requestId) {

        return apiService.process(request, requestId);
    }
}