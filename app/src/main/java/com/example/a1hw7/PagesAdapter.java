package com.example.a1hw7;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1hw7.databinding.ItemPage1Binding;

import java.util.ArrayList;

public class PagesAdapter extends RecyclerView.Adapter<PagesAdapter.ViewHolder> {

    ArrayList<Integer> list;

    public PagesAdapter(ArrayList<Integer> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemPage1Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
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
        ItemPage1Binding binding;
        public ViewHolder(ItemPage1Binding itemView) {
            super(itemView.getRoot());
            binding  = itemView;
        }

        public void bind(Integer integer) {
            binding.ivPages.setImageResource(integer);
        }
    }
}
