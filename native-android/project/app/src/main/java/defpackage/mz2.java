package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mz2 {
    public final w03 a;

    public /* synthetic */ mz2(w03 w03Var) {
        this.a = w03Var;
    }

    public static final Object a(w03 w03Var) {
        Object objG = w03Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof q03)) {
            w03Var.j(null);
            return objG;
        }
        q03 q03Var = (q03) objG;
        if (q03Var.h()) {
            kf2.m("List is empty.");
            return null;
        }
        int i = q03Var.b - 1;
        Object objF = q03Var.f(i);
        q03Var.k(i);
        objF.getClass();
        if (q03Var.h()) {
            w03Var.j(null);
        }
        if (q03Var.b == 1) {
            w03Var.l(null, q03Var.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final q03 b(w03 w03Var) {
        if (w03Var.i()) {
            q03 q03Var = t73.b;
            q03Var.getClass();
            return q03Var;
        }
        q03 q03Var2 = new q03();
        Object[] objArr = w03Var.c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof q03) {
                                q03Var2.b((q03) obj);
                            } else {
                                obj.getClass();
                                q03Var2.a(obj);
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
        return q03Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mz2) {
            return this.a.equals(((mz2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
