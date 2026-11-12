package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj4 extends zz1 {
    public final be3 n = new be3();
    public final h00 o = new h00();
    public iu4 p;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // defpackage.zz1
    public final qv2 k(uv2 uv2Var, ByteBuffer byteBuffer) {
        pv2 wj4Var;
        long j;
        long j2;
        be3 be3Var = this.n;
        h00 h00Var = this.o;
        iu4 iu4Var = this.p;
        if (iu4Var != null) {
            long j3 = uv2Var.x;
            synchronized (iu4Var) {
                j2 = iu4Var.b;
            }
            if (j3 != j2) {
                iu4 iu4Var2 = new iu4(uv2Var.t);
                this.p = iu4Var2;
                iu4Var2.a(uv2Var.t - uv2Var.x);
            }
        } else {
            iu4 iu4Var3 = new iu4(uv2Var.t);
            this.p = iu4Var3;
            iu4Var3.a(uv2Var.t - uv2Var.x);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        be3Var.L(iLimit, bArrArray);
        h00Var.o(iLimit, bArrArray);
        h00Var.t(39);
        long jI = (((long) h00Var.i(1)) << 32) | ((long) h00Var.i(32));
        h00Var.t(20);
        int i = h00Var.i(12);
        int i2 = h00Var.i(8);
        be3Var.O(14);
        if (i2 == 0) {
            wj4Var = new wj4();
        } else if (i2 == 255) {
            long jC = be3Var.C();
            int i3 = i - 4;
            be3Var.k(new byte[i3], 0, i3);
            wj4Var = new iq3(0, jC, jI);
        } else if (i2 == 4) {
            int iA = be3Var.A();
            ArrayList arrayList = new ArrayList(iA);
            for (int i4 = 0; i4 < iA; i4++) {
                be3Var.C();
                boolean z = (be3Var.A() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iA2 = be3Var.A();
                    boolean z2 = (iA2 & 64) != 0;
                    boolean z3 = (iA2 & 32) != 0;
                    if (z2) {
                        be3Var.C();
                    }
                    if (!z2) {
                        int iA3 = be3Var.A();
                        ArrayList arrayList3 = new ArrayList(iA3);
                        for (int i5 = 0; i5 < iA3; i5++) {
                            be3Var.A();
                            be3Var.C();
                            arrayList3.add(new xi4(4));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        be3Var.A();
                        be3Var.C();
                    }
                    be3Var.H();
                    be3Var.A();
                    be3Var.A();
                }
                xi4 xi4Var = new xi4(5);
                Collections.unmodifiableList(arrayList2);
                arrayList.add(xi4Var);
            }
            wj4Var = new wj4();
            Collections.unmodifiableList(arrayList);
        } else if (i2 == 5) {
            iu4 iu4Var4 = this.p;
            be3Var.C();
            boolean z4 = (be3Var.A() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iA4 = be3Var.A();
                boolean z5 = (iA4 & 64) != 0;
                boolean z6 = (iA4 & 32) != 0;
                boolean z7 = (iA4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : iq3.d(jI, be3Var);
                if (!z5) {
                    int iA5 = be3Var.A();
                    ArrayList arrayList4 = new ArrayList(iA5);
                    for (int i6 = 0; i6 < iA5; i6++) {
                        be3Var.A();
                        iu4Var4.b(!z7 ? iq3.d(jI, be3Var) : -9223372036854775807L);
                        arrayList4.add(new xi4(3));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    be3Var.A();
                    be3Var.C();
                }
                be3Var.H();
                be3Var.A();
                be3Var.A();
                j = jD;
            }
            wj4Var = new iq3(j, iu4Var4.b(j), list);
        } else if (i2 != 6) {
            wj4Var = null;
        } else {
            iu4 iu4Var5 = this.p;
            long jD2 = iq3.d(jI, be3Var);
            wj4Var = new iq3(2, jD2, iu4Var5.b(jD2));
        }
        return wj4Var == null ? new qv2(new pv2[0]) : new qv2(wj4Var);
    }
}
