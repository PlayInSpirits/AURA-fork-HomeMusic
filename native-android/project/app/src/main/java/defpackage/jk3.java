package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jk3 {
    public static final jk3 c = null;
    public static final String d = null;
    public static final String e = null;
    public final boolean a;
    public final boolean b;

    static {
        c = new jk3(false, false);
        String r0 = f35.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public jk3(boolean r1, boolean r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof jk3) == true) goto L8;
        return false;
    L8:
        jk3 r6 = (jk3) r5;
        if (this.a == r6.a) goto L11;
    L13:
        return false;
    L11:
        if (this.b != r6.b) goto L13;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }
}
