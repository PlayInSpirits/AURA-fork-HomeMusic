package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class li2 implements m84 {
    public final t20 a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public li2(SparseArray r13, long r14, int r16, long r17, long r19) {
        this.b = r13;
        this.c = r14;
        this.d = r16;
        List r15 = (List) r13.get(r16);
        if (r15 != null) goto L5;
    L22:
        t20 r18 = null;
    L23:
        this.a = r18;
        return;
    L5:
        if (r15.isEmpty() == true) goto L22;
        int r2 = r15.size();
        int[] r3 = new int[r2];
        long[] r4 = new long[r2];
        long[] r5 = new long[r2];
        long[] r6 = new long[r2];
        int r7 = 0;
        int r8 = 0;
    L8:
        if (r8 >= r2) goto L10;
        ki2 r9 = (ki2) r15.get(r8);
        r6[r8] = r9.n;
        r4[r8] = r9.o;
        r8 = r8 + 1;
    L10:
        int r110 = r2 - 1;
        if (r7 >= r110) goto L13;
        int r111 = r7 + 1;
        r3[r7] = (int) (r4[r111] - r4[r7]);
        r5[r7] = r6[r111] - r6[r7];
        r7 = r111;
        goto L10
    L13:
        int r10 = r110;
    L14:
        if (r10 <= 0) goto L18;
        if (r6[r10] < r14) goto L18;
        r10 = r10 - 1;
    L18:
        r3[r10] = (int) ((r17 + r19) - r4[r10]);
        r5[r10] = r14 - r6[r10];
        if (r10 >= r110) goto L21;
        l93.q0("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
        int r11 = r10 + 1;
        r3 = Arrays.copyOf(r3, r11);
        r4 = Arrays.copyOf(r4, r11);
        r5 = Arrays.copyOf(r5, r11);
        r6 = Arrays.copyOf(r6, r11);
    L21:
        r18 = new t20(r3, r4, r5, r6);
        goto L23
    }

    @Override // defpackage.m84
    public final boolean b() {
        int r0 = this.d;
        List r1 = (List) this.b.get(r0);
        if (r1 != null) goto L5;
        return false;
    L5:
        if (r1.isEmpty() == true) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.m84
    public final l84 e(long r1) {
        t20 r0 = this.a;
        if (r0 != null) goto L5;
        o84 r2 = o84.c;
        return new l84(r2, r2);
    L5:
        return r0.e(r1);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
