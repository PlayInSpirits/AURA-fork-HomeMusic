package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hx implements Closeable, Flushable {
    public final jr0 n;

    public hx(File file) {
        s32 s32Var = b71.a;
        String str = ge3.o;
        ge3 A = tv1.A(file);
        s32Var.getClass();
        gr4 gr4Var = gr4.l;
        gr4Var.getClass();
        this.n = new jr0(s32Var, A, gr4Var);
    }

    public final void b(oz3 oz3Var) {
        oz3Var.getClass();
        jr0 jr0Var = this.n;
        String D = si0.D(oz3Var.a);
        synchronized (jr0Var) {
            D.getClass();
            jr0Var.q();
            jr0Var.b();
            jr0.R(D);
            dr0 dr0Var = (dr0) jr0Var.v.get(D);
            if (dr0Var == null) {
                return;
            }
            jr0Var.K(dr0Var);
            if (jr0Var.t <= jr0Var.p) {
                jr0Var.B = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.n.flush();
    }
}
