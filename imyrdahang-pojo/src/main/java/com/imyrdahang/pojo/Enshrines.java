package com.imyrdahang.pojo;

import java.util.Date;

public class Enshrines {
    private Integer eId;

    private String eName;

    private String eUrl;

    private String eDepict;

    private Integer eState;

    private Integer eUId;

    private Date eCreateDate;

    private Date eUpdateDate;

    private String ext1;

    private String ext2;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteUrl() {
        return eUrl;
    }

    public void seteUrl(String eUrl) {
        this.eUrl = eUrl == null ? null : eUrl.trim();
    }

    public String geteDepict() {
        return eDepict;
    }

    public void seteDepict(String eDepict) {
        this.eDepict = eDepict == null ? null : eDepict.trim();
    }

    public Integer geteState() {
        return eState;
    }

    public void seteState(Integer eState) {
        this.eState = eState;
    }

    public Integer geteUId() {
        return eUId;
    }

    public void seteUId(Integer eUId) {
        this.eUId = eUId;
    }

    public Date geteCreateDate() {
        return eCreateDate;
    }

    public void seteCreateDate(Date eCreateDate) {
        this.eCreateDate = eCreateDate;
    }

    public Date geteUpdateDate() {
        return eUpdateDate;
    }

    public void seteUpdateDate(Date eUpdateDate) {
        this.eUpdateDate = eUpdateDate;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }
}