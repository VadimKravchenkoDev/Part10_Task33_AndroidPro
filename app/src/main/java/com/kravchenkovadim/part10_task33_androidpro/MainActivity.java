package com.kravchenkovadim.part10_task33_androidpro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<RecyclerViewElements> recyclerViewElements = new ArrayList<>();
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.margherita, getString(R.string.pizza_Margherita), getString(R.string.describe_Margherita_pizza),getString(R.string.method_pizza_Margherita)));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.margherita_another, getString(R.string.pizza_another_Margherita), getString(R.string.describe_another_Margherita_pizza),getString(R.string.method_pizza_another_Margherita)));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.cheese, getString(R.string.cheese_pizza), getString(R.string.describe_cheese_pizza),getString(R.string.method_cheese_pizza)));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.dough, getString(R.string.pizza_dough), getString(R.string.describe_dough_pizza),getString(R.string.method_pizza_dough)));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.sourdough, getString(R.string.sourdough_pizza), getString(R.string.describe_sourdough_pizza),getString(R.string.method_sourdough_pizza)));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(recyclerViewElements);
        recyclerView.setAdapter(adapter);
    }
}