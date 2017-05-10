package com.example.quintoben.material;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by quintoben on 5/9/17.
 */

public class InviteFriendsActivity extends AppCompatActivity {

    //view for contact
    private RecyclerView recyclerView;
    //search contact edit text
    private EditText etSearch;
    //use for quickly find contact
    private SideBar sideBar;
    //show contact
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    //default data
    private String[] name = {"Bob","Cindy","Bob","Cindy","Bob","Cindy","Bob","Cindy","Bob","Cindy"};
    private String[] phone = {"123456789","123456789","123456789","123456789","123456789","123456789","123456789","123456789","123456789","123456789"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friends);
        initView();
    }

    //init view
    private void initView() {
        sideBar = (SideBar) findViewById(R.id.sidrbar);
        etSearch = (EditText) findViewById(R.id.et_search);

        mRecyclerView = (RecyclerView)findViewById(R.id.contacts_recycler);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        mAdapter = new ContactAdapter(name,phone);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new ContactDecoration());


    }
}
