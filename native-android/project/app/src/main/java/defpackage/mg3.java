package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mg3 implements ci0 {
    public static final mg3 n = null;

    static {
        n = new mg3();
    }

    @Override // defpackage.ci0
    public final long b(ii0 r1) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.ci0
    public final void c(rw4 r1) {
    }

    @Override // defpackage.ci0
    public final void close() {
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return null;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r1, int r2, int r3) {
        throw new UnsupportedOperationException();
    }
}
