package com.kravchenkovadim.part10_task33_androidpro;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<RecyclerViewElements> arrayList;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView pizzaName;
        public TextView pizzaDescribe;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagePizza);
            pizzaName = itemView.findViewById(R.id.textViewPizzaName);
            pizzaDescribe = itemView.findViewById(R.id.textViewPizzaDescribe);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewElements> arrayList){

        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_element,
                parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerViewElements recyclerViewElements = arrayList.get(position);
        holder.imageView.setImageResource(recyclerViewElements.getImageResource());
        holder.pizzaName.setText(recyclerViewElements.getNamePizza());
        holder.pizzaDescribe.setText(recyclerViewElements.getDescribePizza());
        holder.itemView.setOnClickListener(v -> {
            // Создаем интент для открытия нового активити
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            // Передаем данные (текст) в новое активити
            intent.putExtra("pizzaName", recyclerViewElements.getNamePizza());
            intent.putExtra("pizzaDescribe", recyclerViewElements.getDescribePizza());
            v.getContext().startActivity(intent);
        });
    }




    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
