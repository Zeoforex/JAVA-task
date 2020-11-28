package homework_StringBuilder.Task1;
/*
Реализовать класс обертку StringBuilder с поддержкой undo
Делегировать стандартные методы стандартному StringBUilder
Паттерн «Команда»
 */
import java.util.Stack;
public class UndoStringBuilder {
    private interface Action {
        void undo();
    }

    private class DeleteAction implements Action {
        private int size;

        public DeleteAction(int size) {
            this.size = size;
        }

        public void undo() {
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
        }
    }

    private StringBuilder stringBuilder; // делегат

    private Stack<Action> actions = new Stack<>(); // стэк

    public UndoStringBuilder() {
        stringBuilder = new StringBuilder();
    }
    // теперь с помощью стэка будем делать обратные операции

    public UndoStringBuilder reverse() {
        stringBuilder.reverse();
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.reverse();
            }
        };
        actions.add(action);
        return this;
    }

    public UndoStringBuilder append(String str){
        stringBuilder.append(str);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length()-str.length()-1,stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public UndoStringBuilder delete(int start, int end){
        String deleted = stringBuilder.substring(start,end);
        stringBuilder.delete(start, end);
        actions.add(() -> stringBuilder.insert(start,deleted));
        return this;
    }

    public UndoStringBuilder replace(int start, int end, String str){
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.replace(start,end,str);
        actions.add(() -> stringBuilder.replace(start,end,deleted));
        return this;
    }
    public UndoStringBuilder insert(int index, char[] str, int offset, int len){
        stringBuilder.insert(index, str, offset, len);
        actions.add(() -> stringBuilder.delete(index, len));
        return this;
    }
    public UndoStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        actions.add(() -> stringBuilder.delete(offset,str.length()));
        return this;
    }
    public void undo(){
        if (!actions.isEmpty()){
            actions.pop().undo();
        }
    }

    public String toString(){
        return stringBuilder.toString();
    }

}
