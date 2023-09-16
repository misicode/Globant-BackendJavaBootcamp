package _01POO.P113.entities;

public class Course {
    private String name;
    private int hoursPerDay;
    private int daysPerWeek;
    private Turn turn;
    private float pricePerHour;
    private Student[] students;

    public Course() {}

    public Course(String name, int hoursPerDay, int daysPerWeek, Turn turn, float pricePerHour, Student[] students) {
        this.name = name;
        this.hoursPerDay = hoursPerDay;
        this.daysPerWeek = daysPerWeek;
        this.turn = turn;
        this.pricePerHour = pricePerHour;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "CURSO:" +
                "\nNombre: " + name +
                "\nHoras por día: " + hoursPerDay +
                "\nDías por semana: " + daysPerWeek +
                "\nTurno: " + turn.getTurn() +
                "\nPrecio por hora: S/" + pricePerHour +
                "\nEstudiantes: " + students.length;
    }
}
