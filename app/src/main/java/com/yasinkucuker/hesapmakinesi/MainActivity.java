package com.yasinkucuker.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi1;
    EditText sayi2;
    TextView sonucText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1 = findViewById(R.id.sayi1Text);
        sayi2 = findViewById(R.id.sayi2Text);
        sonucText = findViewById(R.id.sonucText);

    }

    public void topla(View v){

        if(sayi1.getText().toString().isEmpty() || sayi2.getText().toString().isEmpty()){
            sonucText.setText("Sayı Gir!!");
        }
        else{
            int toplam = Integer.parseInt(sayi1.getText().toString()) + Integer.parseInt(sayi2.getText().toString());
            sonucText.setText("Sonuç : " + toplam);
        }

    }

    public void cikar(View v){
        if(sayi1.getText().toString().isEmpty() || sayi2.getText().toString().isEmpty()){
            sonucText.setText("Sayı Gir!!");
        }
        else{
            int fark = Integer.parseInt(sayi1.getText().toString()) - Integer.parseInt(sayi2.getText().toString());
            sonucText.setText("Sonuç : " + fark);
        }

    }

    public void bol(View v){
        int carpma = 0;
        if(sayi1.getText().toString().isEmpty() || sayi2.getText().toString().isEmpty()){
            sonucText.setText("Sayı Gir!!");
        }
        else{
            try {
                carpma = Integer.parseInt(sayi1.getText().toString()) / Integer.parseInt(sayi2.getText().toString());
                sonucText.setText("Sonuç : " + carpma);
            }catch(ArithmeticException ae){
                sonucText.setText("0'a bölünmez!!");
            }

        }
    }

    public void carp(View v){
        if(sayi1.getText().toString().isEmpty() || sayi2.getText().toString().isEmpty()){
            sonucText.setText("Sayı Gir!!");
        }
        else{
            int bolme = Integer.parseInt(sayi1.getText().toString()) * Integer.parseInt(sayi2.getText().toString());
            sonucText.setText("Sonuç : " + bolme);
        }

    }
}