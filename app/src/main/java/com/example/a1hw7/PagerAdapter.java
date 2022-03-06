package com.example.a1hw7;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {



    public PagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new page1();
            case 1:
                return new page2();
        }

        return new page1();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
