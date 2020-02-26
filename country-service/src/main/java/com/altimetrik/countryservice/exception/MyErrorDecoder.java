package com.altimetrik.countryservice.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class MyErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 499) {
            return new MyBadRequestException(" client request error");
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }

}
