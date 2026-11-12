package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sc2 {
    public final Object a;
    public xk0 b;
    public boolean c;
    public boolean d;

    public sc2(Object r2) {
        this.a = r2;
        this.b = new xk0(2);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (sc2.class != r3.getClass()) goto L13;
        Object r4 = ((sc2) r3).a;
        return this.a.equals(r4);
    L13:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
