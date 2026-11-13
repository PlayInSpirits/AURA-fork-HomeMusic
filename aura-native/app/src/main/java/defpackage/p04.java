package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p04 implements ci0 {
    public final ci0 n;
    public boolean o;

    public p04(ci0 ci0Var, mj0 mj0Var) {
        this.n = ci0Var;
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) {
        hi0 a = ii0Var.a();
        a.i = ii0Var.i & (-3);
        ii0 a2 = a.a();
        this.o = true;
        return this.n.b(a2);
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.n.c(rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() {
        if (this.o) {
            this.o = false;
            this.n.close();
        }
    }

    @Override // defpackage.ci0
    public final Map j() {
        return this.n.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        Uri m = this.n.m();
        if (m == null) {
            return null;
        }
        return m;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        return this.n.read(bArr, i, i2);
    }
}
