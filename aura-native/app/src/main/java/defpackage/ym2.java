package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ym2 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final bx1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final yw1 g;
    public final byte[] h;

    static {
        String str = f35.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public ym2(xm2 xm2Var) {
        rr2.w((xm2Var.c && ((Uri) xm2Var.e) == null) ? false : true);
        UUID uuid = (UUID) xm2Var.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) xm2Var.e;
        this.c = (bx1) xm2Var.f;
        this.d = xm2Var.a;
        this.f = xm2Var.c;
        this.e = xm2Var.b;
        this.g = (yw1) xm2Var.g;
        byte[] bArr = (byte[]) xm2Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym2)) {
            return false;
        }
        ym2 ym2Var = (ym2) obj;
        return this.a.equals(ym2Var.a) && Objects.equals(this.b, ym2Var.b) && Objects.equals(this.c, ym2Var.c) && this.d == ym2Var.d && this.f == ym2Var.f && this.e == ym2Var.e && this.g.equals(ym2Var.g) && Arrays.equals(this.h, ym2Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
