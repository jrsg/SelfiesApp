package com.example.administrador.selfiesapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Administrador on 18/02/2017.
 */

public class SelfieAdapter extends RecyclerView.Adapter<SelfieAdapter.SelfieViewHolder>{
    private List<Selfie> datos;

    public SelfieAdapter(){
        datos = new ArrayList<Selfie>();

        datos.add(new Selfie(1, "Titulo 1"));
        datos.add(new Selfie(2, "Titulo 2"));
        datos.add(new Selfie(3, "Titulo 3"));


        datos.add(new Selfie(4, "Titulo 4"));
        datos.add(new Selfie(5, "Titulo 5"));
        datos.add(new Selfie(6, "Titulo 6"));

        datos.add(new Selfie(7, "Titulo 7"));
        datos.add(new Selfie(8, "Titulo 8"));
        datos.add(new Selfie(9, "Titulo 9"));

        datos.add(new Selfie(10, "Titulo 10"));
        datos.add(new Selfie(11, "Titulo 11"));
        datos.add(new Selfie(12, "Titulo 12"));
    }

    @Override
    public SelfieAdapter.SelfieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        SelfieAdapter.SelfieViewHolder holder = new SelfieViewHolder(vista);

        return holder;
    }

    @Override
    public void onBindViewHolder(SelfieViewHolder holder, int position) {
        String titulo = datos.get(position).getTitulo();
        holder.texto.setText(titulo);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class SelfieViewHolder extends RecyclerView.ViewHolder {
        public TextView texto;

        SelfieViewHolder(View itemView) {
            super(itemView);
            texto = (TextView) itemView.findViewById(android.R.id.text1);
        }
    }

}
