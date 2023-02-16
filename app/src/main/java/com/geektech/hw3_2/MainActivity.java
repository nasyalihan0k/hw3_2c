package com.geektech.hw3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> contactList;
    private ContactAdapter adapter;

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView = findViewById(R.id.rv_contacts);
            loadData();
            adapter = new ContactAdapter(contactList);
            recyclerView.setAdapter(adapter);

            {

            }
        }
            

    }

    private void loadData() {
        contactList = new ArrayList<>();
        contactList.add("калькулятор");
        contactList.add("плей маркет");
        contactList.add("часы");
        contactList.add("галерея");
        contactList.add("музыка");
        contactList.add("гугл");
        contactList.add("телефон");
        contactList.add("календарь");
        contactList.add("емаил");
        contactList.add("гугл карта");
        contactList.add("хром");
        contactList.add("телеграм");
        contactList.add("заметки");
        contactList.add("настройки");
    }
}

    