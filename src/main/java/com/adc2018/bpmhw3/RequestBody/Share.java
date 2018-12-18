package com.adc2018.bpmhw3.RequestBody;

public class Share {

    private String fromUser;
    private String toUser;

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    @Override
    public String toString() {
        return "Share{" +
                "fromUser='" + fromUser + '\'' +
                ", toUser='" + toUser + '\'' +
                '}';
    }
}
