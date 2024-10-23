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
        webView7 = view.findViewById(R.id.webView7);
        webView8 = view.findViewById(R.id.webView8);
        webView9 = view.findViewById(R.id.webView9);
        webView10 = view.findViewById(R.id.webView10);
      

// Enable JavaScript
        enableWebViewSettings(webView1);
        enableWebViewSettings(webView2);
        enableWebViewSettings(webView3);
        enableWebViewSettings(webView4);
        enableWebViewSettings(webView5);
        enableWebViewSettings(webView6);
        enableWebViewSettings(webView7);
        enableWebViewSettings(webView8);
        enableWebViewSettings(webView9);
        enableWebViewSettings(webView10);


// Load YouTube video URLs
        webView1.loadUrl("https://youtu.be/V2KCAfHjySQ?si=7TjxSIjsjIsKzq_9");
        webView2.loadUrl("https://youtu.be/DuSbZoh_7TI?si=BtrZz9HFWL4bWyO3");
        webView3.loadUrl("https://youtu.be/vg_2FkWgL04?si=NJU4lzdIlJTJ4QjH");
        webView4.loadUrl("https://youtu.be/PKFvMIa37tY?si=Ah2K5LjMw6JCgP1r");
        webView5.loadUrl("https://youtu.be/b2opIFiOpGw?si=G-Pwk6SihM_sBaKh");
        webView6.loadUrl("https://youtu.be/NslZK-3RJXo?si=1N3XdeZ8iSjd5DiN");
        webView7.loadUrl("https://youtu.be/NslZK-3RJXo?si=Qz6GNwzQ5qUaYgH5");
        webView8.loadUrl("https://youtu.be/PlM82pVD6xE?si=P3mTExTmF9-6ynEL");
        webView9.loadUrl("https://youtu.be/XGAQgVKw1GI?si=qJ_WvhArBMXb71z3");
        webView10.loadUrl("https://youtu.be/6x63PnU4Llg?si=6WfUDCaZOO9tollH");

        return view;
    }

    private void enableWebViewSettings(WebView webView) {
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
