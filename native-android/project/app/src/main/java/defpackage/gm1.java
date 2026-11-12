package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gm1 extends s20 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.jd2
    public final void a() {
        this.i.b(this.b);     // Catch: Throwable -> L13
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L16;
        if (this.k == true) goto L16;
        byte[] r2 = this.j;     // Catch: Throwable -> L13
        if (r2.length >= (r1 + 16384)) goto L10;
        this.j = Arrays.copyOf(r2, r2.length + 16384);     // Catch: Throwable -> L13
    L10:
        r0 = this.i.read(this.j, r1, 16384);     // Catch: Throwable -> L13
        if (r0 == (-1)) goto L4;
        r1 = r1 + r0;     // Catch: Throwable -> L13
    L16:
        if (this.k == true) goto L18;
        this.l = Arrays.copyOf(this.j, r1);     // Catch: Throwable -> L13
    L18:
        fu.k(this.i);
        return;
    L13:
        th = move-exception;
        fu.k(this.i);
        throw th;
    }

    @Override // defpackage.jd2
    public final void b() {
        this.k = true;
    }
}
