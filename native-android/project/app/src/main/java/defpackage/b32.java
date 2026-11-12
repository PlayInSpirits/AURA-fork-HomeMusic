package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b32 {
    public final Integer a;
    public final Object b;

    public b32(Integer r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof b32) == false) goto L16;
        b32 r4 = (b32) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (h12.c(this.b, r4.b) == true) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        Object r2 = this.b;
        if ((r2 instanceof Enum) == false) goto L5;
        int r3 = ((Enum) r2).ordinal();
    L9:
        return r3 + r0;
    L5:
        if (r2 == null) goto L7;
        r3 = r2.hashCode();
        goto L9
    L7:
        r3 = 0;
        goto L9
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ")";
    }
}
