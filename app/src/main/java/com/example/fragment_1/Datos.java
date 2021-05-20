package com.example.fragment_1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Datos extends RecyclerView.Adapter <Datos.ViewHolder> {


    //variables globales
    //layout inflater se utiliza para instanciar el archivo de diseño y que se muestre en MainActivity
    LayoutInflater inflater=null;
    //generar los datos
    Context context;
    String[] titulo;
    String [] descripcion;

    int [] avatar;
    //generar constructor

    public Datos(Context context, String[] titulo, String[] descripcion, int[] avatar) {
        this.context = context;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.avatar = avatar;

        //inicializar inflater
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public Datos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view =inflater.inflate(R.layout.item_fila, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }
    //asignar datos a cada una de las posiciones
    @Override
    public void onBindViewHolder(@NonNull Datos.ViewHolder holder, int position){

        holder.titulo.setText(titulo[position]);
        holder.descripcion.setText(descripcion[position]);
        holder.avatar.setImageResource(avatar[position]);



    }
    @Override
    public int getItemCount(){
        return titulo.length;
    }

    //generar vista, extends RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, descripcion;
        ImageView avatar;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            titulo=itemView.findViewById(R.id.titulo);
            descripcion=itemView.findViewById(R.id.descripcion);
            avatar=itemView.findViewById(R.id.avatar);





        }




    }

}
