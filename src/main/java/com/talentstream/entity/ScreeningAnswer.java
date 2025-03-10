package com.talentstream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ScreeningAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "screening_question_id", nullable = false)
    @JsonBackReference
    private ScreeningQuestion screeningQuestion;

    @ManyToOne
    @JoinColumn(name="applicantid", referencedColumnName = "id")
    private Applicant applicant;

    @Column(nullable = false)
    private String answerText;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScreeningQuestion getScreeningQuestion() {
        return screeningQuestion;
    }

    public void setScreeningQuestion(ScreeningQuestion screeningQuestion) {
        this.screeningQuestion = screeningQuestion;
    }

    public Applicant getApplicant() {
    	return applicant;
    }
     
    public void setApplicant(Applicant applicant) {
    	this.applicant = applicant;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}
