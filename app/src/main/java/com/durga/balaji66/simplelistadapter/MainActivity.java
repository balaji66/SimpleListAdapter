package com.durga.balaji66.simplelistadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter =ArrayAdapter.createFromResource(this,R.array.static_list,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        spinner.setAdapter(adapter);
    }
}
