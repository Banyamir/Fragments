package com.example.fragment_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_B#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_B extends Fragment {

    LayoutInflater inflater=null;
    //Datos de cada item
    RecyclerView recyclerview;

    String titulos []={ "Juan", "Maria", "Mariano", "Juan", "Ricardo", "Pedro", "Diego", "Rocio"};
    String descripciones[]={"Ing. Sistemas", "Piloto", "Novelista", "Cantante", "Abogado", "Militar", "Ing. Sistemas", "Arquitecta"};
    int avatar[]={R.drawable.ba, R.drawable.bb,  R.drawable.bc,  R.drawable.bd,  R.drawable.be, R.drawable.bf,
            R.drawable.bg,  R.drawable.bh};
    String edades[]={"34","35","70","30","45","30","85","40"};
    String telefonos[]={"2265893567","263892657","6222478654","5268937657","1826637819","1726527399","187364987", "1237364987"};
    String ciudades[]={"México","Colima","Veracruz","Tlaxcala","Tijuana","Tamaulipas","Oaxaca","Veracruz"};





    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_B() {
        // Required empty public constructor
         //layout inflater se utiliza para instanciar el archivo de diseño y que se muestre en MainActivity

        LayoutInflater inflater=null;
        //Datos de cada item
        RecyclerView recyclerview;



    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_B.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_B newInstance(String param1, String param2) {
        Fragment_B fragment = new Fragment_B();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);



        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //instanciamos recycler
        View view = inflater.inflate(R.layout.fragment__b, container,false);


        recyclerview=(RecyclerView)view.findViewById(R.id.RecyclerVi);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setAdapter(new Datos1( getContext(),titulos,descripciones,ciudades,edades,telefonos,avatar));



        return view;


    }

}