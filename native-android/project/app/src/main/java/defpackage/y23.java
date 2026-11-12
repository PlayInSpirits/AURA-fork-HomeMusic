package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y23 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public y23(boolean r1, boolean r2, int r3, boolean r4, boolean r5, int r6, int r7, int r8, int r9) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L30;
        if (r3 != null) goto L6;
        return false;
    L6:
        if ((r3 instanceof y23) == false) goto L40;
        y23 r4 = (y23) r3;
        boolean r0 = r4.a;
        if (this.a == r0) goto L11;
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
        if (this.g == r4.g) goto L23;
        return false;
    L23:
        if (this.h == r4.h) goto L25;
        return false;
    L25:
        if (this.i != r4.i) goto L39;
        return true;
    L39:
        return false;
    L40:
        return false;
    L30:
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(y23.class.getSimpleName());
        r0.append("(");
        if (this.a == false) goto L6;
        r0.append("launchSingleTop ");
    L6:
        if (this.b == false) goto L8;
        r0.append("restoreState ");
    L8:
        int r1 = this.i;
        int r2 = this.h;
        int r3 = this.g;
        int r5 = this.f;
        if (r5 != (-1)) goto L13;
        if (r3 != (-1)) goto L13;
        if (r2 != (-1)) goto L13;
        if (r1 != (-1)) goto L13;
    L15:
        return r0.toString();
    L13:
        r0.append("anim(enterAnim=0x");
        r0.append(Integer.toHexString(r5));
        r0.append(" exitAnim=0x");
        r0.append(Integer.toHexString(r3));
        r0.append(" popEnterAnim=0x");
        r0.append(Integer.toHexString(r2));
        r0.append(" popExitAnim=0x");
        r0.append(Integer.toHexString(r1));
        r0.append(")");
        goto L15
    }
}
