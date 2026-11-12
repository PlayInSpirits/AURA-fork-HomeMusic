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

    public zu1(o83 o83Var, String str) {
        this.n = o83Var;
        this.o = str;
    }

    @Override // defpackage.sh0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.sh0
    public final void c() {
        k14 k14Var = this.q;
        if (k14Var != null) {
            k14Var.close();
        }
    }

    @Override // defpackage.sh0
    public final void cancel() {
        bv3 bv3Var = this.p;
        if (bv3Var != null) {
            bv3Var.cancel();
        }
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) {
        try {
            o83 o83Var = this.n;
            nz3 nz3Var = new nz3();
            nz3Var.d(this.o);
            oz3 oz3Var = new oz3(nz3Var);
            o83Var.getClass();
            bv3 bv3Var = new bv3(o83Var, oz3Var);
            this.p = bv3Var;
            k14 k14VarC = bv3Var.c();
            this.q = k14VarC;
            if (!k14VarC.C) {
                rh0Var.b(new IOException("Request failed with status code: " + this.q.q));
            } else {
                n14 n14Var = k14VarC.t;
                if (n14Var == null) {
                    rh0Var.b(new IOException("Image response has no body"));
                } else {
                    rh0Var.f(n14Var.byteStream());
                }
            }
        } catch (IOException e) {
            e = e;
            rh0Var.b(e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            rh0Var.b(e);
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        return 2;
    }
}
