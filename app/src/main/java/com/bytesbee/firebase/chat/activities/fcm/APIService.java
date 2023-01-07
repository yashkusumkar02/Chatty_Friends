package com.bytesbee.firebase.chat.activities.fcm;

import com.bytesbee.firebase.chat.activities.fcmmodels.MyResponse;
import com.bytesbee.firebase.chat.activities.fcmmodels.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization: key=AAAAlbMo56k:APA91bHxoo53ZwGuFMKf6XCbz1QaL5-o8Z_v20q-8sKjmj11_FX6Gouea6qecYeh_A5EJBlb1DVnKiH1rPHSdg26aaT9fG9vvCT5HGuqXI6fYT3qVwANLBBtBJnEv17a-MSfGB19x4ha"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
