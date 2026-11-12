package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class te2 {
    public final /* synthetic */ int a;
    public int b;
    public long[] c;

    public te2(int r2) {
        this.a = 0;
        this.c = new long[r2];
    }

    public final void a(long r5) {
        switch(this.a) {
            case 0: goto L13;
            default: goto L5;
        };
    L13:
        int r0 = this.b;
        long[] r1 = this.c;
        if (r0 != r1.length) goto L16;
        this.c = Arrays.copyOf(r1, r0 * 2);
    L16:
        long[] r2 = this.c;
        int r3 = this.b;
        this.b = r3 + 1;
        r2[r3] = r5;
        return;
    L5:
        if (c(r5) == true) goto L18;
        int r4 = this.b;
        long[] r6 = this.c;
        if (r4 < r6.length) goto L9;
        r6 = Arrays.copyOf(r6, Math.max(r4 + 1, r6.length * 2));
        this.c = r6;
    L9:
        r6[r4] = r5;
        if (r4 < this.b) goto L19;
        this.b = r4 + 1;
        return;
    L19:
        return;
    }

    public void b(long[] r6) {
        int r0 = this.b + r6.length;
        long[] r1 = this.c;
        if (r0 <= r1.length) goto L5;
        this.c = Arrays.copyOf(r1, Math.max(r1.length * 2, r0));
    L5:
        System.arraycopy(r6, 0, this.c, this.b, r6.length);
        this.b = r0;
    }

    public boolean c(long r7) {
        int r0 = this.b;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (this.c[r2] == r7) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public long d(int r4) {
        if (r4 >= 0) goto L4;
    L7:
        StringBuilder r5 = f34.j(r4, "Invalid index ", ", size is ");
        r5.append(this.b);
        throw new IndexOutOfBoundsException(r5.toString());
    L4:
        if (r4 >= this.b) goto L7;
        return this.c[r4];
    }

    public void e(long r6) {
        int r0 = this.b;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        if (r6 == this.c[r1]) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        int r7 = this.b - 1;
    L7:
        if (r1 >= r7) goto L9;
        long[] r8 = this.c;
        int r2 = r1 + 1;
        r8[r1] = r8[r2];
        r1 = r2;
        goto L7
    L9:
        this.b--;
        return;
    }

    public /* synthetic */ te2() {
        this.a = 1;
    }
}
