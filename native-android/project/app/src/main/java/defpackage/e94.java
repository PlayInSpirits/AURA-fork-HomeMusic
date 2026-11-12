package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e94 implements q94, Iterable, x32 {
    public final w03 n;
    public fg2 o;
    public boolean p;
    public boolean q;

    public e94() {
        long[] jArr = v54.a;
        this.n = new w03();
    }

    @Override // defpackage.q94
    public final void a(p94 p94Var, Object obj) {
        boolean z = obj instanceof w2;
        w03 w03Var = this.n;
        if (z && w03Var.c(p94Var)) {
            Object objG = w03Var.g(p94Var);
            objG.getClass();
            w2 w2Var = (w2) objG;
            w2 w2Var2 = (w2) obj;
            String str = w2Var2.a;
            if (str == null) {
                str = w2Var.a;
            }
            sf1 sf1Var = w2Var2.b;
            if (sf1Var == null) {
                sf1Var = w2Var.b;
            }
            w03Var.l(p94Var, new w2(str, sf1Var));
        } else {
            w03Var.l(p94Var, obj);
        }
        p94Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final e94 b() {
        e94 e94Var = new e94();
        e94Var.p = this.p;
        e94Var.q = this.q;
        w03 w03Var = e94Var.n;
        w03Var.getClass();
        w03 w03Var2 = this.n;
        w03Var2.getClass();
        Object[] objArr = w03Var2.b;
        Object[] objArr2 = w03Var2.c;
        long[] jArr = w03Var2.a;
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
                            int i4 = (i << 3) + i3;
                            w03Var.l(objArr[i4], objArr2[i4]);
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
        return e94Var;
    }

    public final Object d(p94 p94Var) {
        Object objG = this.n.g(p94Var);
        if (objG != null) {
            return objG;
        }
        nz2.w(p94Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void e(e94 e94Var) {
        w03 w03Var = e94Var.n;
        Object[] objArr = w03Var.b;
        Object[] objArr2 = w03Var.c;
        long[] jArr = w03Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        p94 p94Var = (p94) obj;
                        w03 w03Var2 = this.n;
                        Object objG = w03Var2.g(p94Var);
                        p94Var.getClass();
                        Object objInvoke = p94Var.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            w03Var2.l(p94Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e94)) {
            return false;
        }
        e94 e94Var = (e94) obj;
        return h12.c(this.n, e94Var.n) && this.p == e94Var.p && this.q == e94Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + xa3.c(this.n.hashCode() * 31, 31, this.p);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        fg2 fg2Var = this.o;
        if (fg2Var == null) {
            w03 w03Var = this.n;
            w03Var.getClass();
            fg2 fg2Var2 = new fg2(w03Var);
            this.o = fg2Var2;
            fg2Var = fg2Var2;
        }
        return ((r11) fg2Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.p) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.q) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        w03 w03Var = this.n;
        Object[] objArr = w03Var.b;
        Object[] objArr2 = w03Var.c;
        long[] jArr = w03Var.a;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((p94) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return xl.L(this) + "{ " + ((Object) sb) + " }";
    }
}
