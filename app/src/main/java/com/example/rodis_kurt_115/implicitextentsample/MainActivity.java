package com.example.rodis_kurt_115.implicitextentsample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v){
        Intent i = null, chooser=null;
        if(v.getId()==R.id.btnScrn2){
            i = new Intent(this, Activity2.class);
            startActivity(i);
        } else if (v.getId()==R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 14.609974, 120.992055"));
            chooser = Intent.createChooser(i, "create a map app");
            startActivity(chooser);
        }
    }

}
