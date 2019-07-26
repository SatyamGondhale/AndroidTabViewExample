package com.example.tabviewexample;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabOne extends Fragment {

    Button showSnack;

    public TabOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.tab_one, container, false);
        showSnack=v.findViewById(R.id.showSnackbar);
        showSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(showSnack,"Task Completed",Snackbar.LENGTH_SHORT);
                snackbar.setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(),"Snackbar Completed",Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();
            }
        });
        return v;
    }

}
