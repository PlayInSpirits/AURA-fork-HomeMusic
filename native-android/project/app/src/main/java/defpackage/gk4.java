package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk4 {
    public static final boolean a = false;
    public static final fk4 b = null;
    public static final fk4 c = null;
    public static final ri d = null;
    public static final ri e = null;
    public static final ri f = null;

    static {
        Class.forName("java.sql.Date");     // Catch: ClassNotFoundException -> L5
        boolean r2 = true;
    L6:
        a = r2;
        if (r2 == false) goto L9;
        b = new fk4(0, Date.class);
        c = new fk4(1, Timestamp.class);
        d = dk4.c;
        e = dk4.d;
        f = ek4.c;
        return;
    L9:
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        return;
    L5:
        r2 = false;
        goto L6
    }
}
