package com.example.a1hw7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1hw7.databinding.ItemActionBinding;

import java.util.ArrayList;

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.ViewHolder> {


    ArrayList<ActionsModel> list;


    public ActionAdapter(ArrayList<ActionsModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(ItemActionBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
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
        ItemActionBinding binding;
        public ViewHolder(@NonNull  ItemActionBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(ActionsModel actionsModel) {
            binding.tvText.setText(actionsModel.getAction());
            binding.fPhoto.setImageResource(actionsModel.getPhoto());
            binding.sPhoto.setImageResource(actionsModel.getPhoto2());
        }
    }
}
