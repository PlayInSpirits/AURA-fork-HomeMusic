package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m71 {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final boolean[] g;
    public int h;

    public m71() {
        this.g = new boolean[15];
    }

    public final boolean a() {
        if (this.d > 15) goto L5;
        return false;
    L5:
        if (this.h != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void b(long r11) {
        long r0 = this.d;
        if (r0 != 0) goto L6;
        this.a = r11;
    L16:
        this.d++;
        this.c = r11;
        return;
    L6:
        if (r0 != 1) goto L8;
        long r1 = r11 - this.a;
        this.b = r1;
        this.f = r1;
        this.e = 1;
        goto L16
    L8:
        long r5 = r11 - this.c;
        int r2 = (int) (r0 % 15);
        long r3 = Math.abs(r5 - this.b);
        boolean[] r4 = this.g;
        if (r3 > 1000000) goto L14;
        this.e++;
        this.f += r5;
        if (r4[r2] == false) goto L16;
        r4[r2] = false;
        this.h--;
        goto L16
    L14:
        if (r4[r2] == true) goto L16;
        r4[r2] = true;
        this.h++;
        goto L16
    }

    public final void c() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.h = 0;
        Arrays.fill(this.g, false);
    }
}
