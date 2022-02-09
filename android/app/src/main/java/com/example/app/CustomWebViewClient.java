package com.example.app;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

import com.getcapacitor.Bridge;
import com.getcapacitor.BridgeWebViewClient;

public class CustomWebViewClient extends BridgeWebViewClient {
    public CustomWebViewClient(Bridge bridge) {
        super(bridge);
        Log.d("APP", "NEW WEB VIEW CLIENT CREATED");
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(final WebView view, WebResourceRequest request) {
        Log.d("APP", "should override? " + request.getUrl());
        return super.shouldInterceptRequest(view, request);
    }
}
