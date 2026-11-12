package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final yw a = null;
    public static final yw b = null;
    public static final yw c = null;
    public static final yw d = null;
    public static final yw e = null;

    static {
        yw r0 = yw.q;
        a = pa.t("/");
        b = pa.t("\\");
        c = pa.t("/\\");
        d = pa.t(".");
        e = pa.t("..");
    }

    public static final int a(ge3 r6) {
        yw r7 = r6.n;
        if (r7.d() != 0) goto L6;
    L37:
        return -1;
    L6:
        if (r7.i(0) != 47) goto L9;
    L19:
        return 1;
    L9:
        if (r7.i(0) != 92) goto L21;
        if (r7.d() <= 2) goto L19;
        if (r7.i(1) != 92) goto L19;
        yw r0 = b;
        r0.getClass();
        int r1 = r7.f(2, r0.h());
        if (r1 == (-1)) goto L17;
        return r1;
    L17:
        return r7.d();
    L21:
        if (r7.d() <= 2) goto L37;
        if (r7.i(1) != 58) goto L37;
        if (r7.i(2) != 92) goto L37;
        char r8 = (char) r7.i(0);
        if ('a' > r8) goto L32;
        if (r8 >= '{') goto L32;
        return 3;
    L32:
        if ('A' > r8) goto L37;
        if (r8 >= '[') goto L37;
        return 3;
    }

    public static final ge3 b(ge3 r6, ge3 r7, boolean r8) {
        r7.getClass();
        if (a(r7) == (-1)) goto L6;
    L7:
        return r7;
    L6:
        if (r7.e() != null) goto L7;
        yw r0 = c(r6);
        if (r0 != null) goto L13;
        r0 = c(r7);
        if (r0 != null) goto L13;
        r0 = f(ge3.o);
    L13:
        tv r1 = new tv();
        r1.X(r6.n);
        if (r1.o <= 0) goto L16;
        r1.X(r0);
    L16:
        r1.X(r7.n);
        return d(r1, r8);
    }

    public static final yw c(ge3 r3) {
        yw r0 = r3.n;
        yw r1 = a;
        if (yw.g(r0, r1) == (-1)) goto L5;
        return r1;
    L5:
        yw r4 = r3.n;
        yw r2 = b;
        if (yw.g(r4, r2) == (-1)) goto L8;
        return r2;
    L8:
        return null;
    }

    public static final ge3 d(tv r17, boolean r18) {
        tv r1 = new tv();
        yw r2 = null;
        int r4 = 0;
    L4:
        if (r17.v(a) == true) goto L91;
        yw r5 = b;
        if (r17.v(r5) == true) goto L91;
        if (r4 >= 2) goto L11;
    L13:
        boolean r6 = false;
    L14:
        yw r10 = c;
        if (r6 == false) goto L17;
        r2.getClass();
        r1.X(r2);
        r1.X(r2);
    L19:
        long r15 = -1;
    L49:
        if (r1.o <= 0) goto L51;
        boolean r3 = true;
    L52:
        ArrayList r7 = new ArrayList();
    L53:
        boolean r8 = r17.l();
        yw r9 = d;
        if (r8 == true) goto L81;
        long r13 = r17.u(r10);
        if (r13 != r15) goto L58;
        yw r11 = r17.g(r17.o);
    L59:
        yw r12 = e;
        if (h12.c(r11, r12) == true) goto L61;
        if (h12.c(r11, r9) == true) goto L53;
        if (h12.c(r11, yw.q) == true) goto L53;
        r7.add(r11);
        goto L53
    L61:
        if (r3 == false) goto L64;
        if (r7.isEmpty() == true) goto L53;
    L64:
        if (r18 == false) goto L75;
        if (r3 == true) goto L71;
        if (r7.isEmpty() == true) goto L75;
        if (h12.c(q40.C0(r7), r12) == true) goto L75;
    L71:
        if (r6 == false) goto L74;
        if (r7.size() == 1) goto L53;
    L74:
        v40.r0(r7);
    L75:
        r7.add(r11);
        goto L53
    L58:
        r11 = r17.g(r13);
        r17.readByte();
        goto L59
    L81:
        int r0 = r7.size();
        int r14 = 0;
    L82:
        if (r14 >= r0) goto L87;
        if (r14 <= 0) goto L85;
        r1.X(r2);
    L85:
        r1.X((yw) r7.get(r14));
        r14 = r14 + 1;
        goto L82
    L87:
        if (r1.o != 0) goto L90;
        r1.X(r9);
    L90:
        return new ge3(r1.g(r1.o));
    L51:
        r3 = false;
        goto L52
    L17:
        if (r4 <= 0) goto L20;
        r2.getClass();
        r1.X(r2);
        goto L19
    L20:
        long r16 = r17.u(r10);
        if (r2 != null) goto L27;
        if (r16 != (-1)) goto L25;
        r2 = f(ge3.o);
        goto L27
    L25:
        r2 = e(r17.q(r16));
    L27:
        if (h12.c(r2, r5) == false) goto L19;
        if (r17.o < 2) goto L19;
        r15 = -1;
        if (r17.q(1) != 58) goto L49;
        char r19 = (char) r17.q(0);
        if ('a' > r19) goto L41;
        if (r19 >= '{') goto L41;
    L45:
        if (r16 != 2) goto L47;
        r1.L(r17, 3);
        goto L49
    L47:
        r1.L(r17, 2);
    L41:
        if ('A' > r19) goto L49;
        if (r19 >= '[') goto L49;
    L11:
        if (h12.c(r2, r5) == false) goto L13;
        r6 = true;
    L91:
        byte r20 = r17.readByte();
        if (r2 != null) goto L94;
        r2 = e(r20);
    L94:
        r4 = r4 + 1;
        goto L4
    }

    public static final yw e(byte r1) {
        if (r1 == 47) goto L11;
        if (r1 == 92) goto L7;
        kf2.n(f34.f(r1, "not a directory separator: "));
        return null;
    L7:
        return b;
    L11:
        return a;
    }

    public static final yw f(String r1) {
        if (h12.c(r1, "/") == false) goto L7;
        return a;
    L7:
        if (h12.c(r1, "\\") == true) goto L9;
        kf2.n(xa3.g("not a directory separator: ", r1));
        return null;
    L9:
        return b;
    }
}
