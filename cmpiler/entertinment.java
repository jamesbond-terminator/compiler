package com.example.myvedio;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        WebView webView1 = findViewById(R.id.webView1);
        String video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KLuTLF3x9sA?si=BlFMgKh482J_SfsI\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webView1.loadData(video1, "text/html","utf=8");
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebChromeClient(new WebChromeClient());

        WebView webView2 = findViewById(R.id.webView2);
        String video2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/cHBqwj0Ed_I?si=htcBda8M43mJEq83\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webView2.loadData(video2, "text/html","utf=8");
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebChromeClient(new WebChromeClient());

        WebView webView3 = findViewById(R.id.webView3);
        String video3 = " <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bfubuYExbiU?si=xCTcApbxKp4DwiZE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webView3.loadData(video2, "text/html","utf=8");
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.setWebChromeClient(new WebChromeClient());

        WebView webView4 = findViewById(R.id.webView4);
        String video4 = "  <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JUECfGWh6gI?si=d675MJsNz0GfcLsu\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webView4.loadData(video2, "text/html","utf=8");
        webView4.getSettings().setJavaScriptEnabled(true);
        webView4.setWebChromeClient(new WebChromeClient());

    }
}