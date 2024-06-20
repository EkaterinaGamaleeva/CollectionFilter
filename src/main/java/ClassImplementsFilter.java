import javax.xml.crypto.dsig.spec.XPathType;
import java.util.function.Function;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class ClassImplementsFilter<T> implements Function<T, Boolean> {
    @Override
    public Boolean apply(Object o) {

        return o!=null;
    }
}
