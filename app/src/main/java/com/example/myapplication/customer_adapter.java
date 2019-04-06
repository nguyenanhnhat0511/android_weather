package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class customer_adapter extends ArrayAdapter<String> {
    List<String> data;
    int resource;
    Context context;
    public customer_adapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.data = objects;
        this.context = context;
        this.resource =resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textLayout = (TextView) convertView.findViewById(R.id.text_layout);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textLayout.setText(data.get(position));
        return convertView;
    }

    public class ViewHolder {
        TextView textLayout;

    }
}
