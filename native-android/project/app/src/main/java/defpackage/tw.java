package defpackage;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tw implements yh0, fl0 {
    public final ByteBuffer n;

    public tw(int r1, ByteBuffer r2) {
        switch(r1) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.n = r2;
        return;
    L5:
        this.n = r2;
        r2.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.fl0
    public int b() {
        int r0 = d() << 8;
        return d() | r0;
    }

    @Override // defpackage.yh0
    public void c() {
    }

    @Override // defpackage.fl0
    public short d() {
        ByteBuffer r2 = this.n;
        if (r2.remaining() < 1) goto L7;
        return (short) (r2.get() & 255);
    L7:
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // defpackage.fl0
    public int e(int r2, byte[] r3) {
        ByteBuffer r1 = this.n;
        int r4 = Math.min(r2, r1.remaining());
        if (r4 != 0) goto L6;
        return -1;
    L6:
        r1.get(r3, 0, r4);
        return r4;
    }

    @Override // defpackage.yh0
    public Object l() {
        ByteBuffer r1 = this.n;
        r1.position(0);
        return r1;
    }

    @Override // defpackage.fl0
    public long skip(long r3) {
        ByteBuffer r2 = this.n;
        int r4 = (int) Math.min(r2.remaining(), r3);
        r2.position(r2.position() + r4);
        return r4;
    }
}
