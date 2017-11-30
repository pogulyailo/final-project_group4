package project;

import Actions.ActionList;

public class SuperScreens {
    private String text;                                           //Приветственное сообщение
    private String text2;                                          //Название программы и ее версия
    private ActionList[] actionLists = new ActionList[2];          //Список действий на этом экране

    public SuperScreens(String text, String text2) {
        this.text = text;
        this.text2 = text2;

        for (int i = 0; i < actionLists.length; i++) {
            actionLists[i] = new ActionList();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;

    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public ActionList[] getActionLists() {                       //Выбираем действие 1 или 2
        actionLists = new ActionList[2];
        for (int i = 0; i < actionLists.length; i++) {
            actionLists[i] = new ActionList();
        }
        return actionLists;
    }

    public void setActionLists(ActionList[] actionLists) {
        this.actionLists = actionLists;
    }
}
