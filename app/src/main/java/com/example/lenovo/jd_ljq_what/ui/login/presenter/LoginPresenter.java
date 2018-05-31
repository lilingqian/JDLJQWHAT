package com.example.lenovo.jd_ljq_what.ui.login.presenter;


import com.example.lenovo.jd_ljq_what.bean.UserBean;
import com.example.lenovo.jd_ljq_what.net.LoginApi;
import com.example.lenovo.jd_ljq_what.ui.BasePresenter;
import com.example.lenovo.jd_ljq_what.ui.login.contract.LoginContract;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    private LoginApi loginApi;

    @Inject
    public LoginPresenter(LoginApi loginApi) {
        this.loginApi = loginApi;
    }

    @Override
    public void login(String mobile, String password) {

        loginApi.login(mobile, password)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<UserBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserBean userBean) {
                        mView.loginSuccess(userBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
