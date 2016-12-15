import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by zoloe on 2016. 12. 14..
 */
@DatabaseTable(tableName = "accounts")
public class Account{
    public static final String PASSWORD_FIELD_NAME = "password";
    public static final String NAME_FIELD_NAME = "name";

    @DatabaseField(id = true, columnName = NAME_FIELD_NAME)
    private String name;
    @DatabaseField(columnName = PASSWORD_FIELD_NAME)
    private String password;

    public void setAddress(Address address) {
        this.address = address;
    }

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private Address address;

    public Account(){
        // ORMLite needs a no-arg constructor
    }

    public Account(String name, String password, Address address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                '}' + address.toString();
    }
}