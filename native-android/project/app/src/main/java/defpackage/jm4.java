package defpackage;

import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jm4 implements ci0 {
    public final lx n;
    public ii0 o;
    public String p;

    public jm4(lx lxVar) {
        this.n = lxVar;
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) {
        ii0Var.getClass();
        lx lxVar = this.n;
        this.p = lxVar.r.d(ii0Var);
        long jB = lxVar.b(ii0Var);
        this.o = ii0Var;
        return jB;
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.n.c(rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() {
        lx lxVar = this.n;
        se4 se4Var = lxVar.n;
        lxVar.close();
        ii0 ii0Var = this.o;
        if (ii0Var != null) {
            String strD = this.p;
            if (strD == null) {
                strD = lxVar.r.d(ii0Var);
                strD.getClass();
            }
            if (nd0.a(se4Var.i(strD)) == -1) {
                Log.d("StreamingCacheDataSource", "Removing partial cache for ".concat(strD));
                se4Var.m(strD);
            } else {
                Log.d("StreamingCacheDataSource", "Key " + strD + " has been fully cached");
            }
        }
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.v;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.n.read(bArr, i, i2);
    }
}
