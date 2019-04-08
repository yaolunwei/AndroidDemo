package com.yaolunwei.demo.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * <pre>
 *     author : ylw
 *     e-mail : bigoatsm@gmail.com
 *     time   : 19-4-8
 *     desc   : USB插入通知
 * </pre>
 */
public class UsbNoticeActivity extends AppCompatActivity {
    private static final String TAG = "UsbNoticeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usb_notice);

        TextView textView = findViewById(R.id.text);

        UsbDevice device = getIntent().getParcelableExtra(UsbManager.EXTRA_DEVICE);


        textView.setText(device.toString());

        Log.d(TAG, "UsbDevice: " + device.toString());
    }
}
