package com.example.miwok;

public class Word {

    private String defaultWord;
    private String miwokWord;

    private int HAS_IMAGE = -1;
    private int image = HAS_IMAGE;


    public Word(String defaultWord,String miwokWord)
    {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
    }

    public Word(String defaultWord,String miwokWord,int image)
    {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.image = image;
    }

    public String getDefaultWord()
    {
        return defaultWord;
    }

    public String getMiwokWord()
    {
        return miwokWord;
    }

    public int getImage() {
        return image;
    }
    public boolean hasImage()
    {
        return image != HAS_IMAGE;
    }
}
