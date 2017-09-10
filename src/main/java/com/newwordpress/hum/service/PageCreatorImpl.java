package com.newwordpress.hum.service;

import com.newwordpress.hum.persistence.model.Text;
import com.newwordpress.hum.persistence.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PageCreatorImpl implements PageCreator {

    @Autowired
    ContentRepository contentRepository;


    @Override
    public Text pageContentbyIndex(int index) {
        Text webPageContent = new Text();
        webPageContent = contentRepository.findByAuthorId(index);
        return webPageContent;
    }

    @Override
    public Text pageContentByPageName(String name) {
        Text webPageContent = new Text();
        webPageContent = contentRepository.findByPageName(name);
        return webPageContent;
    }

    @Override
    public Text pageContentByAuthorId(int authorId) {
        Text webPageContent = new Text();
        webPageContent = contentRepository.findByAuthorId(authorId);
        return webPageContent;
    }

    @Override
    public void savePageContent(String pageContent, int authorId) {
        Text webPageContent = new Text();
        webPageContent.setAuthorId(authorId);
        webPageContent.setTextContent(pageContent);
        contentRepository.save(webPageContent);
    }

    @Override
    public void editPageContent(String pageContent, int authorId) {

    }
}
