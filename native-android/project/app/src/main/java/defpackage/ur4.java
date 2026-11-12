package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ur4 {
    public final int a;

    public /* synthetic */ ur4(int r1) {
        this.a = r1;
    }

    public static String a(int r1) {
        if (r1 != 1) goto L7;
        return "Ltr";
    L7:
        if (r1 != 2) goto L11;
        return "Rtl";
    L11:
        if (r1 != 3) goto L15;
        return "Content";
    L15:
        if (r1 != 4) goto L19;
        return "ContentOrLtr";
    L19:
        if (r1 != 5) goto L22;
        return "ContentOrRtl";
    L22:
        if (r1 != 0) goto L25;
        return "Unspecified";
    L25:
        return "Invalid";
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ur4) == false) goto L11;
        int r3 = ((ur4) r2).a;
        if (this.a == r3) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
