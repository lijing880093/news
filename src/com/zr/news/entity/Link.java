package com.zr.news.entity;

/**
 * @author: Iman
 * date   : 2019/3/11
 */
public class Link {
    private  int linkId;
    private  String linlName;
    private String email;
    private String linkUrl;
    private  int linkOrder;

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public String getLinlName() {
        return linlName;
    }

    public void setLinlName(String linlName) {
        this.linlName = linlName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public int getLinkOrder() {
        return linkOrder;
    }

    public void setLinkOrder(int linkOrder) {
        this.linkOrder = linkOrder;
    }

    public Link() {
    }

    public Link(int linkId, String linlName, String email, String linkUrl, int linkOrder) {
        this.linkId = linkId;
        this.linlName = linlName;
        this.email = email;
        this.linkUrl = linkUrl;
        this.linkOrder = linkOrder;
    }
}
