package com.example.hoathan.templeandroid1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hoathan.templeandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tungnguyenbk54 on 10/4/2017.
 */
 public class ListAAdapter extends RecyclerView.Adapter<ListAAdapter.ViewHolder> {
    private List<String> mList = new ArrayList<>();

    public ListAAdapter(List<String> list) {
        if (list != null) mList.addAll(list);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.text_view);
        }
    }

    @Override
    public ListAAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAAdapter.ViewHolder holder, int position) {
        holder.textView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}