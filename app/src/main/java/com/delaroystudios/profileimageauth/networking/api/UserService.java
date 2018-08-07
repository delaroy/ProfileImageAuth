package com.delaroystudios.profileimageauth.networking.api;

import com.delaroystudios.profileimageauth.model.Message;
import com.delaroystudios.profileimageauth.networking.Routes;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/**
 * Created by delaroy on 8/2/18.
 */

public interface UserService {

    @Multipart
    @POST(Routes.CREATE_USER)
    Call<Message> createUser(
            @PartMap() Map<String, RequestBody> partMap,
            @Part MultipartBody.Part file);
}
