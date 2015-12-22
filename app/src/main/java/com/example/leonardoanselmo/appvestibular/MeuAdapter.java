package com.example.leonardoanselmo.appvestibular;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by everton on 22/12/2015.
 */
public class MeuAdapter extends ArrayAdapter<Questao> {
    private List<Questao> values;
    private int mSelectedItem;
    private Context context;

    public MeuAdapter(Context context, List<Questao> values) {
        super(context, R.layout.layout_navigation_drawer);
        this.values = values;
        this.context = context;
    }

    public int getmSelectedItem() {
        return mSelectedItem;
    }

    public void setmSelectedItem(int mSelectedItem) {
        this.mSelectedItem = mSelectedItem;
    }

    @Override
    public int getCount() {
        return this.values.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.layout_navigation_drawer, parent, false);
        TextView txt = (TextView) rowView.findViewById(R.id.txt_nav_drawer);
        txt.setText(values.get(position).diminuirEnuciado());
        if (values.get(position).getStatus() == 1) {
            txt.setBackgroundColor(getContext().getResources().getColor(android.R.color.holo_green_dark));
        }else if (values.get(position).getStatus() == 2){
            txt.setBackgroundColor(getContext().getResources().getColor(android.R.color.holo_red_dark));
        }else{
            txt.setBackgroundColor(getContext().getResources().getColor(android.R.color.white));
        }

        return rowView;
    }
}
