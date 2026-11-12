package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qv2 {
    public final pv2[] a;
    public final long b;

    public qv2(List r2) {
        this((pv2[]) r2.toArray(new pv2[0]));
    }

    public final qv2 a(pv2... r6) {
        if (r6.length != 0) goto L5;
        return this;
    L5:
        String r1 = f35.a;
        pv2[] r2 = this.a;
        Object[] r3 = Arrays.copyOf(r2, r2.length + r6.length);
        System.arraycopy(r6, 0, r3, r2.length, r6.length);
        long r5 = this.b;
        return new qv2(r5, (pv2[]) r3);
    }

    public final qv2 b(qv2 r1) {
        if (r1 != null) goto L5;
        return this;
    L5:
        return a(r1.a);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (qv2.class != r5.getClass()) goto L15;
        qv2 r6 = (qv2) r5;
        if (Arrays.equals(this.a, r6.a) == false) goto L15;
        if (this.b != r6.b) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = Arrays.hashCode(this.a) * 31;
        return si0.z(this.b) + r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("entries=");
        r0.append(Arrays.toString(this.a));
        long r3 = this.b;
        if (r3 != (-9223372036854775807L)) goto L5;
        String r5 = "";
    L6:
        r0.append(r5);
        return r0.toString();
    L5:
        r5 = ", presentationTimeUs=" + r3;
        goto L6
    }

    public qv2(long r1, pv2... r3) {
        this.b = r1;
        this.a = r3;
    }

    public qv2(pv2... r3) {
        this(-9223372036854775807L, r3);
    }
}
