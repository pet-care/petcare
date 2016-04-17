package gr.petcare.Persistence;

/**
 * Created by user on 17/4/2016.
 */
public class DBConnectionFormator {
    public static String getJdbcUrl() {

        return("jdbc:mysql://" + System.getenv("OPENSHIFT_MYSQL_DB_HOST") + ":" + System.getenv("OPENSHIFT_MYSQL_DB_PORT") + "/" + System.getenv("OPENSHIFT_APP_NAME"));
    }
    public static String getJdbcUsernname() {
        return (System.getenv("OPENSHIFT_MYSQL_DB_USERNAME"));
    }
    public static String getJdbcPassword() {
        return(System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD"));
    }
}