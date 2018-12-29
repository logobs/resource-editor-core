package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "PROJECT")
@Entity
public class Project extends AbstractBaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "PROJECTNR", unique = true)
    @NotNull
    private Integer projectNr;

    @Column(name = "PROJECTNAME", nullable = false, unique = true)
    @Size(min = 2, max = 50)
    @NotNull
    private String projectName;

    @Column(name = "PROJECTDEF", nullable = false, unique = false)
    @Size(min = 2, max = 100)
    @NotNull
    private String projectDef;

    public Project() {
        /* */
    }

    public Integer getProjectnr() {
        return projectNr;
    }

    public void setProjectnr(Integer projectNr) {
        this.projectNr = projectNr;
    }

    public String getProjectname() {
        return projectName;
    }

    public void setProjectname(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectdef() {
        return projectDef;
    }

    public void setProjectdef(String projectDef) {
        this.projectDef = projectDef;
    }

    public boolean isPersisted() {
        return getId() != null;
    }

}
