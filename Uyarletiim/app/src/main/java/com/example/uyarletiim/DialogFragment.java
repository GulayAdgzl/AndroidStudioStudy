package com.example.uyarletiim;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DialogFragment  extends androidx.fragment.app.DialogFragment {

    Toast toast;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder (getActivity ());
        builder.setPositiveButton (R.string.fab_transformation_scrim_behavior, new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int id) {


            }
        })
                .setNegativeButton (R.string.cancel, new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }




                });
        return builder.create ();






    }

    private void finish() {
    }
}
