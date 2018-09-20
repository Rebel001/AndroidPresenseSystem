package com.example.admin.androidpresensesystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.firebase.database.DatabaseReference;

public class ListOnline extends AppCompatActivity {

    DatabaseReference onlineRef,currentUserRef,counterRef;
    FirebaseRecyclerAdapter< User , ListOnlineViewHolder > adapter; //this is new

    RecyclerView listOnline;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_online);
        //init view
        listOnline = (RecyclerView)findViewById(R.id.listOnline);
        listOnline.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this );
        listOnline.setLayoutManager(layoutManager);
        //set toolbar and logout/ join menu
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbar.setTitle("Presense System");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
      return true;
    }
}
