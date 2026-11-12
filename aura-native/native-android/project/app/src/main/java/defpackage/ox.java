package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ox implements ej4 {
    public boolean n;
    public final /* synthetic */ fw o;
    public final /* synthetic */ jw p;
    public final /* synthetic */ wu3 q;

    public ox(fw fwVar, jw jwVar, wu3 wu3Var) {
        this.o = fwVar;
        this.p = jwVar;
        this.q = wu3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zH;
        if (!this.n) {
            tl1 tl1Var = ze5.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zH = ze5.h(this, 100);
            } catch (IOException unused) {
                zH = false;
            }
            if (!zH) {
                this.n = true;
                this.p.a();
            }
        }
        this.o.close();
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        tvVar.getClass();
        try {
            long j2 = this.o.read(tvVar, j);
            wu3 wu3Var = this.q;
            if (j2 != -1) {
                tvVar.n(wu3Var.o, tvVar.o - j2, j2);
                wu3Var.b();
                return j2;
            }
            if (!this.n) {
                this.n = true;
                wu3Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.n) {
                throw e;
            }
            this.n = true;
            this.p.a();
            throw e;
        }
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.o.timeout();
    }
}
