package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lu3 {
    public static final String a = null;

    static {
        String r0 = f35.a;
        a = Integer.toString(0, 36);
    }

    public static lu3 a(Bundle r7) {
        String r0 = a;
        int r2 = r7.getInt(r0, -1);
        boolean r3 = false;
        boolean r4 = true;
        if (r2 != 0) goto L5;
        String r5 = vl1.d;
        if (r7.getInt(r0, -1) == 0) goto L44;
        r4 = false;
    L44:
        rr2.l(r4);
        if (r7.getBoolean(vl1.d, false) == false) goto L49;
        return new vl1(r7.getBoolean(vl1.e, false));
    L49:
        return new vl1();
    L5:
        if (r2 != 1) goto L7;
        String r6 = jf3.c;
        if (r7.getInt(r0, -1) != 1) goto L34;
        r3 = true;
    L34:
        rr2.l(r3);
        float r8 = r7.getFloat(jf3.c, -1.0f);
        if (r8 != (-1.0f)) goto L39;
        return new jf3();
    L39:
        return new jf3(r8);
    L7:
        if (r2 != 2) goto L9;
        String r9 = xk4.d;
        if (r7.getInt(r0, -1) != 2) goto L25;
        r3 = true;
    L25:
        rr2.l(r3);
        int r1 = r7.getInt(xk4.d, 5);
        float r10 = r7.getFloat(xk4.e, -1.0f);
        if (r10 != (-1.0f)) goto L30;
        return new xk4(r1);
    L30:
        return new xk4(r1, r10);
    L9:
        if (r2 != 3) goto L20;
        String r11 = qt4.d;
        if (r7.getInt(r0, -1) == 3) goto L14;
        r4 = false;
    L14:
        rr2.l(r4);
        if (r7.getBoolean(qt4.d, false) == false) goto L19;
        return new qt4(r7.getBoolean(qt4.e, false));
    L19:
        return new qt4();
    L20:
        kf2.n(f34.f(r2, "Unknown RatingType: "));
        return null;
    }

    public abstract boolean b();

    public abstract Bundle c();
}
