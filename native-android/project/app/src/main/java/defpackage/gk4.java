package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk4 {
    public static final boolean a;
    public static final fk4 b;
    public static final fk4 c;
    public static final ri d;
    public static final ri e;
    public static final ri f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new fk4(0, Date.class);
            c = new fk4(1, Timestamp.class);
            d = dk4.c;
            e = dk4.d;
            f = ek4.c;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
