package com.example.cgpa_calc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sem1frag extends Fragment {

    public sem1frag() {}

    Button sem1butt;
    EditText physicsmarks1;
    EditText chemmarks1;
    EditText mechmarks1;
    EditText beemarks1;
    EditText mathsmarks1;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_sem1frag, container, false);
        physicsmarks1=view.findViewById(R.id.Phymarks1);
        chemmarks1=view.findViewById(R.id.Chemmarks1);
        mathsmarks1=view.findViewById(R.id.Mathsmarks1);
        mechmarks1=view.findViewById(R.id.Mechmarks1);
        beemarks1=view.findViewById(R.id.Beemarks1);
        sem1butt=view.findViewById(R.id.sem1butt);
        result=view.findViewById(R.id.result);

        sem1butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maths=mathsmarks1.getText().toString();
                String mech=mechmarks1.getText().toString();
                String bee=beemarks1.getText().toString();
                String phys=physicsmarks1.getText().toString();
                String chem=chemmarks1.getText().toString();

                if(maths.isEmpty() || bee.isEmpty() || mech.isEmpty() || phys.isEmpty() || chem.isEmpty()){
                    result.setTextColor(getResources().getColor(R.color.red));
                    result.setText("Error ! Fields Are Left Blank");
                }
                else{

                    int a=Integer.parseInt(maths);
                    int b=Integer.parseInt(mech);
                    int c=Integer.parseInt(bee);
                    int d=Integer.parseInt(phys);
                    int e=Integer.parseInt(chem);
                    double answer = ((a+b+c+d+e)/5.0)/10.0;
                    result.setTextColor(getResources().getColor(R.color.green));
                    result.setText("CGPA : "+answer);
                }
            }
        });

        return view;
    }
}