package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yl4 implements ci0 {
    public final ci0 n;
    public long o;
    public Uri p;
    public Map q;

    public yl4(ci0 ci0Var) {
        ci0Var.getClass();
        this.n = ci0Var;
        this.p = Uri.EMPTY;
        this.q = Collections.EMPTY_MAP;
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) {
        ci0 ci0Var = this.n;
        this.p = ii0Var.a;
        this.q = Collections.EMPTY_MAP;
        try {
            return ci0Var.b(ii0Var);
        } finally {
            Uri m = ci0Var.m();
            if (m != null) {
                this.p = m;
            }
            this.q = ci0Var.j();
        }
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.n.c(rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.n.close();
    }

    @Override // defpackage.ci0
    public final Map j() {
        return this.n.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.n.read(bArr, i, i2);
        if (read != -1) {
            this.o += read;
        }
        return read;
    }
}
