package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sq1 implements r21 {
    public static final List g = ze5.f("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = ze5.f("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final cv3 a;
    public final ev3 b;
    public final rq1 c;
    public volatile yq1 d;
    public final pr3 e;
    public volatile boolean f;

    public sq1(o83 o83Var, cv3 cv3Var, ev3 ev3Var, rq1 rq1Var) {
        o83Var.getClass();
        rq1Var.getClass();
        this.a = cv3Var;
        this.b = ev3Var;
        this.c = rq1Var;
        List list = o83Var.s;
        pr3 pr3Var = pr3.t;
        this.e = list.contains(pr3Var) ? pr3Var : pr3.s;
    }

    @Override // defpackage.r21
    public final ej4 a(k14 k14Var) {
        yq1 yq1Var = this.d;
        yq1Var.getClass();
        return yq1Var.h;
    }

    @Override // defpackage.r21
    public final void b(oz3 oz3Var) throws IOException {
        int i;
        yq1 yq1Var;
        boolean z;
        oz3Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = oz3Var.d != null;
        tl1 tl1Var = oz3Var.c;
        ArrayList arrayList = new ArrayList(tl1Var.size() + 4);
        arrayList.add(new pl1(pl1.f, oz3Var.b));
        yw ywVar = pl1.g;
        gr1 gr1Var = oz3Var.a;
        gr1Var.getClass();
        String strB = gr1Var.b();
        String strD = gr1Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new pl1(ywVar, strB));
        String strA = tl1Var.a("Host");
        if (strA != null) {
            arrayList.add(new pl1(pl1.i, strA));
        }
        arrayList.add(new pl1(pl1.h, gr1Var.a));
        int size = tl1Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = tl1Var.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strB2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && tl1Var.e(i2).equals("trailers"))) {
                arrayList.add(new pl1(lowerCase, tl1Var.e(i2)));
            }
        }
        rq1 rq1Var = this.c;
        rq1Var.getClass();
        boolean z3 = !z2;
        synchronized (rq1Var.J) {
            synchronized (rq1Var) {
                try {
                    if (rq1Var.r > 1073741823) {
                        rq1Var.q(b21.REFUSED_STREAM);
                    }
                    if (rq1Var.s) {
                        throw new ConnectionShutdownException();
                    }
                    i = rq1Var.r;
                    rq1Var.r = i + 2;
                    yq1Var = new yq1(i, rq1Var, z3, false, null);
                    z = !z2 || rq1Var.G >= rq1Var.H || yq1Var.d >= yq1Var.e;
                    if (yq1Var.h()) {
                        rq1Var.o.put(Integer.valueOf(i), yq1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rq1Var.J.q(z3, i, arrayList);
        }
        if (z) {
            rq1Var.J.flush();
        }
        this.d = yq1Var;
        boolean z4 = this.f;
        yq1 yq1Var2 = this.d;
        if (z4) {
            yq1Var2.getClass();
            yq1Var2.e(b21.CANCEL);
            mj0.i("Canceled");
            return;
        }
        yq1Var2.getClass();
        xq1 xq1Var = yq1Var2.j;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xq1Var.g(j, timeUnit);
        yq1 yq1Var3 = this.d;
        yq1Var3.getClass();
        yq1Var3.k.g(this.b.h, timeUnit);
    }

    @Override // defpackage.r21
    public final void c() {
        yq1 yq1Var = this.d;
        yq1Var.getClass();
        yq1Var.f().close();
    }

    @Override // defpackage.r21
    public final void cancel() {
        this.f = true;
        yq1 yq1Var = this.d;
        if (yq1Var != null) {
            yq1Var.e(b21.CANCEL);
        }
    }

    @Override // defpackage.r21
    public final long d(k14 k14Var) {
        if (br1.a(k14Var)) {
            return ze5.e(k14Var);
        }
        return 0L;
    }

    @Override // defpackage.r21
    public final of4 e(oz3 oz3Var, long j) {
        oz3Var.getClass();
        yq1 yq1Var = this.d;
        yq1Var.getClass();
        return yq1Var.f();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    @Override // defpackage.r21
    public final j14 f(boolean z) throws IOException {
        tl1 tl1Var;
        boolean z2;
        yq1 yq1Var = this.d;
        if (yq1Var == null) {
            mj0.i("stream wasn't created");
            return null;
        }
        synchronized (yq1Var) {
            while (true) {
                if (!yq1Var.f.isEmpty() || yq1Var.l != null) {
                    break;
                }
                if (!z) {
                    yq1Var.b.getClass();
                    vq1 vq1Var = yq1Var.i;
                    z2 = vq1Var.p || vq1Var.n;
                }
                if (z2) {
                    yq1Var.j.h();
                }
                try {
                    try {
                        yq1Var.wait();
                        if (z2) {
                            yq1Var.j.k();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        yq1Var.j.k();
                    }
                    throw th;
                }
            }
            if (yq1Var.f.isEmpty()) {
                IOException iOException = yq1Var.m;
                if (iOException != null) {
                    throw iOException;
                }
                b21 b21Var = yq1Var.l;
                b21Var.getClass();
                throw new StreamResetException(b21Var);
            }
            Object objRemoveFirst = yq1Var.f.removeFirst();
            objRemoveFirst.getClass();
            tl1Var = (tl1) objRemoveFirst;
        }
        pr3 pr3Var = this.e;
        pr3Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = tl1Var.size();
        ue1 ue1VarC = null;
        for (int i = 0; i < size; i++) {
            String strB = tl1Var.b(i);
            String strE = tl1Var.e(i);
            if (strB.equals(":status")) {
                ue1VarC = hw.C("HTTP/1.1 ".concat(strE));
            } else if (!h.contains(strB)) {
                arrayList.add(strB);
                arrayList.add(qm4.K0(strE).toString());
            }
        }
        if (ue1VarC == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        j14 j14Var = new j14();
        j14Var.b = pr3Var;
        j14Var.c = ue1VarC.o;
        j14Var.d = (String) ue1VarC.q;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        strArr.getClass();
        sl1 sl1Var = new sl1();
        ArrayList arrayList2 = sl1Var.a;
        arrayList2.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList2.addAll(listAsList);
        j14Var.f = sl1Var;
        j14Var.n = gq1.p;
        if (z && j14Var.c == 100) {
            return null;
        }
        return j14Var;
    }

    @Override // defpackage.r21
    public final void g() {
        this.c.flush();
    }

    @Override // defpackage.r21
    public final q21 h() {
        return this.a;
    }

    @Override // defpackage.r21
    public final tl1 i() throws IOException {
        tl1 tl1Var;
        yq1 yq1Var = this.d;
        yq1Var.getClass();
        synchronized (yq1Var) {
            wq1 wq1Var = yq1Var.h;
            if (!wq1Var.o || !wq1Var.p.l() || !yq1Var.h.q.l()) {
                b21 b21Var = yq1Var.l;
                if (b21Var == null) {
                    throw new IllegalStateException("too early; can't read the trailers yet");
                }
                IOException iOException = yq1Var.m;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(b21Var);
            }
            tl1Var = yq1Var.h.r;
            if (tl1Var == null) {
                tl1Var = ze5.a;
            }
        }
        return tl1Var;
    }
}
