package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qv2 {
    public final pv2[] a;
    public final long b;

    public qv2(List list) {
        this((pv2[]) list.toArray(new pv2[0]));
    }

    public final qv2 a(pv2... pv2VarArr) {
        if (pv2VarArr.length == 0) {
            return this;
        }
        String str = f35.a;
        pv2[] pv2VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(pv2VarArr2, pv2VarArr2.length + pv2VarArr.length);
        System.arraycopy(pv2VarArr, 0, copyOf, pv2VarArr2.length, pv2VarArr.length);
        return new qv2(this.b, (pv2[]) copyOf);
    }

    public final qv2 b(qv2 qv2Var) {
        return qv2Var == null ? this : a(qv2Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qv2.class == obj.getClass()) {
            qv2 qv2Var = (qv2) obj;
            if (Arrays.equals(this.a, qv2Var.a) && this.b == qv2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return si0.z(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public qv2(long j, pv2... pv2VarArr) {
        this.b = j;
        this.a = pv2VarArr;
    }

    public qv2(pv2... pv2VarArr) {
        this(-9223372036854775807L, pv2VarArr);
    }
}
