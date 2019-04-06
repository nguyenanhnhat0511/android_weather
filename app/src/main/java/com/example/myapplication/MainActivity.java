package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity<i> extends AppCompatActivity {
    ListView lv;
    ArrayList<String> array_data ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv );
        array_data =  new ArrayList<String>();

        for (int i = 1 ; i < 6 ; i++ ) {
            array_data.add("item"+ i);
        }

        customer_adapter sc = new customer_adapter(this,R.layout.custom_layout,array_data);

        lv.setAdapter(sc );
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "du lieu la " + array_data.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
