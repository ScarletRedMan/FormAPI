package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.form.window.FormWindowModal;
import cn.nukkit.form.window.FormWindowSimple;

public interface ModalFormResponse extends FormResponse {

    void handle(Player targetPlayer, FormWindowModal targetForm, int data);

}
