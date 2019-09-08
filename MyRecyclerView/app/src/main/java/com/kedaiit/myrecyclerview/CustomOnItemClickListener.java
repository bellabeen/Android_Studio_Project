package com.kedaiit.myrecyclerview;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {
    private static int position;
    private OnItemClickCallback onItemClikCallback;
    CustomOnItemClickListener (int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClikCallback = onItemClickCallback;
    }
    @Override
    public void onClick(View view) {
        onItemClikCallback.onItemClicked(view, position);
    }
    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
