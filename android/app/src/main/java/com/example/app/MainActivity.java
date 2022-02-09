package com.example.app;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onStart() {
        super.onStart();

        this.bridge.setWebViewClient(new CustomWebViewClient(this.bridge));
    }

}
