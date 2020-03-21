package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindowCustom;

import java.util.List;

public interface CustomFormResponse extends FormResponse {

    void handle(Player targetPlayer, FormWindowCustom targetForm, List<Object> data);

}
