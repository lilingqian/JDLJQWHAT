package com.example.lenovo.jd_ljq_what.ui.homepage.contract;


import com.example.lenovo.jd_ljq_what.bean.AdBean;
import com.example.lenovo.jd_ljq_what.bean.CatagoryBean;
import com.example.lenovo.jd_ljq_what.ui.BaseContract;

public interface HomPageContract {
    interface View extends BaseContract.BaseView {
        void getAdSuccess(AdBean adBean);

        void getCatagorySuccess(CatagoryBean catagoryBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getAd();

        void getCatagory();
    }

}
