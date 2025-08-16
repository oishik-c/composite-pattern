package com.compositepattern.html;

import java.util.*;

public class HTMLCompositeElement extends HTMLTag{
    private String startTag;
    private String endTag;
    private String tagName;
    private List<HTMLTag> children;

    public HTMLCompositeElement(String tagName) {
        this.tagName=tagName;
        this.startTag="";
        this.endTag="";
        this.children = new ArrayList<HTMLTag>();
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
        return this.tagName;
    }

    @Override
    public List<HTMLTag> getChildren() {
        return children;
    }

    @Override
    public void addChildren(HTMLTag tag) {
        children.add(tag);
    }

    @Override
    public void removeChildren(HTMLTag tag) {
        children.remove(tag);
    }

    @Override
    public void generateHTML() {
        System.out.println(this.startTag);
        for (HTMLTag child : children) {
            child.generateHTML();
        }
        System.out.println(this.endTag);
    }
}
