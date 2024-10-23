package com.jamesbond.terminator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class course extends Fragment {

    private WebView webView1, webView2, webView3, webView4, webView5, webView6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course, container, false);

        // Initialize WebViews
        webView1 = view.findViewById(R.id.webView1);
        webView2 = view.findViewById(R.id.webView2);
        webView3 = view.findViewById(R.id.webView3);
        webView4 = view.findViewById(R.id.webView4);
        webView5 = view.findViewById(R.id.webView5);
        webView6 = view.findViewById(R.id.webView6);

        // Enable JavaScript
        enableWebViewSettings(webView1);
        enableWebViewSettings(webView2);
        enableWebViewSettings(webView3);
        enableWebViewSettings(webView4);
        enableWebViewSettings(webView5);
        enableWebViewSettings(webView6);

        // Load YouTube video URLs
        webView1.loadUrl("https://youtu.be/V2KCAfHjySQ?si=7TjxSIjsjIsKzq_9");
        webView2.loadUrl("<iframe width=\"100%\" height=\"100%  \" src=\"https://www.youtube.com/embed/V2KCAfHjySQ?si=xVE1ybr8jJplsdd7\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>");
        webView3.loadUrl("https://www.youtube.com/embed/YOUR_VIDEO_ID_3");
        webView4.loadUrl("https://www.youtube.com/embed/YOUR_VIDEO_ID_4");
        webView5.loadUrl("https://www.youtube.com/embed/YOUR_VIDEO_ID_5");
        webView6.loadUrl("https://www.youtube.com/embed/YOUR_VIDEO_ID_6");

        return view;
    }

    private void enableWebViewSettings(WebView webView) {
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
