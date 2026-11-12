package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z13 {
    public final h33 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public z13(h33 r3, boolean r4, Object r5, boolean r6) {
        if (r3.a == true) goto L8;
        if (r4 == false) goto L8;
        kf2.e(r3.b().concat(" does not allow nullable values"));
        throw null;
    L8:
        if (r4 == true) goto L14;
        if (r6 == false) goto L14;
        if (r5 != null) goto L14;
        nz2.k(r3.b(), " has null value but is not nullable.", "Argument with type ");
        throw null;
    L14:
        this.a = r3;
        this.b = r4;
        this.d = r5;
        this.c = r6;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L26;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (z13.class.equals(r3.getClass()) == false) goto L28;
        z13 r4 = (z13) r3;
        if (this.b == r4.b) goto L12;
        return false;
    L12:
        if (this.c == r4.c) goto L15;
        return false;
    L15:
        if (this.a.equals(r4.a) == false) goto L31;
        Object r5 = r4.d;
        Object r2 = this.d;
        if (r2 != null) goto L20;
        if (r5 != null) goto L27;
        return true;
    L27:
        return false;
    L20:
        return r2.equals(r5);
    L31:
        return false;
    L28:
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r0 = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object r2 = this.d;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return r0 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(z13.class.getSimpleName());
        r0.append(" Type: " + this.a);
        r0.append(" Nullable: " + this.b);
        if (this.c == false) goto L6;
        r0.append(" DefaultValue: " + this.d);
    L6:
        return r0.toString();
    }
}
