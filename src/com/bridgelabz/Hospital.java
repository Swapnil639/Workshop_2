package com.bridgelabz;



public class Hospital {
    public enum Department{
        ONCOLOGY, NEUROLOGY , CARDIOLOGY ,GYNOCOLOGY
    }

    public Department department;

    public Hospital(Department department) {
        this.department = department;
    }

    public static void main(String[] args) {
        String str=" ONCOLOGY";
        Hospital hospital=new Hospital(Department.valueOf(str));

    }






}
