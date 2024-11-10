package com.example.android_lab_2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Андрей"));
        contactList.add(new Contact("Виктория"));
        contactList.add(new Contact("Олег"));
        contactList.add(new Contact("Мария"));
        contactList.add(new Contact("Дмитрий"));

        ContactList contactLIst = new ContactList(contactList, this);
        recyclerView.setAdapter(contactLIst);
    }
}