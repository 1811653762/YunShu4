package com.tck.transportation.Utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

private static Context mContext;
	
	public static void init(Context context){
		mContext = context;
	}

	public static void show(String msg){
		if(mContext == null){
			try {
				throw new Exception("please call init() then use show() method !");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
	}
	
}
