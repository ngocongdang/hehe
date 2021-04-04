package com.example.hehe.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> arrayFragments= new ArrayList<>();
    private  ArrayList<String> arraytitle = new ArrayList<>();

    public MainViewPagerAdapter(@NonNull FragmentManager fm ){super(fm);}

    @NonNull
    @Override
    public Fragment getItem(int position){return  arrayFragments.get(position);}

    @Override
    public int getCount(){return arrayFragments.size();}
    public void addFragment(Fragment fragment, String title){
        arrayFragments.add(fragment);
        arraytitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){return arraytitle.get(position);}
}
