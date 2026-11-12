package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ab3 {
    public static final tv1 e = new tv1();
    public final Object a;
    public final za3 b;
    public final String c;
    public volatile byte[] d;

    public ab3(String str, Object obj, za3 za3Var) {
        if (TextUtils.isEmpty(str)) {
            kf2.n("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = obj;
        this.b = za3Var;
    }

    public static ab3 a(Object obj, String str) {
        return new ab3(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ab3) {
            return this.c.equals(((ab3) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return b11.q(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
