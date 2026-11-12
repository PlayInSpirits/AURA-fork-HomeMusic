package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends ar4 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(String str, gf1 gf1Var) {
        super(str);
        this.e = 2;
        this.f = gf1Var;
    }

    @Override // defpackage.ar4
    public final long a() {
        int i = 0;
        long j = -1;
        switch (this.e) {
            case 0:
                jr0 jr0Var = (jr0) this.f;
                synchronized (jr0Var) {
                    if (jr0Var.z && !jr0Var.A) {
                        try {
                            jr0Var.M();
                        } catch (IOException unused) {
                            jr0Var.B = true;
                        }
                        try {
                            if (jr0Var.s()) {
                                jr0Var.J();
                                jr0Var.w = 0;
                            }
                        } catch (IOException unused2) {
                            jr0Var.C = true;
                            wu3 wu3Var = jr0Var.u;
                            if (wu3Var != null) {
                                xe5.b(wu3Var);
                            }
                            jr0Var.u = new wu3(new ct());
                        }
                        break;
                    }
                }
                return -1L;
            case 1:
                dv3 dv3Var = (dv3) this.f;
                long jNanoTime = System.nanoTime();
                Map map = dv3Var.c;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    throw xa3.d(it);
                }
                Iterator it2 = dv3Var.f.iterator();
                while (it2.hasNext()) {
                    if (map.get(((cv3) it2.next()).d.a) != null) {
                        kf2.k();
                        return 0L;
                    }
                }
                long j2 = (jNanoTime - dv3Var.b) + 1;
                cv3 cv3Var = null;
                cv3 cv3Var2 = null;
                long j3 = Long.MAX_VALUE;
                long j4 = j2;
                cv3 cv3Var3 = null;
                int i2 = 0;
                for (cv3 cv3Var4 : dv3Var.f) {
                    long j5 = j;
                    cv3Var4.getClass();
                    synchronized (cv3Var4) {
                        if (dv3Var.a(cv3Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j6 = cv3Var4.t;
                            if (j6 < j4) {
                                cv3Var3 = cv3Var4;
                                j4 = j6;
                            }
                            if (map.get(cv3Var4.d.a) != null) {
                                throw new ClassCastException();
                            }
                            i++;
                            if (j6 < j3) {
                                cv3Var2 = cv3Var4;
                                j3 = j6;
                            }
                        }
                    }
                    j = j5;
                }
                long j7 = j;
                if (cv3Var3 != null) {
                    cv3Var = cv3Var3;
                } else if (i > 5) {
                    j4 = j3;
                    cv3Var = cv3Var2;
                } else {
                    j4 = j7;
                }
                if (cv3Var == null) {
                    if (cv3Var2 != null) {
                        return (j3 + dv3Var.b) - jNanoTime;
                    }
                    return i2 > 0 ? dv3Var.b : j7;
                }
                synchronized (cv3Var) {
                    if (cv3Var.s.isEmpty() && cv3Var.t == j4) {
                        cv3Var.m = true;
                        dv3Var.f.remove(cv3Var);
                        if (map.get(cv3Var.d.a) == null) {
                            Socket socket = cv3Var.f;
                            socket.getClass();
                            ze5.c(socket);
                            if (dv3Var.f.isEmpty()) {
                                dv3Var.d.a();
                            }
                        } else {
                            kf2.k();
                        }
                    }
                }
                return 0L;
            default:
                ((gf1) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr0(Object obj, String str, int i) {
        super(str);
        this.e = i;
        this.f = obj;
    }
}
