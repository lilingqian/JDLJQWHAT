package com.example.lenovo.jd_ljq_what.component;



import com.example.lenovo.jd_ljq_what.module.HttpModule;
import com.example.lenovo.jd_ljq_what.ui.classify.ClassifyFragment;
import com.example.lenovo.jd_ljq_what.ui.classify.ListActivity;
import com.example.lenovo.jd_ljq_what.ui.classify.ListDetailsActivity;
import com.example.lenovo.jd_ljq_what.ui.homepage.HomePageFragment;
import com.example.lenovo.jd_ljq_what.ui.login.LoginActivity;
import com.example.lenovo.jd_ljq_what.ui.main.MakeSureOrderActivity;
import com.example.lenovo.jd_ljq_what.ui.main.UserInfoActivity;
import com.example.lenovo.jd_ljq_what.ui.shopcart.ShopCartActivity;


import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(LoginActivity loginActivity);

    void inject(HomePageFragment homePageFragment);

    void inject(ClassifyFragment classifyFragment);

    void inject(ListActivity listActivity);

    void inject(ListDetailsActivity listDetailsActivity);

    void inject(ShopCartActivity shopCartActivity);


    void inject(MakeSureOrderActivity makeSureOrderActivity);

    void inject(UserInfoActivity userInfoActivity);
}
