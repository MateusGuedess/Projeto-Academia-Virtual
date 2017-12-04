package com.u9.fabapp.virtualgym;

/**
 * Created by denis on 04/12/2017.
 */

public class APIUtils {

    public static final String BASE_URL = "http://golfetto.16mb.com/virtual-fit/home/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }

}
