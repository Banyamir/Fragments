package com.example.fragment_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Datos1 extends RecyclerView.Adapter <Datos1.ViewHolder> {


    //variables globales
    //layout inflater se utiliza para instanciar el archivo de diseño y que se muestre en MainActivity
    LayoutInflater inflater=null;
    //generar los datos
    Context context;
    String[] titulo;
    String [] descripcion;
    String [] edad;
    String [] telefono;
    String [] ciudad;

    int [] avatar;
    //generar constructor

    public Datos1(Context context, String[] titulo, String[] descripcion,
                  String[] edad,String[] telefono,String[] ciudad, int[] avatar) {
        this.context = context;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.edad = edad;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.avatar = avatar;

        //inicializar inflater
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }




    @NonNull
    @Override
    public Datos1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view =inflater.inflate(R.layout.item_fila2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }
    //asignar datos a cada una de las posiciones
    @Override
    public void onBindViewHolder(@NonNull Datos1.ViewHolder holder, int position){

        holder.titulo.setText(titulo[position]);
        holder.descripcion.setText(descripcion[position]);
        holder.edad.setText(edad[position]);
        holder.ciudad.setText(ciudad[position]);
        holder.telefono.setText(telefono[position]);
        holder.avatar.setImageResource(avatar[position]);




    }
    @Override
    public int getItemCount(){
        return titulo.length;
    }

    //generar vista, extends RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, descripcion, edad, ciudad, telefono;
        ImageView avatar;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            titulo=itemView.findViewById(R.id.titulo);
            descripcion=itemView.findViewById(R.id.descripcion);
            avatar=itemView.findViewById(R.id.avatar);
            edad=itemView.findViewById(R.id.edad);
            ciudad=itemView.findViewById(R.id.ciudad);
            telefono=itemView.findViewById(R.id.telefono);








        }




    }

}
