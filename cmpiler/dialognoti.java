package com.jamesbon.cmpiler;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class dialognoti extends DialogFragment {

    private String message;

    // Use this method to pass data to the fragment
    public static dialognoti newInstance(String message) {
        dialognoti fragment = new dialognoti();
        Bundle args = new Bundle();
        args.putString("message", message);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_notidialog, container, false);

        // Retrieve message from arguments
        if (getArguments() != null) {
            message = getArguments().getString("message");
        }

        TextView notificationMessage = view.findViewById(R.id.notificationMessage);
        notificationMessage.setText(message);

        return view;
    }
}
