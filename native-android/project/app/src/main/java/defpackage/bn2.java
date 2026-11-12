package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bn2 {
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public final Uri a;
    public final String b;
    public final ym2 c;
    public final sm2 d;
    public final List e;
    public final String f;
    public final yw1 g;
    public final long h;

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

    public bn2(Uri r1, String r2, ym2 r3, sm2 r4, List r5, String r6, yw1 r7, long r8) {
        this.a = r1;
        this.b = lw2.m(r2);
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        uw1 r9 = yw1.j();
        int r10 = 0;
    L4:
        if (r10 >= r7.size()) goto L6;
        fn2 r11 = (fn2) r7.get(r10);
        en2 r12 = new en2();
        r12.a = r11.a;
        r12.b = r11.b;
        r12.c = r11.c;
        r12.d = r11.d;
        r12.e = r11.e;
        r12.f = r11.f;
        r12.g = r11.g;
        r9.c(new dn2(r12));
        r10 = r10 + 1;
        goto L4
    L6:
        r9.f();
        this.h = r8;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof bn2) == false) goto L35;
        bn2 r4 = (bn2) r3;
        if (this.a.equals(r4.a) == true) goto L10;
        return false;
    L10:
        if (Objects.equals(this.b, r4.b) == true) goto L12;
        return false;
    L12:
        if (Objects.equals(this.c, r4.c) == true) goto L14;
        return false;
    L14:
        if (Objects.equals(this.d, r4.d) == true) goto L16;
        return false;
    L16:
        if (this.e.equals(r4.e) == true) goto L18;
        return false;
    L18:
        if (Objects.equals(this.f, r4.f) == true) goto L20;
        return false;
    L20:
        if (this.g.equals(r4.g) == true) goto L22;
        return false;
    L22:
        if (this.h != r4.h) goto L34;
        return true;
    L34:
        return false;
    L35:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = 0;
        String r2 = this.b;
        if (r2 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        ym2 r5 = this.c;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r4 + r6) * 31;
        sm2 r8 = this.d;
        if (r8 != null) goto L13;
        int r9 = 0;
    L14:
        int r10 = (this.e.hashCode() + ((r7 + r9) * 31)) * 31;
        String r11 = this.f;
        if (r11 == null) goto L19;
        r1 = r11.hashCode();
    L19:
        return (int) ((((long) ((this.g.hashCode() + ((r10 + r1) * 31)) * 31)) * 31) + this.h);
    L13:
        r9 = r8.hashCode();
        goto L14
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r3 = r2.hashCode();
        goto L6
    }
}
