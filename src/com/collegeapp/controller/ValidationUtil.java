/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collegeapp.controller;
import com.collegeapp.model.StudentModel;

/**
 *
 * @author rushav
 */
public class ValidationUtil extends StudentModel{
    public static boolean isLmuIdValid(String lmuId) {
        try {
            int id = Integer.parseInt(lmuId);
            return id >= 1000 && id <= 10000;
        } catch (NumberFormatException e) {
            return false; 
        }
    }
    
    public static boolean isCollegeIdValid(String clgId) {
        try {
            int id = Integer.parseInt(clgId);
            return id >= 1000 && id <= 10000;
        } catch (NumberFormatException e) {
            return false; 
        }
    }
    
    public static boolean isNameValid(String name) {
         return name.matches("^[a-zA-Z ]+$");
    }
    
    public static boolean isNumValid(String num) {
        return num.matches("^98\\\\d{8}$");
    }
    
    public static boolean isAgeValid(String age) {
        try {
            int ageVal = Integer.parseInt(age);
            return ageVal >= 7 && ageVal <= 60;
        } catch (NumberFormatException e) {
            return false; 
        }
    }

    
    public static boolean IsEmpty(String value){
            return value == null || value.trim().isEmpty();
    }
    
    public static boolean isModuleEmpty(String mod) {
        return mod == null || mod.trim().isEmpty();
    }
}