package com.newwordpress.hum.service;

import com.newwordpress.hum.persistence.model.Text;

public interface PageCreator {

    Text pageContentbyIndex(int index);
    Text pageContentByPageName(String name);
    Text pageContentByAuthorId(int authorId);
    void savePageContent(String pageContent, int authorId);
    void editPageContent(String pageContent, int authorId);
}
