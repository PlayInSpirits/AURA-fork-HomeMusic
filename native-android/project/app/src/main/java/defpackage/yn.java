package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yn {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public yn(ArrayList r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, float r11, String r12) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
    }

    public static yn a(be3 r17) {
        r17.O(4);     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r6 = (r17.A() & 3) + 1;     // Catch: ArrayIndexOutOfBoundsException -> L19
        if (r6 == 3) goto L18;
        ArrayList r5 = new ArrayList();     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r2 = r17.A() & 31;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L8;
        int r7 = r17.H();     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r8 = r17.b;     // Catch: ArrayIndexOutOfBoundsException -> L19
        r17.O(r7);     // Catch: ArrayIndexOutOfBoundsException -> L19
        byte[] r9 = r17.a;     // Catch: ArrayIndexOutOfBoundsException -> L19
        byte[] r11 = new byte[r7 + 4];     // Catch: ArrayIndexOutOfBoundsException -> L19
        System.arraycopy(i40.a, 0, r11, 0, 4);     // Catch: ArrayIndexOutOfBoundsException -> L19
        System.arraycopy(r9, r8, r11, 4, r7);     // Catch: ArrayIndexOutOfBoundsException -> L19
        r5.add(r11);     // Catch: ArrayIndexOutOfBoundsException -> L19
        r4 = r4 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L19
        goto L6
    L8:
        int r10 = r17.A();     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r12 = 0;
    L9:
        if (r12 >= r10) goto L11;
        int r13 = r17.H();     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r14 = r17.b;     // Catch: ArrayIndexOutOfBoundsException -> L19
        r17.O(r13);     // Catch: ArrayIndexOutOfBoundsException -> L19
        byte[] r15 = r17.a;     // Catch: ArrayIndexOutOfBoundsException -> L19
        byte[] r16 = new byte[r13 + 4];     // Catch: ArrayIndexOutOfBoundsException -> L19
        System.arraycopy(i40.a, 0, r16, 0, 4);     // Catch: ArrayIndexOutOfBoundsException -> L19
        System.arraycopy(r15, r14, r16, 4, r13);     // Catch: ArrayIndexOutOfBoundsException -> L19
        r5.add(r16);     // Catch: ArrayIndexOutOfBoundsException -> L19
        r12 = r12 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L19
        goto L9
    L11:
        if (r2 <= 0) goto L14;
        u13 r0 = uc5.L((byte[]) r5.get(0), 4, ((byte[]) r5.get(0)).length);     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r1 = r0.e;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r3 = r0.f;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r18 = r0.h + 8;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r19 = r0.i + 8;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r20 = r0.p;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r21 = r0.q;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r22 = r0.r;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r110 = r0.s;     // Catch: ArrayIndexOutOfBoundsException -> L19
        float r111 = r0.g;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r112 = r0.a;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r113 = r0.b;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r23 = r0.c;     // Catch: ArrayIndexOutOfBoundsException -> L19
        byte[] r114 = i40.a;     // Catch: ArrayIndexOutOfBoundsException -> L19
        String r24 = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(r112), Integer.valueOf(r113), Integer.valueOf(r23)});     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r115 = r21;
        int r116 = r22;
        int r117 = r110;
        float r118 = r111;
        int r25 = r3;
        int r26 = r18;
        int r119 = r19;
        int r120 = r20;
        int r27 = r1;
    L16:
        return new yn(r5, r6, r27, r25, r26, r119, r120, r115, r116, r117, r118, r24);
    L14:
        r24 = null;
        r27 = -1;
        r25 = -1;
        r26 = -1;
        r115 = -1;
        r116 = -1;
        r117 = 16;
        r118 = 1.0f;
        r119 = -1;
        r120 = -1;
        goto L16
    L18:
        throw new IllegalStateException();     // Catch: ArrayIndexOutOfBoundsException -> L19
    L19:
        e = move-exception;
        throw ParserException.a(e, "Error parsing AVC config");
    }
}
