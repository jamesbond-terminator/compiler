package com.jamesbond.terminator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

public class home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the correct layout
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize views using the inflated view with the correct types
        TextView textView = view.findViewById(R.id.textView); // Correct type
        SearchView searchView = view.findViewById(R.id.searchView); // Correct type
        ImageView notificationIcon = view.findViewById(R.id.notificationIcon);
        FrameLayout bookFrame = view.findViewById(R.id.book);
        FrameLayout course = view.findViewById(R.id.course); // This should remain FrameLayout
        FrameLayout paper = view.findViewById(R.id.paper); // This should remain FrameLayout
        FrameLayout result = view.findViewById(R.id.result); // This should remain FrameLayout
        FrameLayout tt = view.findViewById(R.id.time);

        // Set up click listeners
        bookFrame.setOnClickListener(v -> {
            Fragment bookFragment = new book(); // Make sure this class exists
            ((MainActivity) getActivity()).loadFragment(bookFragment);
        });

        course.setOnClickListener(v -> {
            Fragment courseFragment = new course(); // Make sure this class exists
            ((MainActivity) getActivity()).loadFragment(courseFragment);
        });

        paper.setOnClickListener(v -> {
            Fragment paperFragment = new paper(); // Make sure this class exists
            ((MainActivity) getActivity()).loadFragment(paperFragment);
        });

        result.setOnClickListener(v -> {
            String url = "https://coe1.annauniv.edu/home/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        notificationIcon.setOnClickListener(v -> {
            notidialog notificationFragment = new notidialog(); // Make sure this class exists
            notificationFragment.setCancelable(true);
            notificationFragment.show(getChildFragmentManager(), "notificationFragment");
        });

        //tt

        tt.setOnClickListener(v -> {
            Fragment ttfragment = new tt();
            ((MainActivity) getActivity()).loadFragment(ttfragment);
        });


        return view; // Return the inflated view
    }
}
