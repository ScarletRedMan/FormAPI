# FormAPI | NukkitX

Simple library for creating forms (MCBE Nukkit)

<br/><br/>
Examples:
<br/><br/>
SimpleForm
-----------------------------------
<br/>

```java
SimpleForm form = new SimpleForm("Test simple form")
    .setContent("Sample text")
    .addButton("Just a button")
    .addButton("Button with diamond", ImageType.PATH, "textures/items/diamond");

form.send(player, (targetPlayer, targetForm, data) -> {
    if(data == -1) return;
    
    targetPlayer.sendMessage(data.toString());
});
```

![screenshot of sample](http://images.vfl.ru/ii/1576485918/351dffe3/28924854.png)
<br/><br/>
CustomForm
-----------------------------------
<br/>

```java
CustomForm form = new CustomForm()
    .addLabel("Sample text")
    .addDropDown("Sample dropdown", Arrays.asList("Line 1", "Line 2", "Line 3"))
    .addInput("Text area")
    .addSlider("Slider", 1, 100)
    .addStepSlider("Step slider", Arrays.asList("Step 1", "Step 2", "Step 3"))
    .addToggle("Just a toggle", false);

form.send(player, (targetPlayer, targetForm, data) -> {
    if(data == null) return;
    
    targetPlayer.sendMessage(data.toString());
});
```         

![screenshot of sample](http://images.vfl.ru/ii/1576486356/8c9f89a6/28924955.png)
<br/><br/>
ModalForm
-----------------------------------
<br/>

```java
ModalForm form = new ModalForm("It`s a title", "Sample text", "Positive button", "Negative button");

form.send(player, (targetPlayer, targetForm, data) -> {
    if(data == -1) return;
    
    targetPlayer.sendMessage(data.toString());
});
```
                            
![screenshot of sample](http://images.vfl.ru/ii/1576486613/7c402664/28925022.png)
-----------------------------------
Download: https://github.com/qPexLegendary/FormAPI/releases <br>
Example plugin: https://github.com/qPexLegendary/Example-for-FormAPI
