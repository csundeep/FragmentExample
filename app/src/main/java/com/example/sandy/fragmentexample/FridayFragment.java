package com.example.sandy.fragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.viewpager.R;

public class FridayFragment extends Fragment {

    private static final String KEY_NAME = "name";

    private String name;

    public static Fragment newInstance(String name) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NAME, "name");
        Fragment fragment = new FridayFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monday, container, false);
        TextView textView = (TextView) view.findViewById(R.id.value);
        textView.setText("Friday");
        return view;
    }


}
