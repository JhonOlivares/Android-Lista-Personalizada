package com.example.tarea03_ejercicio02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ItemListAdapter extends ArrayAdapter<Item> {
    private  static final String TAG = "ItemListAdapter";
    private Context mContext;
    int mResourse;

    public ItemListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Item> objects) {
        super(context, resource, objects);
        mContext = context;
        mResourse = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        //get item information
        String titulo = getItem(position).getTitulo();
        String subtitulo = getItem(position).getSubtitulo();

        //create the item object  with the information
        Item item = new Item(titulo, subtitulo);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResourse, parent, false);

        TextView tvTitulo = convertView.findViewById(R.id.tv_MainText);
        TextView tvSubTitulo = convertView.findViewById(R.id.tv_SecondText);

        tvTitulo.setText(titulo);
        tvSubTitulo.setText(subtitulo);

        return convertView;
    }
}
