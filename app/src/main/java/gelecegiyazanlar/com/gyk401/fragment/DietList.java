package gelecegiyazanlar.com.gyk401.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import gelecegiyazanlar.com.gyk401.R;
import gelecegiyazanlar.com.gyk401.adapters.DietListAdapter;
import gelecegiyazanlar.com.gyk401.models.Diet;

/**
 * A simple {@link Fragment} subclass.
 */
public class DietList extends Fragment {

    final List<Diet> dietList = new ArrayList<Diet>();

    public DietList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list,null);
        // Inflate the layout for this fragment
        dietList.add(new Diet(R.drawable.menu_3,"Yumurta,peynir,zeytin","5000C"));
        dietList.add(new Diet(R.drawable.menu_1,"Mevsim yeşillikleri salata","2000C"));
        dietList.add(new Diet(R.drawable.menu_2,"Badem,fındık,ceviz","4000C"));
        dietList.add(new Diet(R.drawable.menu_4,"Kivi,çilek,muz","1000C"));

        ListView myDietList = (ListView) view.findViewById(R.id.list_fragment_diet_listview);
        DietListAdapter dietListAdapter = new DietListAdapter(getLayoutInflater(),dietList);
        myDietList.setAdapter(dietListAdapter);



        return view;
    }

}
