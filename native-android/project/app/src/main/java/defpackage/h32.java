package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h32 {
    public final j32 a() {
        if ((this instanceof j32) == true) goto L5;
        er1.o(this, "Not a JSON Object: ");
        return null;
    L5:
        return (j32) this;
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        StringWriter r0 = new StringWriter();     // Catch: IOException -> L4
        q32 r1 = new q32(r0);     // Catch: IOException -> L4
        r1.r = true;     // Catch: IOException -> L4
        dz4 r2 = hz4.a;     // Catch: IOException -> L4
        lk1.d(r1, this);     // Catch: IOException -> L4
        return r0.toString();
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }
}
