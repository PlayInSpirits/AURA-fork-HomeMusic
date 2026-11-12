package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final ho g;

    public qy3(long j, long j2, long j3, long j4, long j5, float[] fArr, ho hoVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = hoVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && qy3.class == obj.getClass()) {
            qy3 qy3Var = (qy3) obj;
            if (this.a == qy3Var.a && this.b == qy3Var.b && this.e == qy3Var.e && g02.a(this.c, qy3Var.c) && g02.a(this.d, qy3Var.d)) {
                float[] fArr = qy3Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.g == qy3Var.g;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = xa3.b(xa3.b(xa3.b(xa3.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iB + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
