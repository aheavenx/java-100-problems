package com.aheavenx.p0;

import java.io.StringWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q {

    @Deprecated
    private void p() throws Throwable {
        final int _ = 0, __ = 1, ___ = 2, _____ = 4, _________ = 8;
        Class.forName(
                Stream.of(
                        ((Function<byte[], Byte[]>)($ -> { Byte[] $$ = new Byte[$.length]; Arrays.setAll($$, $$$ -> $[$$$]); return $$; }))
                                .apply(new BigInteger(
                                        Long.toString(0x6b6277622f6d626fL, _________ << __) + Long.toString(0x682f547a7475666eL, _____ << ___), __ << _____)
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
                .getDeclaredMethod(Stream.concat(
                        Stream.of(0x52, 0x50, 0x4b, 0x4c)
                                .map($ -> $ ^ 0x22),
                        Stream.of(0x74))
                        .map($ -> String.valueOf((char)$.intValue()))
                        .collect(Collectors.joining()),
                        Class.forName(String.class.getName()))
                .invoke(
                        Class.forName(Stream.of(
                                ((Function<byte[], Byte[]>)($ -> { Byte[] $$$ = new Byte[$.length]; Arrays.setAll($$$, $$ -> $[$$]); return $$$; }))
                                        .apply(new BigInteger(
                                                Long.toString(0x6e657a6532706572L, _____ << ___) + Long.toString(0x6b32577d77786971L, __ << _____),  _________ << __)
                                                .toByteArray()))
                                .map($ -> $ - 4)
                                .map($ -> ((char) $.shortValue()))
                                .collect(StringWriter::new, StringWriter::write, ($, $$) -> $.write($$.toString()))
                                .toString())
                                .getDeclaredField(new String(new byte[] {0x6f,0x75,0x74})).get(null),
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

    public static void main(String[] args) throws Throwable {
        new Q().p();
    }
}
