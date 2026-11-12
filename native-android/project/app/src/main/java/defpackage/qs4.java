package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qs4 {
    public static final qs4 c = null;
    public static final qs4 d = null;
    public final int a;
    public final boolean b;

    static {
        c = new qs4(2, false);
        d = new qs4(1, true);
    }

    public qs4(int r1, boolean r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof qs4) == true) goto L8;
        return false;
    L8:
        qs4 r6 = (qs4) r5;
        int r1 = r6.a;
        if (this.a == r1) goto L11;
        return false;
    L11:
        if (this.b == r6.b) goto L13;
        return false;
    L13:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.a) * 31;
        return Boolean.hashCode(this.b) + r0;
    }

    public final String toString() {
        if (equals(c) == false) goto L7;
        return "TextMotion.Static";
    L7:
        if (equals(d) == false) goto L10;
        return "TextMotion.Animated";
    L10:
        return "Invalid";
    }
}
