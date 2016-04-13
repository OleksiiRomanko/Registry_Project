package com.kp_42.Model.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "criminalact", schema = "mydb", catalog = "")
public class CriminalActEntity {
    private int id;
    private String criminalDescription;
    private String criminalType;
    private Long tribunalDate;
    private Long activationDate;
    private String penaltyType;
    private String reasonForRepaymentConvictions;
    private Long dateRepaymentConvitions;
    private String requisitesOfPaymentPenalty;
    private String processOfCriminal;
    private String groundOfPenalty;
    private Long dateoffPenalty;
    private UsersEntity user;
    private List<LawEntity> law;
    private ExtractionEntity extraction;

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "criminalDescription")
    public String getCriminalDescription() {
        return criminalDescription;
    }

    public void setCriminalDescription(String criminalDescription) {
        this.criminalDescription = criminalDescription;
    }

    @Basic
    @Column(name = "criminalType")
    public String getCriminalType() {
        return criminalType;
    }

    public void setCriminalType(String criminalType) {
        this.criminalType = criminalType;
    }

    @Basic
    @Column(name = "tribunalDate")
    public Long getTribunalDate() {
        return tribunalDate;
    }

    public void setTribunalDate(Long tribunalDate) {
        this.tribunalDate = tribunalDate;
    }

    @Basic
    @Column(name = "activationDate")
    public Long getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Long activationDate) {
        this.activationDate = activationDate;
    }

    @Basic
    @Column(name = "penaltyType")
    public String getPenaltyType() {
        return penaltyType;
    }

    public void setPenaltyType(String penaltyType) {
        this.penaltyType = penaltyType;
    }

    @Basic
    @Column(name = "reasonForRepaymentConvictions")
    public String getRepaymentConvictions() {
        return reasonForRepaymentConvictions;
    }

    public void setRepaymentConvictions(String repaymentConvictions) {
        this.reasonForRepaymentConvictions = repaymentConvictions;
    }

    @Basic
    @Column(name = "dateRepaymentConvitions")
    public Long getDateRepaymentConvitions() {
        return dateRepaymentConvitions;
    }

    public void setDateRepaymentConvitions(Long dateRepaymentConvitions) {
        this.dateRepaymentConvitions = dateRepaymentConvitions;
    }

    @Basic
    @Column(name = "requisitesOfPaymentPenalty")
    public String getRequisitesOfPaymentPenalty() {
        return requisitesOfPaymentPenalty;
    }

    public void setRequisitesOfPaymentPenalty(String requisitesOfPaymentPenalty) {
        this.requisitesOfPaymentPenalty = requisitesOfPaymentPenalty;
    }

    @Basic
    @Column(name = "processOfCriminal")
    public String getProcessOfCriminal() {
        return processOfCriminal;
    }

    public void setProcessOfCriminal(String processOfCriminal) {
        this.processOfCriminal = processOfCriminal;
    }


    @Basic
    @Column(name = "groundOfPenalty")
    public String getGroundOfPenalty() {
        return groundOfPenalty;
    }

    public void setGroundOfPenalty(String groundOfPenalty) {
        this.groundOfPenalty = groundOfPenalty;
    }

    @Basic
    @Column(name = "dateoffPenalty")
    public Long getDateoffPenalty() {
        return dateoffPenalty;
    }

    public void setDateoffPenalty(Long dateoffPenalty) {
        this.dateoffPenalty = dateoffPenalty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CriminalActEntity that = (CriminalActEntity) o;

        if (id != that.id) return false;
        if (criminalDescription != null ? !criminalDescription.equals(that.criminalDescription) : that.criminalDescription != null)
            return false;
        if (criminalType != null ? !criminalType.equals(that.criminalType) : that.criminalType != null) return false;
        if (tribunalDate != null ? !tribunalDate.equals(that.tribunalDate) : that.tribunalDate != null) return false;
        if (activationDate != null ? !activationDate.equals(that.activationDate) : that.activationDate != null)
            return false;
        if (penaltyType != null ? !penaltyType.equals(that.penaltyType) : that.penaltyType != null) return false;
        if (reasonForRepaymentConvictions != null ? !reasonForRepaymentConvictions.equals(that.reasonForRepaymentConvictions) : that.reasonForRepaymentConvictions != null)
            return false;
        if (dateRepaymentConvitions != null ? !dateRepaymentConvitions.equals(that.dateRepaymentConvitions) : that.dateRepaymentConvitions != null)
            return false;
        if (requisitesOfPaymentPenalty != null ? !requisitesOfPaymentPenalty.equals(that.requisitesOfPaymentPenalty) : that.requisitesOfPaymentPenalty != null)
            return false;
        if (processOfCriminal != null ? !processOfCriminal.equals(that.processOfCriminal) : that.processOfCriminal != null)
            return false;
        if (groundOfPenalty != null ? !groundOfPenalty.equals(that.groundOfPenalty) : that.groundOfPenalty != null)
            return false;
        if (dateoffPenalty != null ? !dateoffPenalty.equals(that.dateoffPenalty) : that.dateoffPenalty != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (criminalDescription != null ? criminalDescription.hashCode() : 0);
        result = 31 * result + (criminalType != null ? criminalType.hashCode() : 0);
        result = 31 * result + (tribunalDate != null ? tribunalDate.hashCode() : 0);
        result = 31 * result + (activationDate != null ? activationDate.hashCode() : 0);
        result = 31 * result + (penaltyType != null ? penaltyType.hashCode() : 0);
        result = 31 * result + (reasonForRepaymentConvictions != null ? reasonForRepaymentConvictions.hashCode() : 0);
        result = 31 * result + (dateRepaymentConvitions != null ? dateRepaymentConvitions.hashCode() : 0);
        result = 31 * result + (requisitesOfPaymentPenalty != null ? requisitesOfPaymentPenalty.hashCode() : 0);
        result = 31 * result + (processOfCriminal != null ? processOfCriminal.hashCode() : 0);
        result = 31 * result + (groundOfPenalty != null ? groundOfPenalty.hashCode() : 0);
        result = 31 * result + (dateoffPenalty != null ? dateoffPenalty.hashCode() : 0);
        return result;
    }

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    @ManyToMany
    @JoinTable(name = "criminalacthaslaw",catalog = "mydb",joinColumns = {
            @JoinColumn(name = "CriminalAct_id",nullable = false)},inverseJoinColumns = {
            @JoinColumn(name = "Law_id",nullable = false)})
    public List<LawEntity> getLaw() {
        return law;
    }

    public void setLaw(List<LawEntity> law) {
        this.law = law;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "criminalAct_id", nullable = false)
    public ExtractionEntity getExtraction() {
        return extraction;
    }

    public void setExtraction(ExtractionEntity extraction) {
        this.extraction = extraction;
    }
}
