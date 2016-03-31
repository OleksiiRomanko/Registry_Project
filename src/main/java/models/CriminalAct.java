package models;

import javax.persistence.*;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
@Entity
@Table(name = "Criminal Act", schema = "register", catalog = "")
public class CriminalAct {
    private int id;
    private String criminalDescription;
    private String criminalType;
    private Integer tribunalDate;
    private Integer activationDate;
    private String penaltyType;
    private String repaymentConvictions;
    private String dateRepaymentConvitions;
    private String requisitesOfPaymentPenalty;
    private String processOfCriminal;
    private String typeOfPenalty;
    private String groundOfPenalty;
    private String dateoffPenalty;

    @Id
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
    public Integer getTribunalDate() {
        return tribunalDate;
    }

    public void setTribunalDate(Integer tribunalDate) {
        this.tribunalDate = tribunalDate;
    }

    @Basic
    @Column(name = "activationDate")
    public Integer getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Integer activationDate) {
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
    @Column(name = "repaymentConvictions")
    public String getRepaymentConvictions() {
        return repaymentConvictions;
    }

    public void setRepaymentConvictions(String repaymentConvictions) {
        this.repaymentConvictions = repaymentConvictions;
    }

    @Basic
    @Column(name = "dateRepaymentConvitions")
    public String getDateRepaymentConvitions() {
        return dateRepaymentConvitions;
    }

    public void setDateRepaymentConvitions(String dateRepaymentConvitions) {
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
    @Column(name = "typeOfPenalty")
    public String getTypeOfPenalty() {
        return typeOfPenalty;
    }

    public void setTypeOfPenalty(String typeOfPenalty) {
        this.typeOfPenalty = typeOfPenalty;
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
    public String getDateoffPenalty() {
        return dateoffPenalty;
    }

    public void setDateoffPenalty(String dateoffPenalty) {
        this.dateoffPenalty = dateoffPenalty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CriminalAct that = (CriminalAct) o;

        if (id != that.id) return false;
        if (criminalDescription != null ? !criminalDescription.equals(that.criminalDescription) : that.criminalDescription != null)
            return false;
        if (criminalType != null ? !criminalType.equals(that.criminalType) : that.criminalType != null) return false;
        if (tribunalDate != null ? !tribunalDate.equals(that.tribunalDate) : that.tribunalDate != null) return false;
        if (activationDate != null ? !activationDate.equals(that.activationDate) : that.activationDate != null)
            return false;
        if (penaltyType != null ? !penaltyType.equals(that.penaltyType) : that.penaltyType != null) return false;
        if (repaymentConvictions != null ? !repaymentConvictions.equals(that.repaymentConvictions) : that.repaymentConvictions != null)
            return false;
        if (dateRepaymentConvitions != null ? !dateRepaymentConvitions.equals(that.dateRepaymentConvitions) : that.dateRepaymentConvitions != null)
            return false;
        if (requisitesOfPaymentPenalty != null ? !requisitesOfPaymentPenalty.equals(that.requisitesOfPaymentPenalty) : that.requisitesOfPaymentPenalty != null)
            return false;
        if (processOfCriminal != null ? !processOfCriminal.equals(that.processOfCriminal) : that.processOfCriminal != null)
            return false;
        if (typeOfPenalty != null ? !typeOfPenalty.equals(that.typeOfPenalty) : that.typeOfPenalty != null)
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
        result = 31 * result + (repaymentConvictions != null ? repaymentConvictions.hashCode() : 0);
        result = 31 * result + (dateRepaymentConvitions != null ? dateRepaymentConvitions.hashCode() : 0);
        result = 31 * result + (requisitesOfPaymentPenalty != null ? requisitesOfPaymentPenalty.hashCode() : 0);
        result = 31 * result + (processOfCriminal != null ? processOfCriminal.hashCode() : 0);
        result = 31 * result + (typeOfPenalty != null ? typeOfPenalty.hashCode() : 0);
        result = 31 * result + (groundOfPenalty != null ? groundOfPenalty.hashCode() : 0);
        result = 31 * result + (dateoffPenalty != null ? dateoffPenalty.hashCode() : 0);
        return result;
    }
}
