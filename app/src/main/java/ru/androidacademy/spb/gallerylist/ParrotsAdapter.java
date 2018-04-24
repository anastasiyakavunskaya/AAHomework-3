package ru.androidacademy.spb.gallerylist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by User on 21.04.2018.
 */

public class ParrotsAdapter extends RecyclerView.Adapter<ParrotsAdapter.ParrotHolder>{

    @NonNull
    private final List<Parrot> parrots;
    public ParrotsAdapter(@NonNull List<Parrot> parrots){
        this.parrots = parrots;
    }

    @NonNull
    @Override
    public ParrotHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ParrotHolder(inflater.inflate(R.layout.item_parrot,parent,false));
    }

    @Override

    public void onBindViewHolder(@NonNull ParrotHolder holder, int position) {
        Parrot parrot = parrots.get(position);
        Picasso.get().load(parrot.getUrl()).into(holder.parrotImage);
    }

    @Override
    public int getItemCount(){
        return parrots.size();
    }

    static class ParrotHolder extends RecyclerView.ViewHolder {
        private final ImageView parrotImage;
        private ParrotHolder(View itemView) {
            super(itemView);
            parrotImage = itemView.findViewById(R.id.parrot_image);
        }
    }


}
