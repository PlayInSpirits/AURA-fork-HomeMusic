package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 extends zb1 {
    public final if1 o;
    public boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(of4 of4Var, if1 if1Var) {
        super(of4Var);
        of4Var.getClass();
        this.o = if1Var;
    }

    @Override // defpackage.zb1, defpackage.of4
    public final void L(tv tvVar, long j) {
        if (this.p) {
            tvVar.skip(j);
            return;
        }
        try {
            this.n.L(tvVar, j);
        } catch (IOException e) {
            this.p = true;
            this.o.invoke(e);
        }
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.p = true;
            this.o.invoke(e);
        }
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Flushable
    public final void flush() {
        if (this.p) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.p = true;
            this.o.invoke(e);
        }
    }
}
