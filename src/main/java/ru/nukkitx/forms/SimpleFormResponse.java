package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.form.window.FormWindowSimple;

public interface SimpleFormResponse extends FormResponse {

    void handle(Player targetPlayer, FormWindowSimple targetForm, int data);

}
