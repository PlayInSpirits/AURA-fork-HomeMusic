package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n14 implements Closeable {
    public static final m14 Companion = null;
    private Reader reader;

    static {
        Companion = new m14();
    }

    @zo0
    public static final n14 create(hu2 r7, yw r8) {
        m14 r0 = Companion;
        r0.getClass();
        r8.getClass();
        tv r5 = new tv();
        r5.X(r8);
        long r3 = r8.d();
        r0.getClass();
        return new fv3(r7, r3, r5, 1);
    }

    public final InputStream byteStream() {
        return source().V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final yw byteString() {
        long r0 = contentLength();
        yw th = null;
        if (r0 > 2147483647L) goto L26;
        fw r7 = source();
        yw r2 = r7.E();     // Catch: Throwable -> L10
        r7.close();     // Catch: Throwable -> L8
    L9:
        yw r6 = th;
        th = r2;
        th = r6;
    L16:
        if (th != 0) goto L25;
        int r8 = th.d();
        if (r0 != (-1)) goto L20;
    L24:
        return th;
    L20:
        if (r0 == r8) goto L24;
        throw new IOException("Content-Length (" + r0 + ") and stream length (" + r8 + ") disagree");
    L25:
        throw th;
    L8:
        th = th;
    L10:
        th = th;
        if (r7 == null) goto L16;
        r7.close();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        j51.d(th, th);
        goto L16
    L26:
        mj0.i(b11.k("Cannot buffer entire body for content length: ", r0));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] bytes() {
        long r0 = contentLength();
        byte[] th = null;
        if (r0 > 2147483647L) goto L26;
        fw r7 = source();
        byte[] r2 = r7.i();     // Catch: Throwable -> L10
        r7.close();     // Catch: Throwable -> L8
    L9:
        byte[] r6 = th;
        th = r2;
        th = r6;
    L16:
        if (th != 0) goto L25;
        int r8 = th.length;
        if (r0 != (-1)) goto L20;
    L24:
        return th;
    L20:
        if (r0 == r8) goto L24;
        throw new IOException("Content-Length (" + r0 + ") and stream length (" + r8 + ") disagree");
    L25:
        throw th;
    L8:
        th = th;
    L10:
        th = th;
        if (r7 == null) goto L16;
        r7.close();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        j51.d(th, th);
        goto L16
    L26:
        mj0.i(b11.k("Cannot buffer entire body for content length: ", r0));
        return null;
    }

    public final Reader charStream() {
        Reader r0 = this.reader;
        if (r0 != null) goto L10;
        fw r1 = source();
        hu2 r2 = contentType();
        if (r2 == null) goto L8;
        Charset r3 = hu2.a(r2);
        if (r3 == null) goto L8;
    L9:
        r0 = new l14(r1, r3);
        this.reader = r0;
    L8:
        r3 = w10.a;
    L10:
        return r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        xe5.b(source());
    }

    public abstract long contentLength();

    public abstract hu2 contentType();

    public abstract fw source();

    public final String string() {
        fw r0 = source();
        hu2 r2 = contentType();     // Catch: Throwable -> L11
        if (r2 == null) goto L7;
        Charset r3 = hu2.a(r2);     // Catch: Throwable -> L11
        if (r3 == null) goto L7;
    L8:
        String r4 = r0.B(ze5.g(r0, r3));     // Catch: Throwable -> L11
        r0.close();
        return r4;
    L7:
        r3 = w10.a;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        q05.h(r0, th);
        throw th;
    }

    @zo0
    public static final n14 create(hu2 r7, long r8, fw r10) {
        Companion.getClass();
        r10.getClass();
        return new fv3(r7, r8, r10, 1);
    }

    @zo0
    public static final n14 create(hu2 r1, String r2) {
        Companion.getClass();
        r2.getClass();
        return m14.a(r2, r1);
    }

    @zo0
    public static final n14 create(hu2 r1, byte[] r2) {
        Companion.getClass();
        r2.getClass();
        return m14.b(r2, r1);
    }

    public static final n14 create(String r1, hu2 r2) {
        Companion.getClass();
        return m14.a(r1, r2);
    }

    public static final n14 create(byte[] r1, hu2 r2) {
        Companion.getClass();
        return m14.b(r1, r2);
    }

    public static final n14 create(yw r7, hu2 r8) {
        m14 r0 = Companion;
        r0.getClass();
        r7.getClass();
        tv r5 = new tv();
        r5.X(r7);
        long r3 = r7.d();
        r0.getClass();
        return new fv3(r8, r3, r5, 1);
    }

    public static final n14 create(fw r7, hu2 r8, long r9) {
        Companion.getClass();
        r7.getClass();
        return new fv3(r8, r9, r7, 1);
    }
}
