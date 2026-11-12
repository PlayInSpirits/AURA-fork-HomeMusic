package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xo4 extends zo4 {
    public int[] q;
    public long[] r;
    public double[] s;
    public String[] t;
    public byte[][] u;
    public Cursor v;

    public static void n(Cursor r0, int r1) {
        if (r1 >= 0) goto L4;
    L6:
        h12.P(25, "column index out of range");
        throw null;
    L4:
        if (r1 >= r0.getColumnCount()) goto L6;
    }

    @Override // defpackage.z34
    public final String D(int r1) {
        b();
        Cursor r0 = q();
        n(r0, r1);
        String r2 = r0.getString(r1);
        r2.getClass();
        return r2;
    }

    @Override // defpackage.z34
    public final boolean O() {
        b();
        j();
        Cursor r0 = this.v;
        if (r0 != null) goto L5;
        kf2.o("Required value was null.");
        return false;
    L5:
        return r0.moveToNext();
    }

    @Override // defpackage.z34
    public final void c(int r3, long r4) {
        b();
        f(1, r3);
        this.q[r3] = 1;
        this.r[r3] = r4;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.p == true) goto L5;
        b();
        this.q = new int[0];
        this.r = new long[0];
        this.s = new double[0];
        this.t = new String[0];
        this.u = new byte[0][];
        reset();
    L5:
        this.p = true;
    }

    @Override // defpackage.z34
    public final void d(double r3, int r5) {
        b();
        f(2, r5);
        this.q[r5] = 2;
        this.s[r5] = r3;
    }

    @Override // defpackage.z34
    public final void e(int r2) {
        b();
        f(5, r2);
        this.q[r2] = 5;
    }

    public final void f(int r4, int r5) {
        int r6 = r5 + 1;
        int[] r1 = this.q;
        if (r1.length >= r6) goto L5;
        this.q = Arrays.copyOf(r1, r6);
    L5:
        if (r4 != 1) goto L7;
        long[] r7 = this.r;
        if (r7.length >= r6) goto L32;
        this.r = Arrays.copyOf(r7, r6);
        return;
    L32:
        return;
    L7:
        if (r4 != 2) goto L9;
        double[] r8 = this.s;
        if (r8.length >= r6) goto L31;
        this.s = Arrays.copyOf(r8, r6);
        return;
    L31:
        return;
    L9:
        if (r4 != 3) goto L11;
        String[] r9 = this.t;
        if (r9.length >= r6) goto L30;
        this.t = (String[]) Arrays.copyOf(r9, r6);
        return;
    L30:
        return;
    L11:
        if (r4 != 4) goto L33;
        byte[][] r10 = this.u;
        if (r10.length >= r6) goto L29;
        this.u = (byte[][]) Arrays.copyOf(r10, r6);
        return;
    L29:
        return;
    }

    @Override // defpackage.z34
    public final int getColumnCount() {
        b();
        j();
        Cursor r0 = this.v;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getColumnCount();
    }

    @Override // defpackage.z34
    public final String getColumnName(int r1) {
        b();
        j();
        Cursor r0 = this.v;
        if (r0 == null) goto L6;
        n(r0, r1);
        String r2 = r0.getColumnName(r1);
        r2.getClass();
        return r2;
    L6:
        kf2.o("Required value was null.");
        return null;
    }

    @Override // defpackage.z34
    public final double getDouble(int r1) {
        b();
        Cursor r0 = q();
        n(r0, r1);
        return r0.getDouble(r1);
    }

    @Override // defpackage.z34
    public final long getLong(int r1) {
        b();
        Cursor r0 = q();
        n(r0, r1);
        return r0.getLong(r1);
    }

    @Override // defpackage.z34
    public final boolean isNull(int r1) {
        b();
        Cursor r0 = q();
        n(r0, r1);
        return r0.isNull(r1);
    }

    public final void j() {
        if (this.v != null) goto L6;
        rm2 r0 = new rm2(22, this);
        this.v = this.n.F(r0);
        return;
    }

    public final Cursor q() {
        Cursor r1 = this.v;
        if (r1 == null) goto L5;
        return r1;
    L5:
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final void r(int r3, String r4) {
        r4.getClass();
        b();
        f(3, r3);
        this.q[r3] = 3;
        this.t[r3] = r4;
    }

    @Override // defpackage.z34
    public final void reset() {
        b();
        Cursor r0 = this.v;
        if (r0 == null) goto L5;
        r0.close();
    L5:
        this.v = null;
    }
}
