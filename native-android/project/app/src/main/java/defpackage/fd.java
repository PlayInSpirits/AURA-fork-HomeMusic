package defpackage;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fd {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public int a(long r8) {
        int r0 = this.a + 1;
        long[] r1 = (long[]) this.c;
        int r2 = r1.length;
        if (r0 <= r2) goto L6;
        int r3 = r2 * 2;
        long[] r4 = new long[r3];
        int[] r5 = new int[r3];
        ti.a0(r1, r4, 0, 0, r1.length);
        ti.b0(0, 0, 14, (int[]) this.d, r5);
        this.c = r4;
        this.d = r5;
    L6:
        int r6 = this.a;
        this.a = r6 + 1;
        int r7 = ((int[]) this.e).length;
        if (this.b < r7) goto L12;
        int r9 = r7 * 2;
        int[] r10 = new int[r9];
        int r11 = 0;
    L9:
        if (r11 >= r9) goto L11;
        int r12 = r11 + 1;
        r10[r11] = r12;
        r11 = r12;
        goto L9
    L11:
        ti.b0(0, 0, 14, (int[]) this.e, r10);
        this.e = r10;
    L12:
        int r13 = this.b;
        int[] r14 = (int[]) this.e;
        this.b = r14[r13];
        long[] r15 = (long[]) this.c;
        r15[r6] = r8;
        ((int[]) this.d)[r6] = r13;
        r14[r13] = r6;
    L13:
        if (r6 <= 0) goto L17;
        int r16 = ((r6 + 1) >> 1) - 1;
        if (h12.k(r15[r16], r8) <= 0) goto L17;
        d(r16, r6);
        r6 = r16;
    L17:
        return r13;
    }

    public float b(TypedArray r2, String r3, int r4, float r5) {
        if (gi1.u((XmlPullParser) this.c, r3) == false) goto L6;
        r5 = r2.getFloat(r4, r5);
    L6:
        e(r2.getChangingConfigurations());
        return r5;
    }

    public void c(int r3) {
        int r2 = this.b;
        boolean r0 = false;
        if (r3 < 0) goto L6;
        if (r3 >= r2) goto L6;
        r0 = true;
    L6:
        if (r0 == true) goto L9;
        dz1.a("lineIndex(" + r3 + ") is out of bounds [0, " + r2 + ")");
        return;
    }

    public void d(int r7, int r8) {
        long[] r0 = (long[]) this.c;
        int[] r1 = (int[]) this.d;
        int[] r6 = (int[]) this.e;
        long r2 = r0[r7];
        r0[r7] = r0[r8];
        r0[r8] = r2;
        int r3 = r1[r7];
        int r4 = r1[r8];
        r1[r7] = r4;
        r1[r8] = r3;
        r6[r4] = r7;
        r6[r3] = r8;
    }

    public void e(int r2) {
        this.a = r2 | this.a;
    }
}
