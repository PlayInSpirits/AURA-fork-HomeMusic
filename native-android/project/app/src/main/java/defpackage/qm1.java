package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public qm1(int r3, String r4, String r5) {
        boolean r0 = true;
        if (r3 == 1) goto L5;
    L10:
        rr2.w(r0);
        this.a = r4;
        this.b = r3;
        this.d = r5;
        this.c = 0.0d;
        return;
    L5:
        if (r5.startsWith("0x") == true) goto L10;
        if (r5.startsWith("0X") == true) goto L10;
        r0 = false;
        goto L10
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof qm1) == false) goto L23;
        qm1 r6 = (qm1) r5;
        if (this.b == r6.b) goto L10;
        return false;
    L10:
        if (Double.compare(this.c, r6.c) == 0) goto L12;
        return false;
    L12:
        if (Objects.equals(this.a, r6.a) == true) goto L14;
        return false;
    L14:
        if (Objects.equals(this.d, r6.d) == false) goto L22;
        return true;
    L22:
        return false;
    L23:
        return false;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.b);
        Double r1 = Double.valueOf(this.c);
        String r2 = this.d;
        return Objects.hash(new Object[]{this.a, r0, r1, r2});
    }

    public qm1(String r1, double r2) {
        this.a = r1;
        this.b = 2;
        this.c = r2;
        this.d = null;
    }
}
