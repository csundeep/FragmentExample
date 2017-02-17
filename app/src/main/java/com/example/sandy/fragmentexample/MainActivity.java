/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.sandy.fragmentexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import com.example.android.viewpager.R;

import java.util.ArrayList;

/**
 * Displays a {@link ViewPager} where each page shows a different day of the week.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        Fragment f1 = FridayFragment.newInstance("f1");
        Fragment f2 = FridayFragment.newInstance("f1");
        Fragment f3 = FridayFragment.newInstance("f1");
        Fragment f4 = FridayFragment.newInstance("f1");
        Fragment f5 = FridayFragment.newInstance("f1");




        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(f1);
        fragments.add(f2);
        fragments.add(f3);
        fragments.add(f4);
        fragments.add(f5);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
    }
}
