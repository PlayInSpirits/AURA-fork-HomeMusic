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

    public final boolean v(cj0 cj0Var) {
        ByteBuffer byteBuffer;
        rr2.l(!cj0Var.d(1073741824));
        rr2.l(!cj0Var.d(268435456));
        rr2.l(!cj0Var.d(4));
        if (w()) {
            if (this.y >= this.z) {
                return false;
            }
            ByteBuffer byteBuffer2 = cj0Var.r;
            if (byteBuffer2 != null && (byteBuffer = this.r) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.y;
        this.y = i + 1;
        if (i == 0) {
            this.t = cj0Var.t;
            if (cj0Var.d(1)) {
                this.o = 1;
            }
        }
        ByteBuffer byteBuffer3 = cj0Var.r;
        if (byteBuffer3 != null) {
            t(byteBuffer3.remaining());
            this.r.put(byteBuffer3);
        }
        this.x = cj0Var.t;
        return true;
    }

    public final boolean w() {
        return this.y > 0;
    }
}
