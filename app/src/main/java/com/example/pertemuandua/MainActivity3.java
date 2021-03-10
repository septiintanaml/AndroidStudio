package com.example.pertemuandua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void activity6(View view){
        Intent a = new Intent( MainActivity3.this, MainActivity.class);
        startActivity(a);
        Toast.makeText(this,"Back To HomePage", Toast.LENGTH_SHORT).show();
    }

    public void activity7(View view){
        Intent b = new Intent( MainActivity3.this, PertemuanDua.class);
        startActivity(b);
        Toast.makeText(this,"Back To Article", Toast.LENGTH_SHORT).show();
    }
}