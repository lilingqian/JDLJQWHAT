package com.example.lenovo.jd_ljq_what.ui.classify.contract;


import com.example.lenovo.jd_ljq_what.bean.CatagoryBean;
import com.example.lenovo.jd_ljq_what.bean.ProductCatagoryBean;
import com.example.lenovo.jd_ljq_what.ui.BaseContract;

public interface ClassifyContract {
    interface View extends BaseContract.BaseView {
        void getProductCatagorySuccess(ProductCatagoryBean productCatagoryBean);

        void getCatagorySuccess(CatagoryBean catagoryBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getProductCatagory(String cid);

        void getCatagory();
    }
}
