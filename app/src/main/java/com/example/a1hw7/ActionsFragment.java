package com.example.a1hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1hw7.databinding.FragmentActionsBinding;

import java.util.ArrayList;


public class ActionsFragment extends Fragment {

    FragmentActionsBinding binding;
    ActionAdapter adapter;
    ArrayList<ActionsModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentActionsBinding.inflate(inflater , container , false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.toolbar.setTitle("Following");

        list = new ArrayList<>();
        list.add(new ActionsModel(R.drawable.ic_person,"karennne liked your photo. 1h",R.drawable.ic_moutains));
        list.add(new ActionsModel(R.drawable.ic_person,"karennne liked your photo. 1h",R.drawable.ic_moutains));
        list.add(new ActionsModel(R.drawable.ic_person,"karennne liked your photo. 1h",R.drawable.ic_moutains));
        list.add(new ActionsModel(R.drawable.ic_person,"karennne liked your photo. 1h",R.drawable.ic_moutains));


        adapter = new ActionAdapter(list);
        binding.rvAction.setAdapter(adapter);

    }
}