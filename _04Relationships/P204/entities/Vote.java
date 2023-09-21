package _04Relationships.P204.entities;

import java.util.HashSet;

public class Vote {
    private Student studentVotes;
    private HashSet<Student> votedStudents;

    public Vote() {}

    public void setStudentVotes(Student studentVotes) {
        this.studentVotes = studentVotes;
    }

    public Student getStudentVotes() {
        return studentVotes;
    }

    public void setVotedStudents(HashSet<Student> votedStudents) {
        this.votedStudents = votedStudents;
    }

    public HashSet<Student> getVotedStudents() {
        return votedStudents;
    }
}
