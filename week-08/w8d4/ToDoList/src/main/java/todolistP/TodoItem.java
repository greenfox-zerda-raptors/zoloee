package todolistP;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by zoloe on 2016. 11. 17..
 */
public class TodoItem {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private boolean isDone;
    @DatabaseField
    private String Description;

    public TodoItem() {
    }

    public TodoItem(String Description) {
        this(false, Description);
    }

    public TodoItem(boolean isDone, String Description) {
        this.isDone = isDone;
        this.Description = Description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        Description = Description;
    }

    @Override
    public String toString() {
        return id + " " + Description ;
//        + isDone + " " +
    }
}
