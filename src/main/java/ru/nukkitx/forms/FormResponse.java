package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;

import java.util.HashMap;

public interface FormResponse {

    /*
     *
     * player - Игрок.
     * window - Форма, полученного результата.
     * data - Результат формы (является null, если форма была закрыта)
     *
     */

    void handle(Player player, FormWindow window, Object data, HashMap<String, Object> params);
}