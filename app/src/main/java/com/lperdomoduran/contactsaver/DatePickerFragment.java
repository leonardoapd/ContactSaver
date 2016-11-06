package com.lperdomoduran.contactsaver;

/**
 * Created by lperdomoduran on 4/11/16.
 */


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;


public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        // do some stuff for example write on log and update TextField on activity
        Log.w("DatePicker", "Date = " + year);

        ((TextView) getActivity().findViewById(R.id.tvYear)).setText("" + year);
        ((TextView) getActivity().findViewById(R.id.tvDay)).setText("" + day);

        switch (month) {
            case 0:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.enero));
                break;
            case 1:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.febrero));
                break;
            case 2:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.marzo));
                break;
            case 3:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.abril));
                break;
            case 4:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.mayo));
                break;
            case 5:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.junio));
                break;
            case 6:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.julio));
                break;
            case 7:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.agosto));
                break;
            case 8:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.sept));
                break;
            case 9:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.oct));
                break;
            case 10:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.nov));
                break;
            case 11:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.dic));
                break;
            default:
                ((TextView) getActivity().findViewById(R.id.tvMonth)).setText(getResources().getString(R.string.enero));
                break;

        }
    }

}