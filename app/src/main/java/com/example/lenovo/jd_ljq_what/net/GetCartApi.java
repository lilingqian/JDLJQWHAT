package com.example.lenovo.jd_ljq_what.net;



import com.example.lenovo.jd_ljq_what.bean.GetCartsBean;

import io.reactivex.Observable;

public class GetCartApi {
    private static GetCartApi getCartApi;
    private GetCartApiService getCartApiService;

    private GetCartApi(GetCartApiService getCartApiService) {
        this.getCartApiService = getCartApiService;
    }

    public static GetCartApi getGetCartApi(GetCartApiService getCartApiService) {
        if (getCartApi == null) {
            getCartApi = new GetCartApi(getCartApiService);
        }
        return getCartApi;
    }

    public Observable<GetCartsBean> getCatagory(String uid, String token) {
        return getCartApiService.getCart(uid, token);
    }

}
