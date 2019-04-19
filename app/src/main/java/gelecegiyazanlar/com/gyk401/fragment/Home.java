package gelecegiyazanlar.com.gyk401.fragment;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import gelecegiyazanlar.com.gyk401.R;
import gelecegiyazanlar.com.gyk401.fragments.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {
    EditText userWeightEt;
    EditText userLengthtEt;
    TextView userResultTv;
    Button calculateBtn;
    private HomeFragment.OnFragmentInteractionListener mListener;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        userWeightEt = (EditText) view.findViewById(R.id.home_fragment_user_weight_et);
        userLengthtEt = (EditText) view.findViewById(R.id.home_fragment_user_length_et);
        userResultTv = (TextView) view.findViewById(R.id.home_fragment_result_tv);

        calculateBtn = (Button) view.findViewById(R.id.home_fragment_calculate_btn);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
        return view;
    }
    private void calculate() {

        if (userWeightEt.getText().toString().length() > 0 && userLengthtEt.getText().toString().length() > 0) {


            float userWeight =  Float.parseFloat(userWeightEt.getText().toString());
            float userLength = Float.parseFloat(userLengthtEt.getText().toString());
            if(userLength>0){
                userLength = userLength / 100;
                float result = (userWeight / ((userLength * userLength)));

                String resultDescription = "";

                if (result < 15) {
                    resultDescription = "Aşırı Zayıf";
                } else if (result > 15 && result <= 30) {
                    resultDescription = "Zayıf";
                } else if (result > 30 && result <= 40) {
                    resultDescription = "Normal";
                } else if (result > 40) {
                    resultDescription = "Aşırı Şişman (Morbid Obez)";
                } else {
                    resultDescription = "Aşırı Şişman (Morbid Obez)";
                }

                userResultTv.setText("Vücut kitle endeksiniz: " + result + "\n" + resultDescription);
            }}else {

            final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setTitle("Hata!");
            builder.setMessage("Kilo ya da boy boş bırakılamaz.");
            builder.setNegativeButton("TAMAM", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int id) {

                }
            });

            builder.show();
        }
    }
}
