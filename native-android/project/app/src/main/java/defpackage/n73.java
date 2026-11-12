package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n73 extends bz4 {
    public static final m73 b = new m73(new n73(2), 0);
    public final int a;

    public n73(int i) {
        this.a = i;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        int iE0 = l32Var.e0();
        int iW = xa3.w(iE0);
        if (iW == 5 || iW == 6) {
            return f34.b(this.a, l32Var);
        }
        if (iW == 8) {
            l32Var.a0();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + b11.x(iE0) + "; at path " + l32Var.v());
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) throws IOException {
        q32Var.T((Number) obj);
    }
}
