import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import

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

    private Address address;


    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private int address_id;

    public Account(){
        // ORMLite needs a no-arg constructor
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
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
    public int getAddress_id() {
        return address_id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                '}' + address.toString;
    }
}