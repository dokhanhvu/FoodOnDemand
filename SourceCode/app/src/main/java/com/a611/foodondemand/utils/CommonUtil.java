package com.a611.foodondemand.utils;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by pnhung on 2/12/2017.
 */

public class CommonUtil {
    public static <T extends View> T findViewById(View view, int id) {
        return (T) view.findViewById(id);
    }

    public static <T extends View> T findViewById(Activity activity, int id) {
        return (T) activity.findViewById(id);
    }

    public static void showToast(Activity view, String msg, int duration) {
        Toast.makeText(view, msg, duration).show();
    }
}
