package defpackage;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cj0 extends uv {
    public tb1 p;
    public final fg0 q;
    public ByteBuffer r;
    public boolean s;
    public long t;
    public ByteBuffer u;
    public final int v;
    public final int w;

    static {
        hn2.a("media3.decoder");
    }

    public cj0(int r2, int r3) {
        this.q = new fg0();
        this.v = r2;
        this.w = r3;
    }

    public void r() {
        this.o = 0;
        ByteBuffer r1 = this.r;
        if (r1 == null) goto L5;
        r1.clear();
    L5:
        ByteBuffer r2 = this.u;
        if (r2 == null) goto L8;
        r2.clear();
    L8:
        this.s = false;
    }

    public final ByteBuffer s(int r5) {
        int r1 = this.v;
        if (r1 != 1) goto L7;
        return ByteBuffer.allocate(r5);
    L7:
        if (r1 == 2) goto L9;
        ByteBuffer r4 = this.r;
        if (r4 != null) goto L13;
        int r6 = 0;
    L15:
        throw new DecoderInputBuffer$InsufficientCapacityException(b11.n("Buffer too small (", " < ", r6, r5, ")"));
    L13:
        r6 = r4.capacity();
        goto L15
    L9:
        return ByteBuffer.allocateDirect(r5);
    }

    public final void t(int r4) {
        int r5 = r4 + this.w;
        ByteBuffer r0 = this.r;
        if (r0 != null) goto L6;
        this.r = s(r5);
        return;
    L6:
        int r1 = r0.capacity();
        int r2 = r0.position();
        int r6 = r5 + r2;
        if (r1 < r6) goto L10;
        this.r = r0;
        return;
    L10:
        ByteBuffer r7 = s(r6);
        r7.order(r0.order());
        if (r2 <= 0) goto L13;
        r0.flip();
        r7.put(r0);
    L13:
        this.r = r7;
    }

    public final void u() {
        ByteBuffer r0 = this.r;
        if (r0 == null) goto L5;
        r0.flip();
    L5:
        ByteBuffer r1 = this.u;
        if (r1 == null) goto L9;
        r1.flip();
        return;
    }
}
