package com.shaihi.dialogtest;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class placeholdercode {
    TextView tvDate;

    private void datePicker(){
        final Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                null/*MainActivity.this*/,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tvDate.setText(String.format("%02d/%02d/%04d", day, month+1, year));
                    }
                },
                year,
                month,
                day);
        datePickerDialog.show();
    }

    private void timePicker(){
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(
                null/*MainActivity.this*/,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        // Set selected time to the TextView
                        tvDate.setText(String.format("%02d:%02d", hourOfDay, minute));
                    }
                }, hour, minute, true);
        timePickerDialog.show();
    }
}
