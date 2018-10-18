package com.example.classbase;

import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Content {
    @Id
    @GeneratedValue
    private Integer teacherId;

    private String teacherName;

    private String courseId;

    private String courseName;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String first;
    private String second;
    private String third;
    private String fourth;
    private String fifth;
    private String sixth;
    private String seventh;
    private String eighth;
    private String ninth;
    private String tenth;
    private String eleventh;
    private String twelfth;
    private String thirteenth;
    private String fourteenth;
    private String fifteenth;
    private String sixteenth;

    public Content() {
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    public String getSixth() {
        return sixth;
    }

    public void setSixth(String sixth) {
        this.sixth = sixth;
    }

    public String getSeventh() {
        return seventh;
    }

    public void setSeventh(String seventh) {
        this.seventh = seventh;
    }

    public String getEighth() {
        return eighth;
    }

    public void setEighth(String eighth) {
        this.eighth = eighth;
    }

    public String getNinth() {
        return ninth;
    }

    public void setNinth(String ninth) {
        this.ninth = ninth;
    }

    public String getTenth() {
        return tenth;
    }

    public void setTenth(String tenth) {
        this.tenth = tenth;
    }

    public String getEleventh() {
        return eleventh;
    }

    public void setEleventh(String eleventh) {
        this.eleventh = eleventh;
    }

    public String getTwelfth() {
        return twelfth;
    }

    public void setTwelfth(String twelfth) {
        this.twelfth = twelfth;
    }

    public String getThirteenth() {
        return thirteenth;
    }

    public void setThirteenth(String thirteenth) {
        this.thirteenth = thirteenth;
    }

    public String getFourteenth() {
        return fourteenth;
    }

    public void setFourteenth(String fourteenth) {
        this.fourteenth = fourteenth;
    }

    public String getFifteenth() {
        return fifteenth;
    }

    public void setFifteenth(String fifteenth) {
        this.fifteenth = fifteenth;
    }

    public String getSixteenth() {
        return sixteenth;
    }

    public void setSixteenth(String sixteenth) {
        this.sixteenth = sixteenth;
    }
}
