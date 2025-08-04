import config.FactoryConfiguration;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Customer customer = new Customer();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
    }
}