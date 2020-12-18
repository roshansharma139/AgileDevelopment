package com.example.shopnow.api;

import com.example.shopnow.models.Cart;
import com.example.shopnow.models.Order;
import com.example.shopnow.models.UserUpdateModel;
import com.example.shopnow.models.Users;
import com.example.shopnow.models.UsersCUD;
import com.example.shopnow.serverresponse.CartResponse;
import com.example.shopnow.serverresponse.OrderResponse;
import com.example.shopnow.serverresponse.SignUpResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UsersAPI {
    //register employee
    @POST("register/register_user")
    Call<Void> registerEmployee(@Body UsersCUD usersCUD);


    //me
    @GET("register/me")
    Call<Users> getUserDetails(@Header("Authorization") String token);

    //forupdatinguser
    @PUT("register/me")
    Call<UserUpdateModel> edituser(@Header("Authorization") String token, @Body UserUpdateModel userUpdateModel);

}

