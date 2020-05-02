package com.example.drtravel.Dashboard.PenandaActivity;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drtravel.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PenandaFragment extends Fragment {


    public PenandaFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_penanda, container, false);
        return view;
    }

}
