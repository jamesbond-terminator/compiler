package com.jamesbond.terminator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class course extends Fragment {

    private VideoView videoView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course, container, false);

        // Initialize VideoView if you plan to use it

        // Set up click listeners
        setupClickListener(view, R.id.c1, "https://youtu.be/DuSbZoh_7TI?si=NNcnIMr-zFaoainH");
        setupClickListener(view, R.id.c2, "https://youtu.be/vg_2FkWgL04?si=wfZvOCYd8ZAJM6Ud");
        setupClickListener(view, R.id.c3, "https://youtu.be/PKFvMIa37tY?si=OwzHOsfTBPEs6scm");
        setupClickListener(view, R.id.c4, "https://youtu.be/b2opIFiOpGw?si=jT1NRUYDW9cHdrYJ");
        setupClickListener(view, R.id.c5, "https://youtu.be/xDCj8RM5OTg?si=f05FaVyAkcXxuvPH");
        setupClickListener(view, R.id.c6, "https://youtu.be/NslZK-3RJXo?si=euNLksWql8MVvmtD");
        setupClickListener(view, R.id.c7, "https://youtu.be/98wHiXX_jmk?si=JW8tGQCh0veYQnYy");
        setupClickListener(view, R.id.c8, "https://youtu.be/PlM82pVD6xE?si=EYjxOunu_fkM9pWN");
        setupClickListener(view, R.id.c9, "https://youtu.be/XGAQgVKw1GI?si=rE3N1nxlC5EcjQbQ");
        setupClickListener(view, R.id.c10, "https://youtu.be/6x63PnU4Llg?si=O0jL9NWUN-esro2_");

        return view;
    }

    private void setupClickListener(View view, int linearLayoutId, String url) {
        LinearLayout linearLayout = view.findViewById(linearLayoutId);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(v -> {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            });
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (videoView != null && videoView.isPlaying()) {
            videoView.pause();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (videoView != null) {
            videoView.start();
        }
    }
}

