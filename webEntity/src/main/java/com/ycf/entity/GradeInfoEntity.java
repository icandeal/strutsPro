package com.ycf.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by sniper on 16-8-29.
 */
@Entity
@Table(name = "grade_info", schema = "school", catalog = "" )
public class GradeInfoEntity {
    private int gradeId;
    private String gradeName;
    private String gradeValue;
    private Timestamp cTime;
    private Timestamp mTime;

    @Id
    @Column(name = "GRADE_ID")
    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    @Basic
    @Column(name = "GRADE_NAME")
    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Basic
    @Column(name = "GRADE_VALUE")
    public String getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(String gradeValue) {
        this.gradeValue = gradeValue;
    }

    @Basic
    @Column(name = "C_TIME")
    public Timestamp getcTime() {
        return cTime;
    }

    public void setcTime(Timestamp cTime) {
        this.cTime = cTime;
    }

    @Basic
    @Column(name = "M_TIME")
    public Timestamp getmTime() {
        return mTime;
    }

    public void setmTime(Timestamp mTime) {
        this.mTime = mTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GradeInfoEntity that = (GradeInfoEntity) o;

        if (gradeId != that.gradeId) return false;
        if (gradeName != null ? !gradeName.equals(that.gradeName) : that.gradeName != null) return false;
        if (gradeValue != null ? !gradeValue.equals(that.gradeValue) : that.gradeValue != null) return false;
        if (cTime != null ? !cTime.equals(that.cTime) : that.cTime != null) return false;
        if (mTime != null ? !mTime.equals(that.mTime) : that.mTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gradeId;
        result = 31 * result + (gradeName != null ? gradeName.hashCode() : 0);
        result = 31 * result + (gradeValue != null ? gradeValue.hashCode() : 0);
        result = 31 * result + (cTime != null ? cTime.hashCode() : 0);
        result = 31 * result + (mTime != null ? mTime.hashCode() : 0);
        return result;
    }
}
