package com.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<UserRow> {


    private Context context;
    ArrayList<UserRow> users;
    public UserAdapter(Context context, ArrayList<UserRow>users) {
        super(context, R.layout.user_row,users);
        this.context = context;
        this.users = users;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.user_row,parent,false);

        ImageView image = (ImageView) convertView.findViewById(R.id.userProfile);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView phone = (TextView) convertView.findViewById(R.id.phone);
        TextView email = (TextView) convertView.findViewById(R.id.email);

        image.setImageResource(users.get(position).getImageID());
        name.setText(users.get(position).getName());
        phone.setText(users.get(position).getPhone());
        email.setText(users.get(position).getEmail());

        return convertView;
    }
}
