package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface f42 {
    public static final Charset a = null;

    static {
        a = Charset.forName("UTF-8");
    }

    void b(MessageDigest r1);

    boolean equals(Object r1);

    int hashCode();
}
