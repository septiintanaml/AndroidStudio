package com.example.pertemuandua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PertemuanDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan_dua);
    }
    public void activity4(View view){
        Intent a = new Intent( PertemuanDua.this, MainActivity.class);
        startActivity(a);
        Toast.makeText(this,"Back To HomePage", Toast.LENGTH_SHORT).show();
    }

    public void activity5(View view){
        Intent b = new Intent( PertemuanDua.this, MainActivity3.class);
        startActivity(b);
        Toast.makeText(this,"Move To Biodata", Toast.LENGTH_SHORT).show();
    }

}