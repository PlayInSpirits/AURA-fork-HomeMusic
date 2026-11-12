package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fq1 extends bq1 {
    public boolean q;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.o) {
            return;
        }
        if (!this.q) {
            b();
        }
        this.o = true;
    }

    @Override // defpackage.bq1, defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        tvVar.getClass();
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return 0L;
        }
        if (this.o) {
            kf2.o("closed");
            return 0L;
        }
        if (this.q) {
            return -1L;
        }
        long j2 = super.read(tvVar, j);
        if (j2 != -1) {
            return j2;
        }
        this.q = true;
        b();
        return -1L;
    }
}
