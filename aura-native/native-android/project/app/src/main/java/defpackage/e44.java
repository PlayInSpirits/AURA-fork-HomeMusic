package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e44 extends h44 implements Iterator {
    public f44 n;
    public f44 o;

    @Override // defpackage.h44
    public final void a(f44 f44Var) {
        f44 f44Var2 = null;
        if (this.n == f44Var && f44Var == this.o) {
            this.o = null;
            this.n = null;
        }
        f44 f44Var3 = this.n;
        if (f44Var3 == f44Var) {
            this.n = f44Var3.q;
        }
        f44 f44Var4 = this.o;
        if (f44Var4 == f44Var) {
            f44 f44Var5 = this.n;
            if (f44Var4 != f44Var5 && f44Var5 != null) {
                f44Var2 = f44Var4.p;
            }
            this.o = f44Var2;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        f44 f44Var = this.o;
        f44 f44Var2 = this.n;
        this.o = (f44Var == f44Var2 || f44Var2 == null) ? null : f44Var.p;
        return f44Var;
    }
}
