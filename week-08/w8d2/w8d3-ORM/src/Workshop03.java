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
public class Workshop03 {

    public static void main(String[] args) throws Exception {

        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop03?user=user1&password=12345&useSSL=false";


        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl);
        // instantiate the dao
        Dao<Address, String> addressDao =
                DaoManager.createDao(connectionSource, Address.class);
        // if you need to create the ’accounts’ table make this call
        TableUtils.createTable(connectionSource, Address.class);

        // create an instance of Account
//        Account myAccount = new Account();
//        myAccount.setName("Captain America");
//
//        // persist the account object to the database
//        accountDao.create(myAccount);

        // create an instance of Account
        Address myAddress = new Address();
        myAddress.setCity("Bp");
        myAddress.setCountry("HU");
        myAddress.setPostCode(1037);
        myAddress.setStreet("Kinizsi 2/B");

        try {
            addressDao.create(myAddress);
        } catch (Exception e){
            System.out.println("already existing recrds - dit not write to db");
        }

        // retrieve the account from the database by its id field (name)
        List<Address> addresses = addressDao.queryForAll();
        for (Address a:
                addresses) {
            System.out.println(a.toString());
        }

        // close the connection source
        connectionSource.close();
    }
}

