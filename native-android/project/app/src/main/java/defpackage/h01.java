package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h01 {
    public final int a;

    public /* synthetic */ h01(int r1) {
        this.a = r1;
    }

    public static String a(int r2) {
        if (r2 != 0) goto L6;
        return "EmojiSupportMatch.Default";
    L6:
        if (r2 != 1) goto L10;
        return "EmojiSupportMatch.None";
    L10:
        if (r2 != 2) goto L14;
        return "EmojiSupportMatch.All";
    L14:
        return b11.j(r2, "Invalid(value=", ")");
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof h01) == false) goto L11;
        int r3 = ((h01) r2).a;
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
