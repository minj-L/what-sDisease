package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button appleButton = (Button) findViewById(R.id.apple_button);
        Button cornButton = (Button) findViewById(R.id.corn_button);
        Button grapesButton = (Button) findViewById(R.id.grapes_button);
        Button tomatoButton = (Button) findViewById(R.id.tomato_button);
        Button potatoButton = (Button) findViewById(R.id.potato_button);

        appleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_apple = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(intent_apple);
            }
        });
        cornButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_corn = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(intent_corn);
            }
        });
        grapesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_grapes = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(intent_grapes);
            }
        });
        tomatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_tomato = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(intent_tomato);
            }
        });
        potatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_potato = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(intent_potato);
            }
        });
    }
}