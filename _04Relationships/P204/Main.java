package org.amincia._04Relationships.P204;

import org.amincia._04Relationships.P204.entities.Student;
import org.amincia._04Relationships.P204.entities.Vote;
import org.amincia._04Relationships.P204.services.SimulatorService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SimulatorService simulatorService = new SimulatorService();

        ArrayList<Student> students = simulatorService.generateStudents();
        simulatorService.showStudents(students);

        ArrayList<Vote> votes = simulatorService.vote(students);
        simulatorService.showVotes(votes);

        simulatorService.votesCount(students);
        simulatorService.chooseTeam(students);
    }
}
