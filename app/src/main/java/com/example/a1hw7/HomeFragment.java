package com.example.a1hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1hw7.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    HomeAdapter adapter;
    ArrayList<HomeModel>arrayList = new ArrayList<>();

    FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater , container , false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapter = new HomeAdapter(arrayList);
        binding.rvHome.setAdapter(adapter);
    }

    private void loadData() {
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
        arrayList.add(new HomeModel(R.drawable.pic, "joshua_l The game in Japan was amazing and I want to share some photos"));
    }
}