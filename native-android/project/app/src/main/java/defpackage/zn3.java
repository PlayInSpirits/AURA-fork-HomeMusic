package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zn3 implements z34 {
    public final z34 n;
    public final long o;
    public final /* synthetic */ go3 p;

    public zn3(go3 r1, z34 r2) {
        r2.getClass();
        this.p = r1;
        this.n = r2;
        this.o = uc5.m();
    }

    @Override // defpackage.z34
    public final String D(int r8) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o == uc5.m()) goto L7;
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    L7:
        return this.n.D(r8);
    }

    @Override // defpackage.z34
    public final boolean O() {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o == uc5.m()) goto L7;
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    L7:
        return this.n.O();
    }

    @Override // defpackage.z34
    public final void c(int r8, long r9) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o != uc5.m()) goto L8;
        this.n.c(r8, r9);
        return;
    L8:
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o != uc5.m()) goto L8;
        this.n.close();
        return;
    L8:
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final void d(double r8, int r10) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o != uc5.m()) goto L8;
        this.n.d(r8, r10);
        return;
    L8:
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final void e(int r8) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o != uc5.m()) goto L8;
        this.n.e(r8);
        return;
    L8:
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final int getColumnCount() {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o == uc5.m()) goto L7;
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    L7:
        return this.n.getColumnCount();
    }

    @Override // defpackage.z34
    public final String getColumnName(int r8) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o == uc5.m()) goto L7;
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    L7:
        return this.n.getColumnName(r8);
    }

    @Override // defpackage.z34
    public final double getDouble(int r8) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o == uc5.m()) goto L7;
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    L7:
        return this.n.getDouble(r8);
    }

    @Override // defpackage.z34
    public final long getLong(int r8) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o == uc5.m()) goto L7;
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    L7:
        return this.n.getLong(r8);
    }

    @Override // defpackage.z34
    public final boolean isNull(int r8) {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o == uc5.m()) goto L7;
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    L7:
        return this.n.isNull(r8);
    }

    @Override // defpackage.z34
    public final void r(int r8, String r9) {
        r9.getClass();
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o != uc5.m()) goto L8;
        this.n.r(r8, r9);
        return;
    L8:
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final void reset() {
        if (this.p.d.get() == false) goto L5;
        h12.P(21, "Statement is recycled");
        throw null;
    L5:
        if (this.o != uc5.m()) goto L8;
        this.n.reset();
        return;
    L8:
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }
}
