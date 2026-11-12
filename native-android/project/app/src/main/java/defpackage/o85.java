package defpackage;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o85 {
    public final int[] a;
    public boolean b;
    public boolean c;
    public int[] d;
    public int e;
    public int f;
    public Rect g;
    public int h;
    public int i;

    public o85() {
        this.a = new int[4];
        this.h = -1;
        this.i = -1;
    }

    public static int a(int[] r1, int r2) {
        if (r2 < 0) goto L8;
        if (r2 >= r1.length) goto L8;
        return r1[r2];
    L8:
        return r1[0];
    }

    public static int c(int r1, int r2) {
        return (r1 & 16777215) | ((r2 * 17) << 24);
    }

    public final void b(h00 r10, boolean r11, Rect r12, int[] r13) {
        int r0 = r12.width();
        int r14 = r12.height();
        int r15 = !r11 ? 1 : 0;
        int r2 = r15 * r0;
    L3:
        int r4 = 0;
    L4:
        int r6 = 1;
        int r5 = 0;
    L6:
        if (r5 >= r6) goto L13;
        if (r6 > 64) goto L13;
        if (r10.b() < 4) goto L11;
        r5 = (r5 << 4) | r10.i(4);
        r6 = r6 << 2;
        goto L6
    L11:
        int r7 = -1;
        int r8 = 0;
    L17:
        int r9 = Math.min(r8, r0 - r4);
        if (r9 <= 0) goto L20;
        int r16 = r2 + r9;
        Arrays.fill(r13, r2, r16, this.a[r7]);
        r4 = r4 + r9;
        r2 = r16;
    L20:
        if (r4 < r0) goto L4;
        r15 = r15 + 2;
        if (r15 >= r14) goto L23;
        r2 = r15 * r0;
        r10.c();
        goto L3
    L23:
        return;
    L13:
        r7 = r5 & 3;
        if (r5 >= 4) goto L16;
        r8 = r0;
        goto L17
    L16:
        r8 = r5 >> 2;
        goto L17
    }
}
