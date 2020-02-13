package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;

public interface SimpleFormResponse extends FormResponse {

    void handle(Player targetPlayer, FormWindow targetForm, int data);

}
