package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.printf("Welcome %s\n", UIMenu.doctorLogged.getName());

            System.out.println("1. Add available appointment");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        } while (response != 0);
    }

    private static void showAvailableAppointments() {
        int response = 0;

        do {
            System.out.println("Add available appointment");
            System.out.println("Select a date");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.printf("%d. %s", j, UIMenu.MONTHS[i]);
            }

            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());


            if (response > 0 && response < 4) {
                System.out.printf("%d. %s\n", response, UIMenu.MONTHS[response]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");

                String date = sc.nextLine();

                System.out.printf("Your date is %s\n1.Correct\n2.ChangeDate\n", date);

                int responseDate = Integer.parseInt(sc.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.printf("Insert the time available for date: %s [16:00]\n", date);
                    time = sc.nextLine();
                    System.out.printf("Your time is: %s\n1. Correct \n2. Change Time\n", time);
                    responseTime = Integer.parseInt(sc.nextLine());
                } while (responseTime == 2);

                UIMenu.doctorLogged.addAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);


            } else if (response == 0) {
                showDoctorMenu();
            }

        } while (response != 0);

    }

    private static void checkDoctorAvailableAppointments(Doctor doctor) {
        if (doctor.getAvailableApointmens().size() > 0 && !doctorsAvailableAppointments.contains(doctor )) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
