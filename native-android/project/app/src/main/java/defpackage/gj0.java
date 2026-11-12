package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 implements n9 {
    public int p;
    public int q;
    public final boolean n = true;
    public final int o = 65536;
    public int r = 0;
    public m9[] s = new m9[100];

    @Override // defpackage.n9
    public final synchronized void a(ru ruVar) {
        while (ruVar != null) {
            try {
                m9[] m9VarArr = this.s;
                int i = this.r;
                this.r = i + 1;
                m9 m9Var = (m9) ruVar.p;
                m9Var.getClass();
                m9VarArr[i] = m9Var;
                this.q--;
                ruVar = (ru) ruVar.q;
                if (ruVar == null || ((m9) ruVar.p) == null) {
                    ruVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void b(int i) {
        boolean z = i < this.p;
        this.p = i;
        if (z) {
            h();
        }
    }

    @Override // defpackage.n9
    public final synchronized void f(m9 m9Var) {
        m9[] m9VarArr = this.s;
        int i = this.r;
        this.r = i + 1;
        m9VarArr[i] = m9Var;
        this.q--;
        notifyAll();
    }

    @Override // defpackage.n9
    public final synchronized m9 g() {
        m9 m9Var;
        try {
            int i = this.q + 1;
            this.q = i;
            int i2 = this.r;
            if (i2 > 0) {
                m9[] m9VarArr = this.s;
                int i3 = i2 - 1;
                this.r = i3;
                m9Var = m9VarArr[i3];
                m9Var.getClass();
                this.s[this.r] = null;
            } else {
                m9 m9Var2 = new m9(0, new byte[this.o]);
                m9[] m9VarArr2 = this.s;
                if (i > m9VarArr2.length) {
                    this.s = (m9[]) Arrays.copyOf(m9VarArr2, m9VarArr2.length * 2);
                }
                m9Var = m9Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m9Var;
    }

    @Override // defpackage.n9
    public final synchronized void h() {
        int iMax = Math.max(0, f35.g(this.p, this.o) - this.q);
        int i = this.r;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.s, iMax, i, (Object) null);
        this.r = iMax;
    }

    @Override // defpackage.n9
    public final int m() {
        return this.o;
    }
}
