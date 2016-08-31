package com.ycf.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by sniper on 16-8-30.
 */
@Entity
@Table(name = "user_info", schema = "school", catalog = "")
public class UserInfoEntity {
    private String ref;
    private int userId;
    private String userName;
    private String password;
    private int stateId;
    private String identityNumber;
    private String address;
    private Timestamp birthDate;
    private Timestamp cTime;
    private Timestamp mTime;
    private Integer gender;
    private String headImage;
    private String mailAddress;
    private String passQuestion;
    private String questionAnswer;
    private String realName;
    private Integer isModify;
    private Integer qq;
    private String hobbies;
    private String country;
    private String nation;
    private String lzxUserId;
    private String schoolId;
    private Integer ettUserId;
    private Integer dcSchoolId;
    private Integer isActivity;
    private Timestamp tgTime;

    @Id
    @Column(name = "REF", nullable = false, length = 50)
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Basic
    @Column(name = "USER_ID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "STATE_ID", nullable = false)
    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "IDENTITY_NUMBER", nullable = true, length = 50)
    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "BIRTH_DATE", nullable = true)
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "C_TIME", nullable = true)
    public Timestamp getcTime() {
        return cTime;
    }

    public void setcTime(Timestamp cTime) {
        this.cTime = cTime;
    }

    @Basic
    @Column(name = "M_TIME", nullable = true)
    public Timestamp getmTime() {
        return mTime;
    }

    public void setmTime(Timestamp mTime) {
        this.mTime = mTime;
    }

    @Basic
    @Column(name = "GENDER", nullable = true)
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "HEAD_IMAGE", nullable = true, length = 1000)
    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    @Basic
    @Column(name = "MAIL_ADDRESS", nullable = true, length = 100)
    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Basic
    @Column(name = "PASS_QUESTION", nullable = true, length = 1000)
    public String getPassQuestion() {
        return passQuestion;
    }

    public void setPassQuestion(String passQuestion) {
        this.passQuestion = passQuestion;
    }

    @Basic
    @Column(name = "QUESTION_ANSWER", nullable = true, length = 1000)
    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    @Basic
    @Column(name = "REAL_NAME", nullable = true, length = 50)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "IS_MODIFY", nullable = true)
    public Integer getIsModify() {
        return isModify;
    }

    public void setIsModify(Integer isModify) {
        this.isModify = isModify;
    }

    @Basic
    @Column(name = "QQ", nullable = true)
    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "HOBBIES", nullable = true, length = 500)
    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = true, length = 200)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "NATION", nullable = true, length = 200)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "LZX_USER_ID", nullable = true, length = 32)
    public String getLzxUserId() {
        return lzxUserId;
    }

    public void setLzxUserId(String lzxUserId) {
        this.lzxUserId = lzxUserId;
    }

    @Basic
    @Column(name = "SCHOOL_ID", nullable = true, length = 50)
    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "ETT_USER_ID", nullable = true)
    public Integer getEttUserId() {
        return ettUserId;
    }

    public void setEttUserId(Integer ettUserId) {
        this.ettUserId = ettUserId;
    }

    @Basic
    @Column(name = "DC_SCHOOL_ID", nullable = true)
    public Integer getDcSchoolId() {
        return dcSchoolId;
    }

    public void setDcSchoolId(Integer dcSchoolId) {
        this.dcSchoolId = dcSchoolId;
    }

    @Basic
    @Column(name = "is_activity", nullable = true)
    public Integer getIsActivity() {
        return isActivity;
    }

    public void setIsActivity(Integer isActivity) {
        this.isActivity = isActivity;
    }

    @Basic
    @Column(name = "tg_time", nullable = true)
    public Timestamp getTgTime() {
        return tgTime;
    }

    public void setTgTime(Timestamp tgTime) {
        this.tgTime = tgTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfoEntity that = (UserInfoEntity) o;

        if (userId != that.userId) return false;
        if (stateId != that.stateId) return false;
        if (ref != null ? !ref.equals(that.ref) : that.ref != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (identityNumber != null ? !identityNumber.equals(that.identityNumber) : that.identityNumber != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (cTime != null ? !cTime.equals(that.cTime) : that.cTime != null) return false;
        if (mTime != null ? !mTime.equals(that.mTime) : that.mTime != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (headImage != null ? !headImage.equals(that.headImage) : that.headImage != null) return false;
        if (mailAddress != null ? !mailAddress.equals(that.mailAddress) : that.mailAddress != null) return false;
        if (passQuestion != null ? !passQuestion.equals(that.passQuestion) : that.passQuestion != null) return false;
        if (questionAnswer != null ? !questionAnswer.equals(that.questionAnswer) : that.questionAnswer != null)
            return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (isModify != null ? !isModify.equals(that.isModify) : that.isModify != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (hobbies != null ? !hobbies.equals(that.hobbies) : that.hobbies != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (lzxUserId != null ? !lzxUserId.equals(that.lzxUserId) : that.lzxUserId != null) return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (ettUserId != null ? !ettUserId.equals(that.ettUserId) : that.ettUserId != null) return false;
        if (dcSchoolId != null ? !dcSchoolId.equals(that.dcSchoolId) : that.dcSchoolId != null) return false;
        if (isActivity != null ? !isActivity.equals(that.isActivity) : that.isActivity != null) return false;
        if (tgTime != null ? !tgTime.equals(that.tgTime) : that.tgTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ref != null ? ref.hashCode() : 0;
        result = 31 * result + userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + stateId;
        result = 31 * result + (identityNumber != null ? identityNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (cTime != null ? cTime.hashCode() : 0);
        result = 31 * result + (mTime != null ? mTime.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (headImage != null ? headImage.hashCode() : 0);
        result = 31 * result + (mailAddress != null ? mailAddress.hashCode() : 0);
        result = 31 * result + (passQuestion != null ? passQuestion.hashCode() : 0);
        result = 31 * result + (questionAnswer != null ? questionAnswer.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (isModify != null ? isModify.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (lzxUserId != null ? lzxUserId.hashCode() : 0);
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + (ettUserId != null ? ettUserId.hashCode() : 0);
        result = 31 * result + (dcSchoolId != null ? dcSchoolId.hashCode() : 0);
        result = 31 * result + (isActivity != null ? isActivity.hashCode() : 0);
        result = 31 * result + (tgTime != null ? tgTime.hashCode() : 0);
        return result;
    }
}
