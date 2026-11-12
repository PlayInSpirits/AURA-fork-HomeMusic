package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf1 implements so4 {
    public final Context n;
    public final String o;
    public final uv p;
    public final boolean q;
    public final boolean r;
    public final rp4 s;
    public boolean t;

    public bf1(Context r1, String r2, uv r3, boolean r4, boolean r5) {
        r1.getClass();
        r3.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = new rp4(new wc(5, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.s.o == rv2.H) goto L6;
        ((af1) this.s.getValue()).close();
        return;
    }

    @Override // defpackage.so4
    public final String getDatabaseName() {
        return this.o;
    }

    @Override // defpackage.so4
    public final void setWriteAheadLoggingEnabled(boolean r3) {
        if (this.s.o == rv2.H) goto L5;
        ((af1) this.s.getValue()).setWriteAheadLoggingEnabled(r3);
    L5:
        this.t = r3;
    }

    @Override // defpackage.so4
    public final we1 w() {
        return ((af1) this.s.getValue()).b(false);
    }

    @Override // defpackage.so4
    public final we1 z() {
        return ((af1) this.s.getValue()).b(true);
    }
}
