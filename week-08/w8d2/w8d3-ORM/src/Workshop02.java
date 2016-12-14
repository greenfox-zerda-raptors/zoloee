import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.List;

/**
 * Created by zoloe on 2016. 12. 14..
 */
public class Workshop02 {

    public static void main(String[] args) throws Exception {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        } // elviled ez gyakna ki a jdbc hibat

        // this uses h2 by default but change to match your database

        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop02?user=user1&password=12345&useSSL=false";


        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl);
        // instantiate the dao
        Dao<Account, String> accountDao =
                DaoManager.createDao(connectionSource, Account.class);
        // if you need to create the ’accounts’ table make this call
//        TableUtils.createTable(connectionSource, Account.class);

        // create an instance of Account
//        Account myAccount = new Account();
//        myAccount.setName("Captain America");
//
//        // persist the account object to the database
//        accountDao.create(myAccount);

        // create an instance of Account
        Account myAccount2 = new Account();
        myAccount2.setName("Iron Man");

        Account myAccount3 = new Account();
        myAccount3.setName("Wolverine");

        Account myAccount4 = new Account();
        myAccount4.setName("Hulk");

        Account myAccount5 = new Account();
        myAccount5.setName("Loki");

        try {
            accountDao.create(myAccount2);
            accountDao.create(myAccount3);
            accountDao.create(myAccount4);
            accountDao.create(myAccount5);
        } catch (Exception e){
            System.out.println("already existing recrds - dit not write to db");
        }

        // retrieve the account from the database by its id field (name)
        List<Account> accounts = accountDao.queryForAll();
        for (Account a:
             accounts) {
            System.out.println("Account: " + a.getName());
        }

        //Use QueryBuilder to query the database and order the accounts alphabetically.
        accounts = null;
        QueryBuilder<Account, String> accountStringQueryBuilder = accountDao.queryBuilder();
        accountStringQueryBuilder.where().isNotNull(Account.NAME_FIELD_NAME);
        accountStringQueryBuilder.orderBy(Account.NAME_FIELD_NAME, false);
        accounts = accountStringQueryBuilder.query();

        for (Account a:
                accounts) {
            System.out.println("Account: " + a.getName());
        }

        // close the connection source
        connectionSource.close();
    }

}

