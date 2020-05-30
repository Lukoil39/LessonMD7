package com.example.lessonmd7;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment_one = FragmentOne.newInstance(null);
        Fragment fragment_two = FragmentTwo.newInstance(null);
        Fragment fragment_three = FragmentThree.newInstance(null);

        Adapter Adapter = new Adapter(getSupportFragmentManager());
        Adapter.addFragment(fragment_one, "tab1");
        Adapter.addFragment(fragment_two, "tab2");
        Adapter.addFragment(fragment_three, "tab3");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(Adapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}