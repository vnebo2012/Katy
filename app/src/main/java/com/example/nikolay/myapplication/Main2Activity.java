package com.example.nikolay.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2);
    }

    public void puskStart(View view) {
        Intent intent = new Intent(this, Cash1Activity.class);
        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        Animation anim = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.alpha2);
        final Button image3 = (Button) findViewById(R.id.button);
        image3.startAnimation(anim);

        //intent.putExtra("k1", k1_1.getText().toString());
        startActivity(intent);
    }
}
