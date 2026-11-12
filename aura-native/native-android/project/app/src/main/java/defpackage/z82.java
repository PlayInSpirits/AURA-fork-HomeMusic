package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z82 implements x44, u44 {
    public final y44 n;
    public final w44 o;
    public final x03 p;

    public z82(x44 x44Var, Map map, w44 w44Var) {
        x xVar = new x(23, x44Var);
        wl4 wl4Var = z44.a;
        this.n = new y44(map, xVar);
        this.o = w44Var;
        x03 x03Var = w54.a;
        this.p = new x03();
    }

    @Override // defpackage.x44
    public final c12 a(String str, gf1 gf1Var) {
        return this.n.a(str, gf1Var);
    }

    @Override // defpackage.x44
    public final boolean b(Object obj) {
        return this.n.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000d->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[EDGE_INSN: B:21:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000d->B:17:0x004e], SYNTHETIC] */
    @Override // defpackage.x44
    public final Map c() {
        x03 x03Var = this.p;
        Object[] objArr = x03Var.b;
        long[] jArr = x03Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            w44 w44Var = this.o;
                            if (w44Var.o.j(obj) == null) {
                                w44Var.n.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.n.c();
    }

    @Override // defpackage.x44
    public final Object d(String str) {
        return this.n.d(str);
    }

    @Override // defpackage.u44
    public final void e(Object obj, r70 r70Var, rg1 rg1Var, int i) {
        int i2;
        rg1Var.S(-858296452);
        if ((i & 6) == 0) {
            i2 = (rg1Var.g(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rg1Var.g(r70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rg1Var.g(this) ? 256 : 128;
        }
        if (rg1Var.K(i2 & 1, (i2 & 147) != 146)) {
            this.o.e(obj, r70Var, rg1Var, i2 & 126);
            boolean zG = rg1Var.g(this) | rg1Var.g(obj);
            Object objH = rg1Var.H();
            if (zG || objH == j80.a) {
                objH = new o(15, this, obj);
                rg1Var.b0(objH);
            }
            bu.b(obj, (if1) objH, rg1Var);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new o70(this, obj, r70Var, i, 2);
        }
    }
}
