package com.example.catalyst.interactivestory.model;

/**
 * Created by dsloane on 2/19/2016.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

}
