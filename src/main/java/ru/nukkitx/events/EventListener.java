package ru.nukkitx.events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.form.response.FormResponse;
import cn.nukkit.form.response.FormResponseCustom;
import cn.nukkit.form.response.FormResponseModal;
import cn.nukkit.form.response.FormResponseSimple;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.form.window.FormWindowCustom;
import cn.nukkit.form.window.FormWindowModal;
import cn.nukkit.form.window.FormWindowSimple;
import ru.nukkitx.forms.Form;

import java.util.ArrayList;

public class EventListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void formResponded(PlayerFormRespondedEvent event) {
        Player player = event.getPlayer();
        FormWindow window = event.getWindow();
        FormResponse response = window.getResponse();

        if (response == null) return;

        if (Form.playersForm.containsKey(player.getName()) && Form.paramsForm.containsKey(player.getName())) {
            ru.nukkitx.forms.FormResponse temp = Form.playersForm.get(player.getName());
            Form.playersForm.remove(player.getName());

            Object data;

            if (event.wasClosed()) {
                data = null;
                temp.handle(player, window, data, Form.paramsForm.get(player.getName()));
                return;
            }

            if (window instanceof FormWindowSimple) {
                data = ((FormResponseSimple) response).getClickedButtonId();
                temp.handle(player, window, data, Form.paramsForm.get(player.getName()));
                return;
            }

            if (window instanceof FormWindowCustom) {
                data = new ArrayList<>(((FormResponseCustom) response).getResponses().values());
                temp.handle(player, window, data, Form.paramsForm.get(player.getName()));
                return;
            }

            if (window instanceof FormWindowModal) {
                data = ((FormResponseModal) response).getClickedButtonId();
                temp.handle(player, window, data, Form.paramsForm.get(player.getName()));
                return;
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void playerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        Form.playersForm.remove(player.getName());
        Form.paramsForm.remove(player.getName());
    }
}