package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wu3 implements ew {
    public final of4 n;
    public final tv o;
    public boolean p;

    public wu3(of4 r1) {
        r1.getClass();
        this.n = r1;
        this.o = new tv();
    }

    @Override // defpackage.ew
    public final ew A(yw r2) {
        r2.getClass();
        if (this.p == true) goto L6;
        this.o.X(r2);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.ew
    public final ew C(long r2) {
        if (this.p == true) goto L6;
        this.o.a0(r2);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.of4
    public final void L(tv r2, long r3) {
        r2.getClass();
        if (this.p == true) goto L6;
        this.o.L(r2, r3);
        b();
        return;
    L6:
        kf2.o("closed");
    }

    @Override // defpackage.ew
    public final ew Q(long r2) {
        if (this.p == true) goto L6;
        this.o.Z(r2);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.ew
    public final tv a() {
        return this.o;
    }

    public final ew b() {
        if (this.p == true) goto L8;
        tv r0 = this.o;
        long r1 = r0.j();
        if (r1 <= 0) goto L7;
        this.n.L(r0, r1);
    L7:
        return this;
    L8:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        of4 r0 = this.n;
        if (this.p == false) goto L21;
        return;
    L21:
        tv r1 = this.o;     // Catch: Throwable -> L8
        long r2 = r1.o;     // Catch: Throwable -> L8
        if (r2 <= 0) goto L10;
        r0.L(r1, r2);     // Catch: Throwable -> L8
    L10:
        th = null;
    L23:
        r0.close();     // Catch: Throwable -> L13
    L16:
        this.p = true;
        if (th == null) goto L25;
        throw th;
    L25:
        return;
    L13:
        th = move-exception;
        if (th != null) goto L16;
        th = th;
    L8:
        th = th;
        goto L23
    }

    @Override // defpackage.ew, defpackage.of4, java.io.Flushable
    public final void flush() {
        if (this.p == true) goto L9;
        tv r0 = this.o;
        long r1 = r0.o;
        of4 r5 = this.n;
        if (r1 <= 0) goto L7;
        r5.L(r0, r1);
    L7:
        r5.flush();
        return;
    L9:
        kf2.o("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.p;
    }

    @Override // defpackage.ew
    public final long p(ej4 r7) {
        r7.getClass();
        long r0 = 0;
    L3:
        long r2 = r7.read(this.o, 8192);
        if (r2 == (-1)) goto L6;
        r0 = r0 + r2;
        b();
        goto L3
    L6:
        return r0;
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.n.timeout();
    }

    public final String toString() {
        return "buffer(" + this.n + ')';
    }

    @Override // defpackage.ew
    public final ew write(byte[] r4) {
        r4.getClass();
        if (this.p == true) goto L6;
        int r1 = r4.length;
        this.o.m78write(r4, 0, r1);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.ew
    public final ew writeByte(int r2) {
        if (this.p == true) goto L6;
        this.o.Y(r2);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.ew
    public final ew writeInt(int r2) {
        if (this.p == true) goto L6;
        this.o.b0(r2);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.ew
    public final ew writeShort(int r2) {
        if (this.p == true) goto L6;
        this.o.c0(r2);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // defpackage.ew
    public final ew y(String r2) {
        r2.getClass();
        if (this.p == true) goto L6;
        this.o.d0(r2);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer r2) {
        r2.getClass();
        if (this.p == true) goto L6;
        int r3 = this.o.write(r2);
        b();
        return r3;
    L6:
        kf2.o("closed");
        return 0;
    }

    @Override // defpackage.ew
    public final ew write(byte[] r2, int r3, int r4) {
        r2.getClass();
        if (this.p == true) goto L6;
        this.o.m78write(r2, r3, r4);
        b();
        return this;
    L6:
        kf2.o("closed");
        return null;
    }
}
