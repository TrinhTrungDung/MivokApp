package com.example.android.miwok;


public class Word {
    // Default translation for word
    private String mDefaultTranslation;

    // Mivok translation for word
    private String mMivokTranslation;
    

    public Word(String defaultTranslation, String mivokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
    }

    // Get default translation of the word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get mivok translation of the word
    public String getmMivokTranslation() {
        return mMivokTranslation;
    }
}
