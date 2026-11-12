package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public b30() {
        int r0 = 8;
        if (Integer.bitCount(8) == 1) goto L5;
        r0 = Integer.highestOneBit(7) << 1;
    L5:
        this.d = r0 - 1;
        this.c = new int[r0];
    }

    public void a(int r7) {
        int[] r0 = this.c;
        int r1 = this.b;
        r0[r1] = r7;
        int r8 = this.d & (r1 + 1);
        this.b = r8;
        int r2 = this.a;
        if (r8 != r2) goto L10;
        int r9 = r0.length;
        int r3 = r9 - r2;
        int r4 = r9 << 1;
        if (r4 < 0) goto L8;
        int[] r5 = new int[r4];
        ti.Y(0, r2, r9, r0, r5);
        ti.Y(r3, 0, this.a, this.c, r5);
        this.c = r5;
        this.a = 0;
        this.b = r9;
        this.d = r4 - 1;
        return;
    L8:
        tb4.e("Max array capacity exceeded");
        return;
    }

    public void b(int r6, int r7) {
        if (r6 < 0) goto L14;
        if (r7 < 0) goto L12;
        int r0 = this.d;
        int r1 = r0 * 2;
        int[] r2 = this.c;
        if (r2 != null) goto L8;
        int[] r3 = new int[4];
        this.c = r3;
        Arrays.fill(r3, -1);
    L10:
        int[] r4 = this.c;
        r4[r1] = r6;
        r4[r1 + 1] = r7;
        this.d++;
        return;
    L8:
        if (r1 < r2.length) goto L10;
        int[] r5 = new int[r0 * 4];
        this.c = r5;
        System.arraycopy(r2, 0, r5, 0, r2.length);
        goto L10
    L12:
        kf2.n("Pixel distance must be non-negative");
        return;
    L14:
        kf2.n("Layout positions must be non-negative");
    }

    public void c(RecyclerView r5, boolean r6) {
        this.d = 0;
        int[] r0 = this.c;
        if (r0 == null) goto L5;
        Arrays.fill(r0, -1);
    L5:
        mw3 r1 = r5.A;
        if (r5.z == null) goto L21;
        if (r1 != null) goto L9;
        return;
    L9:
        if (r1.i == false) goto L23;
        if (r6 == false) goto L15;
        if (r5.r.m() == true) goto L17;
        r1.i(r5.z.a(), this);
    L17:
        int r4 = this.d;
        if (r4 <= r1.j) goto L24;
        r1.j = r4;
        r1.k = r6;
        r5.p.m();
        return;
    L24:
        return;
    L15:
        if (r5.Q() == true) goto L17;
        r1.h(this.a, this.b, r5.u0, this);
        goto L17
    L23:
        return;
    }
}
