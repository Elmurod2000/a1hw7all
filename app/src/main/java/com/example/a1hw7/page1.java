package com.example.a1hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1hw7.databinding.FragmentPage1Binding;

import java.util.ArrayList;


public class page1 extends Fragment {

    FragmentPage1Binding binding;
    PagesAdapter adapter;
    ArrayList<Integer> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPage1Binding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = new ArrayList<>();
        list.add(R.drawable.ic_moutains);
        list.add(R.drawable.ic_image2);
        list.add(R.drawable.ic_image2);
        list.add(R.drawable.ic_image2);
        list.add(R.drawable.ic_image3);
        list.add(R.drawable.ic_moutains);
        list.add(R.drawable.ic_image3);
        list.add(R.drawable.ic_moutains);
        list.add(R.drawable.ic_moutains);
        list.add(R.drawable.ic_moutains);
        list.add(R.drawable.ic_image2);
        list.add(R.drawable.ic_image2);
        list.add(R.drawable.ic_image2);
        list.add(R.drawable.ic_image3);
        list.add(R.drawable.ic_moutains);
        list.add(R.drawable.ic_image3);
        list.add(R.drawable.ic_moutains);
        list.add(R.drawable.ic_moutains);
        adapter  = new PagesAdapter(list);
        binding.rvPage1.setAdapter(adapter);
    }
}