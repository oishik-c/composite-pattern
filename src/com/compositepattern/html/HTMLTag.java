package com.compositepattern.html;

import java.util.List;

public abstract class HTMLTag {
    public abstract void setStartTag(String Tag);
    public abstract void setEndTag(String Tag);
    public abstract String getTagName();

    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current Operation is not supported.");
    };
    public void addChildren(HTMLTag tag){
        throw new UnsupportedOperationException("Current Operation is not supported.");
    };
    public void removeChildren(HTMLTag tag){
        throw new UnsupportedOperationException("Current Operation is not supported.");
    };
    public List<HTMLTag> getChildren(){
        throw new UnsupportedOperationException("Current Operation is not supported.");
    };
    public abstract void generateHTML();
}
