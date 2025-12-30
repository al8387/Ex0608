package com.example.ex0608;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rng;
    TextView tVF1;
    TextView tVF2;
    TextView tVS1;
    TextView tVS2;
    TextView tVL1;
    TextView tVL2;
    int numF;
    int numS;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    EditText eT1;
    EditText eT2;
    EditText eT3;
    String st1;
    String st2;
    String st3;
    int sum;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rng = new Random();

        tVF1 = findViewById(R.id.tVF1);
        tVF2 = findViewById(R.id.tVF2);
        tVS1 = findViewById(R.id.tVS1);
        tVS2 = findViewById(R.id.tVS2);
        tVL1 = findViewById(R.id.tVL1);
        tVL2 = findViewById(R.id.tVL2);
        eT1 = (EditText) findViewById(R.id.eT1);
        eT2 = (EditText) findViewById(R.id.eT2);
        eT3 = (EditText) findViewById(R.id.eT3);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        btn1 = findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st1 = eT1.getText().toString();
                imageView.setVisibility(View.VISIBLE);
                if (!st1.isEmpty()) {
                    sum = Integer.parseInt(st1);
                    if (sum == numF + numS) {
                        imageView.setImageResource(R.drawable.ck);
                        tVS1.setVisibility(View.VISIBLE);
                        tVS2.setVisibility(View.VISIBLE);
                        eT2.setVisibility(View.VISIBLE);
                        tVS1.setText(String.valueOf(sum));

                    } else {
                        imageView.setImageResource(R.drawable.rx);
                        imageView.setImageResource(R.drawable.ck);
                        tVS1.setVisibility(View.VISIBLE);
                        tVS2.setVisibility(View.VISIBLE);
                        eT2.setVisibility(View.VISIBLE);
                    }
                } else {
                    imageView.setImageResource(R.drawable.rx);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        numF = rng.nextInt(90) + 10;
        numS = rng.nextInt(90) + 10;
        tVF1.setText(String.valueOf(numF));
        tVF2.setText(String.valueOf(numS));


    }
}
