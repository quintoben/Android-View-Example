package com.example.quintoben.material;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LegalActivity extends AppCompatActivity {

    //show items view
    private ListView legalListView;
    //data list
    List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
    //legal list item name
    private String[] legalItemName= {"Copyright",
                                     "Terms & Conditions",
                                     "Privacy Policy",
                                     "Data Providers",
                                     "Software License",
                                     "Location Information"
                                    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal);
        legalListView=(ListView)findViewById(R.id.legal_list);
        //set map
        for(int i=0;i<legalItemName.length;i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("legal_item", legalItemName[i]);
            list.add(map);
        }
        //define adapter
        SimpleAdapter adapter = new SimpleAdapter(this,
                list,
                R.layout.item_legal,
                new String[] {"legal_item"},
                new int[] {R.id.legal_item_text});
        //set adapter
        legalListView.setAdapter(adapter);
        //set header divider
        legalListView.addHeaderView(new ViewStub(this));
        //set divider color
        legalListView.setDivider(new ColorDrawable(Color.WHITE));
        //set divider height
        legalListView.setDividerHeight(1);
    }
}
