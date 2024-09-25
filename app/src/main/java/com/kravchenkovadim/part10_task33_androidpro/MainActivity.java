package com.kravchenkovadim.part10_task33_androidpro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.margherita,""+ R.string.pizza_Margherita, ""+R.string.describe_Margherita_pizza));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.margherita_another,""+ R.string.pizza_Margherita, ""+R.string.describe_another_Margherita_pizza));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.cheese,""+ R.string.cheese_pizza, ""+R.string.describe_cheese_pizza));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.dough,""+ R.string.pizza_dough, ""+R.string.describe_dough_pizza));
        recyclerViewElements.add(new RecyclerViewElements(R.drawable.sourdough,""+ R.string.sourdough_pizza, ""+R.string.describe_sourdough_pizza));
    }
}