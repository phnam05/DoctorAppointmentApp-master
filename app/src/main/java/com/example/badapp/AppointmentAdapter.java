package com.example.badapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.AppointmentViewHolder> {

    private List<Appointment> appointmentsList;

    public AppointmentAdapter(List<Appointment> appointmentsList) {
        this.appointmentsList = appointmentsList;
    }

    @NonNull
    @Override
    public AppointmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.appointment_item, parent, false);
        return new AppointmentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AppointmentViewHolder holder, int position) {
        Appointment appointment = appointmentsList.get(position);
        holder.bind(appointment);
    }

    @Override
    public int getItemCount() {
        return appointmentsList.size();
    }

    static class AppointmentViewHolder extends RecyclerView.ViewHolder {
        TextView patientName, appointmentDate, appointmentType, appointmentNote, appointmentTime;

        AppointmentViewHolder(View itemView) {
            super(itemView);
            patientName = itemView.findViewById(R.id.tvPatientName);
            appointmentDate = itemView.findViewById(R.id.tvAppointmentDate);
            appointmentType = itemView.findViewById(R.id.tvAppointmentType);
            appointmentNote = itemView.findViewById(R.id.tvNote);
            appointmentTime = itemView.findViewById(R.id.tvAppointmentTime);
        }

        void bind(Appointment appointment) {
            patientName.setText(appointment.getPatientName());
            String dateTime = appointment.getAppointmentDate() + ", " + appointment.getTime();
            appointmentDate.setText(dateTime);
            appointmentType.setText(appointment.getAppointmentType());
            appointmentNote.setText(appointment.getNote());
            appointmentTime.setText(appointment.getTime()); // If needed separately
        }
    }
}
