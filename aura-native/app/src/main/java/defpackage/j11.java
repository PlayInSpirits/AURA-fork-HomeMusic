package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j11 implements Runnable {
    public final /* synthetic */ int n;
    public final cf4 o;
    public final /* synthetic */ m11 p;

    public /* synthetic */ j11(m11 m11Var, cf4 cf4Var, int i) {
        this.n = i;
        this.p = m11Var;
        this.o = cf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ly lyVar;
        switch (this.n) {
            case 0:
                cf4 cf4Var = this.o;
                cf4Var.b.a();
                synchronized (cf4Var.c) {
                    synchronized (this.p) {
                        try {
                            if (this.p.n.n.contains(new k11(this.o, fh0.h))) {
                                m11 m11Var = this.p;
                                cf4 cf4Var2 = this.o;
                                m11Var.getClass();
                                try {
                                    cf4Var2.h(m11Var.E, 5);
                                } finally {
                                }
                            }
                            this.p.b();
                        } finally {
                        }
                    }
                }
                return;
            default:
                cf4 cf4Var3 = this.o;
                cf4Var3.b.a();
                synchronized (cf4Var3.c) {
                    synchronized (this.p) {
                        try {
                            if (this.p.n.n.contains(new k11(this.o, fh0.h))) {
                                this.p.G.a();
                                m11 m11Var2 = this.p;
                                cf4 cf4Var4 = this.o;
                                m11Var2.getClass();
                                try {
                                    cf4Var4.i(m11Var2.G, m11Var2.C);
                                    this.p.g(this.o);
                                } finally {
                                }
                            }
                            this.p.b();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
