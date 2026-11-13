package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m10 extends nv1 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final nv1[] f;

    public m10(String str, boolean z, boolean z2, String[] strArr, nv1[] nv1VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = nv1VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m10.class != obj.getClass()) {
            return false;
        }
        m10 m10Var = (m10) obj;
        return this.c == m10Var.c && this.d == m10Var.d && this.b.equals(m10Var.b) && Arrays.equals(this.e, m10Var.e) && Arrays.equals(this.f, m10Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
