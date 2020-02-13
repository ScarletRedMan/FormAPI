package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;

import java.util.HashMap;

public interface FormResponse {

    @Deprecated
    void handle(Player player, FormWindow window, Object data, HashMap<String, Object> params);
}