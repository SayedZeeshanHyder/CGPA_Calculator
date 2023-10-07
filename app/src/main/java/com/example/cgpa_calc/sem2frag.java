package com.example.cgpa_calc;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sem2frag extends Fragment {

    public sem2frag() {}
    Button sem2butt;
    EditText physicsmarks2;
    EditText chemmarks2;
    EditText mechmarks2;
    EditText beemarks2;
    EditText mathsmarks2;
    EditText pcemarks2;
    TextView result2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sem2frag, container, false);

        pcemarks2=view.findViewById(R.id.pcemarks2);
        physicsmarks2=view.findViewById(R.id.Phymarks2);
        chemmarks2=view.findViewById(R.id.Chemmarks2);
        mathsmarks2=view.findViewById(R.id.Mathsmarks2);
        mechmarks2=view.findViewById(R.id.Mechmarks2);
        beemarks2=view.findViewById(R.id.Beemarks2);
        sem2butt=view.findViewById(R.id.sem2butt);
        result2=view.findViewById(R.id.result2);

        sem2butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maths=mathsmarks2.getText().toString();
                String mech=mechmarks2.getText().toString();
                String bee=beemarks2.getText().toString();
                String phys=physicsmarks2.getText().toString();
                String chem=chemmarks2.getText().toString();
                String pce=pcemarks2.getText().toString();

                if(maths.isEmpty() || bee.isEmpty() || mech.isEmpty() || phys.isEmpty() || chem.isEmpty() || pce.isEmpty()){
                    result2.setTextColor(getResources().getColor(R.color.red));
                    result2.setText("Error ! Fields Are Left Blank");
                }
                else{
                    int a=Integer.parseInt(maths);
                    int b=Integer.parseInt(mech);
                    int c=Integer.parseInt(bee);
                    int d=Integer.parseInt(phys);
                    int e=Integer.parseInt(chem);
                    int f=Integer.parseInt(pce);
                    double answer = ((a+b+c+d+e+f)/6.0)/10.0;
                    result2.setTextColor(getResources().getColor(R.color.green));
                    result2.setText("CGPA : "+answer);
                }

            }
        });
        return view;
    }
}