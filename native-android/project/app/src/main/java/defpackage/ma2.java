package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 {
    public static final int b = 66305;
    public final int a;

    public /* synthetic */ ma2(int r1) {
        this.a = r1;
    }

    public static String a(int r6) {
        int r0 = r6 & 255;
        String r2 = "Invalid";
        if (r0 != 1) goto L5;
        String r1 = "Strategy.Simple";
    L12:
        int r5 = (r6 >> 8) & 255;
        if (r5 != 1) goto L15;
        String r3 = "Strictness.None";
    L25:
        int r7 = (r6 >> 16) & 255;
        if (r7 != 1) goto L28;
        r2 = "WordBreak.None";
    L33:
        return b11.q(b11.u("LineBreak(strategy=", r1, ", strictness=", r3, ", wordBreak="), r2, ")");
    L28:
        if (r7 != 2) goto L30;
        r2 = "WordBreak.Phrase";
        goto L33
    L30:
        if (r7 != 0) goto L33;
        r2 = "WordBreak.Unspecified";
        goto L33
    L15:
        if (r5 != 2) goto L17;
        r3 = "Strictness.Loose";
        goto L25
    L17:
        if (r5 != 3) goto L20;
        r3 = "Strictness.Normal";
        goto L25
    L20:
        if (r5 != 4) goto L22;
        r3 = "Strictness.Strict";
        goto L25
    L22:
        if (r5 != 0) goto L24;
        r3 = "Strictness.Unspecified";
        goto L25
    L24:
        r3 = "Invalid";
        goto L25
    L5:
        if (r0 != 2) goto L7;
        r1 = "Strategy.HighQuality";
        goto L12
    L7:
        if (r0 != 3) goto L9;
        r1 = "Strategy.Balanced";
        goto L12
    L9:
        if (r0 != 0) goto L11;
        r1 = "Strategy.Unspecified";
        goto L12
    L11:
        r1 = "Invalid";
        goto L12
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ma2) == false) goto L11;
        int r3 = ((ma2) r2).a;
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
