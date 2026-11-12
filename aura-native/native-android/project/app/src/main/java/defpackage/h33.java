package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h33 {
    public static final b33 b = new b33(2, false);
    public static final b33 c = new b33(4, false);
    public static final a33 d = new a33(4, true);
    public static final a33 e = new a33(5, true);
    public static final b33 f = new b33(3, false);
    public static final a33 g = new a33(6, true);
    public static final a33 h = new a33(7, true);
    public static final b33 i = new b33(1, false);
    public static final a33 j = new a33(2, true);
    public static final a33 k = new a33(3, true);
    public static final b33 l = new b33(0, false);
    public static final a33 m = new a33(0, true);
    public static final a33 n = new a33(1, true);
    public static final b33 o = new b33(5, true);
    public static final a33 p = new a33(8, true);
    public static final a33 q = new a33(9, true);
    public final boolean a;

    public h33(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
