import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public interface Observerable {
    List<Observer> list=new ArrayList<>();
    void notifyObserver(String product, BigDecimal money);
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}
