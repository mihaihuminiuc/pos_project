package com.newwordpress.hum.web.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContentPageDto {
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @NotNull
    String pageName;

    @NotNull
    String pageContent;

    @NotNull
    int userId;

}
