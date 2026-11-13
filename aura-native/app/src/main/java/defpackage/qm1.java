package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qm1 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public qm1(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        rr2.w(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm1)) {
            return false;
        }
        qm1 qm1Var = (qm1) obj;
        return this.b == qm1Var.b && Double.compare(this.c, qm1Var.c) == 0 && Objects.equals(this.a, qm1Var.a) && Objects.equals(this.d, qm1Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public qm1(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}
