package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = findViewById(R.id.productList);

        ArrayList<String> products = new ArrayList<>(Arrays.asList("Tricou", "Bluza", "Pantaloni", "Pulover", "Shorts", "Blugi", "Esarfa"));
        final ArrayList<String> products_desc = new ArrayList<>(Arrays.asList("Acesta este un tricou.", "Aceasta este o bluza.", "Avem aici o pereche de pantaloni.",  "Pulover", "Shorts", "Blugi", "Esarfa"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, products);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("POS", Integer.toString(position));
                String product_name = (String) list.getItemAtPosition(position);
                String product_description = (String) products_desc.get(position);
                TextView productTextView = findViewById(R.id.textview);
                productTextView.setText(product_description);
            }
        });

    }
}
