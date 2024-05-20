package com.example.menudemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MainActivity2 extends ArrayAdapter<String> {

    private int resource;

    public MainActivity2(@NonNull Context context, int resource, @NonNull String[] objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String item = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resource, parent, false);
        }
        TextView textView = convertView.findViewById(android.R.id.text1);
        textView.setText(item);
        textView.setTextSize(20);
        return convertView;
    }
}
