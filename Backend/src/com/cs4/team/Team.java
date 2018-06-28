package com.cs4.team;

public class Team {

    private String teamID;

    public Team(int number){
        teamID = "frc" + number;
    }

    public Team(String number){
        teamID = "frc" + number;
    }
}
