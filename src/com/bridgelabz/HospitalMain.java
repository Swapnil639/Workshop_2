package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalMain {
    public static Scanner scanner = new Scanner(System.in);
    ArrayList<Patient> patientArrayList = new ArrayList<>();

    public static void main(String[] args) {
        HospitalMain hospitalMain = new HospitalMain();
        hospitalMain.addPatientDetail();
        boolean condition=true;

        while (condition==true) {
            System.out.println("Choose option \n1.Add \n2.Edit \n3.Delete \n4.New patient");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    hospitalMain.addPatientDetail();
                    condition=false;
                    break;
                case 2:
                    hospitalMain.editPatientDetail();
                    condition=false;
                    break;
                case 3:
                    hospitalMain.deletePatientDetail();
                    condition=false;
                    break;
                case 4:
                    hospitalMain.addNewPatientDetail();
                    condition=false;
                    break;
                default:
                    System.out.println("Invalid option");
                    condition=true;
            }
        }


    }

    public void addPatientDetail() {
        Patient patient1 = new Patient();

        System.out.println("Enter your name :");
        patient1.setName(scanner.next());

        System.out.println("Enter your age :");
        patient1.setAge(scanner.nextInt());

        System.out.println("Enter your Phone number :");
        patient1.setPhoneNumber(scanner.nextLong());

        System.out.println("Enter your City :");
        patient1.setCity(scanner.next());

        System.out.println("Enter your State :");
        patient1.setState(scanner.next());


        patientArrayList.add(patient1);
        System.out.println(patientArrayList);
        System.out.println("Successfully create contact !");

    }

    public void editPatientDetail() {
        System.out.println("Enter name for edit");
        String editname = scanner.next();
        for (int i = 1; i < patientArrayList.size(); i++) {
            if (patientArrayList.get(i).getName().equalsIgnoreCase(editname)) {
                System.out.println("select option");
                System.out.println("Choose option \n1.Name \n2.Age \n3.Phone Number \n4.city \n5.State");
                int editoption = scanner.nextInt();
                switch (editoption) {
                    case 1:
                        System.out.println("Enter your name :");
                        patientArrayList.get(i).setName(scanner.next());
                        break;

                    case 2:
                        System.out.println("Enter your age :");
                        patientArrayList.get(i).setAge(scanner.nextInt());
                        break;

                    case 3:
                        System.out.println("Enter your Phone number :");
                        patientArrayList.get(i).setPhoneNumber(scanner.nextLong());
                        break;

                    case 4:
                        System.out.println("Enter your City :");
                        patientArrayList.get(i).setCity(scanner.next());
                        break;

                    case 5:
                        System.out.println("Enter your State :");
                        patientArrayList.get(i).setCity(scanner.next());
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
            }
                System.out.println("Edited list is :");
                System.out.println(patientArrayList);

        }
    }

    public void deletePatientDetail() {
        System.out.println("Conform name for delete");
        String name = scanner.next();
        System.out.println(name);
        for (int i = 1; i < patientArrayList.size(); i++) {
            if (patientArrayList.get(i).getName().equals(name)) {
                Patient patient = patientArrayList.get(i);
                patientArrayList.remove(patient);
            }
        }
        System.out.println(patientArrayList);

    }

    public void addNewPatientDetail() {
        System.out.println("Enter number of patient");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            addPatientDetail();
            System.out.println(i + 1 + "patient detail add successfully");
        }
    }


}
