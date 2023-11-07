package com.misicode._04Relationships.Exercises.P204.services;

import com.misicode._04Relationships.Exercises.P204.entities.Student;
import com.misicode._04Relationships.Exercises.P204.entities.Vote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SimulatorService {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<String> generateFullNames(int num) {
        ArrayList<String> fullnames = new ArrayList<>();

        String[] names = {
                "Andrea", "David", "Luis", "Diana", "Bruno", "Baltasar", "Carlos", "Lucero", "Maria", "Juan",
                "Carolina", "Camila", "Sofia", "Jose", "Jean", "Alex", "Ronald", "Sara", "Carmen", "Julio"
        };
        String[] lastnames = {
                "Gomez", "Guerrero", "Cardenas", "Maza", "Peve", "Azorsa", "Bravo", "Carillo", "Soliz", "Castillo",
                "Herrera", "Castro", "Grande", "Rojas", "Luna", "Lopez", "Puma", "Trejo", "Morales", "Rema"
        };

        for(int i = 0; i < num; i++) {
            fullnames.add(names[(int) (Math.random() * names.length)] + " "
                    + lastnames[(int) (Math.random() * lastnames.length)]);
        }

        return fullnames;
    }
    private ArrayList<Integer> generateIdDocs(int num) {
        ArrayList<Integer> idDocs = new ArrayList<>();

        for(int i = 0; i < num; i++) {
            idDocs.add(validateUniqueIdDoc(idDocs));
        }

        return idDocs;
    }

    private int validateUniqueIdDoc(ArrayList<Integer> idDocs) {
        int idDoc;

        do {
            idDoc = (int) (Math.random() * (99999999 - 10000000 + 1)) + 10000000;
        } while(idDocs.contains(idDoc));

        return idDoc;
    }

    public ArrayList<Student> generateStudents() {
        ArrayList<Student> students = new ArrayList<>();
        int num;

        do {
            System.out.print("Ingrese el número de estudiantes (mayor o igual a 10): ");
            num = scanner.nextInt();
        } while(num < 10);

        for(int i = 0; i < num; i++) {
            Student student = new Student();
            student.setFullname(generateFullNames(num).get(i));
            student.setIdDoc(generateIdDocs(num).get(i));
            student.setNumVotes(0);

            students.add(student);
        }

        return students;
    }

    public void showStudents(ArrayList<Student> students) {
        System.out.println("\nLISTA DE ALUMNOS");
        for(Student student: students) {
            System.out.println(student);
        }
    }

    public ArrayList<Vote> vote(ArrayList<Student> students) {
        ArrayList<Vote> votes = new ArrayList<>();

        for(Student student: students) {
            Vote vote = new Vote();
            vote.setStudentVotes(student);

            HashSet<Student> votedStudents = new HashSet<>();
            do {
                int numStudent = (int) (Math.random() * students.size());
                Student votedStudent = students.get(numStudent);

                if(!votedStudent.equals(student) && votedStudents.add(votedStudent)) {
                    votedStudent.setNumVotes(votedStudent.getNumVotes() + 1);
                }
            } while(votedStudents.size() < 3);

            vote.setVotedStudents(votedStudents);
            votes.add(vote);
        }

        return votes;
    }

    public void showVotes(ArrayList<Vote> votes) {
        for(Vote vote: votes) {
            System.out.println("\nALUMNO");
            System.out.print("Nombres: " + vote.getStudentVotes().getFullname());
            System.out.println(", N° de votos: " + vote.getStudentVotes().getNumVotes());
            System.out.println("Votó por:");
            for(Student student: vote.getVotedStudents()) {
                System.out.println(student.getFullname());
            }
        }
    }

    public void votesCount(ArrayList<Student> students) {
        students.sort(new Student().reversed());

        System.out.println("\nRECUENTO DE VOTOS");
        System.out.println("Total de votos = " + students.size() * 3);
        for(Student student: students) {
            System.out.print("Alumno: " + student.getFullname());
            System.out.println(", N° de votos: " + student.getNumVotes());
        }
    }

    public void chooseTeam(ArrayList<Student> students) {
        students.sort(new Student().reversed());

        System.out.println("\nLISTA DE FACILITADORES");
        for(int i = 0; i < 5; i++) {
            System.out.println(students.get(i));
        }

        System.out.println("\nLISTA DE FACILITADORES SUPLENTES");
        for(int i = 5; i < 10; i++) {
            System.out.println(students.get(i));
        }
    }
}
