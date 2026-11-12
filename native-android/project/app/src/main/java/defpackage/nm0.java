package defpackage;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nm0 {
    public static final di0 h = new di0(2);
    public static final Random i = new Random();
    public ho2 d;
    public String f;
    public final bu4 a = new bu4();
    public final zt4 b = new zt4();
    public final HashMap c = new HashMap();
    public cu4 e = cu4.a;
    public long g = -1;

    public final void a(mm0 mm0Var) {
        long j = mm0Var.c;
        if (j != -1 && mm0Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final mm0 b(int i2, mt2 mt2Var) {
        long j;
        long j2;
        long j3;
        HashMap map = this.c;
        mm0 mm0Var = null;
        long j4 = Long.MAX_VALUE;
        for (mm0 mm0Var2 : map.values()) {
            long j5 = mm0Var2.c;
            mt2 mt2Var2 = mm0Var2.d;
            if (j5 == -1 && i2 == mm0Var2.b && mt2Var != null) {
                long j6 = mt2Var.d;
                nm0 nm0Var = mm0Var2.g;
                j = -1;
                mm0 mm0Var3 = (mm0) nm0Var.c.get(nm0Var.f);
                if (mm0Var3 != null) {
                    j3 = mm0Var3.c;
                    if (j3 == -1) {
                        j3 = nm0Var.g + 1;
                    }
                } else {
                    j3 = nm0Var.g + 1;
                }
                if (j6 >= j3) {
                    mm0Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (mt2Var != null) {
                long j7 = mt2Var.d;
                if (j7 != j) {
                    if (mt2Var2 == null) {
                        if (!mt2Var.b() && j7 == mm0Var2.c) {
                            j2 = mm0Var2.c;
                            if (j2 != j || j2 < j4) {
                                mm0Var = mm0Var2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = f35.a;
                                if (mm0Var.d != null && mt2Var2 != null) {
                                    mm0Var = mm0Var2;
                                }
                            }
                        }
                    } else if (j7 == mt2Var2.d && mt2Var.b == mt2Var2.b && mt2Var.c == mt2Var2.c) {
                        j2 = mm0Var2.c;
                        if (j2 != j) {
                        }
                        mm0Var = mm0Var2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == mm0Var2.b) {
                j2 = mm0Var2.c;
                if (j2 != j) {
                }
                mm0Var = mm0Var2;
                j4 = j2;
            }
        }
        if (mm0Var != null) {
            return mm0Var;
        }
        String str2 = (String) h.get();
        mm0 mm0Var4 = new mm0(this, str2, i2, mt2Var);
        map.put(str2, mm0Var4);
        return mm0Var4;
    }

    public final synchronized String c(cu4 cu4Var, mt2 mt2Var) {
        return b(cu4Var.g(mt2Var.a, this.b).c, mt2Var).a;
    }

    public final void d(q9 q9Var) {
        mt2 mt2Var;
        cu4 cu4Var = q9Var.b;
        int i2 = q9Var.c;
        mt2 mt2Var2 = q9Var.d;
        boolean zP = cu4Var.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                mm0 mm0Var = (mm0) map.get(str);
                mm0Var.getClass();
                a(mm0Var);
                return;
            }
            return;
        }
        mm0 mm0Var2 = (mm0) map.get(str);
        this.f = b(i2, mt2Var2).a;
        e(q9Var);
        if (mt2Var2 != null) {
            long j = mt2Var2.d;
            if (mt2Var2.b()) {
                if (mm0Var2 != null && mm0Var2.c == j && (mt2Var = mm0Var2.d) != null && mt2Var.b == mt2Var2.b && mt2Var.c == mt2Var2.c) {
                    return;
                }
                b(i2, new mt2(j, mt2Var2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b7, B:44:0x00bb, B:45:0x00c2, B:47:0x00cc, B:49:0x00d0, B:51:0x00dd, B:54:0x00e4), top: B:59:0x0001 }] */
    public final synchronized void e(q9 q9Var) {
        long j;
        this.d.getClass();
        if (q9Var.b.p()) {
            return;
        }
        mt2 mt2Var = q9Var.d;
        if (mt2Var != null) {
            long j2 = mt2Var.d;
            if (j2 != -1) {
                mm0 mm0Var = (mm0) this.c.get(this.f);
                if (mm0Var != null) {
                    j = mm0Var.c;
                    if (j == -1) {
                        j = this.g + 1;
                    }
                } else {
                    j = this.g + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            mm0 mm0Var2 = (mm0) this.c.get(this.f);
            if (mm0Var2 != null && mm0Var2.c == -1 && mm0Var2.b != q9Var.c) {
                return;
            }
        }
        mm0 mm0VarB = b(q9Var.c, q9Var.d);
        if (this.f == null) {
            this.f = mm0VarB.a;
        }
        mt2 mt2Var2 = q9Var.d;
        if (mt2Var2 != null && mt2Var2.b()) {
            mt2 mt2Var3 = q9Var.d;
            mm0 mm0VarB2 = b(q9Var.c, new mt2(mt2Var3.a, mt2Var3.d, mt2Var3.b));
            if (!mm0VarB2.e) {
                mm0VarB2.e = true;
                q9Var.b.g(q9Var.d.a, this.b);
                Math.max(0L, f35.i0(this.b.d(q9Var.d.b)) + f35.i0(this.b.e));
                this.d.getClass();
            }
        }
        if (!mm0VarB.e) {
            mm0VarB.e = true;
            this.d.getClass();
        }
        if (mm0VarB.a.equals(this.f) && !mm0VarB.f) {
            mm0VarB.f = true;
            ho2 ho2Var = this.d;
            String str = mm0VarB.a;
            ho2Var.getClass();
            mt2 mt2Var4 = q9Var.d;
            if (mt2Var4 == null || !mt2Var4.b()) {
                ho2Var.b();
                ho2Var.j = str;
                ho2Var.k = hd0.j().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.2");
                ho2Var.c(q9Var.b, q9Var.d);
            }
        }
    }
}
