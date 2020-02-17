package com.example.sincos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private Button btnSin,btnCos,btnTan,btnCsc,btnSec,btnCot,btnLog;
    private TextView tvHasil;
    private EditText etAngka;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnCsc = findViewById(R.id.btnCsc);
        btnSec = findViewById(R.id.btnSec);
        btnCot = findViewById(R.id.btnCot);
        btnTan = findViewById(R.id.btnTan);
        tvHasil = findViewById(R.id.tvHasil);
        etAngka = findViewById(R.id.etAngka);
        btnLog = findViewById(R.id.btnLog);

        btnSin.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dSin = Math.sin(Math.toRadians(dAngka));

                    String sHasil = String.valueOf(dSin);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dCos = Math.cos(Math.toRadians(dAngka));


                    String sHasil = String.valueOf(dCos);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dTan = Math.tan(Math.toRadians(dAngka));


                    String sHasil = String.valueOf(dTan);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnCsc.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dCsc = 1/Math.sin(Math.toRadians(dAngka));


                    String sHasil = String.valueOf(dCsc);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dSec = 1/Math.cos(Math.toRadians(dAngka));


                    String sHasil = String.valueOf(dSec);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnCot.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dCot = 1/Math.tan(Math.toRadians(dAngka));


                    String sHasil = String.valueOf(dCot);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dLog = Math.log10(Math.toRadians(dAngka));


                    String sHasil = String.valueOf(dLog);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
