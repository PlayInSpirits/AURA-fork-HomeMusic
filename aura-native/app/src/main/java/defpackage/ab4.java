package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ab4 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final xa4 d;

    static {
        String str = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public ab4(int i, Bundle bundle, long j, xa4 xa4Var) {
        rr2.l(xa4Var == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (xa4Var == null && i < 0) {
            xa4Var = new xa4(i, "no error message provided");
        }
        this.d = xa4Var;
    }

    public static ab4 a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle n = f35.n(bundle.getBundle(f));
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        xa4 a = bundle2 != null ? xa4.a(bundle2) : i != 0 ? new xa4(i, "no error message provided") : null;
        if (n == null) {
            n = Bundle.EMPTY;
        }
        return new ab4(i, n, j, a);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        xa4 xa4Var = this.d;
        if (xa4Var != null) {
            bundle.putBundle(h, xa4Var.b());
        }
        return bundle;
    }

    public ab4(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public ab4(xa4 xa4Var) {
        this(xa4Var.a, Bundle.EMPTY, SystemClock.elapsedRealtime(), xa4Var);
    }

    public ab4(int i) {
        this(i, Bundle.EMPTY);
    }
}
