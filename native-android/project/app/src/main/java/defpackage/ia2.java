package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia2 extends x65 {
    public final i03 b;

    public ia2() {
        i03 i03Var = f02.a;
        this.b = new i03();
    }

    @Override // defpackage.x65
    public final void b() {
        i03 i03Var = this.b;
        int[] iArr = i03Var.b;
        Object[] objArr = i03Var.c;
        long[] jArr = i03Var.a;
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
                        int i5 = iArr[i4];
                        q03 q03Var = (q03) objArr[i4];
                        Object[] objArr2 = q03Var.a;
                        int i6 = q03Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ha2 ha2Var = (ha2) objArr2[i7];
                            ez ezVar = ha2Var.d;
                            if (ezVar != null) {
                                ezVar.cancel();
                            }
                            ha2Var.d = null;
                            wf2 wf2Var = (wf2) ha2Var.a.o;
                            wf2Var.o = true;
                            wf2Var.n = false;
                            wf2Var.a();
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
}
