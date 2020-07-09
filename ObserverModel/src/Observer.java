import java.math.BigDecimal;

public interface Observer {
    void update(String mallName, String product, BigDecimal money);
}
