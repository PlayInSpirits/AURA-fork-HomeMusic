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

    public bf1(Context context, String str, uv uvVar, boolean z, boolean z2) {
        context.getClass();
        uvVar.getClass();
        this.n = context;
        this.o = str;
        this.p = uvVar;
        this.q = z;
        this.r = z2;
        this.s = new rp4(new wc(5, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.s.o != rv2.H) {
            ((af1) this.s.getValue()).close();
        }
    }

    @Override // defpackage.so4
    public final String getDatabaseName() {
        return this.o;
    }

    @Override // defpackage.so4
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.s.o != rv2.H) {
            ((af1) this.s.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.t = z;
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
