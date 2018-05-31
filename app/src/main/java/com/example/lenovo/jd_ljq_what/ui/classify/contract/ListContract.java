package com.example.lenovo.jd_ljq_what.ui.classify.contract;



import com.example.lenovo.jd_ljq_what.bean.ProductsBean;
import com.example.lenovo.jd_ljq_what.ui.BaseContract;

import java.util.List;

public interface ListContract {
    interface View extends BaseContract.BaseView {
        void onSuccess(List<ProductsBean.DataBean> list);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getProducts(String pscid);
    }
}
