package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yo4 extends zo4 {
    public final df1 q;

    public yo4(we1 r1, String r2) {
        r1.getClass();
        r2.getClass();
        super(r1, r2);
        this.q = r1.j(r2);
    }

    @Override // defpackage.z34
    public final String D(int r1) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final boolean O() {
        b();
        this.q.o.execute();
        return false;
    }

    @Override // defpackage.z34
    public final void c(int r1, long r2) {
        b();
        this.q.c(r1, r2);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.q.close();
        this.p = true;
    }

    @Override // defpackage.z34
    public final void d(double r1, int r3) {
        b();
        this.q.d(r1, r3);
    }

    @Override // defpackage.z34
    public final void e(int r1) {
        b();
        this.q.e(r1);
    }

    @Override // defpackage.z34
    public final int getColumnCount() {
        b();
        return 0;
    }

    @Override // defpackage.z34
    public final String getColumnName(int r1) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final double getDouble(int r1) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final long getLong(int r1) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final boolean isNull(int r1) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final void r(int r1, String r2) {
        r2.getClass();
        b();
        this.q.h(r1, r2);
    }

    @Override // defpackage.z34
    public final void reset() {
    }
}
