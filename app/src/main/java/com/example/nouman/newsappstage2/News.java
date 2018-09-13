package com.example.nouman.newsappstage2;

public class News {

    private String mHeadLine;

    private String mAuthor;

    private String mSection;

    private String mDate;

    /** Website URL of the news */
    private String mUrl;

    public News(String headLine, String author, String section, String date, String url){
        mHeadLine = headLine;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    public String getHeadLine(){ return mHeadLine; }

    public String getAuthor(){ return mAuthor; }

    public String getSection(){ return mSection; }

    public String getDate(){ return mDate; }

    public String getUrl(){ return mUrl; }
}

