package com.bdfleet.sendsimpledata;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("id")
    public int id;

    public LoginResponse(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
