package ru.nukkitx.forms.elements;

import cn.nukkit.Player;
import cn.nukkit.form.element.*;
import cn.nukkit.form.window.FormWindowCustom;
import ru.nukkitx.forms.CustomFormResponse;
import ru.nukkitx.forms.Form;

import java.util.List;

public class CustomForm extends Form {

    public CustomForm(FormWindowCustom form){
        this.form = form;
    }

    public CustomForm() {
        form = new FormWindowCustom("");
    }

    public CustomForm(String title) {
        form = new FormWindowCustom(title);
    }

    public void send(Player player, CustomFormResponse response){
        playersForm.put(player.getName(), response);
        player.showFormWindow(form);
    }

    public CustomForm setTitle(String value) {
        ((FormWindowCustom) form).setTitle(value);
        return this;
    }

    public CustomForm addLabel(String value) {
        ((FormWindowCustom) form).addElement(new ElementLabel(value));
        return this;
    }

    public CustomForm addInput() {
        ElementInput element = new ElementInput("");
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addInput(String name) {
        ElementInput element = new ElementInput(name);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addInput(String name, String placeholder) {
        ElementInput element = new ElementInput(name, placeholder);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addInput(String name, String placeholder, String defaultText) {
        ElementInput element = new ElementInput(name, placeholder, defaultText);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addToggle() {
        ElementToggle element = new ElementToggle("");
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addToggle(String name) {
        ElementToggle element = new ElementToggle(name);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addToggle(String name, boolean defaultValue) {
        ElementToggle element = new ElementToggle(name, defaultValue);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addDropDown(String name, List<String> list) {
        ElementDropdown element = new ElementDropdown(name, list);
        ((FormWindowCustom) form).addElement(element);

        return this;
    }

    public CustomForm addDropDown(String name, List<String> list, int defaultValue) {
        ElementDropdown element = new ElementDropdown(name, list, defaultValue);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addSlider(String name, int min, int max) {
        ElementSlider element = new ElementSlider(name, min, max);
        ((FormWindowCustom) form).addElement(element);

        return this;
    }

    public CustomForm addSlider(String name, int min, int max, int step) {
        ElementSlider element = new ElementSlider(name, min, max, step, 3);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addSlider(String name, int min, int max, int step, int defaultValue) {
        ElementSlider element = new ElementSlider(name, min, max, step, defaultValue);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addStepSlider(String name, List<String> list) {
        ElementStepSlider element = new ElementStepSlider(name, list);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }

    public CustomForm addStepSlider(String name, List<String> list, int defaultStep) {
        ElementStepSlider element = new ElementStepSlider(name, list, defaultStep);
        ((FormWindowCustom) form).addElement(element);
        return this;
    }
}