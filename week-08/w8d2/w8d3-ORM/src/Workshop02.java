import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Created by zoloe on 2016. 12. 14..
 */
public class Workshop02 {

    public static void main(String[] args) throws Exception {

        // this uses h2 by default but change to match your database

        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop02?user=user1&password=12345";


        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl);
        // instantiate the dao
        Dao<Account, String> accountDao =
                DaoManager.createDao(connectionSource, Account.class);
        // if you need to create the ’accounts’ table make this call
        TableUtils.createTable(connectionSource, Account.class);

        // create an instance of Account
        Account myAccount = new Account();
        myAccount.setName("Captain America");

        // persist the account object to the database
        accountDao.create(myAccount);

        // retrieve the account from the database by its id field (name)
        Account account2 = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account2.getName());

        // close the connection source
        connectionSource.close();
    }

}
