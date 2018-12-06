package com.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.administrator.helloworld.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity{

    @BindView(R.id.editaccount)
    EditText editaccount;
    @BindView(R.id.clear)
    ImageView clear;
    @BindView(R.id.editpassword)
    EditText editpassword;
    @BindView(R.id.showpass)
    ImageView showpass;
    @BindView(R.id.tvforget)
    TextView tvforget;
    @BindView(R.id.btnlogin)
    Button btnlogin;
    @BindView(R.id.tvregister)
    TextView tvregister;
    @BindView(R.id.layoutcontent)
    LinearLayout layoutcontent;
    @BindView(R.id.activity_login)
    RelativeLayout activityLogin;

    boolean isShowPassWord = false;
    @Override
    protected void initLayoutId() {
        isFull = true;
        layoutId = R.layout.activity_login;
    }
}


