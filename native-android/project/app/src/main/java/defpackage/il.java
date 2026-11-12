package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class il {
    public static final il i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public AudioAttributes h;

    static {
        i = new il(0, 0, 1, 1, 0, false, true);
        String r0 = f35.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public il(int r1, int r2, int r3, int r4, int r5, boolean r6, boolean r7) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
    }

    public static il a(Bundle r11) {
        String r0 = j;
        boolean r2 = false;
        if (r11.containsKey(r0) == false) goto L5;
        int r4 = r11.getInt(r0);
    L6:
        String r1 = k;
        if (r11.containsKey(r1) == false) goto L9;
        int r5 = r11.getInt(r1);
    L10:
        String r3 = l;
        boolean r6 = true;
        if (r11.containsKey(r3) == false) goto L13;
        int r7 = r11.getInt(r3);
    L14:
        String r8 = m;
        if (r11.containsKey(r8) == false) goto L17;
        int r9 = r11.getInt(r8);
    L18:
        String r10 = n;
        if (r11.containsKey(r10) == false) goto L21;
        int r12 = r11.getInt(r10);
    L22:
        String r13 = o;
        if (r11.containsKey(r13) == false) goto L25;
        r2 = r11.getBoolean(r13);
    L25:
        boolean r14 = r2;
        String r15 = p;
        if (r11.containsKey(r15) == false) goto L29;
        r6 = r11.getBoolean(r15);
    L29:
        return new il(r4, r5, r7, r9, r12, r14, r6);
    L21:
        r12 = 0;
        goto L22
    L17:
        r9 = 1;
        goto L18
    L13:
        r7 = 1;
        goto L14
    L9:
        r5 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    public static il b(AudioAttributes r8) {
        int r1 = r8.getContentType();
        int r2 = r8.getFlags();
        int r3 = r8.getUsage();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L5;
        int r4 = z9.a(r8);
        boolean r7 = z9.v(r8);
    L7:
        if (r0 < 32) goto L9;
        int r5 = m3.a(r8);
        boolean r6 = m3.j(r8);
        int r9 = r5;
    L11:
        return new il(r1, r2, r3, r4, r9, r6, r7);
    L9:
        r9 = 0;
        r6 = false;
        goto L11
    L5:
        r4 = 1;
        r7 = true;
        goto L7
    }

    public final AudioAttributes c() {
        if (this.h != null) goto L12;
        AudioAttributes.Builder r0 = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 29) goto L8;
        z9.k(r0, this.d);
        z9.l(r0, this.g);
    L8:
        if (r1 < 32) goto L10;
        m3.f(r0, this.e);
        m3.g(r0, this.f);
    L10:
        this.h = r0.build();
    L12:
        return this.h;
    }

    public final Bundle d() {
        Bundle r0 = new Bundle();
        int r1 = this.a;
        if (r1 == 0) goto L5;
        r0.putInt(j, r1);
    L5:
        int r2 = this.b;
        if (r2 == 0) goto L8;
        r0.putInt(k, r2);
    L8:
        int r3 = this.c;
        if (r3 == 1) goto L11;
        r0.putInt(l, r3);
    L11:
        int r4 = this.d;
        if (r4 == 1) goto L14;
        r0.putInt(m, r4);
    L14:
        int r5 = this.e;
        if (r5 == 0) goto L17;
        r0.putInt(n, r5);
    L17:
        boolean r6 = this.f;
        if (r6 == false) goto L20;
        r0.putBoolean(o, r6);
    L20:
        boolean r7 = this.g;
        if (r7 == true) goto L23;
        r0.putBoolean(p, r7);
    L23:
        return r0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L25:
        return false;
    L8:
        if (il.class != r5.getClass()) goto L25;
        il r6 = (il) r5;
        if (this.a != r6.a) goto L25;
        if (this.b != r6.b) goto L25;
        if (this.c != r6.c) goto L25;
        if (this.d != r6.d) goto L25;
        if (this.e != r6.e) goto L25;
        if (this.f != r6.f) goto L25;
        if (this.g != r6.g) goto L25;
        return true;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
