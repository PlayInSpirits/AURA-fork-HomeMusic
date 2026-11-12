package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lu3 {
    public static final String a;

    static {
        String str = f35.a;
        a = Integer.toString(0, 36);
    }

    public static lu3 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = vl1.d;
            rr2.l(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(vl1.d, false) ? new vl1(bundle.getBoolean(vl1.e, false)) : new vl1();
        }
        if (i == 1) {
            String str3 = jf3.c;
            rr2.l(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(jf3.c, -1.0f);
            return f == -1.0f ? new jf3() : new jf3(f);
        }
        if (i == 2) {
            String str4 = xk4.d;
            rr2.l(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(xk4.d, 5);
            float f2 = bundle.getFloat(xk4.e, -1.0f);
            return f2 == -1.0f ? new xk4(i2) : new xk4(i2, f2);
        }
        if (i != 3) {
            kf2.n(f34.f(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = qt4.d;
        rr2.l(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(qt4.d, false) ? new qt4(bundle.getBoolean(qt4.e, false)) : new qt4();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
