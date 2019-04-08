package com.yaolunwei.demo.usb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.util.Log;

/**
 * <pre>
 *     author : ylw
 *     e-mail : bigoatsm@gmail.com
 *     time   : 19-4-8
 *     desc   : USB插拔通知
 * </pre>
 */
public class USBReceiver extends BroadcastReceiver {
    private static final String TAG = "USBReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        /**
         * USB连接上手机时会发送广播android.hardware.usb.action.USB_STATE"及UsbManager.ACTION_USB_DEVICE_ATTACHED
         * 判断其中一个就可以了
         */
        if (intent.getAction().equals(UsbManager.ACTION_USB_DEVICE_ATTACHED)) {
            // USB插入
            Log.d(TAG, "USB插入");

        } else if (intent.getAction().equals(UsbManager.ACTION_USB_DEVICE_DETACHED)) {
            // USB拔出


        }

    }
}
