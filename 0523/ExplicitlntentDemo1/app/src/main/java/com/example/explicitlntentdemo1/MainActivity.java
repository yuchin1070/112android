package com.example.explicitlntentdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtC = (EditText) findViewById(R.id.txtC);
                Intent intent = new Intent(MainActivity.this,FActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TEMPC" , txtC.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}