package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jn2 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final Bundle a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        String str = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public jn2(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = new Bundle(bundle);
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static jn2 a(Bundle bundle) {
        Bundle n = f35.n(bundle.getBundle(e));
        boolean z = bundle.getBoolean(f, false);
        boolean z2 = bundle.getBoolean(g, false);
        boolean z3 = bundle.getBoolean(h, false);
        if (n == null) {
            n = Bundle.EMPTY;
        }
        return new jn2(n, z, z2, z3);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBundle(e, this.a);
        bundle.putBoolean(f, this.b);
        bundle.putBoolean(g, this.c);
        bundle.putBoolean(h, this.d);
        return bundle;
    }
}
