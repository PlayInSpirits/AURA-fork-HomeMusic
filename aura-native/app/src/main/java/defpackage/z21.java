package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z21 extends MediaDataSource {
    public long n;
    public final /* synthetic */ e31 o;

    public z21(e31 e31Var) {
        this.o = e31Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        e31 e31Var = this.o;
        DataInputStream dataInputStream = e31Var.n;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.n;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        e31Var.f(j);
                        this.n = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = e31Var.read(bArr, i, i2);
                if (read >= 0) {
                    this.n += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.n = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
