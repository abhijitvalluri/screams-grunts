package com.abhijitvalluri.android.screams_grunts;

import android.support.v4.app.Fragment;

public class ScreamsGruntsActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return ScreamsGruntsFragment.newInstance();
    }

}
