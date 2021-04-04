package com.example.hehe.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import com.androidnc.btl_h2dmusic.Adapter.MainViewPagerAdapter;
import com.androidnc.btl_h2dmusic.Fragment.Fragment_Profile;
import com.androidnc.btl_h2dmusic.Fragment.Fragment_Thu_Vien;
import com.androidnc.btl_h2dmusic.Fragment.Fragment_Tim_Kiem;
import com.androidnc.btl_h2dmusic.Fragment.Fragment_Trang_Chu;
import com.androidnc.btl_h2dmusic.Fragment.LoadingDialog;
import com.example.hehe.Adapter.MainViewPagerAdapter;
import com.example.hehe.Fragment.LoadingDialog;
import com.example.hehe.R;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final LoadingDialog loadingDialog = new LoadingDialog(HomeActivity.this);
        AnhXa();
        loadingDialog.StartLoadingDialog();
        Handler handler = new Handler();
        handler.postDelayed({loadingDialog.dismissDialog();},7500);
        init();
        overridePendingTransition(R.anim.anim_intent_in_home,R.anim.anim_intent_out);
    }

    private  void init(){
        MainViewPagerAdapter mainViewPagerAdapter - new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_`);
    }

    private void AnhXa() {
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewPager);
    }

}
