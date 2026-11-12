package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tc implements f42 {
    public final int b;
    public final f42 c;

    public tc(int r1, f42 r2) {
        this.b = r1;
        this.c = r2;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r2) {
        this.c.b(r2);
        r2.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.f42
    public final boolean equals(Object r3) {
        if ((r3 instanceof tc) == false) goto L10;
        tc r4 = (tc) r3;
        if (this.b == r4.b) goto L7;
        return false;
    L7:
        if (this.c.equals(r4.c) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        f42 r0 = this.c;
        return e35.F(this.b, r0);
    }
}
