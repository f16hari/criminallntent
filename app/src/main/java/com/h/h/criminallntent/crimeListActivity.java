package com.h.h.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by HARI JEYACHANDRAN on 12/15/2017.
 */

public class crimeListActivity extends singleFragmentActivity {
    @Override
    protected Fragment createfragment()
    {
        return new crimeListFragment();
    }
}
