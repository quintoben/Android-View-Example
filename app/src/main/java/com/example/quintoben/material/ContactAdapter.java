package com.example.quintoben.material;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by quintoben on 5/10/17.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private String[] name;
    private String[] phone;
    private int num;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        private LinearLayout linearLayout;
        private TextView nameView;
        private TextView numberView;
        public ViewHolder(LinearLayout v) {
            super(v);
            this.linearLayout = v;
            nameView = (TextView)v.findViewById(R.id.name);
            numberView = (TextView)v.findViewById(R.id.number);
        }

    }

    // Provide a suitable constructor
    public ContactAdapter(String[] name,String[] phone) {
        this.name = name;
        this.phone = phone;
    }

    public ContactAdapter(int num){
        this.num=num;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view

        LinearLayout v = (LinearLayout)LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false);
        ContactAdapter.ViewHolder vh = new ContactAdapter.ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ContactAdapter.ViewHolder holder, int position) {

        holder.nameView.setText(name[position]);
        holder.numberView.setText(phone[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return name.length;
    }
}
