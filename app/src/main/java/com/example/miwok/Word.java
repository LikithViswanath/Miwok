package com.example.miwok;

public class Word {
    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private final int mImageResourceId;
    private final int mAudioResourceId;
    public Word(String DefaultTranslation ,String MiwokTranslation,int AudioResourceId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=0;
        mAudioResourceId=AudioResourceId;
    }
    public Word(String DefaultTranslation ,String MiwokTranslation,int ImageResourceId,int AudioResourceId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId=AudioResourceId;
    }
    public String getMiwokTranslation(){
       return mMiwokTranslation;
    }
    public  String getEnglishTranslation(){
         return  mDefaultTranslation;
    }
    public  int getmImageResourceId(){
        return mImageResourceId;
    }
    public int getmAudioResourceId(){
        return  mAudioResourceId;
    }
}
