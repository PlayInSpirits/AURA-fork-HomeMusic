package defpackage;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cj0 extends uv {
    public tb1 p;
    public final fg0 q = new fg0();
    public ByteBuffer r;
    public boolean s;
    public long t;
    public ByteBuffer u;
    public final int v;
    public final int w;

    static {
        hn2.a("media3.decoder");
    }

    public cj0(int i, int i2) {
        this.v = i;
        this.w = i2;
    }

    public void r() {
        this.o = 0;
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.u;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.s = false;
    }

    public final ByteBuffer s(int i) {
        int i2 = this.v;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.r;
        throw new DecoderInputBuffer$InsufficientCapacityException(b11.n("Buffer too small (", " < ", byteBuffer == null ? 0 : byteBuffer.capacity(), i, ")"));
    }

    public final void t(int i) {
        int i2 = i + this.w;
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer == null) {
            this.r = s(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.r = byteBuffer;
            return;
        }
        ByteBuffer byteBufferS = s(i3);
        byteBufferS.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferS.put(byteBuffer);
        }
        this.r = byteBufferS;
    }

    public final void u() {
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.u;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
