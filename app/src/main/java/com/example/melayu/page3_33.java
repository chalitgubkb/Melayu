package com.example.melayu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page3_33 extends AppCompatActivity {
    ImageButton v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_33);

        v1=(ImageButton) findViewById(R.id.imageButton1vdo);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v1 = new Intent(com.example.melayu.page3_33.this,page3_3.class);
                startActivity(v1);
            }
        });

    }
}