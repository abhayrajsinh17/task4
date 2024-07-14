package com.example.task4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMenActivity(View view) {
        Intent intent = new Intent(this, men.class);
        startActivity(intent);
        Toast.makeText(this, "Men category selected", Toast.LENGTH_SHORT).show();
    }

    public void openWomenActivity(View view) {
        Intent intent = new Intent(this, women.class);
        startActivity(intent);
        Toast.makeText(this, "Women category selected", Toast.LENGTH_SHORT).show();
    }

    public void openKidsActivity(View view) {
        Intent intent = new Intent(this, kids.class);
        startActivity(intent);
        Toast.makeText(this, "Kids category selected", Toast.LENGTH_SHORT).show();

    }
}
