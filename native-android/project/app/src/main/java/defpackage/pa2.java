package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 {
    public final int a;

    public /* synthetic */ pa2(int r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof pa2) == false) goto L11;
        int r3 = ((pa2) r2).a;
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
        int r1 = this.a;
        if (r1 != 0) goto L7;
        return "LineHeightStyle.Mode.Fixed";
    L7:
        if (r1 != 1) goto L11;
        return "LineHeightStyle.Mode.Minimum";
    L11:
        if (r1 != 2) goto L14;
        return "LineHeightStyle.Mode.Tight";
    L14:
        return "Invalid";
    }
}
