package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 {
    public final long a;
    public final cu4 b;
    public final int c;
    public final mt2 d;
    public final long e;
    public final cu4 f;
    public final int g;
    public final mt2 h;
    public final long i;
    public final long j;

    public q9(long r1, cu4 r3, int r4, mt2 r5, long r6, cu4 r8, int r9, mt2 r10, long r11, long r13) {
        this.a = r1;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r8;
        this.g = r9;
        this.h = r10;
        this.i = r11;
        this.j = r13;
    }

    public final boolean equals(Object r5) {
        if (this == r5) goto L32;
        if (r5 != null) goto L6;
        return false;
    L6:
        if (q9.class != r5.getClass()) goto L43;
        q9 r6 = (q9) r5;
        if (this.a == r6.a) goto L11;
        return false;
    L11:
        if (this.c == r6.c) goto L13;
        return false;
    L13:
        if (this.e == r6.e) goto L15;
        return false;
    L15:
        if (this.g == r6.g) goto L17;
        return false;
    L17:
        if (this.i == r6.i) goto L19;
        return false;
    L19:
        if (this.j == r6.j) goto L21;
        return false;
    L21:
        if (this.b.equals(r6.b) == true) goto L23;
        return false;
    L23:
        if (Objects.equals(this.d, r6.d) == true) goto L25;
        return false;
    L25:
        if (Objects.equals(this.f, r6.f) == true) goto L27;
        return false;
    L27:
        if (Objects.equals(this.h, r6.h) == false) goto L42;
        return true;
    L42:
        return false;
    L43:
        return false;
    L32:
        return true;
    }

    public final int hashCode() {
        Long r2 = Long.valueOf(this.a);
        Integer r4 = Integer.valueOf(this.c);
        Long r6 = Long.valueOf(this.e);
        Integer r8 = Integer.valueOf(this.g);
        Long r10 = Long.valueOf(this.i);
        Long r11 = Long.valueOf(this.j);
        return Objects.hash(new Object[]{r2, this.b, r4, this.d, r6, this.f, r8, this.h, r10, r11});
    }
}
