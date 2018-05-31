package com.example.lenovo.jd_ljq_what.ui.login.contract;


import com.example.lenovo.jd_ljq_what.bean.UserBean;
import com.example.lenovo.jd_ljq_what.ui.BaseContract;

public interface LoginContract {
    interface View extends BaseContract.BaseView {
        void loginSuccess(UserBean userBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void login(String mobile, String password);
    }
}
