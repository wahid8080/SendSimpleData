package com.bdfleet.sendsimpledata;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterface {

    @POST("sms")
    Call<LoginResponse> sendId(@Body LoginResponse response);
}
