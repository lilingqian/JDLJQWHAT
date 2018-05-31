package com.example.lenovo.jd_ljq_what.ui.main.contract;


import com.example.lenovo.jd_ljq_what.ui.BaseContract;

public interface UpdateHeaderContract {

    interface View extends BaseContract.BaseView{
        void updateSuccess(String code);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void updateHeader(String uid, String filePath);
    }
}
