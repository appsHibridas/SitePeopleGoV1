package mx.com.site.commons.util;
import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Supplier;

public class SiteUtilException {

    public static <X extends RuntimeException, T > T ofDefaultNullable(T value, Supplier<? extends X> exceptionSupplier) throws X {
        if (!Optional.ofNullable(value).isPresent() || value.equals("")) {
            throw exceptionSupplier.get();
        }
        return value;
    }

    public static String messageException(String message,String method){
        StringBuilder msj = new StringBuilder();
        msj.append(message)
                .append("en el")
                .append(method)
                .append(LocalDate.now().toString());
        return Optional.of(msj).get().toString();
    }

}
