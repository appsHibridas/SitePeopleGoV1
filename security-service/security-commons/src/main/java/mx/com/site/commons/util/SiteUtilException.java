package mx.com.site.commons.util;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import static mx.com.site.commons.util.Constants.EMPTY;

public class SiteUtilException {


    public static  String ofStringNullableOrEmpty(String value, String message)  {
        if (null == value || value.equals("")) {
            ExceptionMessage.EXCEPTION_MESSAGE.setMessage(message);
            throw new NullPointerException(messageException());
        }
        return value;
    }

    public static <T>  T ofEntityNullable(T value,String message)  {
        if (null == value) {
            ExceptionMessage.EXCEPTION_MESSAGE.setMessage(message);
            throw new NullPointerException(messageException());
        }
        return value;
    }

    public static <T>  T ofCollectionNullable(T value,String message)  {
        if (null == value || ((Collection) value).isEmpty() ) {
            ExceptionMessage.EXCEPTION_MESSAGE.setMessage(message);
            throw new NullPointerException(messageException());
        }
        return value;
    }

    private static String messageException(){
        StringBuilder msj = new StringBuilder();
        msj.append(ExceptionMessage.EXCEPTION_MESSAGE.getMessage())
                .append(EMPTY)
                .append(LocalDate.now().toString());
        return Optional.of(msj).get().toString();
    }
}
