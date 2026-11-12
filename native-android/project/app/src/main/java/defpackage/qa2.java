package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qa2 {
    public final int a;

    public /* synthetic */ qa2(int r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof qa2) == false) goto L11;
        int r3 = ((qa2) r2).a;
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
        if (r1 != 1) goto L7;
        return "LineHeightStyle.Trim.FirstLineTop";
    L7:
        if (r1 != 16) goto L11;
        return "LineHeightStyle.Trim.LastLineBottom";
    L11:
        if (r1 != 17) goto L14;
        return "LineHeightStyle.Trim.Both";
    L14:
        if (r1 != 0) goto L17;
        return "LineHeightStyle.Trim.None";
    L17:
        return "Invalid";
    }
}
