package com.compositepattern.html;

public class HTMLLeafElement extends HTMLTag{
    private String startTag;
    private String endTag;
    private String tagBody;
    private String tagName;


    public HTMLLeafElement(String tagName) {
        this.tagName = tagName;
        this.startTag="";
        this.endTag="";
        this.tagBody="";
    }

    @Override
    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public void generateHTML() {
        System.out.println(startTag + " " + tagBody + " " + endTag);
    }
}
