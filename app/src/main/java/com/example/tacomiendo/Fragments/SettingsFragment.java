package com.example.tacomiendo.Fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.tacomiendo.R;

public class SettingsFragment extends Fragment {

    TextView edit_set_frequency, edit_frequency;
    final String[] option = new String[1];

    public SettingsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        edit_set_frequency = (TextView) view.findViewById(R.id.edit_set_frequency);
        edit_frequency = (TextView) view.findViewById(R.id.edit_frequency);

        final AlertDialog alert = setupDialog();

        edit_set_frequency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.show();
                edit_frequency.setText(option[0]);
            }
        });
        return view;
    }

    public AlertDialog setupDialog(){
        final String[] items = {"Correo diario", "Correo semanal", "Correo mensual", "No recibir correos"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Frecuencia de notificaciones por correo");
        builder.setIcon(R.drawable.ic_email);
        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                option[0] = items[item];
                //Toast.makeText(getContext(), items[item], Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getContext(), "Success", Toast.LENGTH_SHORT).show();
                        Toast.makeText(getContext(), option[0], Toast.LENGTH_SHORT).show();
                    }
                });
        builder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getContext(), "Fail", Toast.LENGTH_SHORT).show();
                    }
                });

        return builder.create();
    }

}
