package com.skax.academicadmin.domain;

public class Evaluation {
    private Long id;
    private Long applicantId;
    private String item;
    private Double weight;
    private Double score;
    private String remarks;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getApplicantId() { return applicantId; }
    public void setApplicantId(Long applicantId) { this.applicantId = applicantId; }
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
    public Double getWeight() { return weight; }
    public void setWeight(Double weight) { this.weight = weight; }
    public Double getScore() { return score; }
    public void setScore(Double score) { this.score = score; }
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
} 