package com.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapterWithViewHolder extends ArrayAdapter<UserRow> {

    private Context context;
    ArrayList<UserRow> users;

    public UserAdapterWithViewHolder(Context context, ArrayList<UserRow>users) {
        super(context, R.layout.user_row,users);
        this.context = context;
        this.users = users;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.user_row, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.image = (ImageView) convertView.findViewById(R.id.userProfile);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.phone = (TextView) convertView.findViewById(R.id.phone);
            viewHolder.email = (TextView) convertView.findViewById(R.id.email);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.image.setImageResource(users.get(position).getImageID());
        viewHolder.name.setText(users.get(position).getName());
        viewHolder.phone.setText(users.get(position).getPhone());
        viewHolder.email.setText(users.get(position).getEmail());

        return convertView;
    }

    private class ViewHolder{
        ImageView image;
        TextView name;
        TextView phone;
        TextView email;
    }
}
