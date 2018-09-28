package com.example.audiolibro_v1;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class PreferenciasFragment extends PreferenceFragmentCompat {
    @Override public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
