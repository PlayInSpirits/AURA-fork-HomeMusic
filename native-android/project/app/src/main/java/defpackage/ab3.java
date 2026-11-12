package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ab3 {
    public static final tv1 e = null;
    public final Object a;
    public final za3 b;
    public final String c;
    public volatile byte[] d;

    static {
        e = new tv1();
    }

    public ab3(String r2, Object r3, za3 r4) {
        if (TextUtils.isEmpty(r2) == true) goto L6;
        this.c = r2;
        this.a = r3;
        this.b = r4;
        return;
    L6:
        kf2.n("Must not be null or empty");
        throw null;
    }

    public static ab3 a(Object r2, String r3) {
        return new ab3(r3, r2, e);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ab3) == true) goto L5;
        return false;
    L5:
        return this.c.equals(((ab3) r2).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return b11.q(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
