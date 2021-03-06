package com.example.android.miwok;



public class Word {
    // Image resource ID of the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Default translation for word
    private String mDefaultTranslation;

    // Mivok translation for word
    String mMivokTranslation;

    private int mAudioResourceId = NO_AUDIO_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    public Word(String defaultTranslation, String mivokTranslation, int audioResourceId) {
        mAudioResourceId = audioResourceId;
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
    }

    public Word(String defaultTranslation, String mivokTranslation, int imageResourceId, int audioResourceId) {
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
    }

    public int getmAudioResourceId() {return mAudioResourceId;}

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Get default translation of the word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get mivok translation of the word
    public String getmMivokTranslation() {
        return mMivokTranslation;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mImageResourceId=" + mImageResourceId +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMivokTranslation='" + mMivokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
