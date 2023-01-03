package com.example.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;


public class home_Fragment extends Fragment {

    ImageButton mCustomTripBtn;
    ImageButton mWeekendBreakBtn;
    ImageButton mHolidayPkgBtn;
    ImageButton mCountrySideBtn;
    ImageButton mCategoryBtn;



    public home_Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_home_, null);


        mCustomTripBtn = (ImageButton) view.findViewById(R.id.customTripBtn);
        mWeekendBreakBtn = (ImageButton) view.findViewById(R.id.weekendBreakbtn);
        mHolidayPkgBtn = (ImageButton) view.findViewById(R.id.holidayPkgbtn);
        mCountrySideBtn = (ImageButton) view.findViewById(R.id.countrySidebtn);
        mCategoryBtn = (ImageButton) view.findViewById(R.id.categorybtn);


        mCustomTripBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_, container, false);



    }

    private void showDialog()
    {
        Intent intent = new Intent(getActivity(), PopUpDesViewModel.class);
        startActivity(intent);
    }

    public void onButtonClick(View view) {
        showDialog();
    }
}