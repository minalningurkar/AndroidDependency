package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void ShowToast(Context context,String string){
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
    }
}
