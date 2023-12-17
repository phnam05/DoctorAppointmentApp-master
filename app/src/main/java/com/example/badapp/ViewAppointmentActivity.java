package com.example.badapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ViewAppointmentActivity extends AppCompatActivity {
    ProgressBar progressBar;

    Button backHomeButton;
    private RecyclerView recyclerView;
    private AppointmentAdapter adapter;
    private List<Appointment> appointments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_appointment);
        backHomeButton = findViewById(R.id.btnHome);
        backHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewAppointmentActivity.this, PatientHomeActivity.class));
            }
        });
        // Initialize the RecyclerView and set its layout manager
        recyclerView = findViewById(R.id.recycler_view_appointments);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize your appointment list
        // Initialize the appointments ArrayList
        ArrayList<Appointment> appointments = new ArrayList<>();
        Doctor doctor1 = new Doctor();

        // Add appointments to the list
        appointments.add(new Appointment("Alice Brown", "alice.brown@email.com", "15 Jan 2023",
                "Online", "Please be gentle", "09:00am - 12:00pm",
                "ID123", doctor1));
        appointments.add(new Appointment("Bob Smith", "bob.smith@email.com", "20 Jan 2023",
                "Offline", "Regular check-up", "10:00am - 11:00am",
                "ID124", doctor1));
        appointments.add(new Appointment("Charlie Davis", "charlie.davis@email.com", "25 Jan 2023",
                "Online", "Consultation", "02:00pm - 03:00pm",
                "ID125", doctor1));
        adapter = new AppointmentAdapter(appointments);
        recyclerView.setAdapter(adapter);
    }
}