package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sv4 {
    public static final String f = null;
    public static final String g = null;
    public final int a;
    public final String b;
    public final int c;
    public final tb1[] d;
    public int e;

    static {
        String r0 = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public sv4(String r7, tb1... r8) {
        int r1 = 1;
        if (r8.length <= 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        this.b = r7;
        this.d = r8;
        this.a = r8.length;
        String r9 = r8[0].n;
        if (TextUtils.isEmpty(r9) == false) goto L9;
        int r10 = lw2.h(r8[0].m);
    L10:
        this.c = r10;
        String r6 = r8[0].d;
        if (r6 != null) goto L13;
    L14:
        r6 = "";
    L15:
        int r3 = r8[0].f | 16384;
    L17:
        if (r1 >= r8.length) goto L32;
        String r4 = r8[r1].d;
        if (r4 != null) goto L21;
    L22:
        r4 = "";
    L24:
        if (r6.equals(r4) == false) goto L25;
        if (r3 != (r8[r1].f | 16384)) goto L29;
        r1 = r1 + 1;
        goto L17
    L29:
        c("role flags", Integer.toBinaryString(r8[0].f), Integer.toBinaryString(r8[r1].f), r1);
        return;
    L25:
        c("languages", r8[0].d, r8[r1].d, r1);
        return;
    L21:
        if (r4.equals("und") == false) goto L24;
    L32:
        return;
    L13:
        if (r6.equals("und") == false) goto L15;
    L9:
        r10 = lw2.h(r9);
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    public static sv4 a(Bundle r3) {
        ArrayList r0 = r3.getParcelableArrayList(f);
        if (r0 != null) goto L5;
        vw1 r1 = yw1.o;
        gy3 r2 = gy3.r;
    L7:
        return new sv4(r3.getString(g, ""), (tb1[]) r2.toArray(new tb1[0]));
    L5:
        r2 = hw.f(new tb4(9), r0);
        goto L7
    }

    public static void c(String r4, String r5, String r6, int r7) {
        StringBuilder r8 = b11.u("Different ", r4, " combined in one TrackGroup: '", r5, "' (track 0) and '");
        r8.append(r6);
        r8.append("' (track ");
        r8.append(r7);
        r8.append(")");
        l93.G("TrackGroup", "", new IllegalStateException(r8.toString()));
    }

    public final int b(tb1 r4) {
        int r0 = 0;
    L3:
        tb1[] r1 = this.d;
        if (r0 >= r1.length) goto L9;
        if (r4 == r1[r0]) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r0;
    L9:
        return -1;
    }

    public final Bundle d() {
        Bundle r1 = new Bundle();
        tb1[] r3 = this.d;
        ArrayList<? extends Parcelable> r2 = new ArrayList(r3.length);
        int r4 = r3.length;
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L21;
        tb1 r7 = r3[r6];
        List r8 = r7.q;
        Bundle r9 = new Bundle();
        r9.putString(tb1.R, r7.a);
        r9.putString(tb1.S, r7.b);
        String r10 = tb1.w0;
        yw1 r11 = r7.c;
        ArrayList<? extends Parcelable> r12 = new ArrayList(r11.size());
        int r13 = r11.size();
        int r14 = 0;
    L5:
        if (r14 >= r13) goto L10;
        Object r15 = r11.get(r14);
        r14 = r14 + 1;
        o42 r16 = (o42) r15;
        r16.getClass();
        Bundle r5 = new Bundle();
        tb1[] r17 = r3;
        String r18 = r16.a;
        int r19 = r4;
        if (r18 == null) goto L9;
        r5.putString(o42.c, r18);
    L9:
        r5.putString(o42.d, r16.b);
        r12.add(r5);
        r3 = r17;
        r4 = r19;
        goto L5
    L10:
        tb1[] r110 = r3;
        int r111 = r4;
        r9.putParcelableArrayList(r10, r12);
        r9.putString(tb1.T, r7.d);
        r9.putInt(tb1.U, r7.e);
        r9.putInt(tb1.V, r7.f);
        int r20 = r7.g;
        if (r20 == tb1.Q.g) goto L13;
        r9.putInt(tb1.x0, r20);
    L13:
        r9.putInt(tb1.W, r7.h);
        r9.putInt(tb1.X, r7.i);
        r9.putString(tb1.Y, r7.k);
        r9.putString(tb1.Z, r7.m);
        r9.putString(tb1.a0, r7.n);
        r9.putInt(tb1.b0, r7.o);
        int r21 = 0;
    L15:
        if (r21 >= r8.size()) goto L17;
        r9.putByteArray(tb1.c0 + "_" + Integer.toString(r21, 36), (byte[]) r8.get(r21));
        r21 = r21 + 1;
        goto L15
    L17:
        r9.putParcelable(tb1.d0, r7.r);
        r9.putLong(tb1.e0, r7.s);
        r9.putInt(tb1.f0, r7.u);
        r9.putInt(tb1.g0, r7.v);
        r9.putInt(tb1.z0, r7.w);
        r9.putInt(tb1.A0, r7.x);
        r9.putFloat(tb1.h0, r7.y);
        r9.putInt(tb1.i0, r7.z);
        r9.putFloat(tb1.j0, r7.A);
        r9.putByteArray(tb1.k0, r7.B);
        r9.putInt(tb1.l0, r7.C);
        c50 r22 = r7.D;
        if (r22 == null) goto L20;
        String r23 = tb1.m0;
        Bundle r24 = new Bundle();
        r24.putInt(c50.i, r22.a);
        r24.putInt(c50.j, r22.b);
        r24.putInt(c50.k, r22.c);
        r24.putByteArray(c50.l, r22.d);
        r24.putInt(c50.m, r22.e);
        r24.putInt(c50.n, r22.f);
        r9.putBundle(r23, r24);
    L20:
        r9.putInt(tb1.y0, r7.E);
        r9.putInt(tb1.n0, r7.F);
        r9.putInt(tb1.o0, r7.G);
        r9.putInt(tb1.p0, r7.H);
        r9.putInt(tb1.q0, r7.I);
        r9.putInt(tb1.r0, r7.J);
        r9.putInt(tb1.s0, r7.K);
        r9.putInt(tb1.u0, r7.M);
        r9.putInt(tb1.v0, r7.N);
        r9.putInt(tb1.t0, r7.O);
        r2.add(r9);
        r6 = r6 + 1;
        r3 = r110;
        r4 = r111;
        goto L3
    L21:
        r1.putParcelableArrayList(f, r2);
        r1.putString(g, this.b);
        return r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (sv4.class != r5.getClass()) goto L15;
        sv4 r6 = (sv4) r5;
        if (this.b.equals(r6.b) == false) goto L15;
        if (Arrays.equals(this.d, r6.d) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        if (this.e != 0) goto L6;
        int r0 = f34.e(this.b, 527, 31);
        this.e = Arrays.hashCode(this.d) + r0;
    L6:
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
