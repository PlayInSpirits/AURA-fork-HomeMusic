package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class em {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final il g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public em(dm r2) {
        this.a = r2.a;
        this.b = r2.b;
        this.c = r2.c;
        this.d = r2.d;
        this.e = r2.e;
        this.f = r2.f;
        this.g = r2.g;
        this.h = r2.h;
        this.i = r2.i;
        this.j = r2.j;
        this.k = r2.k;
    }

    public final dm a() {
        dm r0 = new dm();
        r0.a = this.a;
        r0.b = this.b;
        r0.c = this.c;
        r0.d = this.d;
        r0.e = this.e;
        r0.f = this.f;
        r0.g = this.g;
        r0.h = this.h;
        r0.i = this.i;
        r0.j = this.j;
        r0.k = this.k;
        return r0;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L34;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (em.class != r3.getClass()) goto L46;
        em r4 = (em) r3;
        if (this.a == r4.a) goto L11;
        return false;
    L11:
        if (this.b == r4.b) goto L13;
        return false;
    L13:
        if (this.c == r4.c) goto L15;
        return false;
    L15:
        if (this.d == r4.d) goto L17;
        return false;
    L17:
        if (this.e == r4.e) goto L19;
        return false;
    L19:
        if (this.f == r4.f) goto L21;
        return false;
    L21:
        if (this.h == r4.h) goto L23;
        return false;
    L23:
        if (this.i == r4.i) goto L25;
        return false;
    L25:
        if (this.j == r4.j) goto L27;
        return false;
    L27:
        if (this.k == r4.k) goto L29;
        return false;
    L29:
        if (this.g.equals(r4.g) == false) goto L45;
        return true;
    L45:
        return false;
    L46:
        return false;
    L34:
        return true;
    }

    public final int hashCode() {
        Integer r1 = Integer.valueOf(this.a);
        Integer r2 = Integer.valueOf(this.b);
        Integer r3 = Integer.valueOf(this.c);
        Boolean r4 = Boolean.valueOf(this.d);
        Boolean r5 = Boolean.valueOf(this.e);
        Integer r6 = Integer.valueOf(this.f);
        Integer r8 = Integer.valueOf(this.h);
        Integer r9 = Integer.valueOf(this.i);
        Boolean r10 = Boolean.valueOf(this.k);
        Boolean r11 = Boolean.valueOf(this.j);
        return Objects.hash(new Object[]{r1, r2, r3, r4, r5, r6, this.g, r8, r9, r10, r11});
    }
}
