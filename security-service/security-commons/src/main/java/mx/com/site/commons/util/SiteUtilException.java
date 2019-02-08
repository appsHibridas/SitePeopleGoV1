package mx.com.site.commons.util;
import java.util.Optional;
import java.util.function.Supplier;

public class SiteUtilException {

    public static <X extends RuntimeException, T > T defaultNullable(T value, Supplier<? extends X> exceptionSupplier) throws X {
        if (!Optional.ofNullable(value).isPresent() || value.equals("")) {
            throw exceptionSupplier.get();
        }
        return value;
    }
}
