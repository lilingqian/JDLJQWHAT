package com.example.lenovo.jd_ljq_what.net;



import com.example.lenovo.jd_ljq_what.bean.AdBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface AdApiService {
   
    @GET("ad/getAd")
    Observable<AdBean> getAd();
}
