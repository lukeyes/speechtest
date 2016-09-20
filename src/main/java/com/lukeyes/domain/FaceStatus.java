package com.lukeyes.domain;

public class FaceStatus {
    private String part;
    private String emotion;
    private boolean isTalking;

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public boolean getIsTalking() {
        return isTalking;
    }

    public void setIsTalking(boolean isTalking) {
        this.isTalking = isTalking;
    }

    public FaceStatus(String part, String emotion, boolean isTalking) {
        this.part = part;
        this.emotion = emotion;
        this.isTalking = isTalking;
    }
}