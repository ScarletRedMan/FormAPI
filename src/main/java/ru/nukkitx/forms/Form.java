package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;

import java.util.HashMap;

public abstract class Form {

    public static HashMap<String, FormResponse> playersForm = new HashMap<>();
    protected FormWindow form;

    public void send(Player player) {
        player.showFormWindow(form);
    }

    public static void sendForm(Player player, FormWindow form, ModalFormResponse response){
        playersForm.put(player.getName(), response);
        player.showFormWindow(form);
    }

    public static void sendForm(Player player, FormWindow form, CustomFormResponse response){
        playersForm.put(player.getName(), response);
        player.showFormWindow(form);
    }

    public static void sendForm(Player player, FormWindow form, SimpleFormResponse response){
        playersForm.put(player.getName(), response);
        player.showFormWindow(form);
    }
}