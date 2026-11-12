package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 {
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final Bundle e;
    public final int f;

    static {
        String r0 = f35.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public ja0(String r8, int r9, Bundle r10) {
        this(1009002300, 8, r8, r9, new Bundle(r10), 0);
    }

    public static ja0 a(Bundle r9) {
        int r3 = r9.getInt(g, 0);
        int r4 = r9.getInt(k, 0);
        String r5 = r9.getString(h);
        r5.getClass();
        String r0 = i;
        rr2.l(r9.containsKey(r0));
        int r6 = r9.getInt(r0);
        Bundle r1 = r9.getBundle(j);
        int r8 = r9.getInt(l, 0);
        if (r1 != null) goto L6;
        r1 = Bundle.EMPTY;
    L6:
        return new ja0(r3, r4, r5, r6, r1, r8);
    }

    public final Bundle b() {
        Bundle r0 = new Bundle();
        r0.putInt(g, this.a);
        r0.putString(h, this.c);
        r0.putInt(i, this.d);
        r0.putBundle(j, this.e);
        r0.putInt(k, this.b);
        r0.putInt(l, this.f);
        return r0;
    }

    public ja0(int r1, int r2, String r3, int r4, Bundle r5, int r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }
}
