package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fe2 extends Writer {
    public final String n;
    public final StringBuilder o;

    public fe2() {
        this.o = new StringBuilder(128);
        this.n = "FragmentManager";
    }

    public final void b() {
        StringBuilder r0 = this.o;
        if (r0.length() <= 0) goto L6;
        Log.d(this.n, r0.toString());
        r0.delete(0, r0.length());
        return;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L9;
        char r1 = r4[r5 + r0];
        if (r1 != '\n') goto L7;
        b();
    L8:
        r0 = r0 + 1;
        goto L3
    L7:
        this.o.append(r1);
        goto L8
    }
}
