package com.example.mark.rgb_seekbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.rgb;


public class MainActivity extends AppCompatActivity {

    private int seekR, seekG, seekB;

  
    private TextView Red_text;
    private TextView Green_text;
    private TextView Blue_text;
    private TextView Text_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        init();

        SeekBar sbR = (SeekBar) findViewById(R.id.RedSeekBar);
        SeekBar sbG = (SeekBar) findViewById(R.id.GreenSeekBar);
        SeekBar sbB = (SeekBar) findViewById(R.id.BlueSeekBar);

        sbR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekR = progress;
                Red_text.setText("Red :" +seekR);
                Text_view.setBackgroundColor(rgb(seekR,seekG ,seekB ));
                //getWindow().getDecorView().setBackgroundColor(rgb(seekR,seekG,seekB));
                Text_view.setText("(" + seekR + "," + seekG + "," + seekB + ")");
                doSomethingWithColor();
            }
        });

        sbG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekG = progress;
                Green_text.setText("Green :" +seekG);
                Text_view.setBackgroundColor(rgb(seekR,seekG ,seekB ));
               //getWindow().getDecorView().setBackgroundColor(rgb(seekR,seekG,seekB));
                Text_view.setText("(" + seekR + "," + seekG + "," + seekB + ")");
                doSomethingWithColor();
            }
        });

        sbB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekB = progress;
                Blue_text.setText("Blue :" +seekB);
                Text_view.setBackgroundColor(rgb(seekR,seekG ,seekB ));
                //getWindow().getDecorView().setBackgroundColor(rgb(seekR,seekG,seekB));
                Text_view.setText("(" + seekR + "," + seekG + "," + seekB + ")");
                doSomethingWithColor();
            }
        });
    }
    private void doSomethingWithColor() {
        int color = Color.rgb(seekR, seekG, seekB);
        // Do something with color
    }
    private void init() {


        Red_text=(TextView)findViewById(R.id.Red_text);
        Green_text=(TextView)findViewById(R.id.Green_text);
        Blue_text=(TextView)findViewById(R.id.Blue_text);
        Text_view = (TextView) findViewById(R.id.Text_view);
    }
}
