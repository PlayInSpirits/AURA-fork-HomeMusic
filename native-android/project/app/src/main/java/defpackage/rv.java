package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rv extends InputStream {
    public final /* synthetic */ int n;
    public final /* synthetic */ fw o;

    public /* synthetic */ rv(fw r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int available() {
        int r0 = this.n;
        fw r5 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        xu3 r6 = (xu3) r5;
        if (r6.p == false) goto L11;
        mj0.i("closed");
        return 0;
    L11:
        return (int) Math.min(r6.o.o, 2147483647L);
    L10:
        return (int) Math.min(((tv) r5).o, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((xu3) this.o).close();
        return;
    }

    @Override // java.io.InputStream
    public final int read() {
        int r0 = this.n;
        fw r6 = this.o;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        xu3 r7 = (xu3) r6;
        tv r1 = r7.o;
        if (r7.p == false) goto L7;
        mj0.i("closed");
        return 0;
    L7:
        if (r1.o != 0) goto L18;
        if (r7.n.read(r1, 8192) != (-1)) goto L18;
        return -1;
    L18:
        return r1.readByte() & 255;
    L14:
        tv r8 = (tv) r6;
        if (r8.o > 0) goto L17;
        return -1;
    L17:
        return r8.readByte() & 255;
    }

    public final String toString() {
        int r0 = this.n;
        fw r2 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((xu3) r2) + ".inputStream()";
    L7:
        return ((tv) r2) + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
        int r0 = this.n;
        fw r8 = this.o;
        r9.getClass();
        switch(r0) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        xu3 r12 = (xu3) r8;
        tv r1 = r12.o;
        if (r12.p == true) goto L12;
        zz1.i(r9.length, r10, r11);
        if (r1.o != 0) goto L17;
        if (r12.n.read(r1, 8192) != (-1)) goto L17;
        return -1;
    L17:
        return r1.read(r9, r10, r11);
    L12:
        mj0.i("closed");
        return 0;
    L15:
        return ((tv) r8).read(r9, r10, r11);
    }
}
