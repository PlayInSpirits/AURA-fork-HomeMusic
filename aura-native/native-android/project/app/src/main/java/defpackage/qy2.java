package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy2 implements m84 {
    public final long a;
    public final ry2[] b;
    public final int c;

    public qy2(long j, ry2[] ry2VarArr, int i) {
        this.a = j;
        this.b = ry2VarArr;
        this.c = i;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[SYNTHETIC] */
    @Override // defpackage.m84
    public final l84 e(long j) {
        long j2;
        long j3;
        long jMin;
        long j4;
        int i;
        long jMin2;
        xv4 xv4Var;
        long[] jArr;
        int iA;
        int iA2;
        int iB;
        ry2[] ry2VarArr = this.b;
        int length = ry2VarArr.length;
        o84 o84Var = o84.c;
        if (length == 0) {
            return new l84(o84Var, o84Var);
        }
        int i2 = this.c;
        if (i2 != -1) {
            xv4 xv4Var2 = ry2VarArr[i2].b;
            int iA3 = xv4Var2.a(j);
            if (iA3 == -1) {
                iA3 = xv4Var2.b(j);
            }
            long[] jArr2 = xv4Var2.c;
            long[] jArr3 = xv4Var2.f;
            if (iA3 == -1) {
                return new l84(o84Var, o84Var);
            }
            j3 = jArr3[iA3];
            j2 = jArr2[iA3];
            if (j3 < j && iA3 < xv4Var2.b - 1 && (iB = xv4Var2.b(j)) != -1 && iB != iA3) {
                j4 = jArr3[iB];
                jMin = jArr2[iB];
            }
            jMin2 = j2;
            for (i = 0; i < ry2VarArr.length; i++) {
                if (i != i2) {
                    xv4Var = ry2VarArr[i].b;
                    jArr = xv4Var.c;
                    iA = xv4Var.a(j3);
                    if (iA == -1) {
                        iA = xv4Var.b(j3);
                    }
                    if (iA != -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j4 == -9223372036854775807L) {
                        iA2 = xv4Var.a(j4);
                        if (iA2 == -1) {
                            iA2 = xv4Var.b(j4);
                        }
                        if (iA2 == -1) {
                            jMin = Math.min(jArr[iA2], jMin);
                        }
                    }
                }
            }
            o84 o84Var2 = new o84(j3, jMin2);
            return j4 == -9223372036854775807L ? new l84(o84Var2, o84Var2) : new l84(o84Var2, new o84(j4, jMin));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        jMin = -1;
        j4 = -9223372036854775807L;
        jMin2 = j2;
        while (i < ry2VarArr.length) {
            if (i != i2) {
                xv4Var = ry2VarArr[i].b;
                jArr = xv4Var.c;
                iA = xv4Var.a(j3);
                if (iA == -1) {
                    iA = xv4Var.b(j3);
                }
                if (iA != -1) {
                    jMin2 = Math.min(jArr[iA], jMin2);
                }
                if (j4 == -9223372036854775807L) {
                    iA2 = xv4Var.a(j4);
                    if (iA2 == -1) {
                        iA2 = xv4Var.b(j4);
                    }
                    if (iA2 == -1) {
                        jMin = Math.min(jArr[iA2], jMin);
                    }
                }
            }
        }
        o84 o84Var3 = new o84(j3, jMin2);
        if (j4 == -9223372036854775807L) {
        }
    }

    @Override // defpackage.m84
    public final long g() {
        return this.a;
    }
}
