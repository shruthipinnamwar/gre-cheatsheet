package com.example.anil.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
    Button button;
    String[] mobileArray = {"Word1","Word2","Word3","Word4",
            "Word5","Word6","Word7","Word8","Word9","Word10"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.verbal);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        NewActivity.class);
                startActivity(myIntent);

              //  ArrayAdapter adapter = new ArrayAdapter<String>(this,
                //   R.layout.activity_listview, mobileArray);

              //  ListView listView = (ListView) findViewById(R.id.mobile_list);
               // listView.setAdapter(adapter);

            }
        });


        button = (Button) findViewById(R.id.quant);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        NewActivity2.class);
                startActivity(myIntent);

            }
        });


        button = (Button) findViewById(R.id.nextprev);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
             //   Intent myIntent = new Intent(MainActivity.this,
               //         NextprevActivity.class);
                // startActivity(myIntent);

                //  ArrayAdapter adapter = new ArrayAdapter<String>(this,
                //   R.layout.activity_listview, mobileArray);

                //  ListView listView = (ListView) findViewById(R.id.mobile_list);
                // listView.setAdapter(adapter);

            }
        });


    }
   // @Override
    //protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

    //}

}
