package com.single.three360panorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.openGL:
                startActivity(new Intent(MainActivity.this,OpenGLActivity.class));
                break;
            case R.id.google_vr:
                startActivity(new Intent(MainActivity.this,GoogleVRActivity.class));
                break;
            case R.id.tree_web:
                startActivity(new Intent(MainActivity.this,TreeWebActivity.class));
                break;
            default:
                break;
        }
    }
}
