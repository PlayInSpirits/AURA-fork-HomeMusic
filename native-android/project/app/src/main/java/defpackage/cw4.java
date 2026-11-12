package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cw4 {
    public static final cw4 J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String a0 = null;
    public static final String b0 = null;
    public static final String c0 = null;
    public static final String d0 = null;
    public static final String e0 = null;
    public static final String f0 = null;
    public static final String g0 = null;
    public static final String h0 = null;
    public static final String i0 = null;
    public static final String j0 = null;
    public static final String k0 = null;
    public static final String l0 = null;
    public static final String m0 = null;
    public static final String n0 = null;
    public static final String o0 = null;
    public static final String p0 = null;
    public static final String q0 = null;
    public static final String r0 = null;
    public static final String s0 = null;
    public static final String t0 = null;
    public static final String u0 = null;
    public static final String v0 = null;
    public final int A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final bx1 H;
    public final jx1 I;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final yw1 m;
    public final yw1 n;
    public final yw1 o;
    public final int p;
    public final yw1 q;
    public final yw1 r;
    public final int s;
    public final int t;
    public final int u;
    public final yw1 v;
    public final aw4 w;
    public final boolean x;
    public final yw1 y;
    public final yw1 z;

    static {
        J = new cw4(new bw4());
        String r1 = f35.a;
        K = Integer.toString(1, 36);
        L = Integer.toString(2, 36);
        M = Integer.toString(3, 36);
        N = Integer.toString(4, 36);
        O = Integer.toString(5, 36);
        P = Integer.toString(6, 36);
        Q = Integer.toString(7, 36);
        R = Integer.toString(8, 36);
        S = Integer.toString(9, 36);
        T = Integer.toString(10, 36);
        U = Integer.toString(11, 36);
        V = Integer.toString(12, 36);
        W = Integer.toString(13, 36);
        X = Integer.toString(14, 36);
        Y = Integer.toString(15, 36);
        Z = Integer.toString(16, 36);
        a0 = Integer.toString(17, 36);
        b0 = Integer.toString(18, 36);
        c0 = Integer.toString(19, 36);
        d0 = Integer.toString(20, 36);
        e0 = Integer.toString(21, 36);
        f0 = Integer.toString(22, 36);
        g0 = Integer.toString(23, 36);
        h0 = Integer.toString(24, 36);
        i0 = Integer.toString(25, 36);
        j0 = Integer.toString(26, 36);
        k0 = Integer.toString(27, 36);
        l0 = Integer.toString(28, 36);
        m0 = Integer.toString(29, 36);
        n0 = Integer.toString(30, 36);
        o0 = Integer.toString(31, 36);
        p0 = Integer.toString(32, 36);
        q0 = Integer.toString(33, 36);
        r0 = Integer.toString(34, 36);
        s0 = Integer.toString(35, 36);
        t0 = Integer.toString(36, 36);
        u0 = Integer.toString(37, 36);
        v0 = Integer.toString(38, 36);
    }

    public cw4(bw4 r2) {
        this.a = r2.a;
        this.b = r2.b;
        this.c = r2.c;
        this.d = r2.d;
        this.e = r2.e;
        this.f = r2.f;
        this.g = r2.g;
        this.h = r2.h;
        this.i = r2.i;
        this.j = r2.j;
        this.k = r2.k;
        this.l = r2.l;
        this.m = r2.m;
        this.n = r2.n;
        this.o = r2.o;
        this.p = r2.p;
        this.q = r2.q;
        this.s = r2.s;
        this.t = r2.t;
        this.r = r2.r;
        this.u = r2.u;
        this.v = r2.v;
        this.w = r2.w;
        this.x = r2.x;
        this.y = r2.y;
        this.A = r2.z;
        this.B = r2.A;
        this.z = r2.B;
        this.C = r2.C;
        this.D = r2.D;
        this.E = r2.E;
        this.F = r2.F;
        this.G = r2.G;
        this.H = bx1.b(r2.H);
        this.I = jx1.k(r2.I);
    }

    public static cw4 b(Bundle r9) {
        bw4 r1 = new bw4();
        cw4 r2 = J;
        r1.a = r9.getInt(P, r2.a);
        r1.b = r9.getInt(Q, r2.b);
        r1.c = r9.getInt(R, r2.c);
        r1.d = r9.getInt(S, r2.d);
        r1.e = r9.getInt(T, r2.e);
        r1.f = r9.getInt(U, r2.f);
        r1.g = r9.getInt(V, r2.g);
        r1.h = r9.getInt(W, r2.h);
        r1.i = r9.getInt(X, r2.i);
        int r3 = r9.getInt(Y, r2.j);
        r1.j = r3;
        boolean r4 = true;
        int r5 = 0;
        if (r1.i != Integer.MAX_VALUE) goto L8;
        if (r3 != Integer.MAX_VALUE) goto L8;
        if (r9.getBoolean(q0, r2.k) == false) goto L8;
        boolean r6 = true;
    L9:
        r1.k = r6;
        r1.l = r9.getBoolean(Z, r2.l);
        String[] r7 = r9.getStringArray(a0);
        String[] r8 = new String[0];
        if (r7 != null) goto L13;
        r7 = r8;
    L13:
        r1.m = yw1.l(r7);
        String[] r10 = r9.getStringArray(t0);
        String[] r11 = new String[0];
        if (r10 != null) goto L17;
        r10 = r11;
    L17:
        r1.n = yw1.l(r10);
        String[] r12 = r9.getStringArray(p0);
        String[] r13 = new String[0];
        if (r12 != null) goto L21;
        r12 = r13;
    L21:
        r1.o = yw1.l(r12);
        r1.p = r9.getInt(i0, r2.p);
        String[] r14 = r9.getStringArray(K);
        String[] r15 = new String[0];
        if (r14 != null) goto L25;
        r14 = r15;
    L25:
        r1.q = bw4.f(r14);
        String[] r16 = r9.getStringArray(u0);
        String[] r17 = new String[0];
        if (r16 != null) goto L29;
        r16 = r17;
    L29:
        r1.r = yw1.l(r16);
        r1.s = r9.getInt(L, r2.s);
        r1.t = r9.getInt(b0, r2.t);
        r1.u = r9.getInt(c0, r2.u);
        String[] r18 = r9.getStringArray(d0);
        String[] r19 = new String[0];
        if (r18 != null) goto L33;
        r18 = r19;
    L33:
        r1.v = yw1.l(r18);
        Bundle r20 = r9.getBundle(n0);
        if (r20 == null) goto L36;
        zv4 r21 = new zv4();
        String r22 = aw4.e;
        aw4 r23 = aw4.d;
        r21.a = r20.getInt(r22, r23.a);
        r21.b = r20.getBoolean(aw4.f, r23.b);
        r21.c = r20.getBoolean(aw4.g, r23.c);
        aw4 r24 = new aw4(r21);
    L37:
        r1.w = r24;
        r1.x = r9.getBoolean(s0, r2.x);
        String[] r25 = r9.getStringArray(M);
        String[] r26 = new String[0];
        if (r25 != null) goto L41;
        r25 = r26;
    L41:
        r1.y = bw4.f(r25);
        r1.z = r9.getInt(N, r2.A);
        if (r1.y.isEmpty() == true) goto L44;
    L48:
        r4 = false;
    L49:
        r1.A = r4;
        r1.C = r9.getInt(j0, r2.C);
        String[] r27 = r9.getStringArray(v0);
        String[] r28 = new String[0];
        if (r27 != null) goto L53;
        r27 = r28;
    L53:
        r1.B = yw1.l(r27);
        r1.D = r9.getBoolean(O, r2.D);
        r1.E = r9.getBoolean(o0, r2.E);
        r1.F = r9.getBoolean(e0, r2.F);
        r1.G = r9.getBoolean(f0, r2.G);
        ArrayList r29 = r9.getParcelableArrayList(g0);
        if (r29 != null) goto L56;
        gy3 r30 = gy3.r;
    L61:
        r1.H = new HashMap();
        int r31 = 0;
    L63:
        if (r31 >= r30.q) goto L65;
        yv4 r32 = (yv4) r30.get(r31);
        r1.H.put(r32.a, r32);
        r31 = r31 + 1;
        goto L63
    L65:
        int[] r33 = r9.getIntArray(h0);
        int[] r34 = new int[0];
        if (r33 != null) goto L69;
        r33 = r34;
    L69:
        r1.I = new HashSet();
        int r35 = r33.length;
    L70:
        if (r5 >= r35) goto L73;
        r1.I.add(Integer.valueOf(r33[r5]));
        r5 = r5 + 1;
        goto L70
    L73:
        return new cw4(r1);
    L56:
        uw1 r36 = yw1.j();
        int r37 = 0;
    L58:
        if (r37 >= r29.size()) goto L60;
        Bundle r38 = (Bundle) r29.get(r37);
        r38.getClass();
        Bundle r39 = r38.getBundle(yv4.c);
        r39.getClass();
        sv4 r40 = sv4.a(r39);
        int[] r41 = r38.getIntArray(yv4.d);
        r41.getClass();
        r36.c(new yv4(r40, jz4.e(r41)));
        r37 = r37 + 1;
        goto L58
    L60:
        r30 = r36.f();
        goto L61
    L44:
        if (r1.z != 0) goto L48;
        if (r9.getBoolean(r0, r2.B) == false) goto L48;
    L36:
        zv4 r42 = new zv4();
        aw4 r43 = aw4.d;
        r42.a = r9.getInt(k0, r43.a);
        r42.b = r9.getBoolean(l0, r43.b);
        r42.c = r9.getBoolean(m0, r43.c);
        r24 = new aw4(r42);
    L8:
        r6 = false;
        goto L9
    }

    public bw4 a() {
        bw4 r1 = new bw4();
        r1.e(this);
        return r1;
    }

    public Bundle c() {
        Bundle r1 = new Bundle();
        r1.putInt(P, this.a);
        r1.putInt(Q, this.b);
        r1.putInt(R, this.c);
        r1.putInt(S, this.d);
        r1.putInt(T, this.e);
        r1.putInt(U, this.f);
        r1.putInt(V, this.g);
        r1.putInt(W, this.h);
        r1.putInt(X, this.i);
        r1.putInt(Y, this.j);
        r1.putBoolean(q0, this.k);
        r1.putBoolean(Z, this.l);
        yw1 r3 = this.m;
        String[] r2 = (String[]) r3.toArray(new String[0]);
        r1.putStringArray(a0, r2);
        String[] r4 = (String[]) this.o.toArray(new String[0]);
        r1.putStringArray(p0, r4);
        String[] r5 = (String[]) this.n.toArray(new String[0]);
        r1.putStringArray(t0, r5);
        r1.putInt(i0, this.p);
        String[] r6 = (String[]) this.q.toArray(new String[0]);
        r1.putStringArray(K, r6);
        r1.putInt(L, this.s);
        r1.putInt(b0, this.t);
        r1.putInt(c0, this.u);
        String[] r7 = (String[]) this.r.toArray(new String[0]);
        r1.putStringArray(u0, r7);
        String[] r8 = (String[]) this.v.toArray(new String[0]);
        r1.putStringArray(d0, r8);
        r1.putBoolean(s0, this.x);
        String[] r9 = (String[]) this.y.toArray(new String[0]);
        r1.putStringArray(M, r9);
        r1.putInt(N, this.A);
        r1.putBoolean(r0, this.B);
        String[] r10 = (String[]) this.z.toArray(new String[0]);
        r1.putStringArray(v0, r10);
        r1.putInt(j0, this.C);
        r1.putBoolean(O, this.D);
        aw4 r11 = this.w;
        int r12 = r11.a;
        r1.putInt(k0, r12);
        boolean r13 = r11.b;
        r1.putBoolean(l0, r13);
        boolean r14 = r11.c;
        r1.putBoolean(m0, r14);
        Bundle r15 = new Bundle();
        r15.putInt(aw4.e, r11.a);
        r15.putBoolean(aw4.f, r13);
        r15.putBoolean(aw4.g, r14);
        r1.putBundle(n0, r15);
        r1.putBoolean(o0, this.E);
        r1.putBoolean(e0, this.F);
        r1.putBoolean(f0, this.G);
        rw1 r16 = this.H.f();
        ArrayList<? extends Parcelable> r17 = new ArrayList(r16.size());
        Iterator<E> r18 = r16.iterator();
    L4:
        if (r18.hasNext() == false) goto L6;
        yv4 r19 = (yv4) r18.next();
        r19.getClass();
        Bundle r20 = new Bundle();
        r20.putBundle(yv4.c, r19.a.d());
        r20.putIntArray(yv4.d, jz4.N(r19.b));
        r17.add(r20);
        goto L4
    L6:
        r1.putParcelableArrayList(g0, r17);
        int[] r21 = jz4.N(this.I);
        r1.putIntArray(h0, r21);
        return r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L81:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L81;
        cw4 r6 = (cw4) r5;
        if (this.a != r6.a) goto L81;
        if (this.b != r6.b) goto L81;
        if (this.c != r6.c) goto L81;
        if (this.d != r6.d) goto L81;
        if (this.e != r6.e) goto L81;
        if (this.f != r6.f) goto L81;
        if (this.g != r6.g) goto L81;
        if (this.h != r6.h) goto L81;
        if (this.l != r6.l) goto L81;
        if (this.i != r6.i) goto L81;
        if (this.j != r6.j) goto L81;
        if (this.k != r6.k) goto L81;
        if (this.m.equals(r6.m) == false) goto L81;
        if (this.n.equals(r6.n) == false) goto L81;
        if (this.o.equals(r6.o) == false) goto L81;
        if (this.p != r6.p) goto L81;
        if (this.q.equals(r6.q) == false) goto L81;
        if (this.s != r6.s) goto L81;
        if (this.t != r6.t) goto L81;
        if (this.r.equals(r6.r) == false) goto L81;
        if (this.u != r6.u) goto L81;
        if (this.v.equals(r6.v) == false) goto L81;
        if (this.w.equals(r6.w) == false) goto L81;
        if (this.x != r6.x) goto L81;
        if (this.z.equals(r6.z) == false) goto L81;
        if (this.y.equals(r6.y) == false) goto L81;
        if (this.A != r6.A) goto L81;
        if (this.B != r6.B) goto L81;
        if (this.C != r6.C) goto L81;
        if (this.D != r6.D) goto L81;
        if (this.E != r6.E) goto L81;
        if (this.F != r6.F) goto L81;
        if (this.G != r6.G) goto L81;
        bx1 r2 = r6.H;
        bx1 r3 = this.H;
        r3.getClass();
        if (vr1.o(r2, r3) == false) goto L81;
        if (this.I.equals(r6.I) == false) goto L81;
        return true;
    }

    public int hashCode() {
        int r1 = (((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31;
        int r2 = (this.m.hashCode() + r1) * 31;
        int r3 = (this.n.hashCode() + r2) * 31;
        int r4 = (((this.o.hashCode() + r3) * 31) + this.p) * 31;
        int r5 = (((((this.q.hashCode() + r4) * 31) + this.s) * 31) + this.t) * 31;
        int r6 = (((this.r.hashCode() + r5) * 31) + this.u) * 31;
        int r7 = (this.v.hashCode() + r6) * 31;
        int r8 = (((this.w.hashCode() + r7) * 31) + (this.x ? 1 : 0)) * 31;
        int r9 = (((((this.y.hashCode() + r8) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31;
        int r10 = (((((((((((this.z.hashCode() + r9) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31;
        int r11 = (this.H.hashCode() + r10) * 31;
        return this.I.hashCode() + r11;
    }
}
