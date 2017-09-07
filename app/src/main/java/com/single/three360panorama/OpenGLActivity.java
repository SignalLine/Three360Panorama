package com.single.three360panorama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.single.three360panorama.glutils.GLPanorama;

/**
 * 用模拟机会报错
 */
public class OpenGLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_gl);

        GLPanorama glPanorama = (GLPanorama) findViewById(R.id.mGLPanorama);
        //传入全景图
        glPanorama.setGLPanorama(R.drawable.imggugong);

    }
}
