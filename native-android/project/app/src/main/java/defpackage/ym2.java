package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ym2 {
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public final UUID a;
    public final Uri b;
    public final bx1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final yw1 g;
    public final byte[] h;

    static {
        String r0 = f35.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public ym2(xm2 r2) {
        if (r2.c == true) goto L5;
    L8:
        boolean r0 = true;
    L9:
        rr2.w(r0);
        UUID r1 = (UUID) r2.d;
        r1.getClass();
        this.a = r1;
        this.b = (Uri) r2.e;
        this.c = (bx1) r2.f;
        this.d = r2.a;
        this.f = r2.c;
        this.e = r2.b;
        this.g = (yw1) r2.g;
        byte[] r3 = (byte[]) r2.h;
        if (r3 == null) goto L12;
        byte[] r4 = Arrays.copyOf(r3, r3.length);
    L13:
        this.h = r4;
        return;
    L12:
        r4 = null;
        goto L13
    L5:
        if (((Uri) r2.e) != null) goto L8;
        r0 = false;
        goto L9
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ym2) == true) goto L8;
        return false;
    L8:
        ym2 r6 = (ym2) r5;
        if (this.a.equals(r6.a) == true) goto L11;
    L25:
        return false;
    L11:
        if (Objects.equals(this.b, r6.b) == false) goto L25;
        if (Objects.equals(this.c, r6.c) == false) goto L25;
        if (this.d != r6.d) goto L25;
        if (this.f != r6.f) goto L25;
        if (this.e != r6.e) goto L25;
        if (this.g.equals(r6.g) == false) goto L25;
        if (Arrays.equals(this.h, r6.h) == false) goto L25;
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        Uri r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = (r0 + r2) * 31;
        int r4 = (((((((this.c.hashCode() + r3) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        int r5 = (this.g.hashCode() + r4) * 31;
        return Arrays.hashCode(this.h) + r5;
    L5:
        r2 = 0;
        goto L6
    }
}
