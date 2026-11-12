package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jn2 {
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public final Bundle a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        String r0 = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public jn2(Bundle r2, boolean r3, boolean r4, boolean r5) {
        this.a = new Bundle(r2);
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    public static jn2 a(Bundle r5) {
        Bundle r0 = f35.n(r5.getBundle(e));
        boolean r1 = r5.getBoolean(f, false);
        boolean r3 = r5.getBoolean(g, false);
        boolean r6 = r5.getBoolean(h, false);
        if (r0 != null) goto L6;
        r0 = Bundle.EMPTY;
    L6:
        return new jn2(r0, r1, r3, r6);
    }

    public final Bundle b() {
        Bundle r0 = new Bundle();
        r0.putBundle(e, this.a);
        r0.putBoolean(f, this.b);
        r0.putBoolean(g, this.c);
        r0.putBoolean(h, this.d);
        return r0;
    }
}
