package com.example.hoathan.templeandroid1.model;

/**
 * Created by Tungnguyenbk54 on 9/29/2017.
 */

public class Face {
    private String mColo;
    private int mFaceImage;
    private String mFaceName;

    public Face(String mColo, int mFaceImage, String mFaceName) {
        this.mColo = mColo;
        this.mFaceImage = mFaceImage;
        this.mFaceName = mFaceName;
    }

    public String getmColo() {
        return mColo;
    }

    public Face setmColo(String mColo) {
        this.mColo = mColo;
        return this;
    }

    public int getmFaceImage() {
        return mFaceImage;
    }

    public Face setmFaceImage(int mFaceImage) {
        this.mFaceImage = mFaceImage;
        return this;
    }

    public String getmFaceName() {
        return mFaceName;
    }

    public Face setmFaceName(String mFaceName) {
        this.mFaceName = mFaceName;
        return this;
    }
}
