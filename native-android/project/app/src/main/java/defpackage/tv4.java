package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv4 {
    public static final tv4 d = null;
    public static final String e = null;
    public final int a;
    public final gy3 b;
    public int c;

    static {
        d = new tv4(new sv4[0]);
        String r0 = f35.a;
        e = Integer.toString(0, 36);
    }

    public tv4(sv4... r6) {
        gy3 r0 = yw1.l(r6);
        this.b = r0;
        this.a = r6.length;
        int r5 = 0;
    L4:
        if (r5 >= r0.q) goto L13;
        int r7 = r5 + 1;
        int r1 = r7;
    L7:
        if (r1 >= r0.q) goto L12;
        if (((sv4) r0.get(r5)).equals(r0.get(r1)) == false) goto L11;
        l93.G("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
    L11:
        r1 = r1 + 1;
        goto L7
    L12:
        r5 = r7;
        goto L4
    }

    public final sv4 a(int r1) {
        return (sv4) this.b.get(r1);
    }

    public final int b(sv4 r1) {
        int r0 = this.b.indexOf(r1);
        if (r0 < 0) goto L5;
        return r0;
    L5:
        return -1;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L16;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (tv4.class != r3.getClass()) goto L19;
        tv4 r4 = (tv4) r3;
        if (this.a == r4.a) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == false) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        if (this.c != 0) goto L6;
        this.c = this.b.hashCode();
    L6:
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
