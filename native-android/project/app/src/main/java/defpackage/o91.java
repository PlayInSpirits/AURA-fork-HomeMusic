package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o91 {
    public final int a;

    public /* synthetic */ o91(int r1) {
        this.a = r1;
    }

    public static String a(int r1) {
        if (r1 != 1) goto L7;
        return "Next";
    L7:
        if (r1 != 2) goto L11;
        return "Previous";
    L11:
        if (r1 != 3) goto L15;
        return "Left";
    L15:
        if (r1 != 4) goto L19;
        return "Right";
    L19:
        if (r1 != 5) goto L23;
        return "Up";
    L23:
        if (r1 != 6) goto L27;
        return "Down";
    L27:
        if (r1 != 7) goto L31;
        return "Enter";
    L31:
        if (r1 != 8) goto L34;
        return "Exit";
    L34:
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof o91) == false) goto L11;
        int r3 = ((o91) r2).a;
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
