package com.example.lenovo.jd_ljq_what.ui.classify.contract;


import com.example.lenovo.jd_ljq_what.ui.BaseContract;

public interface AddCartContract {
    interface View extends BaseContract.BaseView {
        void onSuccess(String str);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void addCart(String uid, String pid, String token);
    }
}
