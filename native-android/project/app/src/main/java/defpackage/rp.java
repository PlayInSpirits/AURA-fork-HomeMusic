package defpackage;

import android.content.res.TypedArray;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rp {
    public Object a;

    public rp(int r2) {
        switch(r2) {
            case 1: goto L11;
            case 2: goto L3;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L3;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        this.a = new ArrayDeque(20);
        return;
    L5:
        this.a = new HashSet();
        return;
    L7:
        this.a = new Object();
        return;
    L9:
        this.a = new kd4();
        return;
    L11:
        this.a = new ArrayList();
    }

    public boolean a(int r8, tg1 r9, Object r10) {
        ArrayList r0 = r9.a;
        if (r0 != null) goto L6;
        b(r8, r9, null);
        return true;
    L6:
        int r2 = r0.size();
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L22;
        Object r5 = r0.get(r4);
        if ((r5 instanceof mg1) == false) goto L15;
        if (r5 != r10) goto L20;
        b(0, r9, r5);
        return true;
    L20:
        r4 = r4 + 1;
        goto L7
    L15:
        if ((r5 instanceof tg1) == false) goto L21;
        if (a(r8, (tg1) r5, r10) == false) goto L20;
        b(0, r9, r5);
        return true;
    L21:
        mj0.g(r5, "Unexpected child source info ");
    L22:
        return false;
    }

    public void b(int r1, tg1 r2, Object r3) {
        d80 r4 = new d80(r1, null, null);
        ((ArrayList) this.a).add(r4);
    }

    public abstract void c(gc r1);

    public kd4 d() {
        kd4 r9 = (kd4) this.a;
        int r0 = r9.f;
        int[] r1 = r9.b;
        if (r0 == 1) goto L5;
        int r6 = r9.e;
        r1[0] = r6;
        int r7 = r9.d;
        r1[1] = r7;
        r1[2] = r7;
        r1[3] = r6;
    L6:
        float[] r2 = r9.a;
        if (r0 == 1) goto L10;
        r2[0] = Math.max(((1.0f - r9.k) - r9.l) / 2.0f, 0.0f);
        r2[1] = Math.max(((1.0f - r9.k) - 0.001f) / 2.0f, 0.0f);
        r2[2] = Math.min(((r9.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
        r2[3] = Math.min(((r9.k + 1.0f) + r9.l) / 2.0f, 1.0f);
        return r9;
    L10:
        r2[0] = 0.0f;
        r2[1] = Math.min(r9.k, 1.0f);
        r2[2] = Math.min(r9.k + r9.l, 1.0f);
        r2[3] = 1.0f;
        return r9;
    L5:
        int r8 = r9.d;
        r1[0] = r8;
        r1[1] = r8;
        int r10 = r9.e;
        r1[2] = r10;
        r1[3] = r10;
        goto L6
    }

    public abstract void e(y94 r1);

    public abstract void f();

    public rp g(TypedArray r14) {
        kd4 r0 = (kd4) this.a;
        if (r14.hasValue(3) == false) goto L6;
        r0.n = r14.getBoolean(3, r0.n);
    L6:
        if (r14.hasValue(0) == false) goto L9;
        r0.o = r14.getBoolean(0, r0.o);
    L9:
        if (r14.hasValue(1) == false) goto L12;
        r0.e = (((int) (Math.min(1.0f, Math.max(0.0f, r14.getFloat(1, 0.3f))) * 255.0f)) << 24) | (r0.e & 16777215);
    L12:
        if (r14.hasValue(11) == false) goto L15;
        r0.d = (((int) (Math.min(1.0f, Math.max(0.0f, r14.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & r0.d);
    L15:
        if (r14.hasValue(7) == false) goto L22;
        long r4 = r14.getInt(7, (int) r0.s);
        if (r4 < 0) goto L19;
        r0.s = r4;
        goto L22
    L19:
        kf2.n(b11.k("Given a negative duration: ", r4));
        return null;
    L22:
        if (r14.hasValue(14) == false) goto L25;
        r0.q = r14.getInt(14, r0.q);
    L25:
        if (r14.hasValue(15) == false) goto L32;
        long r5 = r14.getInt(15, (int) r0.t);
        if (r5 < 0) goto L29;
        r0.t = r5;
        goto L32
    L29:
        kf2.n(b11.k("Given a negative repeat delay: ", r5));
        return null;
    L32:
        if (r14.hasValue(16) == false) goto L35;
        r0.r = r14.getInt(16, r0.r);
    L35:
        if (r14.hasValue(5) == false) goto L46;
        int r6 = r14.getInt(5, r0.c);
        if (r6 != 1) goto L39;
        r0.c = 1;
        goto L46
    L39:
        if (r6 == 2) goto L43;
        if (r6 == 3) goto L42;
        r0.c = 0;
        goto L46
    L42:
        r0.c = 3;
        goto L46
    L43:
        r0.c = 2;
    L46:
        if (r14.hasValue(17) == false) goto L52;
        if (r14.getInt(17, r0.f) == 1) goto L50;
        r0.f = 0;
        goto L52
    L50:
        r0.f = 1;
    L52:
        if (r14.hasValue(6) == false) goto L59;
        float r1 = r14.getFloat(6, r0.l);
        if (r1 < 0.0f) goto L56;
        r0.l = r1;
        goto L59
    L56:
        tb4.f("Given invalid dropoff value: ", r1);
        return null;
    L59:
        if (r14.hasValue(9) == false) goto L66;
        int r2 = r14.getDimensionPixelSize(9, r0.g);
        if (r2 < 0) goto L63;
        r0.g = r2;
        goto L66
    L63:
        kf2.n(f34.f(r2, "Given invalid width: "));
        return null;
    L66:
        if (r14.hasValue(8) == false) goto L73;
        int r3 = r14.getDimensionPixelSize(8, r0.h);
        if (r3 < 0) goto L70;
        r0.h = r3;
        goto L73
    L70:
        kf2.n(f34.f(r3, "Given invalid height: "));
        return null;
    L73:
        if (r14.hasValue(13) == false) goto L80;
        float r7 = r14.getFloat(13, r0.k);
        if (r7 < 0.0f) goto L77;
        r0.k = r7;
        goto L80
    L77:
        tb4.f("Given invalid intensity value: ", r7);
        return null;
    L80:
        if (r14.hasValue(19) == false) goto L87;
        float r8 = r14.getFloat(19, r0.i);
        if (r8 < 0.0f) goto L84;
        r0.i = r8;
        goto L87
    L84:
        tb4.f("Given invalid width ratio: ", r8);
        return null;
    L87:
        if (r14.hasValue(10) == false) goto L94;
        float r9 = r14.getFloat(10, r0.j);
        if (r9 < 0.0f) goto L91;
        r0.j = r9;
        goto L94
    L91:
        tb4.f("Given invalid height ratio: ", r9);
        return null;
    L94:
        if (r14.hasValue(18) == false) goto L97;
        r0.m = r14.getFloat(18, r0.m);
    L97:
        return j();
    }

    public abstract void h();

    public String i() {
        return null;
    }

    public abstract rp j();

    public void k(xn3 r3) {
        ArrayDeque r2 = (ArrayDeque) this.a;
        if (r2.size() >= 20) goto L6;
        r2.offer(r3);
        return;
    }

    public void l(int r1, Object r2, tg1 r3, Object r4) {
        if (h12.c(r2, j80.a) == true) goto L5;
        return;
    L5:
        b(r1, r3, null);
    }

    public abstract if1 m(y94 r1);

    public abstract void n(y00 r1);

    public void o(Type... r6) {
        HashSet r0 = (HashSet) this.a;
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L31;
        Type r3 = r6[r2];
        if (r3 == null) goto L30;
        if (r0.add(r3) == false) goto L30;
    L12:
        th = move-exception;
        r0.remove(r3);
        throw th;
    L10:
        if ((r3 instanceof TypeVariable) == false) goto L15;
        s((TypeVariable) r3);     // Catch: Throwable -> L12
        goto L30
    L15:
        if ((r3 instanceof WildcardType) == false) goto L18;
        t((WildcardType) r3);     // Catch: Throwable -> L12
        goto L30
    L18:
        if ((r3 instanceof ParameterizedType) == false) goto L21;
        r((ParameterizedType) r3);     // Catch: Throwable -> L12
        goto L30
    L21:
        if ((r3 instanceof Class) == false) goto L24;
        p((Class) r3);     // Catch: Throwable -> L12
        goto L30
    L24:
        if ((r3 instanceof GenericArrayType) == false) goto L27;
        q((GenericArrayType) r3);     // Catch: Throwable -> L12
        goto L30
    L27:
        throw new AssertionError("Unknown type: " + r3);     // Catch: Throwable -> L12
    L30:
        r2 = r2 + 1;
        goto L3
    }

    public void p(Class r1) {
    }

    public void q(GenericArrayType r1) {
    }

    public void r(ParameterizedType r1) {
    }

    public abstract void s(TypeVariable r1);

    public abstract void t(WildcardType r1);

    public rp(wv4 r1) {
        this.a = r1;
    }
}
