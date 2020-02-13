package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;

import java.util.List;

public interface CustomFormResponse extends FormResponse {

    void handle(Player targetPlayer, FormWindow targetForm, List<Object> data);

}
