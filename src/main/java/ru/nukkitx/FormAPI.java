package ru.nukkitx;

import cn.nukkit.plugin.PluginBase;
import ru.nukkitx.events.EventListener;

public class FormAPI extends PluginBase {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new EventListener(), this);
    }
}