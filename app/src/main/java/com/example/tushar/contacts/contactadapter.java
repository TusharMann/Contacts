package com.example.tushar.contacts;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tushar on 18-05-2016.
 */
public class contactadapter extends ArrayAdapter<contact> {

    Context context;
    ArrayList<contact> contacts;

    public contactadapter(Context context, ArrayList<contact> tvList) {
        super(context,0,tvList);
        this.context = context;
        this.contacts = tvList;


    }

    @Override
    public int getCount() {
        return contacts.size();
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder {
        TextView showname;
        TextView shownumber;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(context, R.layout.adapterlayout, null);

            ViewHolder vh = new ViewHolder();

            vh.showname = (TextView) convertView.findViewById(R.id.name);
            vh.shownumber = (TextView) convertView.findViewById(R.id.name);

            convertView.setTag(vh);

        }

        ViewHolder vh = (ViewHolder) convertView.getTag();

        contact c = contacts.get(position);
        String contactname = c.getName();
        String contactnumber=c.getNumber();

        vh.showname.setText(contactname);
        vh.shownumber.setText(contactnumber);



        return convertView;
    }



}
