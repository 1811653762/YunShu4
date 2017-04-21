package com.tck.transportation.Utils;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.tck.transportation.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {


	public     String getString(TextView view)
	{
		return  view.getText().toString().trim();
	}
	/**
	 * 跳转页面，动画效果
	 * 
	 * @param curActivity
	 *            当前活动
	 * @param targetActivity
	 *            目标活动
	 * @param finish
	 *            是否结束当前活动
	 */
	public  void gotoActivity(Activity curActivity,
			Class<?> targetActivity, boolean finish) {
		Intent intent = new Intent();
		intent.setClass(curActivity, targetActivity);
		curActivity.startActivity(intent);
		curActivity.overridePendingTransition(R.anim.slide_left_in,
				R.anim.slide_left_out);

		if (finish) {
			curActivity.finish();
		}
	}

	/**
	 * 跳转页面--带数据传递
	 * 
	 * @param curActivity
	 *            当前活动
	 * @param targetActivity
	 *            目标活动
	 * @param bundle
	 *            需要传递的数据
	 * @param finish
	 *            是否结束当前活动
	 */
	public  void gotoActivityWithData(Activity curActivity,
											Class<?> targetActivity, Bundle bundle, boolean finish) {
		Intent intent = new Intent();
		intent.setClass(curActivity, targetActivity);
		intent.putExtras(bundle);
		curActivity.startActivity(intent);
		curActivity.overridePendingTransition(R.anim.slide_left_in,
				R.anim.slide_left_out);

		if (finish) {
			curActivity.finish();
		}
	}

	/**
	 * 跳转页面--带数据传递
	 * 
	 * @param curActivity
	 *            当前活动
	 * @param targetActivity
	 *            目标活动
	 * @param bundle
	 *            需要传递的数据
	 * @param finish
	 *            是否结束当前活动
	 */
	public  void gotoActivityWithDataForResult(Activity curActivity,
			Class<?> targetActivity, Bundle bundle, int RequestCode,
			boolean finish) {
		Intent intent = new Intent();
		intent.setClass(curActivity, targetActivity);
		intent.putExtras(bundle);
		curActivity.startActivityForResult(intent, RequestCode);
		curActivity.overridePendingTransition(R.anim.slide_left_in,
				R.anim.slide_left_out);

		if (finish) {
			curActivity.finish();
		}
	}

	/**
	 * 跳转页面，动画效果
	 * 
	 * @param curActivity
	 *            当前活动
	 * @param targetActivity
	 *            目标活动
	 * @param finish
	 *            是否结束当前活动
	 */
	public  void gotoActivityForResult(Activity curActivity,
			Class<?> targetActivity, int Code, boolean finish) {
		Intent intent = new Intent();
		intent.setClass(curActivity, targetActivity);
		curActivity.startActivityForResult(intent, Code);
		curActivity.overridePendingTransition(R.anim.slide_left_in,R.anim.slide_left_out);

		if (finish) {
			curActivity.finish();
		}
	}

	/**
	 * 跳转页面--结束中间活动
	 * 
	 * @param curActivity
	 *            当前活动
	 * @param targetActivity
	 *            目标活动
	 * @param refresh
	 *            是否刷新要跳转界面
	 */
	public  void gotoActivityWithFinishOtherAll(Activity curActivity,
			Class<?> targetActivity, boolean refresh) {
		Intent intent = new Intent();
		intent.setClass(curActivity, targetActivity);
		if (!refresh) {
			intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);// 设置不要刷新将要跳到的界面
		}
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);// 它可以关掉所要到的界面中间的activity
		curActivity.startActivity(intent);
		curActivity.overridePendingTransition(R.anim.slide_left_in,
				R.anim.slide_left_out);
	}




	/**
	 * 验证字符串是否为网址
	 */
	public  boolean isUrl(String url) {
		String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern patt = Pattern.compile(regex);
		Matcher matcher = patt.matcher(url);
		return matcher.matches();
	}

	/**
	 * 验证字符串是否为数字
	 */
	public  boolean isNumeric(String url) {
		Pattern patt = Pattern.compile("[0-9]*");
		Matcher matcher = patt.matcher(url);
		return matcher.matches();
	}

	/**
	 * 获取版本号
	 * 
	 * @return
	 */
//	public static int getVersionCode() {
//		PackageManager manager = SysEnv.context.getPackageManager();
//		try {
//			PackageInfo info = manager.getPackageInfo(
//					SysEnv.context.getPackageName(), 0);
//			return info.versionCode;
//		} catch (NameNotFoundException e) {
//			return -1;
//		}
//	}



	
}