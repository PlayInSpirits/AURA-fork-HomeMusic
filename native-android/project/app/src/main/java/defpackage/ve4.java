package defpackage;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ve4 implements zi0 {
    public final ue4 a;
    public final cj0[] e;
    public final dj0[] f;
    public int g;
    public int h;
    public cj0 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public int m;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public ve4(cj0[] cj0VarArr, dj0[] dj0VarArr) {
        this.e = cj0VarArr;
        this.g = cj0VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = g();
        }
        this.f = dj0VarArr;
        this.h = dj0VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = h();
        }
        ue4 ue4Var = new ue4(this);
        this.a = ue4Var;
        ue4Var.start();
    }

    @Override // defpackage.zi0
    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.zi0
    public final void b(long j) {
        synchronized (this.b) {
            try {
                rr2.w(this.g == this.e.length || this.k);
                this.n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zi0
    public final Object e() {
        cj0 cj0Var;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                rr2.w(this.i == null);
                int i = this.g;
                if (i == 0) {
                    cj0Var = null;
                } else {
                    cj0[] cj0VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    cj0Var = cj0VarArr[i2];
                }
                this.i = cj0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cj0Var;
    }

    @Override // defpackage.zi0
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                cj0 cj0Var = this.i;
                if (cj0Var != null) {
                    cj0Var.r();
                    cj0[] cj0VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    cj0VarArr[i] = cj0Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    cj0 cj0Var2 = (cj0) this.c.removeFirst();
                    cj0Var2.r();
                    cj0[] cj0VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    cj0VarArr2[i2] = cj0Var2;
                }
                while (!this.d.isEmpty()) {
                    ((dj0) this.d.removeFirst()).s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract cj0 g();

    public abstract dj0 h();

    public abstract DecoderException i(Throwable th);

    public abstract DecoderException j(cj0 cj0Var, dj0 dj0Var, boolean z);

    public final boolean k() {
        boolean z;
        DecoderException decoderExceptionI;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            cj0 cj0Var = (cj0) this.c.removeFirst();
            dj0[] dj0VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            dj0 dj0Var = dj0VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (cj0Var.d(4)) {
                dj0Var.a(4);
            } else {
                dj0Var.p = cj0Var.t;
                if (cj0Var.d(134217728)) {
                    dj0Var.a(134217728);
                }
                long j = cj0Var.t;
                synchronized (this.b) {
                    long j2 = this.n;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    dj0Var.r = true;
                }
                try {
                    decoderExceptionI = j(cj0Var, dj0Var, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionI = i(e);
                } catch (RuntimeException e2) {
                    decoderExceptionI = i(e2);
                }
                if (decoderExceptionI != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionI;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        dj0Var.s();
                    } else {
                        boolean z3 = dj0Var.r;
                        int i2 = this.m;
                        if (z3) {
                            this.m = i2 + 1;
                            dj0Var.s();
                        } else {
                            dj0Var.q = i2;
                            this.m = 0;
                            this.d.addLast(dj0Var);
                        }
                    }
                    cj0Var.r();
                    cj0[] cj0VarArr = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    cj0VarArr[i3] = cj0Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // defpackage.zi0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final dj0 d() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (dj0) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zi0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void f(cj0 cj0Var) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                rr2.l(cj0Var == this.i);
                this.c.addLast(cj0Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(dj0 dj0Var) {
        synchronized (this.b) {
            dj0Var.r();
            dj0[] dj0VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            dj0VarArr[i] = dj0Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }
}
