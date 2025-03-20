package com.example.campus_psych_helper.entity;

import jakarta.persistence.*;

@Entity
public class TestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String result;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private PsychologicalTest test;
    @Column(name = "test_id", insertable = false, updatable = false)
    private Long testId;
    // 添加getter和setter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public PsychologicalTest getTest() {
        return test;
    }

    public void setTest(PsychologicalTest test) {
        this.test = test;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }
}