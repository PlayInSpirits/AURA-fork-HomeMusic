package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq1 implements Closeable {
    public static final pb4 M;
    public long A;
    public long B;
    public final r81 C;
    public final pb4 D;
    public pb4 E;
    public final os F;
    public long G;
    public long H;
    public final Socket I;
    public final zq1 J;
    public final mq1 K;
    public final LinkedHashSet L;
    public final kq1 n;
    public final LinkedHashMap o = new LinkedHashMap();
    public final String p;
    public int q;
    public int r;
    public boolean s;
    public final gr4 t;
    public final fr4 u;
    public final fr4 v;
    public final fr4 w;
    public final rv2 x;
    public long y;
    public long z;

    static {
        pb4 pb4Var = new pb4();
        pb4Var.b(7, 65535);
        pb4Var.b(5, 16384);
        M = pb4Var;
    }

    public rq1(lv4 lv4Var) {
        this.n = (kq1) lv4Var.s;
        String str = (String) lv4Var.p;
        if (str == null) {
            h12.Q("connectionName");
            throw null;
        }
        this.p = str;
        this.r = 3;
        gr4 gr4Var = (gr4) lv4Var.n;
        this.t = gr4Var;
        this.u = gr4Var.e();
        this.v = gr4Var.e();
        this.w = gr4Var.e();
        this.x = rv2.z;
        this.C = (r81) lv4Var.t;
        pb4 pb4Var = new pb4();
        pb4Var.b(7, 16777216);
        this.D = pb4Var;
        pb4 pb4Var2 = M;
        this.E = pb4Var2;
        this.F = new os(0);
        this.H = pb4Var2.a();
        Socket socket = (Socket) lv4Var.o;
        if (socket == null) {
            h12.Q("socket");
            throw null;
        }
        this.I = socket;
        ew ewVar = (ew) lv4Var.r;
        if (ewVar == null) {
            h12.Q("sink");
            throw null;
        }
        this.J = new zq1(ewVar);
        fw fwVar = (fw) lv4Var.q;
        if (fwVar == null) {
            h12.Q("source");
            throw null;
        }
        this.K = new mq1(this, new uq1(fwVar));
        this.L = new LinkedHashSet();
    }

    public final void F(int i, long j) {
        fr4.c(this.u, this.p + '[' + i + "] windowUpdate", new qq1(this, i, j));
    }

    public final void b(b21 b21Var, b21 b21Var2, IOException iOException) {
        int i;
        Object[] array;
        tl1 tl1Var = ze5.a;
        try {
            q(b21Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.o.isEmpty()) {
                array = null;
            } else {
                array = this.o.values().toArray(new yq1[0]);
                this.o.clear();
            }
        }
        yq1[] yq1VarArr = (yq1[]) array;
        if (yq1VarArr != null) {
            for (yq1 yq1Var : yq1VarArr) {
                try {
                    yq1Var.c(b21Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.J.close();
        } catch (IOException unused3) {
        }
        try {
            this.I.close();
        } catch (IOException unused4) {
        }
        this.u.g();
        this.v.g();
        this.w.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(b21.NO_ERROR, b21.CANCEL, null);
    }

    public final void f(IOException iOException) {
        b21 b21Var = b21.PROTOCOL_ERROR;
        b(b21Var, b21Var, iOException);
    }

    public final void flush() {
        this.J.flush();
    }

    public final synchronized yq1 j(int i) {
        return (yq1) this.o.get(Integer.valueOf(i));
    }

    public final synchronized yq1 n(int i) {
        yq1 yq1Var;
        yq1Var = (yq1) this.o.remove(Integer.valueOf(i));
        notifyAll();
        return yq1Var;
    }

    public final void q(b21 b21Var) {
        synchronized (this.J) {
            synchronized (this) {
                if (this.s) {
                    return;
                }
                this.s = true;
                this.J.n(this.q, b21Var, xe5.a);
            }
        }
    }

    public final synchronized void s(long j) {
        try {
            os.c(this.F, j, 0L, 2);
            long jB = this.F.b();
            if (jB >= this.D.a() / 2) {
                F(0, jB);
                os.c(this.F, 0L, jB, 1);
            }
            r81 r81Var = this.C;
            os osVar = this.F;
            r81Var.getClass();
            osVar.getClass();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void u(int i, boolean z, tv tvVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.J.f(z, i, tvVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.G;
                            j3 = this.H;
                            if (j2 >= j3) {
                                if (!this.o.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.J.p);
                j4 = iMin;
                this.G += j4;
            }
            j -= j4;
            this.J.f(z && j == 0, i, tvVar, iMin);
        }
    }

    public final void v(int i, b21 b21Var) {
        fr4.c(this.u, this.p + '[' + i + "] writeSynReset", new pq1(this, i, b21Var));
    }
}
