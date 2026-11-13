package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class va4 {
    public static final gy3 d = yw1.o(40010);
    public static final gy3 e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        gh0.f(7, objArr);
        e = yw1.i(7, objArr);
        String str = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public va4(int i) {
        rr2.k("commandCode shouldn't be COMMAND_CODE_CUSTOM", i != 0);
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public static va4 a(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new va4(i);
        }
        String string = bundle.getString(g);
        string.getClass();
        Bundle n = f35.n(bundle.getBundle(h));
        if (n == null) {
            n = Bundle.EMPTY;
        }
        return new va4(string, n);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof va4)) {
            return false;
        }
        va4 va4Var = (va4) obj;
        return this.a == va4Var.a && TextUtils.equals(this.b, va4Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public va4(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
