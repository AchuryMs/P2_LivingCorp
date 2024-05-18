package co.edu.unbosque.vista;


import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class DashboardView implements Serializable {
    private List<String> messages;
    private String newMessage;

    @PostConstruct
    public void init() {
        messages = new ArrayList<>();
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public void addMessage() {
        if (newMessage != null && !newMessage.isEmpty()) {
            messages.add(newMessage);
            newMessage = null;
        }
    }
}
