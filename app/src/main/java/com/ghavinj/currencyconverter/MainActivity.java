package com.ghavinj.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToBitCoin(View view){
        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);

        int dollarAmount = Integer.parseInt(amountEditText.getText().toString());
        float bitCoin = 7301;

        float result = dollarAmount /bitCoin;

        Toast.makeText(this, "You have "+ result + " bitcoin", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
