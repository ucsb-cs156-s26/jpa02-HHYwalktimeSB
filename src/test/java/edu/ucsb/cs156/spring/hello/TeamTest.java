package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        //team = new Team("test-team");    
        team = Developer.getTeam();
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("s26-07"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void testmember() {
       assert(team.getMembers().contains("Hanson"));
       assert(team.getMembers().contains("Emerson"));
       assert(team.getMembers().contains("Raymond"));
       assert(team.getMembers().contains("Waytt"));
       assert(team.getMembers().contains("David"));
       assert(team.getMembers().contains("Alexander"));
       assert(team.getMembers().contains("Andrew"));
    }
}
