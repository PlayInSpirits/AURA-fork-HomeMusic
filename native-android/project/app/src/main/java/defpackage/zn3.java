package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zn3 implements z34 {
    public final z34 n;
    public final long o;
    public final /* synthetic */ go3 p;

    public zn3(go3 go3Var, z34 z34Var) {
        z34Var.getClass();
        this.p = go3Var;
        this.n = z34Var;
        this.o = uc5.m();
    }

    @Override // defpackage.z34
    public final String D(int i) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            return this.n.D(i);
        }
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final boolean O() {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            return this.n.O();
        }
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final void c(int i, long j) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            this.n.c(i, j);
        } else {
            h12.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            this.n.close();
        } else {
            h12.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.z34
    public final void d(double d, int i) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            this.n.d(d, i);
        } else {
            h12.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.z34
    public final void e(int i) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            this.n.e(i);
        } else {
            h12.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.z34
    public final int getColumnCount() {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            return this.n.getColumnCount();
        }
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final String getColumnName(int i) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            return this.n.getColumnName(i);
        }
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final double getDouble(int i) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            return this.n.getDouble(i);
        }
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final long getLong(int i) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            return this.n.getLong(i);
        }
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final boolean isNull(int i) {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            return this.n.isNull(i);
        }
        h12.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.z34
    public final void r(int i, String str) {
        str.getClass();
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            this.n.r(i, str);
        } else {
            h12.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.z34
    public final void reset() {
        if (this.p.d.get()) {
            h12.P(21, "Statement is recycled");
            throw null;
        }
        if (this.o == uc5.m()) {
            this.n.reset();
        } else {
            h12.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
