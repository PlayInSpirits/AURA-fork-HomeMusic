package defpackage;

import android.database.Cursor;
import java.io.Closeable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ek0 implements Closeable {
    public final Cursor n;

    public ek0(Cursor cursor) {
        this.n = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }
}
