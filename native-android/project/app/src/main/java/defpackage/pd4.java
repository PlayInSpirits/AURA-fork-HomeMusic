package defpackage;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pd4 {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public pd4(int[] r3, Random r4) {
        this.b = r3;
        this.a = r4;
        this.c = new int[r3.length];
        int r5 = 0;
    L4:
        if (r5 >= r3.length) goto L6;
        this.c[r3[r5]] = r5;
        r5 = r5 + 1;
        goto L4
    }

    public final pd4 a(int r9, int r10) {
        int[] r0 = new int[r10];
        int[] r1 = new int[r10];
        int r2 = 0;
        int r3 = 0;
    L3:
        int[] r4 = this.b;
        Random r5 = this.a;
        if (r3 >= r10) goto L6;
        r0[r3] = r5.nextInt(r4.length + 1);
        int r6 = r3 + 1;
        int r7 = r5.nextInt(r6);
        r1[r3] = r1[r7];
        r1[r7] = r3 + r9;
        r3 = r6;
        goto L3
    L6:
        Arrays.sort(r0);
        int[] r8 = new int[r4.length + r10];
        int r11 = 0;
        int r12 = 0;
    L8:
        if (r2 >= (r4.length + r10)) goto L19;
        if (r11 < r10) goto L11;
    L13:
        int r13 = r12 + 1;
        int r14 = r4[r12];
        r8[r2] = r14;
        if (r14 < r9) goto L16;
        r8[r2] = r14 + r10;
    L16:
        r12 = r13;
    L17:
        r2 = r2 + 1;
        goto L8
    L11:
        if (r12 != r0[r11]) goto L13;
        r8[r2] = r1[r11];
        r11 = r11 + 1;
        goto L17
    L19:
        return new pd4(r8, new Random(r5.nextLong()));
    }

    public pd4(int[] r2, long r3) {
        this(Arrays.copyOf(r2, r2.length), new Random(r3));
    }

    public pd4() {
        this(new Random());
    }

    public pd4(Random r2) {
        this(new int[0], r2);
    }
}
