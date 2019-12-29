package com.ebot.MikoBot.Ultils.Entities;

public class UserReference {
    private String userId;
    private short voiceRef;

    public UserReference(String userId,short voiceRef){
        this.userId=userId;
        switch (voiceRef){
            default:
                this.voiceRef = 1;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                this.voiceRef = voiceRef;
                break;
        }
    }

    public String getUserId() {
        return userId;
    }

    public short getVoiceRef() {
        return voiceRef;
    }
}