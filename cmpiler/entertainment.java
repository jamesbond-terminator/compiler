 package com.example.booksvideo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        WebView webView = findViewById(R.id.webView);
        WebView webView1 = findViewById(R.id.webView1);
        WebView webView2 = findViewById(R.id.webView2);
        WebView webView3 = findViewById(R.id.webView3);
        WebView webView4 = findViewById(R.id.webView4);
        WebView webView5 = findViewById(R.id.webView5);
        WebView webView6 = findViewById(R.id.webView6);
        WebView webView7 = findViewById(R.id.webView7);
        WebView webView8 = findViewById(R.id.webView8);
        WebView webView9 = findViewById(R.id.webView9);
        WebView webView10 = findViewById(R.id.webView10);

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DuSbZoh_7TI?si=YuQPlHeOGLopTa8D\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vg_2FkWgL04?si=S5uZ5TbhafuhbP-M\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PKFvMIa37tY?si=kgayonP_AoMVS-8K\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video3 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/b2opIFiOpGw?si=6yv1Xo-sfiu9eF7c\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video4 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xDCj8RM5OTg?si=c58XFwTBcuMXpnBQ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video5 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NslZK-3RJXo?si=cNYR87o8bavgn7TY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video6 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/98wHiXX_jmk?si=QngWErlg9QozcYZj\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video7 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/98wHiXX_jmk?si=LFA_ljWc0C0Y9W4m\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video8 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PlM82pVD6xE?si=euSjw9m4aPnziM4I\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video9 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XGAQgVKw1GI?si=pndfpgxFvd-0jH4A\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String video10 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6x63PnU4Llg?si=KRnAw1dI1crzPe9k\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";

        webView.loadData(video,"text/html","utf-8");
        webView1.loadData(video1,"text/html","utf-8");
        webView2.loadData(video2,"text/html","utf-8");
        webView3.loadData(video3,"text/html","utf-8");
        webView4.loadData(video4,"text/html","utf-8");
        webView5.loadData(video5,"text/html","utf-8");
        webView6.loadData(video6,"text/html","utf-8");
        webView7.loadData(video7,"text/html","utf-8");
        webView8.loadData(video8,"text/html","utf-8");
        webView9.loadData(video9,"text/html","utf-8");
        webView10.loadData(video10,"text/html","utf-8");


        webView.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView3.getSettings().setJavaScriptEnabled(true);
        webView4.getSettings().setJavaScriptEnabled(true);
        webView5.getSettings().setJavaScriptEnabled(true);
        webView6.getSettings().setJavaScriptEnabled(true);
        webView7.getSettings().setJavaScriptEnabled(true);
        webView8.getSettings().setJavaScriptEnabled(true);
        webView9.getSettings().setJavaScriptEnabled(true);
        webView10.getSettings().setJavaScriptEnabled(true);

        webView.setWebChromeClient(new WebChromeClient());
        webView1.setWebChromeClient(new WebChromeClient());
        webView2.setWebChromeClient(new WebChromeClient());
        webView3.setWebChromeClient(new WebChromeClient());
        webView4.setWebChromeClient(new WebChromeClient());
        webView5.setWebChromeClient(new WebChromeClient());
        webView6.setWebChromeClient(new WebChromeClient());
        webView7.setWebChromeClient(new WebChromeClient());
        webView8.setWebChromeClient(new WebChromeClient());
        webView9.setWebChromeClient(new WebChromeClient());
        webView10.setWebChromeClient(new WebChromeClient());
    }
}
