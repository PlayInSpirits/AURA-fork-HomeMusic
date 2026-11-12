package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hp0 {
    public static final hp0 e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        e = new x20(0).b();
        String r0 = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public hp0(x20 r2) {
        this.a = r2.a;
        this.b = r2.b;
        this.c = r2.c;
        this.d = (String) r2.d;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof hp0) == true) goto L8;
        return false;
    L8:
        hp0 r6 = (hp0) r5;
        if (this.a == r6.a) goto L11;
    L17:
        return false;
    L11:
        if (this.b != r6.b) goto L17;
        if (this.c != r6.c) goto L17;
        if (Objects.equals(this.d, r6.d) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String r2 = this.d;
        if (r2 != null) goto L5;
        int r3 = 0;
    L7:
        return r0 + r3;
    L5:
        r3 = r2.hashCode();
        goto L7
    }
}
