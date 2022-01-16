package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button appleButton = (Button) findViewById(R.id.apple_button);
        Button cornButton = (Button) findViewById(R.id.corn_button);

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
    }
}