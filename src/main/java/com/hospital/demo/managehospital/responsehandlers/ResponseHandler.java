package com.hospital.demo.managehospital.responsehandlers;

import com.sun.net.httpserver.HttpsServer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class ResponseHandler {

    public static ResponseEntity<Object> buildResponse(String message , HttpStatus status , Object data){
        HashMap<String ,Object> res = new HashMap<String ,Object>();
        res.put("message",message);
        res.put("status",status);
        res.put("data",res);
        return new ResponseEntity<>(data,status);
    }
}

