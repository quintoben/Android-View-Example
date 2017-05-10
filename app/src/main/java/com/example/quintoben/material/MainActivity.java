package com.example.quintoben.material;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

/**
 * Created by quintoben on 5/5/17.
 */

public class MainActivity extends AppCompatActivity {

    //buttons below provide entries to different activities
    private Button historyButton;
    private Button inviteButton;
    private Button legalButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        historyButton = (Button)findViewById(R.id.history);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HistoryActivity.class);
                startActivity(intent);
            }
        });

        inviteButton = (Button)findViewById(R.id.invite);
        inviteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,InviteFriendsActivity.class);
                startActivity(intent);
            }
        });

        legalButton = (Button)findViewById(R.id.legal);
        legalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LegalActivity.class);
                startActivity(intent);
            }
        });
    }
}
