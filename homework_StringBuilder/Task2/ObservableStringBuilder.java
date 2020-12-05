package homework_StringBuilder.Task2;

import java.util.Stack;

/*
Написать класс StringBuilder с оповещением других
объектов-слушателей об изменении своего состояния
Делегировать стандартные методы стандартному StringBuilder.
Паттерн «Наблюдатель»
 */

interface ChangedOnStringBuilderListener {
    void changedOn(ObservableStringBuilder stringBuilder);
}

public class ObservableStringBuilder {
    //тот самый слушатель которого я уведомляю
    private ChangedOnStringBuilderListener changedOnListener;

    private StringBuilder stringBuilder; // наш делегат

    public void setChangedOnListener(ChangedOnStringBuilderListener changedOnListener) {
        this.changedOnListener = changedOnListener;
    }

    public ObservableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    private void notification() {
        if (changedOnListener != null) {
            changedOnListener.changedOn(this);
        }
    }

    public ObservableStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notification();
        return this;
    }

    public ObservableStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notification();
        return this;
    }

    public ObservableStringBuilder reverse() {
        stringBuilder.reverse();
        notification();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public ObservableStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notification();
        return this;
    }

    public ObservableStringBuilder deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        notification();
        return this;
    }
}

class OurListener implements ChangedOnStringBuilderListener {
    /*
        Определяем метод changedOn (смена состояния), в который передаётся наша строка, а точнее StringBuilder,
        от которой ждем изменеий
     */
    public void changedOn(ObservableStringBuilder stringBuilder) {
        System.out.println("Оп! Переход в новое состояние: " + stringBuilder.toString());
    }
}