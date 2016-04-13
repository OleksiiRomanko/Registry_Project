package com.kp_42.Model.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "workplace", schema = "mydb", catalog = "")
public class WorkplaceEntity {
    private int id;
    private String worksphere;
    private String adress;
    private String workplaceName;
    private UsersEntity user;
    private List<WorktitleEntity> worktitle;

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
    @Column(name = "worksphere")
    public String getWorksphere() {
        return worksphere;
    }

    public void setWorksphere(String worksphere) {
        this.worksphere = worksphere;
    }

    @Basic
    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "workplaceName")
    public String getWorkplaceName() {
        return workplaceName;
    }

    public void setWorkplaceName(String workplaceName) {
        this.workplaceName = workplaceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkplaceEntity that = (WorkplaceEntity) o;

        if (id != that.id) return false;
        if (worksphere != null ? !worksphere.equals(that.worksphere) : that.worksphere != null) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;
        if (workplaceName != null ? !workplaceName.equals(that.workplaceName) : that.workplaceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (worksphere != null ? worksphere.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (workplaceName != null ? workplaceName.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "workplace")
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    @OneToMany(mappedBy = "workplace")
    public List<WorktitleEntity> getWorktitle() {
        return worktitle;
    }

    public void setWorktitle(List<WorktitleEntity> worktitle) {
        this.worktitle = worktitle;
    }
}
