import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by zoloe on 2016. 12. 14..
 */
@DatabaseTable(tableName = "addresses")
public class Address {
    public static final String STREET_FIELD_NAME = "street";
    public static final String CITY_FIELD_NAME = "city";
    public static final String POSTCODE_FIELD_NAME = "postCode";
    public static final String COUNTRY_FIELD_NAME = "country";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = STREET_FIELD_NAME)
    private String street;
    @DatabaseField(columnName = CITY_FIELD_NAME)
    private String city;
    @DatabaseField(columnName = POSTCODE_FIELD_NAME)
    private int postCode;
    @DatabaseField(columnName = COUNTRY_FIELD_NAME)
    private String country;

    public Address() {
    }

    public Address(String street, String city, int postCode, String country) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                ", country='" + country + '\'' +
                '}';
    }
}
