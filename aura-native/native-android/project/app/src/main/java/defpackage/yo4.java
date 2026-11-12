package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yo4 extends zo4 {
    public final df1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo4(we1 we1Var, String str) {
        super(we1Var, str);
        we1Var.getClass();
        str.getClass();
        this.q = we1Var.j(str);
    }

    @Override // defpackage.z34
    public final String D(int i) {
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
    public final void c(int i, long j) {
        b();
        this.q.c(i, j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.q.close();
        this.p = true;
    }

    @Override // defpackage.z34
    public final void d(double d, int i) {
        b();
        this.q.d(d, i);
    }

    @Override // defpackage.z34
    public final void e(int i) {
        b();
        this.q.e(i);
    }

    @Override // defpackage.z34
    public final int getColumnCount() {
        b();
        return 0;
    }

    @Override // defpackage.z34
    public final String getColumnName(int i) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final double getDouble(int i) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final long getLong(int i) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final boolean isNull(int i) {
        b();
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final void r(int i, String str) {
        str.getClass();
        b();
        this.q.h(i, str);
    }

    @Override // defpackage.z34
    public final void reset() {
    }
}
