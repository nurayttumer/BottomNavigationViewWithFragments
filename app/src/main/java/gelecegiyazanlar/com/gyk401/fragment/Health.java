package gelecegiyazanlar.com.gyk401.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import gelecegiyazanlar.com.gyk401.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Health extends Fragment {


    public Health() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
