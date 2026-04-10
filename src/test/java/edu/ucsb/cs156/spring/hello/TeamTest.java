package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
        //team = Developer.getTeam();
        team.addMember("aa");
        team.addMember("bb");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void testmember() {
       assert(!team.getMembers().contains("cc"));
       Team t = Developer.getTeam();
       assert(t.getMembers().contains("EMERSON JIANYI"));
       assert(t.getMembers().contains("RAYMOND"));
       assert(t.getMembers().contains("WYATT"));
       assert(t.getMembers().contains("DAVID HOING"));
       assert(t.getMembers().contains("ALEXANDER"));
       assert(t.getMembers().contains("ANDREW"));
       assert(t.getMembers().contains("HANSON"));
    }

    @Test
    public void testts() {
       assert(team.toString().equals("Team(name=test-team, members=[aa, bb])"));
       int res = team.hashCode();
       int expected = -1226199047;
       assertEquals(expected, res);
    }

    @Test
    public void testeq() {
       Team t1 = new Team();
       t1.setName("sjs");
       t1.addMember("shj");
       Team t2 = new Team();
       t2.setName("sjs");
       t2.addMember("shj");
       assert(t1.equals(t2));
       assert(t1.equals(t1));
       assert(!t1.equals("ah"));
       assertEquals(t1.hashCode(), t2.hashCode());
       t2.addMember("ahah");
       assert(!t1.equals(t2));
       Team t3 = new Team();
       t3.setName("aaaa");
       t3.addMember("shj");
       assert(!t1.equals(t3));
       assert(t1.hashCode()!=t3.hashCode());

    }
}
