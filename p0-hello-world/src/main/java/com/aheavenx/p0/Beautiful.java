package com.aheavenx.p0;

import java.io.StringWriter;
import java.math.BigInteger;
import java.nio.file.AtomicMoveNotSupportedException;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Skovorodnikov
 *         Created on 18.05.2017 14:06
 */
public class Beautiful {

    @Deprecated
    private void program() throws Throwable {
        final int _ = 0, __ = 1, ___ = 2, ____ = 3, _____ = 4, ______ = 5, _______ = 6, ________ = 7, _________ = 8, __________ = 9;
        Class.forName(
                Stream.of(
                        ((Function<byte[], Byte[]>)($ -> { Byte[] $$ = new Byte[$.length]; Arrays.setAll($$, $$$ -> $[$$$]); return $$; }))
                                .apply(new BigInteger(
                                        Long.toString(0x6b6277622f6d626fL, 16) + Long.toString(0x682f547a7475666eL, 16), 16)
                                        .toByteArray()))
                        .map($ -> $ - 1)
                        .map($ -> ((char) $.shortValue()))
                        .collect(StringWriter::new, StringWriter::write, ($, $$) -> $.write($$.toString()))
                        .toString())
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
                        Class.forName(Stream.of(
                                ((Function<byte[], Byte[]>)($ -> { Byte[] $$ = new Byte[$.length]; Arrays.setAll($$, $$$ -> $[$$$]); return $$; }))
                                        .apply(new BigInteger(
                                                Long.toString(0x6e657a6532706572L, 16) + Long.toString(0x6b32577d77786971L, 16), 16)
                                                .toByteArray()))
                                .map($ -> $ - 4)
                                .map($ -> ((char) $.shortValue()))
                                .collect(StringWriter::new, StringWriter::write, ($, $$) -> $.write($$.toString()))
                                .toString())
                                .getDeclaredField("out").get(null),
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
            new Beautiful().program();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
