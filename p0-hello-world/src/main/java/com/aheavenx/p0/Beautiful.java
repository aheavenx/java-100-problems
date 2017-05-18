package com.aheavenx.p0;

import java.math.BigInteger;
import java.nio.file.AtomicMoveNotSupportedException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Skovorodnikov
 *         Created on 18.05.2017 14:06
 */
public class Beautiful {

    @Deprecated
    private void program() throws Throwable {
        final int _ = 0, __ = 1, ___ = 2, ____ = 3, _____ = 4, ______ = 5, _______ = 6, ________ = 7, _________ = 8, __________ = 9;
        Class.forName("java.lang.System")
                .getDeclaredField(
                        new StringBuilder()
                                .append(BiFunction.class.getName().charAt(__ << _____))
                                .append(Function.class.getName().charAt((__ << ___) + __))
                                .append(getClass().getDeclaredMethods()[_].getAnnotations()[_].toString().toLowerCase().charAt((__ << _____) + (__ << __)))
                                .toString()
                )
                .getType()
                .getDeclaredMethod("print", Class.forName("java.lang.String"))
                .invoke(
                        Class.forName("java.lang.System").getDeclaredField("out").get(null),
                        ((Function<BigInteger, ?>)(($$$) -> {
                            final BiFunction<BiFunction, BigInteger, ?> fnb = ($$, $) ->
                                    $.equals(BigInteger.ZERO) ? "" : new String(new char[]{(char) Integer.parseInt($.mod(BigInteger.valueOf(256)).toString())}) + $$.apply($$, $.divide(BigInteger.valueOf(256)));
                            return fnb.apply(fnb, $$$);
                        })).apply(
                                BigInteger.valueOf(8026160351752501L)
                                        .multiply(BigInteger.valueOf(100000000000000L))
                                        .add(BigInteger.valueOf(24568770929992L))
                        ));
    }

    public static void main(String[] args) {
        try {
            System.out.println(AtomicMoveNotSupportedException.class.getSimpleName()); //print
            AtomicMoveNotSupportedException.class.getSimpleName().codePoints(); //todo make "print"

            //new Beautiful().program();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
