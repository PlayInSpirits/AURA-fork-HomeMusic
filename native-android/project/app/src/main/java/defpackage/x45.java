package defpackage;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x45 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer n;

    public x45(ByteBuffer r1) {
        this.n = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.n.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long r3, byte[] r5, int r6, int r7) {
        ByteBuffer r2 = this.n;
        if (r3 < r2.limit()) goto L6;
        return -1;
    L6:
        r2.position((int) r3);
        int r4 = Math.min(r7, r2.remaining());
        r2.get(r5, r6, r4);
        return r4;
    }
}
