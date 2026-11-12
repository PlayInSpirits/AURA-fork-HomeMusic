package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 {
    public static final float b = 0.0f;
    public static final float c = 0.0f;
    public static final float d = 0.0f;
    public final float a;

    static {
        a(0.0f);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }

    public /* synthetic */ oa2(float r1) {
        this.a = r1;
    }

    public static void a(float r1) {
        if (0.0f > r1) goto L8;
        if (r1 > 1.0f) goto L8;
        return;
    L8:
        if (r1 != (-1.0f)) goto L10;
        return;
    L10:
        dz1.b("topRatio should be in [0..1] range or -1");
    }

    public static String b(float r2) {
        if (r2 != 0.0f) goto L7;
        return "LineHeightStyle.Alignment.Top";
    L7:
        if (r2 != b) goto L11;
        return "LineHeightStyle.Alignment.Center";
    L11:
        if (r2 != c) goto L15;
        return "LineHeightStyle.Alignment.Proportional";
    L15:
        if (r2 != d) goto L19;
        return "LineHeightStyle.Alignment.Bottom";
    L19:
        return "LineHeightStyle.Alignment(topPercentage = " + r2 + ")";
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof oa2) == false) goto L11;
        float r3 = ((oa2) r2).a;
        if (Float.compare(this.a, r3) == 0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
