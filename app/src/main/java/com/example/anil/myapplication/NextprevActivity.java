package com.example.anil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class NextprevActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    String[] changingtext = {"Wor11,jhgjgghgh" +
            "/njhfhgfhgfghfggfgfd" +
            "/nhgfhgfhfhghjgjhhhhh, jhhhhhhhhhhhh" +
            "/nhggggggggggggggggggggggggggggggggggggggggggggggggggggggg","Workjlhg,hgjhgjhfhgfhgfgfdkn2","Worfsghjfgfhfd3","Wfsord4",
            "Wsfgfdggord5","Word6","Word7","Word8","Word9","Word10"};

    int j =0;

    Button prevBtn,nextBtn;
    TextView olText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextprev_activity);

        prevBtn = (Button) findViewById(R.id.prev);
        nextBtn = (Button) findViewById(R.id.next);
        olText = (TextView) findViewById(R.id.changetext);


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (++j >= changingtext.length) {
                    j = 0;
                }
                olText.setText(changingtext[j]);
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (--j >= changingtext.length) {
                    j = 0;
                }
                olText.setText(changingtext[j]);
            }
        });

    }}
      //  prevBtn.setOnClickListener(listener);
   //   setEventData(true);

    /*View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v.equals(prevBtn) && eventNum > 0) {
                eventNum--;
                setEventData(false);
                return;
            }

            if (v.equals(nextBtn) && eventNum < maxEvents - 1) {
                eventNum++;
                setEventData(true);
                return;
            }
        }
    };
}

 //   private void setEventData(boolean animLeft) {
   //     olText.setText("PE" + (eventNum + 1)    );

       // if (animLeft){
     //       olText.setText("PE" + (eventNum + 1)    );


           // olText.startAnimation(AnimationUtils.loadAnimation(olText.this, android.R.anim.slide_in_left));
     //    else{}
    //    olText.setText("PE" + (eventNum + 1)    )
          //  olText.startAnimation(AnimationUtils.loadAnimation(.this, android.R.anim.slide_out_right));
//    }

*/