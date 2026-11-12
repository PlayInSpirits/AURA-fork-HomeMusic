package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pi3 {
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public final Object a;
    public final int b;
    public final gn2 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String r0 = f35.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public pi3(Object r4, int r5, gn2 r6, Object r7, int r8, long r9, long r11, int r13, int r14) {
        boolean r0 = false;
        if (r5 < 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.l(r2);
        if (r8 < 0) goto L9;
        r0 = true;
    L9:
        rr2.l(r0);
        this.a = r4;
        this.b = r5;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        this.g = r11;
        this.h = r13;
        this.i = r14;
        return;
    L5:
        r2 = false;
        goto L6
    }

    public static pi3 c(Bundle r14) {
        int r4 = Math.max(0, r14.getInt(j, 0));
        Bundle r0 = r14.getBundle(k);
        if (r0 != null) goto L6;
        gn2 r1 = null;
    L5:
        gn2 r5 = r1;
        return new pi3(null, r4, r5, null, Math.max(0, r14.getInt(l, 0)), r14.getLong(m, 0), r14.getLong(n, 0), r14.getInt(o, -1), r14.getInt(p, -1));
    L6:
        r1 = gn2.b(r0);
        goto L5
    }

    public final boolean a(pi3 r5) {
        if (this.b == r5.b) goto L5;
        return false;
    L5:
        if (this.e == r5.e) goto L7;
        return false;
    L7:
        if (this.f == r5.f) goto L9;
        return false;
    L9:
        if (this.g == r5.g) goto L11;
        return false;
    L11:
        if (this.h == r5.h) goto L13;
        return false;
    L13:
        if (this.i == r5.i) goto L15;
        return false;
    L15:
        if (Objects.equals(this.c, r5.c) == false) goto L25;
        return true;
    L25:
        return false;
    }

    public final pi3 b(boolean r15, boolean r16) {
        if (r15 == false) goto L5;
        if (r16 == false) goto L5;
        return this;
    L5:
        int r1 = 0;
        if (r16 == false) goto L8;
        int r2 = this.b;
    L9:
        if (r15 == false) goto L11;
        gn2 r3 = this.c;
    L12:
        if (r16 == false) goto L14;
        r1 = this.e;
    L14:
        int r5 = r1;
        long r6 = 0;
        if (r15 == false) goto L17;
        long r8 = this.f;
    L18:
        if (r15 == false) goto L20;
        r6 = this.g;
    L20:
        int r4 = -1;
        if (r15 == false) goto L23;
        int r10 = this.h;
    L24:
        if (r15 == false) goto L27;
        r4 = this.i;
    L27:
        return new pi3(this.a, r2, r3, this.d, r5, r8, r6, r10, r4);
    L23:
        r10 = -1;
        goto L24
    L17:
        r8 = 0;
        goto L18
    L11:
        r3 = null;
        goto L12
    L8:
        r2 = 0;
        goto L9
    }

    public final Bundle d(int r8) {
        Bundle r0 = new Bundle();
        int r1 = this.b;
        if (r8 < 3) goto L5;
        if (r1 != 0) goto L5;
    L6:
        gn2 r2 = this.c;
        if (r2 == null) goto L9;
        Bundle r3 = r2.c(false);
        r0.putBundle(k, r3);
    L9:
        int r4 = this.e;
        if (r8 < 3) goto L12;
        if (r4 != 0) goto L12;
    L13:
        long r5 = this.f;
        if (r8 >= 3) goto L16;
    L17:
        r0.putLong(m, r5);
    L18:
        long r6 = this.g;
        if (r8 >= 3) goto L21;
    L22:
        r0.putLong(n, r6);
    L23:
        int r7 = this.h;
        if (r7 == (-1)) goto L26;
        r0.putInt(o, r7);
    L26:
        int r9 = this.i;
        if (r9 == (-1)) goto L29;
        r0.putInt(p, r9);
    L29:
        return r0;
    L21:
        if (r6 == 0) goto L23;
    L16:
        if (r5 == 0) goto L18;
    L12:
        r0.putInt(l, r4);
    L5:
        r0.putInt(j, r1);
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (pi3.class != r5.getClass()) goto L17;
        pi3 r6 = (pi3) r5;
        if (a(r6) == false) goto L17;
        if (Objects.equals(this.a, r6.a) == false) goto L17;
        if (Objects.equals(this.d, r6.d) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        Integer r2 = Integer.valueOf(this.b);
        Integer r5 = Integer.valueOf(this.e);
        Long r6 = Long.valueOf(this.f);
        Long r7 = Long.valueOf(this.g);
        Integer r8 = Integer.valueOf(this.h);
        Integer r9 = Integer.valueOf(this.i);
        return Objects.hash(new Object[]{this.a, r2, this.c, this.d, r5, r6, r7, r8, r9});
    }

    public final String toString() {
        String r0 = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int r2 = this.h;
        if (r2 != (-1)) goto L5;
        return r0;
    L5:
        StringBuilder r1 = b11.s(r0, ", contentPos=");
        r1.append(this.g);
        r1.append(", adGroup=");
        r1.append(r2);
        r1.append(", ad=");
        r1.append(this.i);
        return r1.toString();
    }
}
