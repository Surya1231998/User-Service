package com.lcdw.user.services.UserServices.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException()
    {
        super("Resource not found !!");
    }

}
