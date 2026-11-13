package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l10 extends nv1 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final nv1[] g;

    public l10(String str, int i, int i2, long j, long j2, nv1[] nv1VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = nv1VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l10.class != obj.getClass()) {
            return false;
        }
        l10 l10Var = (l10) obj;
        return this.c == l10Var.c && this.d == l10Var.d && this.e == l10Var.e && this.f == l10Var.f && this.b.equals(l10Var.b) && Arrays.equals(this.g, l10Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
