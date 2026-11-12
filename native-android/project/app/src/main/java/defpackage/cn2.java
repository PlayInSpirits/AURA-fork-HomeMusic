package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cn2 {
    public static final cn2 d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        d = new cn2(new yc5());
        String r0 = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public cn2(yc5 r2) {
        this.a = (Uri) r2.n;
        this.b = (String) r2.o;
        this.c = (Bundle) r2.p;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof cn2) == true) goto L8;
        return false;
    L8:
        cn2 r6 = (cn2) r5;
        if (Objects.equals(this.a, r6.a) == true) goto L11;
    L22:
        return false;
    L11:
        if (Objects.equals(this.b, r6.b) == false) goto L22;
        if (this.c != null) goto L15;
        boolean r4 = true;
    L17:
        if (r6.c != null) goto L19;
        boolean r7 = true;
    L20:
        if (r4 != r7) goto L22;
        return true;
    L19:
        r7 = false;
        goto L20
    L15:
        r4 = false;
        goto L17
    }

    public final int hashCode() {
        int r0 = 0;
        Uri r1 = this.a;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        String r4 = this.b;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        if (this.c == null) goto L15;
        r0 = 1;
    L15:
        return r6 + r0;
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r1.hashCode();
        goto L6
    }
}
