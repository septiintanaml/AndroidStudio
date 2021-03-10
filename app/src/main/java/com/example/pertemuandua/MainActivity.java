package com.example.pertemuandua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity2(View view) {
        Intent a =  new Intent(MainActivity.this,PertemuanDua.class);
        startActivity(a);
        Toast. makeText(this, "Move To Artikel", Toast.LENGTH_SHORT).show();
    }

    public void activity3(View view) {
        Intent b = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(b);
        Toast.makeText(this,"Move To Biodata",Toast.LENGTH_SHORT).show();
    }

}