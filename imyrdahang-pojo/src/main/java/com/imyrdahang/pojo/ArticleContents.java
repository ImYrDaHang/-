package com.imyrdahang.pojo;

public class ArticleContents {
    private Integer aCId;

    private String aCKeyword;

    private String aCDepict;

    private String aCUrl;

    private String aCUrlDepict;

    private String ext1;

    private String ext2;

    private String aCContent;

    public Integer getaCId() {
        return aCId;
    }

    public void setaCId(Integer aCId) {
        this.aCId = aCId;
    }

    public String getaCKeyword() {
        return aCKeyword;
    }

    public void setaCKeyword(String aCKeyword) {
        this.aCKeyword = aCKeyword == null ? null : aCKeyword.trim();
    }

    public String getaCDepict() {
        return aCDepict;
    }

    public void setaCDepict(String aCDepict) {
        this.aCDepict = aCDepict == null ? null : aCDepict.trim();
    }

    public String getaCUrl() {
        return aCUrl;
    }

    public void setaCUrl(String aCUrl) {
        this.aCUrl = aCUrl == null ? null : aCUrl.trim();
    }

    public String getaCUrlDepict() {
        return aCUrlDepict;
    }

    public void setaCUrlDepict(String aCUrlDepict) {
        this.aCUrlDepict = aCUrlDepict == null ? null : aCUrlDepict.trim();
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

    public String getaCContent() {
        return aCContent;
    }

    public void setaCContent(String aCContent) {
        this.aCContent = aCContent == null ? null : aCContent.trim();
    }

	@Override
	public String toString() {
		return "ArticleContents [aCId=" + aCId + ", aCKeyword=" + aCKeyword + ", aCDepict=" + aCDepict + ", aCUrl="
				+ aCUrl + ", aCUrlDepict=" + aCUrlDepict + ", ext1=" + ext1 + ", ext2=" + ext2 + ", aCContent="
				+ aCContent + "]";
	}
    
}