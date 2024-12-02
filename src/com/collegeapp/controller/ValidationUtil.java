/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collegeapp.controller;
import com.collegeapp.model.StudentModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rushav
 */
public class ValidationUtil extends StudentModel{
    public static boolean isLmuIdValid(String lmuId) {
        try {
            int id = Integer.parseInt(lmuId);
            
            if(id < 1000 || id > 10000){
               JOptionPane.showMessageDialog(null, "Please Enter An Id Between 1000 And 10000!", "Invalid College ID", JOptionPane.ERROR_MESSAGE);  
               return false;
            }
            
            if(!lmuId.matches("^23\\d{6}$")){
               JOptionPane.showMessageDialog(null, "Id Must Start With 23 And Have 8 Digits", "Invalid College ID", JOptionPane.ERROR_MESSAGE);  
               return false;
            }
            
            return true;
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "LMU Id Is Not Valid", "Invalid College ID", JOptionPane.ERROR_MESSAGE);  

            return true; 
        }
    }
    
    public static boolean isCollegeIdValid(String clgId) {
        try {
            int id = Integer.parseInt(clgId);
            
            if(id < 1000 || id > 10000){
                JOptionPane.showMessageDialog(null, "Please Enter An Id Between 1000 And 10000!", "Invalid College ID", JOptionPane.ERROR_MESSAGE);  
                return false;
            }
                
            if(!clgId.matches("^23\\d{6}$")){
                JOptionPane.showMessageDialog(null, "College Id Must Start With 23 And Have 12 Digits", "Invalid College ID", JOptionPane.ERROR_MESSAGE);   
                return false;
            }
            
            return true;
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "College ID Must Be a Valid Number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return true; 
        }
    }
    
    public static boolean isNameValid(String name) {
         return name.matches("^[a-zA-Z ]+$");
    }
    
    public static boolean isNumValid(String num) {
        return num.matches("^98\\d{8}$");
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