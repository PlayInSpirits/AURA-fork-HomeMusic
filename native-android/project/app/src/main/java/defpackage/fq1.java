package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fq1 extends bq1 {
    public boolean q;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.o == false) goto L6;
        return;
    L6:
        if (this.q == true) goto L8;
        b();
    L8:
        this.o = true;
    }

    @Override // defpackage.bq1, defpackage.ej4
    public final long read(tv r4, long r5) {
        r4.getClass();
        if (r5 >= 0) goto L5;
        kf2.e(b11.k("byteCount < 0: ", r5));
        return 0;
    L5:
        if (this.o == false) goto L7;
        kf2.o("closed");
        return 0;
    L7:
        if (this.q == false) goto L9;
        return -1;
    L9:
        long r6 = super.read(r4, r5);
        if (r6 != (-1)) goto L13;
        this.q = true;
        b();
        return -1;
    L13:
        return r6;
    }
}
