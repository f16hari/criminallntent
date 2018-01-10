package com.h.h.criminallntent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by HARI JEYACHANDRAN on 12/15/2017.
 */

public abstract class singleFragmentActivity extends FragmentActivity
{
    protected abstract Fragment createfragment();
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        Fragment f1=fm.findFragmentById(R.id.container);
        if(f1==null)
        {
            f1= createfragment();
            fm.beginTransaction().add(R.id.container,f1).commit();
        }

    }
}
