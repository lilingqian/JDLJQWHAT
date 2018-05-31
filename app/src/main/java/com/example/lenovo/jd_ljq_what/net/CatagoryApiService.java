package com.example.lenovo.jd_ljq_what.net;



import com.example.lenovo.jd_ljq_what.bean.CatagoryBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CatagoryApiService {
    @GET("product/getCatagory")
    Observable<CatagoryBean> getCatagory();

}
