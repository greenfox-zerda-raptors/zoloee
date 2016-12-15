package todolistP;

/**
 * Created by zoloe on 2016. 11. 17..
 */
public class TodoItem {
    boolean isDone;
    String Desc;

    public TodoItem(String desc) {
        this(false, desc);
    }

    public TodoItem(boolean isDone, String desc) {
        this.isDone = isDone;
        Desc = desc;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
