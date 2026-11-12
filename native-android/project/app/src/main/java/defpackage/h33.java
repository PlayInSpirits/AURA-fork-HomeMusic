package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h33 {
    public static final b33 b = null;
    public static final b33 c = null;
    public static final a33 d = null;
    public static final a33 e = null;
    public static final b33 f = null;
    public static final a33 g = null;
    public static final a33 h = null;
    public static final b33 i = null;
    public static final a33 j = null;
    public static final a33 k = null;
    public static final b33 l = null;
    public static final a33 m = null;
    public static final a33 n = null;
    public static final b33 o = null;
    public static final a33 p = null;
    public static final a33 q = null;
    public final boolean a;

    static {
        b = new b33(2, false);
        c = new b33(4, false);
        d = new a33(4, true);
        e = new a33(5, true);
        f = new b33(3, false);
        g = new a33(6, true);
        h = new a33(7, true);
        i = new b33(1, false);
        j = new a33(2, true);
        k = new a33(3, true);
        l = new b33(0, false);
        m = new a33(0, true);
        n = new a33(1, true);
        o = new b33(5, true);
        p = new a33(8, true);
        q = new a33(9, true);
    }

    public h33(boolean r1) {
        this.a = r1;
    }

    public abstract Object a(String r1, Bundle r2);

    public abstract String b();

    public Object c(Object r1, String r2) {
        return d(r2);
    }

    public abstract Object d(String r1);

    public abstract void e(Bundle r1, String r2, Object r3);

    public String f(Object r1) {
        return String.valueOf(r1);
    }

    public final String toString() {
        return b();
    }
}
