package com.example.rodis_kurt_115.implicitextentsample;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnScrn1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}
