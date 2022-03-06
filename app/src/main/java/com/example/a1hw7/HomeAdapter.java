package com.example.a1hw7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1hw7.databinding.ItemHomeBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    ArrayList<HomeModel> list;

    public HomeAdapter(ArrayList<HomeModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemHomeBinding binding;
        public ViewHolder(@NonNull ItemHomeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }

        public void bind(HomeModel homeModel) {
            binding.ivInst.setImageResource(homeModel.getPic());
            binding.tvComm.setText(homeModel.getComment());
        }
    }
}
