package com.example.max.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        EditText usd_text = (EditText)findViewById(R.id.txtUsd);
        EditText lkr_text = (EditText)findViewById(R.id.txtLkr);

        double conversion_rate = 145;

        String usd = usd_text.getText().toString();
        String lkr = lkr_text.getText().toString();
        Double usd_amount;
        Double lkr_amount;

        if( (usd.equals("") && lkr.equals("")) || (!usd.equals("") && !lkr.equals(""))){
            Toast.makeText(getApplicationContext(), "Enter exactly one value", Toast.LENGTH_SHORT).show();
        }else{
            if(!usd.equals("")){
                usd_amount = Double.parseDouble(usd);
                String converted_amount = Double.toString(usd_amount * conversion_rate);
                lkr_text.setText(converted_amount);
            }
            else if(!lkr.equals("")){
                lkr_amount = Double.parseDouble(lkr);
                String converted_amount = Double.toString(lkr_amount/conversion_rate);
                usd_text.setText(converted_amount);
            }else{
                Toast.makeText(getApplicationContext(), "Unknown input", Toast.LENGTH_SHORT).show();
            }
        }


    }
}
