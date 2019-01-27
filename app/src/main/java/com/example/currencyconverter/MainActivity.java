package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonTest(View view){
        EditText dollarField = (EditText) findViewById(R.id.dollarInput);
        float dollarValue = Float.parseFloat(dollarField.getText().toString().trim());

        double poundValue = dollarValue * 0.76;
        String poundVal = String.valueOf(poundValue);
        String printVal = "$"+dollarValue+" equals to £"+ poundVal;

        Toast.makeText(MainActivity.this, printVal, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
