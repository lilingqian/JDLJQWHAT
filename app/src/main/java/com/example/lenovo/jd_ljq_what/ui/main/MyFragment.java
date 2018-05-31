package com.example.lenovo.jd_ljq_what.ui.main;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.lenovo.jd_ljq_what.R;
import com.example.lenovo.jd_ljq_what.ui.BaseFragment;
import com.example.lenovo.jd_ljq_what.ui.login.LoginActivity;
import com.example.lenovo.jd_ljq_what.utils.SharedPreferencesUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

public class MyFragment extends BaseFragment implements View.OnClickListener {
    private View view;
    private ImageView mMyUserIcon;
    /**
     * 登录/注册 >
     */
    private RecyclerView tui_jian_recycler;
    private LinearLayout my_linear_login;
    private ImageView my_user_icon;
    private TextView my_user_name;
    private LinearLayout my_order_dfk;
    private LinearLayout my_order_dpj;
    private LinearLayout my_order_dsh;
    private LinearLayout my_order_th;
    private LinearLayout my_order_all;
    private ScrollView fragment_my_scroll;
    private RelativeLayout login_back_pic;
    private SmartRefreshLayout smart_refresh;


    @Override
    public int getContentLayout() {
        return R.layout.fragment_my;
    }

    @Override
    public void onResume() {
        super.onResume();
        String name = (String) SharedPreferencesUtils.getParam(getContext(), "name", "");
        String iconUrl = (String) SharedPreferencesUtils.getParam(getContext(), "iconUrl", "");
        String uid = (String) SharedPreferencesUtils.getParam(getContext(), "uid", "");
        if (!TextUtils.isEmpty(uid)) {
            //登录过
            login_back_pic.setBackgroundResource(R.drawable.normal_regbg);
        } else {
            //未登录
            login_back_pic.setBackgroundResource(R.drawable.reg_bg);
        }
        if (!TextUtils.isEmpty(iconUrl)) {
            Glide.with(getContext()).load(iconUrl).into(my_user_icon);
        }
        if (!TextUtils.isEmpty(name)) {
            my_user_name.setText(name);
        }


    }

    @Override
    public void inject() {

    }

    @Override
    public void initView(View view) {
        tui_jian_recycler = view.findViewById(R.id.tui_jian_recycler);
        my_linear_login = view.findViewById(R.id.my_linear_login);
        my_user_icon = view.findViewById(R.id.my_user_icon);
        my_user_name = view.findViewById(R.id.my_user_name);
        my_order_dfk = view.findViewById(R.id.my_order_dfk);
        my_order_dpj = view.findViewById(R.id.my_order_dpj);
        my_order_dsh = view.findViewById(R.id.my_order_dsh);
        my_order_th = view.findViewById(R.id.my_order_th);
        my_order_all = view.findViewById(R.id.my_order_all);
        fragment_my_scroll = view.findViewById(R.id.fragment_my_scroll);
        login_back_pic = view.findViewById(R.id.login_back_pic);
        smart_refresh = view.findViewById(R.id.smart_refresh);

        setListener();
    }

    private void setListener() {
        my_linear_login.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.my_linear_login:
                //判断是否登录过
                String uid = (String) SharedPreferencesUtils.getParam(getContext(), "uid", "");
                if (TextUtils.isEmpty(uid)) {
                    //未登录
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    startActivity(intent);
                } else {
                    //已登录
                    Intent intent = new Intent(getContext(), UserInfoActivity.class);
                    startActivity(intent);
                }
                break;
        }
    }
}
