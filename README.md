# FormAPI | NukkitX
Простой API для создания форм (MCBE Nukkit)
<br/><br/>
Примеры использования:
<br/><br/>
SimpleForm
-----------------------------------
<br/>

                    Player p = (Player) sender;
                    Form form = new SimpleForm("Тестовая форма");
                    ((SimpleForm)form).setContent("Тут должен быть написан какой-то тестовый текст.")
                            .addButton("Кнопа")
                            .addButton("Кнопка с картинкой", ImageType.PAHT, "textures/items/diamond")
                            .send(p, (player, formWindow, o, hashMap) -> {
                                if(o == null) return;

                                p.sendMessage(o.toString());
                                getLogger().info(o.toString()); //Ответ от формы
                            }); 
                            
![screenshot of sample](http://images.vfl.ru/ii/1576485918/351dffe3/28924854.png)
<br/><br/>
CustomForm
-----------------------------------
<br/>

                    Player p = (Player) sender;
                    Form form = new CustomForm();
                    List<String> list = new ArrayList<>();
                    list.add("1 пункт");
                    list.add("2 пункт");
                    list.add("3 пункт");
                    list.add("4 пункт");
                    list.add("5 пункт");

                    ((CustomForm)form).addLabel("Тут должен быть написан какой-то рандомный текст, но написано это.")
                            .addDropDown("Выпадающий список", list)
                            .addInput("Текстовое поле")
                            .addSlider("Ползунок", 1, 100)
                            .addStepSlider("Пошаговый ползунок", list)
                            .addToggle("Переключатель")
                            .send(p, (player, formWindow, o, hashMap) -> {
                                if(o == null) return;

                                p.sendMessage(o.toString());
                                getLogger().info(o.toString()); //Ответ от формы
                            });

![screenshot of sample](http://images.vfl.ru/ii/1576486356/8c9f89a6/28924955.png)
<br/><br/>
ModalForm
-----------------------------------
<br/>

                    Player p = (Player) sender;
                    Form form = new ModalForm("Заголовок", "Текст", "Кнопка 1", "Кнопка 2");
                    form.send(p, (player, formWindow, o, hashMap) -> {
                                if(o == null) return;
                                p.sendMessage(o.toString());
                                getLogger().info(o.toString()); //Ответ от формы
                            });
                            
![screenshot of sample](http://images.vfl.ru/ii/1576486613/7c402664/28925022.png)
<br/> <br/> <br/>

Подробнее в плагине: https://github.com/qPexLegendary/Example-for-ForAPI
