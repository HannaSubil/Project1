package com.hanna.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebviewActivity extends AppCompatActivity {
EditText urlet;
WebView wv;
Button go;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        urlet=(EditText) findViewById(R.id.url);
        wv=(WebView) findViewById(R.id.webview);
        go=(Button) findViewById(R.id.button);
        wv.setWebViewClient(new WebViewClient());

go.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String urlstring=urlet.getText().toString();
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("https://www."+urlstring+".com");
    }
});
    }

}