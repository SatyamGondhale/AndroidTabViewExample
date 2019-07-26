package com.example.tabviewexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabThree extends Fragment implements View.OnClickListener {


    CheckBox c1,c2,c3,c4;
    public TabThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.tab_three, container, false);
        c1=v.findViewById(R.id.java);
        c2=v.findViewById(R.id.android);
        c3=v.findViewById(R.id.git);
        c4=v.findViewById(R.id.python);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getActivity(),c1.getText().toString()+" Checked",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getActivity(),c1.getText().toString()+" Unchecked",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.java:
                Toast.makeText(getActivity(),c1.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.android:
                Toast.makeText(getActivity(),c2.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.git:
                Toast.makeText(getActivity(),c3.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.python:
                Toast.makeText(getActivity(),c4.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
