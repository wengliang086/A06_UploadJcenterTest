package com.test.basetools;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/4/28.
 */
public class T {

    public static void s(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
