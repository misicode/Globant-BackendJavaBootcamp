package org.amincia._04Relationships.Exercises.P204.entities;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String fullname;
    private int idDoc;
    private Integer numVotes;

    public Student() {}

    public Student(String fullname, int idDoc) {
        this.fullname = fullname;
        this.idDoc = idDoc;
        this.numVotes = 0;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setIdDoc(Integer idDoc) {
        this.idDoc = idDoc;
    }

    public void setNumVotes(Integer numVotes) {
        this.numVotes = numVotes;
    }

    public Integer getNumVotes() {
        return numVotes;
    }

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getNumVotes().compareTo(student2.getNumVotes());
    }

    @Override
    public String toString() {
        return "ESTUDIANTE: [Nombres: " + fullname +
                ", Documento: " + idDoc +
                ", N° de votos: " + numVotes + "]";
    }
}
