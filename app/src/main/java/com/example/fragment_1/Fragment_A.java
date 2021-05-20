package com.example.fragment_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_A#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_A extends Fragment {


    LayoutInflater inflater=null;
    //Datos de cada item
    RecyclerView recyclerview;

    String titulos []={ "Juan", "Maria", "Mariano", "Juan", "Ricardo", "Pedro", "Diego", "Rocio"};
    String descripciones[]={"Ing. Sistemas", "Piloto", "Novelista", "Cantante", "Abogado", "Militar", "Ing. Sistemas", "Arquitecta"};
    int avatar[]={R.drawable.ba, R.drawable.bb,  R.drawable.bc,  R.drawable.bd,  R.drawable.be, R.drawable.bf,
            R.drawable.bg,  R.drawable.bh};


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public  Fragment_A() {
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
     * @return A new instance of fragment Fragment_A.
     */

    // TODO: Rename and change types and number of parameters


    public static Fragment_A newInstance(String param1, String param2) {
        Fragment_A fragment = new Fragment_A();
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
        // Inflate the layout for this fragment

        //instanciamos recycler
         View view = inflater.inflate(R.layout.fragment__a, container,false);


        recyclerview=(RecyclerView)view.findViewById(R.id.RecyclerVi);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setAdapter(new Datos( getContext(),titulos,descripciones,avatar));



        return view;

    }
}