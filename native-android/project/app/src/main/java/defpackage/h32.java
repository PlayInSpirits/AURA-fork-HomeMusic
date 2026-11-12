package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h32 {
    public final j32 a() {
        if (this instanceof j32) {
            return (j32) this;
        }
        er1.o(this, "Not a JSON Object: ");
        return null;
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            q32 q32Var = new q32(stringWriter);
            q32Var.r = true;
            dz4 dz4Var = hz4.a;
            lk1.d(q32Var, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
