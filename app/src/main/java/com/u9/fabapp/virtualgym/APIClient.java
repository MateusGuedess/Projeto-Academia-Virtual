/*
package com.u9.fabapp.virtualgym;

import com.u9.fabapp.virtualgym.Resposta;

import com.u9.fabapp.virtualgym.RespostaLogin;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Path;

*/
/**
 * Created by denis on 30/11/2017.
 *//*


public class APIClient {

    private static RestAdapter REST_ADAPTER;

    public APIClient(){
        createAdapterIfNeeded();
    }

    private static void createAdapterIfNeeded() {
        if(REST_ADAPTER == null){
            REST_ADAPTER = new RestAdapter
                    .Builder()
                    .setEndpoint("http://golfetto.16mb.com/virtual-fit/home/")
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setClient(new OkClient())
                    .build();
        }
    }

    public RestServices getRestService(){
        return REST_ADAPTER.create(RestServices.class);
    }



    public interface RestServices{

        @GET("/getExercicios.php")
        void setUsuarioLoginDTO(
                @Query("LOGIN") String login,
                @Query("SENHA") String senha,
                Callback<RespostaLogin> callbackResposta
        );
    }

}
*/
