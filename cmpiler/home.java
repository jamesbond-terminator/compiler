package com.jamesbon.cmpiler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

public class home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize views
        TextView textView = view.findViewById(R.id.textView);
        SearchView searchView = view.findViewById(R.id.searchView);
        ImageView notificationIcon = view.findViewById(R.id.notificationIcon);
        FrameLayout bookFrame = view.findViewById(R.id.book);
        RelativeLayout course = view.findViewById(R.id.course);
        RelativeLayout paper = view.findViewById(R.id.paper);
        RelativeLayout result = view.findViewById(R.id.result);

        // book fragment

        bookFrame.setOnClickListener(v -> {
            Fragment bookFragment = new test();
            ((MainActivity) getActivity()).loadFragment(bookFragment);
        });

        // course

        course.setOnClickListener(v -> {
            Fragment courseFragment = new course();
            ((MainActivity) getActivity()).loadFragment(courseFragment);
        });

        // paper

        paper.setOnClickListener(v -> {
            Fragment paperFragment = new paper();
            ((MainActivity) getActivity()).loadFragment(paperFragment);
        });

        // result

        result.setOnClickListener(v -> {
            String url = "https://coe1.annauniv.edu/home/";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        // Show notification fragment

        notificationIcon.setOnClickListener(v -> {
            notificationIcon notificationFragment = new notidialog();
            notificationFragment.setCancelable(true);
            notificationFragment.show(getChildFragmentManager(), "notificationFragment");
        });



        // Set up the SearchView functionality
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        });

        return view;
    }
}
