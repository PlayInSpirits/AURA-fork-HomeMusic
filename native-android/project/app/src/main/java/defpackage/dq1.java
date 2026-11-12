package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 extends bq1 {
    public final gr1 q;
    public long r;
    public boolean s;
    public final /* synthetic */ hq1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq1(hq1 hq1Var, gr1 gr1Var) {
        super(hq1Var);
        gr1Var.getClass();
        this.t = hq1Var;
        this.q = gr1Var;
        this.r = -1L;
        this.s = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zH;
        if (this.o) {
            return;
        }
        if (this.s) {
            tl1 tl1Var = ze5.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zH = ze5.h(this, 100);
            } catch (IOException unused) {
                zH = false;
            }
            if (!zH) {
                ((q21) this.t.c).a();
                b();
            }
        }
        this.o = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r11.s == false) goto L31;
     */
    @Override // defpackage.bq1, defpackage.ej4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(tv tvVar, long j) throws IOException {
        hq1 hq1Var = this.t;
        fw fwVar = (fw) hq1Var.d;
        tvVar.getClass();
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return 0L;
        }
        if (this.o) {
            kf2.o("closed");
            return 0L;
        }
        if (this.s) {
            long j2 = this.r;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    fwVar.I();
                }
                try {
                    this.r = fwVar.S();
                    String string = qm4.K0(fwVar.I()).toString();
                    if (this.r < 0 || (string.length() > 0 && !xm4.k0(string, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.r + string + '\"');
                    }
                    if (this.r == 0) {
                        this.s = false;
                        e20 e20Var = (e20) hq1Var.f;
                        e20Var.getClass();
                        sl1 sl1Var = new sl1();
                        while (true) {
                            String strT = ((fw) e20Var.p).t(e20Var.o);
                            e20Var.o -= (long) strT.length();
                            if (strT.length() == 0) {
                                break;
                            }
                            sl1Var.b(strT);
                        }
                        hq1Var.g = sl1Var.c();
                        o83 o83Var = (o83) hq1Var.b;
                        o83Var.getClass();
                        be0 be0Var = o83Var.j;
                        tl1 tl1Var = (tl1) hq1Var.g;
                        tl1Var.getClass();
                        br1.b(be0Var, this.q, tl1Var);
                        b();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long j3 = super.read(tvVar, Math.min(j, this.r));
            if (j3 != -1) {
                this.r -= j3;
                return j3;
            }
            ((q21) hq1Var.c).a();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        return -1L;
    }
}
