package com.example.cal_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class lst extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst);
        listview=findViewById(R.id.listview);

        String[] values =new  String[]{
                "مساحة المربع","محيط المربع",
                "مساحه المستطيل", "محيط المستطيل",
                "مساحة الدائرة","محيط الدائرة",
                "مساحة المثلث ","محيط المثلث ",
                "مساحة شبه المتوازي"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1,values);

        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position == 0){
                    Intent intent= new Intent(view.getContext(),squer.class);
                    startActivity(intent);
                }
            }
        });

    }
}