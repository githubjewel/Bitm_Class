package com.acrophillic.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

   private SharedPreferences sharedPreferences;
   private SharedPreferences.Editor editor;


    public SharedPreference(Context context) {

        sharedPreferences = context.getSharedPreferences("Batch-16",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveData(String data){

         editor.putString("message", data);
         editor.commit();
    }

    public String getData(){

       return sharedPreferences.getString("message","No Data Found...").trim();
    }
}
