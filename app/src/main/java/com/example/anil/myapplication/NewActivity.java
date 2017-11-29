package com.example.anil.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class NewActivity extends Activity {
    String[] mobileArray = {"Word1","Word2","Word3","Word4",
            "Word5","Word6","Word7","Word8","Word9","Word10"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.new_activity);
          ArrayAdapter adapter = new ArrayAdapter<String>(this,
           R.layout.activity_listview, mobileArray);
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);


    }
}