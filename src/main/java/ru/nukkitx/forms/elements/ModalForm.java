package ru.nukkitx.forms.elements;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindowModal;
import ru.nukkitx.forms.Form;
import ru.nukkitx.forms.ModalFormResponse;

public class ModalForm extends Form {

    public ModalForm(FormWindowModal form){
        this.form = form;
    }

    public ModalForm() {
        form = new FormWindowModal("", "", "", "");
    }

    public ModalForm(String title) {
        form = new FormWindowModal(title, "", "", "");
    }

    public ModalForm(String title, String content) {
        form = new FormWindowModal(title, content, "", "");
    }

    public ModalForm(String title, String content, String trueButton) {
        form = new FormWindowModal(title, content, trueButton, "");
    }

    public ModalForm(String title, String content, String trueButton, String falseButton) {
        form = new FormWindowModal(title, content, trueButton, falseButton);
    }

    public void send(Player player, ModalFormResponse response){
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), null);
        player.showFormWindow(form);
    }

    public ModalForm setTitle(String value) {
        ((FormWindowModal) form).setTitle(value);

        return this;
    }

    public ModalForm setContent(String value) {
        ((FormWindowModal) form).setContent(value);
        return this;
    }

    public ModalForm setButton1(String value) {
        ((FormWindowModal) form).setButton1(value);
        return this;
    }

    public ModalForm setButton2(String value) {
        ((FormWindowModal) form).setButton2(value);
        return this;
    }
}