package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zu1 implements sh0 {
    public final o83 n;
    public final String o;
    public bv3 p;
    public k14 q;

    public zu1(o83 r1, String r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.sh0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.sh0
    public final void c() {
        k14 r0 = this.q;
        if (r0 == null) goto L6;
        r0.close();
        return;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        bv3 r0 = this.p;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    @Override // defpackage.sh0
    public final void d(eq3 r4, rh0 r5) {
        o83 r0 = this.n;     // Catch: IllegalArgumentException -> L7 IOException -> L9
        nz3 r1 = new nz3();     // Catch: IllegalArgumentException -> L7 IOException -> L9
        r1.d(this.o);     // Catch: IllegalArgumentException -> L7 IOException -> L9
        oz3 r2 = new oz3(r1);     // Catch: IllegalArgumentException -> L7 IOException -> L9
        r0.getClass();     // Catch: IllegalArgumentException -> L7 IOException -> L9
        bv3 r3 = new bv3(r0, r2);     // Catch: IllegalArgumentException -> L7 IOException -> L9
        this.p = r3;     // Catch: IllegalArgumentException -> L7 IOException -> L9
        k14 r6 = r3.c();     // Catch: IllegalArgumentException -> L7 IOException -> L9
        this.q = r6;     // Catch: IllegalArgumentException -> L7 IOException -> L9
        if (r6.C == true) goto L11;
        r5.b(new IOException("Request failed with status code: " + this.q.q));     // Catch: IllegalArgumentException -> L7 IOException -> L9
        return;
    L11:
        n14 r7 = r6.t;     // Catch: IllegalArgumentException -> L7 IOException -> L9
        if (r7 != null) goto L15;
        r5.b(new IOException("Image response has no body"));     // Catch: IllegalArgumentException -> L7 IOException -> L9
        return;
    L15:
        r5.f(r7.byteStream());     // Catch: IllegalArgumentException -> L7 IOException -> L9
        return;
    L9:
        e = e;
    L17:
        r5.b(e);
        return;
    L7:
        e = e;
        goto L17
    }

    @Override // defpackage.sh0
    public final int e() {
        return 2;
    }
}
