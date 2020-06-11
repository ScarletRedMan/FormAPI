# FormAPI | NukkitX
Простой API для создания форм (MCBE Nukkit)
<br/><br/>
Примеры использования:
<br/><br/>
SimpleForm
-----------------------------------
<br/>

    SimpleForm form = new SimpleForm("Тестовая форма")
        .setContent("Здесь должен быть какой-то текст, но почему-то его все-таки нет.")
        .addButton("Кнопочка")
        .addButton("Кнопоча с алмазиком", ImageType.PATH, "textures/items/diamond");
    
    form.send(player, (targetPlayer, targetForm, data) -> {
        if(data == -1) return; //Если форма закрыта принудительно, то data будет иметь значение -1
        
        targetPlayer.sendMessage(data.toString());
    });

![screenshot of sample](http://images.vfl.ru/ii/1576485918/351dffe3/28924854.png)
<br/><br/>
CustomForm
-----------------------------------
<br/>

    CustomForm form = new CustomForm()
        .addLabel("Тут должен быть написан какой-то рандомный текст, но написано это.")
        .addDropDown("Выпадающий список", Arrays.asList("Вариант 1", "Вариант 2", "Вариант 3"))
        .addInput("Текстовое поле")
        .addSlider("Ползунок", 1, 100)
        .addStepSlider("Пошаговый ползунок", Arrays.asList("Вариант 1", "Вариант 2", "Вариант 3"))
        .addToggle("Переключатель", false);
    
    form.send(player, (targetPlayer, targetForm, data) -> {
        if(data == null) return; //Если форма закрыта принудительно, то data будет иметь значение null
        
        targetPlayer.sendMessage(data.toString());
    });
         

![screenshot of sample](http://images.vfl.ru/ii/1576486356/8c9f89a6/28924955.png)
<br/><br/>
ModalForm
-----------------------------------
<br/>

    ModalForm form = new ModalForm("Заголовок", "Текст", "Кнопка 1", "Кнопка 2");
    
    form.send(player, (targetPlayer, targetForm, data) -> {
        if(data == -1) return; //Если форма закрыта принудительно, то data будет иметь значение -1
        
        targetPlayer.sendMessage(data.toString());
    });
                            
![screenshot of sample](http://images.vfl.ru/ii/1576486613/7c402664/28925022.png)
-----------------------------------
Скачать: https://github.com/qPexLegendary/FormAPI/releases
