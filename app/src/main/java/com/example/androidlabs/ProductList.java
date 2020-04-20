package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductList extends AppCompatActivity {
    ArrayList<String> products = new ArrayList<>(Arrays.asList("Tricou", "Bluza", "Pantaloni", "Pulover", "Shorts", "Blugi", "Esarfa"));
    final ArrayList<String> products_desc = new ArrayList<>(Arrays.asList("Acesta este un tricou.", "Aceasta este o bluza.", "Avem aici o pereche de pantaloni.",  "Pulover", "Shorts", "Blugi", "Esarfa"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);

        final ListView list = findViewById(R.id.productList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, products);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView productTextView = findViewById(R.id.textview);

                Log.d("POS", Integer.toString(position));
                String product_name = (String) list.getItemAtPosition(position);
                String product_description = (String) products_desc.get(position);
                productTextView.setText(product_description);
            }
        });
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        TextView productTextView = findViewById(R.id.textview);

        int last_pos = Integer.parseInt(savedInstanceState.getString("last_pos"));
        if (last_pos != 0) {
            String last_desc = products_desc.get(last_pos);
            productTextView.setText(last_desc);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        TextView productTextView = findViewById(R.id.textview);

        String current_desc = (String) productTextView.getText();
        int current_pos = 0;

        if (products_desc.contains(current_desc))
            current_pos = products_desc.indexOf(current_desc);

        outState.putString("last_pos", String.valueOf(current_pos));
        super.onSaveInstanceState(outState);
    }
}
