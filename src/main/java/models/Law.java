package models;

import javax.persistence.*;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
@Entity
@Table(name = "Law", schema = "register", catalog = "")
public class Law {
    private int id;
    private String name;
    private String type;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Law law = (Law) o;

        if (id != law.id) return false;
        if (name != null ? !name.equals(law.name) : law.name != null) return false;
        if (type != null ? !type.equals(law.type) : law.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
