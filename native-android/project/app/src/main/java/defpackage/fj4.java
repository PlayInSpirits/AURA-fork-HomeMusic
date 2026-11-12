package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fj4 implements uh0, th0 {
    public final wi0 n;
    public final xi0 o;
    public volatile int p;
    public volatile ph0 q;
    public volatile Object r;
    public volatile tw2 s;
    public volatile qh0 t;

    public fj4(wi0 wi0Var, xi0 xi0Var) {
        this.n = wi0Var;
        this.o = xi0Var;
    }

    @Override // defpackage.th0
    public final void a(f42 f42Var, Object obj, sh0 sh0Var, int i, f42 f42Var2) {
        this.o.a(f42Var, obj, sh0Var, this.s.c.e(), f42Var);
    }

    @Override // defpackage.th0
    public final void b(f42 f42Var, Exception exc, sh0 sh0Var, int i) {
        this.o.b(f42Var, exc, sh0Var, this.s.c.e());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // defpackage.uh0
    public final boolean c() {
        boolean z;
        if (this.r == null) {
            if (this.q != null) {
            }
            this.q = null;
            this.s = null;
            z = false;
            while (!z) {
                ArrayList arrayListB = this.n.b();
                int i = this.p;
                this.p = i + 1;
                this.s = (tw2) arrayListB.get(i);
                if (this.s == null) {
                }
            }
            return z;
        }
        Object obj = this.r;
        this.r = null;
        try {
            if (d(obj)) {
                if (this.q != null || !this.q.c()) {
                    this.q = null;
                    this.s = null;
                    z = false;
                    while (!z && this.p < this.n.b().size()) {
                        ArrayList arrayListB2 = this.n.b();
                        int i2 = this.p;
                        this.p = i2 + 1;
                        this.s = (tw2) arrayListB2.get(i2);
                        if (this.s == null && (this.n.p.a(this.s.c.e()) || this.n.c(this.s.c.a()) != null)) {
                            this.s.c.d(this.n.o, new gp3(this, this.s, false, 20));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    @Override // defpackage.uh0
    public final void cancel() {
        tw2 tw2Var = this.s;
        if (tw2Var != null) {
            tw2Var.c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = ee2.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            yh0 yh0VarG = this.n.c.a().g(obj);
            Object objL = yh0VarG.l();
            c11 c11VarD = this.n.d(objL);
            ns3 ns3Var = new ns3(c11VarD, objL, this.n.i, 2);
            f42 f42Var = this.s.a;
            wi0 wi0Var = this.n;
            qh0 qh0Var = new qh0(f42Var, wi0Var.n);
            wq0 wq0VarA = wi0Var.h.a();
            wq0VarA.M(qh0Var, ns3Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + qh0Var + ", data: " + obj + ", encoder: " + c11VarD + ", duration: " + ee2.a(jElapsedRealtimeNanos));
            }
            if (wq0VarA.m(qh0Var) != null) {
                this.t = qh0Var;
                this.q = new ph0(Collections.singletonList(this.s.a), this.n, this);
                this.s.c.c();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.t + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.o.a(this.s.a, yh0VarG.l(), this.s.c, this.s.c.e(), this.s.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.s.c.c();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
