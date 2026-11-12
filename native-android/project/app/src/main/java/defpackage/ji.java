package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ji {
    public int a;
    public final pi b;
    public final yc5 c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;

    public ji(pi r4, yc5 r5) {
        this.a = 0;
        this.d = 8;
        this.e = new int[8];
        this.f = new int[8];
        this.g = new float[8];
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.b = r4;
        this.c = r5;
    }

    public final void a(ai4 r12, float r13, boolean r14) {
        if (r13 > (-0.001f)) goto L5;
    L7:
        int r1 = this.h;
        pi r3 = this.b;
        if (r1 != (-1)) goto L15;
        this.h = 0;
        this.g[0] = r13;
        this.e[0] = r12.o;
        this.f[0] = -1;
        r12.x++;
        r12.a(r3);
        this.a++;
        if (this.j == true) goto L81;
        int r15 = this.i + 1;
        this.i = r15;
        int[] r16 = this.e;
        if (r15 < r16.length) goto L82;
        this.j = true;
        this.i = r16.length - 1;
        return;
    L82:
        return;
    L81:
        return;
    L15:
        int r7 = 0;
        int r8 = -1;
    L16:
        if (r1 == (-1)) goto L42;
        if (r7 >= this.a) goto L42;
        int r9 = this.e[r1];
        int r10 = r12.o;
        if (r9 == r10) goto L21;
        if (r9 >= r10) goto L41;
        r8 = r1;
    L41:
        r1 = this.f[r1];
        r7 = r7 + 1;
        goto L16
    L21:
        float[] r4 = this.g;
        float r5 = r4[r1] + r13;
        if (r5 > (-0.001f)) goto L24;
    L26:
        r4[r1] = r5;
        if (r5 != 0.0f) goto L83;
        int r17 = this.h;
        int[] r0 = this.f;
        if (r1 != r17) goto L31;
        this.h = r0[r1];
    L32:
        if (r14 == false) goto L35;
        r12.b(r3);
    L35:
        if (this.j == false) goto L37;
        this.i = r1;
    L37:
        r12.x--;
        this.a--;
        return;
    L31:
        r0[r8] = r0[r1];
        goto L32
    L83:
        return;
    L24:
        if (r5 >= 0.001f) goto L26;
        r5 = 0.0f;
    L42:
        int r18 = this.i;
        int r2 = r18 + 1;
        if (this.j == false) goto L48;
        int[] r6 = this.e;
        if (r6[r18] == (-1)) goto L49;
        r18 = r6.length;
    L49:
        int[] r11 = this.e;
        if (r18 >= r11.length) goto L52;
    L60:
        int[] r19 = this.e;
        if (r18 < r19.length) goto L63;
        r18 = r19.length;
        int r20 = this.d * 2;
        this.d = r20;
        this.j = false;
        this.i = r18 - 1;
        this.g = Arrays.copyOf(this.g, r20);
        this.e = Arrays.copyOf(this.e, this.d);
        this.f = Arrays.copyOf(this.f, this.d);
    L63:
        this.e[r18] = r12.o;
        this.g[r18] = r13;
        int[] r110 = this.f;
        if (r8 == (-1)) goto L66;
        r110[r18] = r110[r8];
        r110[r8] = r18;
    L67:
        r12.x++;
        r12.a(r3);
        this.a++;
        if (this.j == true) goto L70;
        this.i++;
    L70:
        int r111 = this.i;
        int[] r112 = this.e;
        if (r111 < r112.length) goto L84;
        this.j = true;
        this.i = r112.length - 1;
        return;
    L84:
        return;
    L66:
        r110[r18] = this.h;
        this.h = r18;
        goto L67
    L52:
        if (this.a >= r11.length) goto L60;
        int r21 = 0;
    L54:
        int[] r22 = this.e;
        if (r21 >= r22.length) goto L60;
        if (r22[r21] == (-1)) goto L58;
        r21 = r21 + 1;
        goto L54
    L58:
        r18 = r21;
        goto L60
    L48:
        r18 = r2;
        goto L49
    L5:
        if (r13 >= 0.001f) goto L7;
    }

    public final void b() {
        int r0 = this.h;
        int r2 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r2 >= this.a) goto L11;
        ai4 r3 = ((ai4[]) this.c.p)[this.e[r0]];
        if (r3 == null) goto L10;
        r3.b(this.b);
    L10:
        r0 = this.f[r0];
        r2 = r2 + 1;
    L11:
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final float c(ai4 r5) {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L12;
        if (r1 >= this.a) goto L17;
        if (this.e[r0] == r5.o) goto L10;
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L10:
        return this.g[r0];
    L17:
        return 0.0f;
    L12:
        return 0.0f;
    }

    public final int d() {
        return this.a;
    }

    public final ai4 e(int r4) {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r1 >= this.a) goto L16;
        if (r1 == r4) goto L9;
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L9:
        return ((ai4[]) this.c.p)[this.e[r0]];
    L16:
        return null;
    L11:
        return null;
    }

    public final float f(int r4) {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r1 >= this.a) goto L16;
        if (r1 == r4) goto L9;
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L9:
        return this.g[r0];
    L16:
        return 0.0f;
    L11:
        return 0.0f;
    }

    public final void g(ai4 r10, float r11) {
        if (r11 != 0.0f) goto L6;
        h(r10, true);
        return;
    L6:
        int r0 = this.h;
        pi r2 = this.b;
        if (r0 != (-1)) goto L14;
        this.h = 0;
        this.g[0] = r11;
        this.e[0] = r10.o;
        this.f[0] = -1;
        r10.x++;
        r10.a(r2);
        this.a++;
        if (this.j == true) goto L67;
        int r12 = this.i + 1;
        this.i = r12;
        int[] r13 = this.e;
        if (r12 < r13.length) goto L68;
        this.j = true;
        this.i = r13.length - 1;
        return;
    L68:
        return;
    L67:
        return;
    L14:
        int r5 = 0;
        int r6 = -1;
    L15:
        if (r0 == (-1)) goto L25;
        if (r5 >= this.a) goto L25;
        int r7 = this.e[r0];
        int r8 = r10.o;
        if (r7 == r8) goto L20;
        if (r7 >= r8) goto L24;
        r6 = r0;
    L24:
        r0 = this.f[r0];
        r5 = r5 + 1;
        goto L15
    L20:
        this.g[r0] = r11;
        return;
    L25:
        int r1 = this.i;
        int r9 = r1 + 1;
        if (this.j == false) goto L31;
        int[] r14 = this.e;
        if (r14[r1] == (-1)) goto L32;
        r1 = r14.length;
    L32:
        int[] r15 = this.e;
        if (r1 >= r15.length) goto L35;
    L43:
        int[] r16 = this.e;
        if (r1 < r16.length) goto L46;
        r1 = r16.length;
        int r17 = this.d * 2;
        this.d = r17;
        this.j = false;
        this.i = r1 - 1;
        this.g = Arrays.copyOf(this.g, r17);
        this.e = Arrays.copyOf(this.e, this.d);
        this.f = Arrays.copyOf(this.f, this.d);
    L46:
        this.e[r1] = r10.o;
        this.g[r1] = r11;
        int[] r18 = this.f;
        if (r6 == (-1)) goto L49;
        r18[r1] = r18[r6];
        r18[r6] = r1;
    L50:
        r10.x++;
        r10.a(r2);
        int r19 = this.a + 1;
        this.a = r19;
        if (this.j == true) goto L53;
        this.i++;
    L53:
        int[] r110 = this.e;
        if (r19 < r110.length) goto L57;
        this.j = true;
    L57:
        if (this.i < r110.length) goto L69;
        this.j = true;
        this.i = r110.length - 1;
        return;
    L69:
        return;
    L49:
        r18[r1] = this.h;
        this.h = r1;
        goto L50
    L35:
        if (this.a >= r15.length) goto L43;
        int r20 = 0;
    L37:
        int[] r21 = this.e;
        if (r20 >= r21.length) goto L43;
        if (r21[r20] == (-1)) goto L41;
        r20 = r20 + 1;
        goto L37
    L41:
        r1 = r20;
        goto L43
    L31:
        r1 = r9;
        goto L32
    }

    public final float h(ai4 r8, boolean r9) {
        int r0 = this.h;
        if (r0 == (-1)) goto L23;
        int r2 = 0;
        int r3 = -1;
    L6:
        if (r0 == (-1)) goto L28;
        if (r2 >= this.a) goto L29;
        if (this.e[r0] == r8.o) goto L11;
        r2 = r2 + 1;
        r3 = r0;
        r0 = this.f[r0];
        goto L6
    L11:
        int r4 = this.h;
        int[] r5 = this.f;
        if (r0 != r4) goto L14;
        this.h = r5[r0];
    L15:
        if (r9 == false) goto L17;
        r8.b(this.b);
    L17:
        r8.x--;
        this.a--;
        this.e[r0] = -1;
        if (this.j == false) goto L21;
        this.i = r0;
    L21:
        return this.g[r0];
    L14:
        r5[r3] = r5[r0];
        goto L15
    L29:
        return 0.0f;
    L28:
        return 0.0f;
    L23:
        return 0.0f;
    }

    public final String toString() {
        int r0 = this.h;
        String r1 = "";
        int r2 = 0;
    L4:
        if (r0 == (-1)) goto L8;
        if (r2 >= this.a) goto L8;
        StringBuilder r3 = xa3.i(r1.concat(" -> "));
        r3.append(this.g[r0]);
        r3.append(" : ");
        StringBuilder r4 = xa3.i(r3.toString());
        r4.append(((ai4[]) this.c.p)[this.e[r0]]);
        r1 = r4.toString();
        r0 = this.f[r0];
        r2 = r2 + 1;
    L8:
        return r1;
    }
}
