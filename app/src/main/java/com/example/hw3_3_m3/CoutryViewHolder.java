package com.example.hw3_3_m3;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw3_3_m3.databinding.ItemCountryBinding;


public class CoutryViewHolder extends RecyclerView.ViewHolder {

    private ItemCountryBinding binding;

    public CoutryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Country car) {
        binding.tvTitle.setText(car.getName());
        binding.tvDesc.setText(car.getDesc());
        Glide.with(binding.imgFlag).load(car.getLogo()).into(binding.imgFlag);
    }
}
