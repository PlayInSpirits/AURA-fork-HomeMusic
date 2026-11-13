package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xa4 {
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String str = f35.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public xa4(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        rr2.l(z);
        this.a = i;
        this.b = str;
        this.c = bundle;
    }

    public static xa4 a(Bundle bundle) {
        int i = bundle.getInt(d, 1000);
        String string = bundle.getString(e, "");
        Bundle n = f35.n(bundle.getBundle(f));
        if (n == null) {
            n = Bundle.EMPTY;
        }
        return new xa4(string, i, n);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putString(e, this.b);
        Bundle bundle2 = this.c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa4)) {
            return false;
        }
        xa4 xa4Var = (xa4) obj;
        return this.a == xa4Var.a && Objects.equals(this.b, xa4Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public xa4(int i, String str) {
        this(str, i, Bundle.EMPTY);
    }
}
