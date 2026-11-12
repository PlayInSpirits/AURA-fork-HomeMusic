package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends FilterOutputStream {
    public InputStream n;
    public final Object o;

    public kx1(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.o = new Object();
    }

    public final InputStream b() {
        synchronized (this.o) {
            try {
                if (this.n == null) {
                    this.n = new ByteArrayInputStream(((ByteArrayOutputStream) ((FilterOutputStream) this).out).toByteArray());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.n;
    }
}
