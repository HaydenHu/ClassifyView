package com.anarchy.classifyview.sample.viewpager;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anarchy.classifyview.R;
import com.anarchy.classifyview.core.BaseFragment;
import com.anarchy.classifyview.databinding.FragmentViewpagerBinding;
import com.anarchy.classifyview.sample.normal.NormalFragment;

/**
 * <p>
 * Date: 16/8/11 15:38
 * Author: rsshinide38@163.com
 * <p>
 */
public class ViewPagerFragment extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentViewpagerBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_viewpager,container,false);
        binding.viewPager.setAdapter(new ViewPagerAdapter(getChildFragmentManager()));
        return binding.getRoot();
    }

    static class ViewPagerAdapter extends FragmentStatePagerAdapter{

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new NormalFragment();
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
