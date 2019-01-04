package com.wxx.sb.domain;

public class StudentScores {
    private Integer id;
    private String studentName;
    private String studentPhone;
    private Score scores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public Score getScores() {
        return scores;
    }

    public void setScores(Score scores) {
        this.scores = scores;
    }
}
