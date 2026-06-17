package com.rudresh.bfhl_api.service;

import com.rudresh.bfhl_api.dto.RequestDto;
import com.rudresh.bfhl_api.dto.ResponseDto;

public interface ApiService {

    ResponseDto process(RequestDto request,
                        String requestId);
}