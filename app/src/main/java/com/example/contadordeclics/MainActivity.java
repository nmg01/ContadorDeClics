package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int c1;
    int c2;
    int c3;
    int c4;

    TextView contador1, contador2, contador3, contador4, contadorAll;
    Button augmentar1, augmentar2, augmentar3, augmentar4, reset1, reset2, reset3, reset4, resetAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorAll = findViewById(R.id.contadorAll);
        contador1 = findViewById(R.id.contador1);
        augmentar1 = findViewById(R.id.augmentar1);

        augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c1++;
                contador1.setText(String.valueOf(c1));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        contador2 = findViewById(R.id.contador2);
        augmentar2 = findViewById(R.id.augmentar2);

        augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2++;
                contador2.setText(String.valueOf(c2));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        contador3 = findViewById(R.id.contador3);
        augmentar3 = findViewById(R.id.augmentar3);

        augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c3++;
                contador3.setText(String.valueOf(c3));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        contador4 = findViewById(R.id.contador4);
        augmentar4 = findViewById(R.id.augmentar4);

        augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c4++;
                contador4.setText(String.valueOf(c4));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        reset1 = findViewById(R.id.reset1);
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1 = 0;
                contador1.setText(String.valueOf(c1));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        reset2 = findViewById(R.id.reset2);
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2 = 0;
                contador2.setText(String.valueOf(c2));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        reset3 = findViewById(R.id.reset3);
        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c3 = 0;
                contador3.setText(String.valueOf(c3));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        reset4 = findViewById(R.id.reset4);
        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c4 = 0;
                contador4.setText(String.valueOf(c4));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });

        resetAll = findViewById(R.id.resetAll);
        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                contador1.setText(String.valueOf(c1));
                contador2.setText(String.valueOf(c2));
                contador3.setText(String.valueOf(c3));
                contador4.setText(String.valueOf(c4));
                contadorAll.setText(String.valueOf(contadorAll));
                contadorAll.setText(String.valueOf(c1 + c2 + c3 + c4));
            }
        });
    }
}