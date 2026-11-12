package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w10 {
    public static final Charset a = null;
    public static final Charset b = null;
    public static final Charset c = null;
    public static volatile Charset d;
    public static volatile Charset e;

    static {
        Charset r0 = Charset.forName("UTF-8");
        r0.getClass();
        a = r0;
        Charset.forName("UTF-16").getClass();
        Charset r1 = Charset.forName("UTF-16BE");
        r1.getClass();
        b = r1;
        Charset r2 = Charset.forName("UTF-16LE");
        r2.getClass();
        c = r2;
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
