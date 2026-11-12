package defpackage;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tw implements yh0, fl0 {
    public final ByteBuffer n;

    public tw(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 1:
                this.n = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.n = byteBuffer;
                break;
        }
    }

    @Override // defpackage.fl0
    public int b() {
        return d() | (d() << 8);
    }

    @Override // defpackage.yh0
    public void c() {
    }

    @Override // defpackage.fl0
    public short d() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.n;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // defpackage.fl0
    public int e(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.n;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // defpackage.yh0
    public Object l() {
        ByteBuffer byteBuffer = this.n;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.fl0
    public long skip(long j) {
        ByteBuffer byteBuffer = this.n;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }
}
