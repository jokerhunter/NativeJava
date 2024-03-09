package com.mume.Module_5_Socket_IO.Module_4_4_Socket.UserMessage;

import java.io.Serializable;

/**
 * @author mume
 */
public class UserMessage implements Serializable {
    private static final long serialVersionUID = -7261669001184411837L;

    private String messageType;
    private User user;

    public UserMessage() {
    }

    public UserMessage(User user) {
        this.messageType = "check";
        this.user = user;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "messageType='" + messageType + '\'' +
                ", user=" + user +
                '}';
    }
}
