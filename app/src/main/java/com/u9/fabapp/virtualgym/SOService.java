package com.u9.fabapp.virtualgym;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by denis on 04/12/2017.
 */

public interface SOService {

    @GET("/getExercicios.php")
    Call<Usuario> CallBack(@Query("login") String login, @Query("senha") String senha);


}
