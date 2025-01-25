package com.sundaran.web_socket_demo.client;

import com.sundaran.web_socket_demo.Message;

import java.util.ArrayList;

public interface MessageListener {
    void onMessageReceive(Message message);
    void onActiveUsersUpdated(ArrayList<String> users);

}
