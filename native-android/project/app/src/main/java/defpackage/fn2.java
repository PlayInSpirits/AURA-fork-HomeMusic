package defpackage;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fn2 {
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String r0 = f35.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public fn2(en2 r2) {
        this.a = r2.a;
        this.b = r2.b;
        this.c = r2.c;
        this.d = r2.d;
        this.e = r2.e;
        this.f = r2.f;
        this.g = r2.g;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof fn2) == true) goto L8;
        return false;
    L8:
        fn2 r6 = (fn2) r5;
        if (this.a.equals(r6.a) == true) goto L11;
    L23:
        return false;
    L11:
        if (Objects.equals(this.b, r6.b) == false) goto L23;
        if (Objects.equals(this.c, r6.c) == false) goto L23;
        if (this.d != r6.d) goto L23;
        if (this.e != r6.e) goto L23;
        if (Objects.equals(this.f, r6.f) == false) goto L23;
        if (Objects.equals(this.g, r6.g) == false) goto L23;
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = 0;
        String r2 = this.b;
        if (r2 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        String r5 = this.c;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (((((r4 + r6) * 31) + this.d) * 31) + this.e) * 31;
        String r8 = this.f;
        if (r8 != null) goto L13;
        int r9 = 0;
    L14:
        int r10 = (r7 + r9) * 31;
        String r11 = this.g;
        if (r11 == null) goto L19;
        r1 = r11.hashCode();
    L19:
        return r10 + r1;
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
