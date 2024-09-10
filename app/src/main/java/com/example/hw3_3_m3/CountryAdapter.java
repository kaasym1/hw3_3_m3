package com.example.hw3_3_m3;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_3_m3.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CoutryViewHolder> {

    private ArrayList<Country> country;

    public CountryAdapter(ArrayList<Country> cars) {
        this.country = country;
    }

    @NonNull
    @Override
    public CoutryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CoutryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CoutryViewHolder holder, int position) {
        holder.bind(country.get(position));
    }

    @Override
    public int getItemCount() {
        return country.size();
    }
}
