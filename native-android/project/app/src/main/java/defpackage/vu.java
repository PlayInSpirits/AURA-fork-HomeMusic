package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vu {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public boolean a() {
        int r0 = this.a;
        int r2 = 2;
        if ((r0 & 7) == 0) goto L14;
        int r1 = this.d;
        int r5 = this.b;
        if (r1 <= r5) goto L7;
        int r3 = 1;
    L11:
        if ((r3 & r0) != 0) goto L14;
        return false;
    L7:
        if (r1 != r5) goto L9;
        r3 = 2;
        goto L11
    L9:
        r3 = 4;
    L14:
        if ((r0 & 112) == 0) goto L25;
        int r4 = this.d;
        int r6 = this.c;
        if (r4 <= r6) goto L18;
        int r7 = 1;
    L22:
        if (((r7 << 4) & r0) != 0) goto L25;
        return false;
    L18:
        if (r4 != r6) goto L20;
        r7 = 2;
        goto L22
    L20:
        r7 = 4;
    L25:
        if ((r0 & 1792) == 0) goto L36;
        int r8 = this.e;
        int r9 = this.b;
        if (r8 <= r9) goto L29;
        int r10 = 1;
    L33:
        if (((r10 << 8) & r0) != 0) goto L36;
        return false;
    L29:
        if (r8 != r9) goto L31;
        r10 = 2;
        goto L33
    L31:
        r10 = 4;
    L36:
        if ((r0 & 28672) == 0) goto L47;
        int r11 = this.e;
        int r12 = this.c;
        if (r11 <= r12) goto L40;
        r2 = 1;
    L44:
        if (((r2 << 12) & r0) != 0) goto L47;
        return false;
    L40:
        if (r11 == r12) goto L44;
        r2 = 4;
    L47:
        return true;
    }
}
