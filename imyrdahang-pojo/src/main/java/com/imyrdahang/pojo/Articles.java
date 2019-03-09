package com.imyrdahang.pojo;

import java.util.Date;

public class Articles {
    private Integer aId;

    private Integer aMId;

    private String aTitle;

    private String aAbstract;

    private Integer aUId;

    private Integer aHits;

    private String aChart;

    private Date aCreateDate;

    private Date aUpdateDate;

    private Integer aState;

    private String ext1;

    private String ext2;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getaMId() {
        return aMId;
    }

    public void setaMId(Integer aMId) {
        this.aMId = aMId;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle == null ? null : aTitle.trim();
    }

    public String getaAbstract() {
        return aAbstract;
    }

    public void setaAbstract(String aAbstract) {
        this.aAbstract = aAbstract == null ? null : aAbstract.trim();
    }

    public Integer getaUId() {
        return aUId;
    }

    public void setaUId(Integer aUId) {
        this.aUId = aUId;
    }

    public Integer getaHits() {
        return aHits;
    }

    public void setaHits(Integer aHits) {
        this.aHits = aHits;
    }

    public String getaChart() {
        return aChart;
    }

    public void setaChart(String aChart) {
        this.aChart = aChart == null ? null : aChart.trim();
    }

    public Date getaCreateDate() {
        return aCreateDate;
    }

    public void setaCreateDate(Date aCreateDate) {
        this.aCreateDate = aCreateDate;
    }

    public Date getaUpdateDate() {
        return aUpdateDate;
    }

    public void setaUpdateDate(Date aUpdateDate) {
        this.aUpdateDate = aUpdateDate;
    }

    public Integer getaState() {
        return aState;
    }

    public void setaState(Integer aState) {
        this.aState = aState;
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

	@Override
	public String toString() {
		return "Articles [aId=" + aId + ", aMId=" + aMId + ", aTitle=" + aTitle + ", aAbstract=" + aAbstract + ", aUId="
				+ aUId + ", aHits=" + aHits + ", aChart=" + aChart + ", aCreateDate=" + aCreateDate + ", aUpdateDate="
				+ aUpdateDate + ", aState=" + aState + ", ext1=" + ext1 + ", ext2=" + ext2 + "]";
	}
}