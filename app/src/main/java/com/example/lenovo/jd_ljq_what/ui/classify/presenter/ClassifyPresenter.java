package com.example.lenovo.jd_ljq_what.ui.classify.presenter;



import com.example.lenovo.jd_ljq_what.bean.CatagoryBean;
import com.example.lenovo.jd_ljq_what.bean.ProductCatagoryBean;
import com.example.lenovo.jd_ljq_what.net.CatagoryApi;
import com.example.lenovo.jd_ljq_what.net.ProductCatagoryApi;
import com.example.lenovo.jd_ljq_what.ui.BasePresenter;
import com.example.lenovo.jd_ljq_what.ui.classify.contract.ClassifyContract;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ClassifyPresenter extends BasePresenter<ClassifyContract.View> implements ClassifyContract.Presenter {
    private ProductCatagoryApi productCatagoryApi;
    private CatagoryApi catagoryApi;

    @Inject
    public ClassifyPresenter(ProductCatagoryApi productCatagoryApi, CatagoryApi catagoryApi) {
        this.productCatagoryApi = productCatagoryApi;
        this.catagoryApi = catagoryApi;
    }

    @Override
    public void getProductCatagory(String cid) {
        productCatagoryApi.getProductCatagory(cid)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ProductCatagoryBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ProductCatagoryBean productCatagoryBean) {
                        if (mView != null) {
                            mView.getProductCatagorySuccess(productCatagoryBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getCatagory() {
        catagoryApi.getCatagory()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<CatagoryBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CatagoryBean catagoryBean) {
                        if (mView != null) {
                            mView.getCatagorySuccess(catagoryBean);
                        }
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
