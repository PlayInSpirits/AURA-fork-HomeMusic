package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pr extends cj0 {
    public long x;
    public int y;
    public int z;

    @Override // defpackage.cj0
    public final void r() {
        super.r();
        this.y = 0;
    }

    public final boolean v(cj0 r5) {
        rr2.l(!r5.d(1073741824));
        rr2.l(!r5.d(268435456));
        rr2.l(!r5.d(4));
        if (w() == true) goto L6;
    L16:
        int r0 = this.y;
        this.y = r0 + 1;
        if (r0 != 0) goto L21;
        this.t = r5.t;
        if (r5.d(1) == false) goto L21;
        this.o = 1;
    L21:
        ByteBuffer r1 = r5.r;
        if (r1 == null) goto L24;
        t(r1.remaining());
        this.r.put(r1);
    L24:
        this.x = r5.t;
        return true;
    L6:
        if (this.y >= this.z) goto L26;
        ByteBuffer r2 = r5.r;
        if (r2 == null) goto L16;
        ByteBuffer r3 = this.r;
        if (r3 == null) goto L16;
        if ((r2.remaining() + r3.position()) <= 3072000) goto L16;
        return false;
    L26:
        return false;
    }

    public final boolean w() {
        if (this.y <= 0) goto L6;
        return true;
    L6:
        return false;
    }
}
