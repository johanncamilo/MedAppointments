package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.printf("Welcome: %s\n", UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");

//            Aqui hay un treemap
            //Numeración de la lista de fechas
            //Indice fecha seleccionada
            //[doctors]
            // 1.- doctor1
            // - 1 fecha1
            // - 2 fecha2
            // 2.- doctor2
            // 3.- doctor3
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableApointmens();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(j, UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(k, doctorAppointments);
                }
                Scanner sc = new Scanner(System.in);
                int responseDateSelected = Integer.parseInt(sc.nextLine());
                Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
                Integer indexDate = 0;
                Doctor doctorSelected = new Doctor("piu", "piu@piu.piu", "piupiupiu");

//                Recorrido para obtener los datos confirmados
                for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                    indexDate = doc.getKey();
                    doctorSelected = doc.getValue();
                }

                System.out.println(doctorSelected.getName() +
                        ". Date: " +
                        doctorSelected.getAvailableApointmens().get(indexDate).getDate() +
                        ". Time: " +
                        doctorSelected.getAvailableApointmens().get(indexDate).getTime());

                System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
                response = Integer.parseInt(sc.nextLine());

                if (response == 1) {
                    UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,
                            doctorSelected.getAvailableApointmens().get(indexDate).getDate(null),
                            doctorSelected.getAvailableApointmens().get(indexDate).getTime());
                    showPatientMenu();
                }
            }
        } while (response != 0);
    }

    private static void showPatientMyAppointments() {
        int response = 0;
        do {
            System.out.println("::My Appointments");
            if (UIMenu.patientLogged.getAppointmentDoctors().isEmpty()) {
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                );

                System.out.println("0. Return");
            }
        } while (response != 0);
    }
}
