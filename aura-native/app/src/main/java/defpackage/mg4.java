package defpackage;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mg4 {
    public final long a;
    public final long b;
    public final int c;

    public mg4(int i, long j, long j2) {
        rr2.l(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mg4.class == obj.getClass()) {
            mg4 mg4Var = (mg4) obj;
            if (this.a == mg4Var.a && this.b == mg4Var.b && this.c == mg4Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = f35.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }
}
