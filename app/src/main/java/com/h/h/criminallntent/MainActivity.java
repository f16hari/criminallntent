package com.h.h.criminallntent;

import android.support.v4.app.Fragment;


public class MainActivity extends singleFragmentActivity {


    @Override
    protected Fragment createfragment()
    {
        return new crimeFragment();
    }


}
