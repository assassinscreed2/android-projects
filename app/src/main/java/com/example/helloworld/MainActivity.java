package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        textView = findViewById(R.id.textview);
        clickButton = findViewById(R.id.clickbutton);



        clickButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int getNumber = Integer.parseInt(editText.getText().toString());

                        int pound = convertKiloToPound(getNumber);

                        textView.setText(""+pound);
                    }
                }
        );

    }

    private int convertKiloToPound(int kilo){
        return 2*kilo;
    }


}