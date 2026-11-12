package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u90 implements r02 {
    public static final u90 b = new u90(0);
    public final /* synthetic */ int a;

    public /* synthetic */ u90(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0162 A[Catch: IOException -> 0x00ca, TryCatch #0 {IOException -> 0x00ca, blocks: (B:56:0x00c2, B:59:0x00cd, B:66:0x00f2, B:67:0x0111, B:73:0x013b, B:75:0x0152, B:79:0x015c, B:86:0x0171, B:89:0x017e, B:90:0x019d, B:81:0x0162, B:92:0x019f, B:93:0x01a2, B:68:0x0115, B:72:0x0122), top: B:135:0x00c2, inners: #7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v3, types: [j14, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [j14] */
    @Override // defpackage.r02
    public final k14 a(ev3 ev3Var) throws IOException {
        r21 hq1Var;
        ?? r13;
        IOException iOException;
        ?? J;
        boolean z = true;
        String str = null;
        switch (this.a) {
            case 0:
                bv3 bv3Var = ev3Var.a;
                synchronized (bv3Var) {
                    try {
                        if (!bv3Var.z) {
                            throw new IllegalStateException("released");
                        }
                        if (bv3Var.y) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (bv3Var.x) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                s21 s21Var = bv3Var.t;
                s21Var.getClass();
                cv3 cv3VarA = s21Var.a();
                o83 o83Var = bv3Var.n;
                cv3VarA.getClass();
                o83Var.getClass();
                int i = ev3Var.g;
                Socket socket = cv3VarA.f;
                socket.getClass();
                fw fwVar = cv3VarA.i;
                fwVar.getClass();
                ew ewVar = cv3VarA.j;
                ewVar.getClass();
                rq1 rq1Var = cv3VarA.l;
                if (rq1Var != null) {
                    hq1Var = new sq1(o83Var, cv3VarA, ev3Var, rq1Var);
                } else {
                    socket.setSoTimeout(i);
                    fu4 fu4VarTimeout = fwVar.timeout();
                    long j = i;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    fu4VarTimeout.g(j, timeUnit);
                    ewVar.timeout().g(ev3Var.h, timeUnit);
                    hq1Var = new hq1(o83Var, cv3VarA, fwVar, ewVar);
                }
                y10 y10Var = new y10(bv3Var, s21Var, hq1Var);
                bv3Var.w = y10Var;
                bv3Var.B = y10Var;
                synchronized (bv3Var) {
                    bv3Var.x = true;
                    bv3Var.y = true;
                }
                if (!bv3Var.A) {
                    return ev3.a(ev3Var, 0, y10Var, null, 61).b(ev3Var.e);
                }
                mj0.i("Canceled");
                return null;
            default:
                y10 y10Var2 = ev3Var.d;
                y10Var2.getClass();
                bv3 bv3Var2 = (bv3) y10Var2.d;
                r21 r21Var = (r21) y10Var2.f;
                oz3 oz3Var = ev3Var.e;
                tz3 tz3Var = oz3Var.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        r21Var.b(oz3Var);
                        ?? T = gb.T(oz3Var.b);
                        try {
                            if (T == 0 || tz3Var == null) {
                                bv3Var2.f(y10Var2, true, false, null);
                                T = 0;
                            } else {
                                if ("100-continue".equalsIgnoreCase(oz3Var.c.a("Expect"))) {
                                    try {
                                        r21Var.g();
                                        T = y10Var2.j(true);
                                    } catch (IOException e) {
                                        y10Var2.l(e);
                                        throw e;
                                    }
                                } else {
                                    T = 0;
                                }
                                if (T != 0) {
                                    bv3Var2.f(y10Var2, true, false, null);
                                    if (y10Var2.e().l == null) {
                                        z = false;
                                    }
                                    if (!z) {
                                        r21Var.h().a();
                                    }
                                } else if (tz3Var.isDuplex()) {
                                    try {
                                        r21Var.g();
                                        tz3Var.writeTo(new wu3(y10Var2.c(oz3Var, true)));
                                    } catch (IOException e2) {
                                        y10Var2.l(e2);
                                        throw e2;
                                    }
                                } else {
                                    wu3 wu3Var = new wu3(y10Var2.c(oz3Var, false));
                                    tz3Var.writeTo(wu3Var);
                                    wu3Var.close();
                                }
                            }
                            if (tz3Var == null || !tz3Var.isDuplex()) {
                                try {
                                    r21Var.c();
                                } catch (IOException e3) {
                                    y10Var2.l(e3);
                                    throw e3;
                                }
                            }
                            iOException = null;
                            J = T;
                        } catch (IOException e4) {
                            e = e4;
                            r13 = T;
                            if ((e instanceof ConnectionShutdownException) || !y10Var2.c) {
                                throw e;
                            }
                            iOException = e;
                        }
                    } catch (IOException e5) {
                        y10Var2.l(e5);
                        throw e5;
                    }
                } catch (IOException e6) {
                    e = e6;
                    r13 = 0;
                }
                if (J == 0) {
                    try {
                        J = r13;
                        J = y10Var2.j(false);
                        J.getClass();
                    } catch (IOException e7) {
                        if (iOException == null) {
                            throw e7;
                        }
                        j51.d(iOException, e7);
                        throw iOException;
                    }
                }
                J = r13;
                J.a = oz3Var;
                J.e = y10Var2.e().g;
                J.k = jCurrentTimeMillis;
                J.l = System.currentTimeMillis();
                k14 k14VarA = J.a();
                int i2 = k14VarA.q;
                if (i2 == 100 || (102 <= i2 && i2 < 200)) {
                    j14 j14VarJ = y10Var2.j(false);
                    j14VarJ.getClass();
                    j14VarJ.a = oz3Var;
                    j14VarJ.e = y10Var2.e().g;
                    j14VarJ.k = jCurrentTimeMillis;
                    j14VarJ.l = System.currentTimeMillis();
                    k14VarA = j14VarJ.a();
                    i2 = k14VarA.q;
                }
                j14 j14VarF = k14VarA.f();
                try {
                    String strA = k14VarA.s.a("Content-Type");
                    String str2 = strA == null ? null : strA;
                    long jD = r21Var.d(k14VarA);
                    j14VarF.g = new fv3(str2, jD, new xu3(new p21(y10Var2, r21Var.a(k14VarA), jD)), 0);
                    k14 k14VarA2 = j14VarF.a();
                    oz3 oz3Var2 = k14VarA2.n;
                    oz3Var2.getClass();
                    if ("close".equalsIgnoreCase(oz3Var2.c.a("Connection"))) {
                        r21Var.h().a();
                    } else {
                        String strA2 = k14VarA2.s.a("Connection");
                        if (strA2 != null) {
                            str = strA2;
                        }
                        if ("close".equalsIgnoreCase(str)) {
                            r21Var.h().a();
                        }
                    }
                    if ((i2 != 204 && i2 != 205) || k14VarA2.t.contentLength() <= 0) {
                        return k14VarA2;
                    }
                    throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + k14VarA2.t.contentLength());
                } catch (IOException e8) {
                    y10Var2.l(e8);
                    throw e8;
                }
        }
    }
}
