package com.jamesbond.terminator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class book extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book, container, false);

        // b1

        LinearLayout b1 = view.findViewById(R.id.b1);
        b1.setOnClickListener(v -> {
            Fragment b1Fragment = new BookPagesFragment();
            ((MainActivity) getActivity()).loadFragment(b1Fragment);
        });

        // b2

        LinearLayout b2 = view.findViewById(R.id.b2);
        b2.setOnClickListener(v -> {
            Fragment b2Fragment = new BookPagesFragment();
            ((MainActivity) getActivity()).loadFragment(b2Fragment);
        });

        // b3

        LinearLayout b3 = view.findViewById(R.id.b3);
        b2.setOnClickListener(v -> {
            Fragment b3f = new BookPagesFragment();
            ((MainActivity) getActivity()).loadFragment(b3f);
        });

        // b4

        LinearLayout b4 = view.findViewById(R.id.b4);
        b2.setOnClickListener(v -> {
            Fragment b4f = new BookPagesFragment();
            ((MainActivity) getActivity()).loadFragment(b4f);
        });

        // b5

        LinearLayout b5 = view.findViewById(R.id.b5);
        b2.setOnClickListener(v -> {
            Fragment b5f = new BookPagesFragment();
            ((MainActivity) getActivity()).loadFragment(b5f);
        });

    return view;
    }
}
