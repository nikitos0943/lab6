package com.example.students;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    private int id;
    private String number;
    private String facultyName;
    private int educationLevel;
    private boolean contractExistsFlg;
    private boolean privilegeExistsFlg;

    public StudentsGroup(int id, String number, String facultyName,
                         int educationLevel, boolean contractExistsFlg, boolean privilegeExistsFlg){
        this(number, facultyName, educationLevel, contractExistsFlg, privilegeExistsFlg);
        this.id = id;
    }

    public StudentsGroup(String number, String facultyName,
                         int educationLevel, boolean contractExistsFlg, boolean privilegeExistsFlg){
        this.number = number;
        this.facultyName = facultyName;
        this.educationLevel = educationLevel;
        this.contractExistsFlg = contractExistsFlg;
        this.privilegeExistsFlg = privilegeExistsFlg;
    }

    public int getId(){
        return id;
    }

    public String getNumber(){
        return number;
    }

    public String getFacultyName(){
        return facultyName;
    }

    public int getEducationLevel(){
        return educationLevel;
    }

    public boolean isContractExistsFlg(){
        return  contractExistsFlg;
    }

    public boolean isPrivilageExistsFlg(){
        return privilegeExistsFlg;
    }

    private static ArrayList<StudentsGroup> groups = new ArrayList<StudentsGroup>(
            Arrays.asList(
                    new StudentsGroup("К20-1", "Компьютерные науки", 0, true, false),
                    new StudentsGroup("К21-1", "Компьютерные науки", 0, false, true),
                    new StudentsGroup("К21-1м", "Компьютерные науки", 1, true, false)
            )
    );

    public static void addGroup(StudentsGroup group){
        groups.add(group);
    }

    public static StudentsGroup getGroup(String groupNumber){
        for (StudentsGroup g: groups){
            if(g.getNumber().equals(groupNumber)){
                return g;
            }
        }
        return null;
    }

    public static  ArrayList<StudentsGroup> getGroups(){
        return groups;
    }

    @Override
    public String toString(){
        return number;
    }
}
