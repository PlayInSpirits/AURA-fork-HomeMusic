package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sr4 {
    public static final sr4 b = null;
    public static final sr4 c = null;
    public final int a;

    static {
        b = new sr4(0);
        c = new sr4(1);
    }

    public sr4(int r1) {
        this.a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof sr4) == true) goto L8;
        return false;
    L8:
        int r5 = ((sr4) r4).a;
        if (this.a == r5) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int r3 = this.a;
        if (r3 != 0) goto L6;
        return "TextDecoration.None";
    L6:
        ArrayList r0 = new ArrayList();
        if ((r3 & 1) == 0) goto L10;
        r0.add("Underline");
    L10:
        if ((r3 & 2) == 0) goto L13;
        r0.add("LineThrough");
    L13:
        if (r0.size() != 1) goto L17;
        return "TextDecoration." + r0.get(0);
    L17:
        return xa3.h("TextDecoration[", gc2.a(r0, ", ", null, 62), "]");
    }
}
