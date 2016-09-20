package com.lukeyes.util;

import com.lukeyes.domain.FaceStatus;

/**
 * Created by luke on 9/4/16.
 */
public class FaceUtil {

    public static FaceUtil mInstance = null;

    private FaceStatus mCurrentStatus;

    public static FaceUtil getInstance() {
        if(mInstance == null) {
            mInstance = new FaceUtil();
            mInstance.init();
        }
        return mInstance;
    }

    public void init() {

        mCurrentStatus = new FaceStatus("face","neutral",false);
    }

    public FaceStatus getCurrent() {
        return mCurrentStatus;
    }

    public void setTalking(boolean isTalking) {
        mCurrentStatus.setIsTalking(isTalking);
    }

    public void setEmotion(String emotion) {
        mCurrentStatus.setEmotion(emotion);
    }

}
