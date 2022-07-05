package com.gd.creational.simplefactory;

import java.time.LocalDate;

public class NewsPost extends Post {
    private String headline;
    private LocalDate newsDate;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(LocalDate newsDate) {
        this.newsDate = newsDate;
    }
}
