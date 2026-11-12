package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ff4 implements jd2 {
    public final ii0 a;
    public final yl4 b;
    public byte[] c;

    public ff4(ci0 r2, ii0 r3) {
        ed2.g.getAndIncrement();
        this.a = r3;
        this.b = new yl4(r2);
    }

    @Override // defpackage.jd2
    public final void a() {
        yl4 r2 = this.b;
        r2.o = 0;
        r2.b(this.a);     // Catch: Throwable -> L9
        int r0 = 0;
    L5:
        if (r0 == (-1)) goto L16;
        int r1 = (int) r2.o;     // Catch: Throwable -> L9
        byte[] r3 = this.c;     // Catch: Throwable -> L9
        if (r3 != null) goto L12;
        this.c = new byte[1024];     // Catch: Throwable -> L9
    L14:
        byte[] r4 = this.c;     // Catch: Throwable -> L9
        r0 = r2.read(r4, r1, r4.length - r1);     // Catch: Throwable -> L9
        goto L5
    L12:
        if (r1 != r3.length) goto L14;
        this.c = Arrays.copyOf(r3, r3.length * 2);     // Catch: Throwable -> L9
        goto L14
    L16:
        fu.k(r2);
        return;
    L9:
        th = move-exception;
        fu.k(r2);
        throw th;
    }

    @Override // defpackage.jd2
    public final void b() {
    }
}
