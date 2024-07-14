package com.example.task4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class women extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        String[] womenItems = {"Dresses", "Skirts", "T-Shirts", "Pants", "Jackets"};

        ListView itemListView = findViewById(R.id.itemListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, womenItems);
        itemListView.setAdapter(adapter);

        itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = womenItems[position];

                Toast.makeText(women.this, "Selected women item: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
