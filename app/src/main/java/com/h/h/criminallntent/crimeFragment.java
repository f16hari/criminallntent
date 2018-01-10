package com.h.h.criminallntent;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Date;

public class crimeFragment extends Fragment {
    private crime mcrime;
    private EditText tf;
    private Button datebutton;
    private CheckBox checkBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mcrime=new crime();

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
      View v=inflater.inflate(R.layout.activity_crime_fragment,container,false);
        tf=(EditText)v.findViewById(R.id.title);
        tf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mcrime.setMtitle(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        datebutton=(Button)v.findViewById(R.id.crime_date);
        datebutton.setText(mcrime.getDate().toString());
        datebutton.setEnabled(false);
        checkBox=(CheckBox)v.findViewById(R.id.crime_solved);
        checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mcrime.setSolved(b);

            }
        });
      return  v;



    }
}
