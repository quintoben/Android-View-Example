package com.example.quintoben.material;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by quintoben on 5/10/17.
 */

public class ContactDecoration extends RecyclerView.ItemDecoration {
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        //1px
        outRect.set(0, 0, 0, 1);
    }
}
