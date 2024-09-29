package com.jamesbon.cmpiler;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface apiservice {
    @POST("/login")
    Call<loginresponse> login(@Body loginrequest loginRequest);
}

