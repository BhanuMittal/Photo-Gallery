package com.bignerdranch.android.photogallery;

/**
 * Created by Bhanu Mittal on 11/26/2016.
 */

public class GalleryItem {
    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    private String mCaption;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    private String mId;
    private String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }
}
