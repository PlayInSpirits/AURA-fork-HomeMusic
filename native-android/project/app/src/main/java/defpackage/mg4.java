package defpackage;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mg4 {
    public final long a;
    public final long b;
    public final int c;

    public mg4(int r2, long r3, long r5) {
        if (r3 >= r5) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        this.a = r3;
        this.b = r5;
        this.c = r2;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L17:
        return false;
    L8:
        if (mg4.class != r7.getClass()) goto L17;
        mg4 r8 = (mg4) r7;
        if (this.a != r8.a) goto L17;
        if (this.b != r8.b) goto L17;
        if (this.c != r8.c) goto L17;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        String r0 = f35.a;
        Locale r1 = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }
}
