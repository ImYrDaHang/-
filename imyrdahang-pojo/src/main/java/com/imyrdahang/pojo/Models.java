package com.imyrdahang.pojo;

import java.util.Date;

public class Models {
    private Integer mId;

    private String mName;

    private Integer mFId;

    private String mDepict;

    private String mKeyword;

    private Integer mASum;

    private Date mCreateDate;

    private Integer mUId;

    private String ext1;

    private String ext2;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmFId() {
        return mFId;
    }

    public void setmFId(Integer mFId) {
        this.mFId = mFId;
    }

    public String getmDepict() {
        return mDepict;
    }

    public void setmDepict(String mDepict) {
        this.mDepict = mDepict == null ? null : mDepict.trim();
    }

    public String getmKeyword() {
        return mKeyword;
    }

    public void setmKeyword(String mKeyword) {
        this.mKeyword = mKeyword == null ? null : mKeyword.trim();
    }

    public Integer getmASum() {
        return mASum;
    }

    public void setmASum(Integer mASum) {
        this.mASum = mASum;
    }

    public Date getmCreateDate() {
        return mCreateDate;
    }

    public void setmCreateDate(Date mCreateDate) {
        this.mCreateDate = mCreateDate;
    }

    public Integer getmUId() {
        return mUId;
    }

    public void setmUId(Integer mUId) {
        this.mUId = mUId;
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