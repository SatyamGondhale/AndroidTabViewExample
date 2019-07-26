package com.example.tabviewexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabTwo extends Fragment {

    RadioGroup branches;

    public TabTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       final View v=inflater.inflate(R.layout.tab_two, container, false);
        branches=v.findViewById(R.id.radioGroup);
        branches.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id=radioGroup.getCheckedRadioButtonId();
                RadioButton b=(RadioButton)v.findViewById(id);
                Toast.makeText(getActivity(),b.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        });
        return v;
    }

}
