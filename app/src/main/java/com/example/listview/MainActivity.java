package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    ListView listView;
    ArrayList<String> listitems = new ArrayList<>();
    ArrayAdapter<String> adapter;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
         b1=findViewById(R.id.b1);
         listView=findViewById(R.id.listview);

         adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,listitems);
         listView.setAdapter(adapter);

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 listitems.add(e1.getText().toString());
                 adapter.notifyDataSetChanged();
                 e1.setText("");
             }
         });

     }
}