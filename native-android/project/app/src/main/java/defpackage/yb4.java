package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yb4 implements zi4 {
    public static final int[] i = null;
    public static final float[] j = null;
    public static final int[] k = null;
    public static final float[] l = null;
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object h;

    static {
        i = new int[3];
        j = new float[]{0.0f, 0.5f, 1.0f};
        k = new int[4];
        l = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    }

    public yb4() {
        this.h = new Path();
        Paint r0 = new Paint();
        this.g = r0;
        this.d = new Paint();
        t(-16777216);
        r0.setColor(0);
        Paint r1 = new Paint(4);
        this.e = r1;
        r1.setStyle(Paint.Style.FILL);
        this.f = new Paint(r1);
    }

    @Override // defpackage.zi4
    public void a(int r4, ByteBuffer r5) {
        ShortBuffer r0 = r5.asShortBuffer();
        short[] r1 = (short[]) this.e;
        aj4 r3 = (aj4) this.h;
        r0.get(r1, r3.j * r3.b, r4 / 2);
        r5.position(r5.position() + r4);
    }

    @Override // defpackage.zi4
    public void b(int r5, ByteBuffer r6) {
        ShortBuffer r0 = r6.asShortBuffer();
        short[] r1 = (short[]) this.f;
        int r4 = ((aj4) this.h).b;
        r0.put(r1, 0, r5 * r4);
        int r7 = (r5 * 2) * r4;
        r6.position(r7 + r6.position());
    }

    @Override // defpackage.zi4
    public void c(int r13, long r14, long r16) {
        int r0 = 0;
    L3:
        aj4 r1 = (aj4) this.h;
        int r2 = r1.b;
        if (r0 >= r2) goto L6;
        short[] r3 = (short[]) this.f;
        int r4 = (r1.k * r2) + r0;
        short[] r5 = (short[]) this.g;
        int r6 = (r13 * r2) + r0;
        short r7 = r5[r6];
        short r8 = r5[r6 + r2];
        long r9 = ((long) r1.n) * r14;
        int r10 = r1.m;
        long r11 = ((long) (r10 + 1)) * r16;
        long r12 = r11 - r9;
        long r15 = r11 - (((long) r10) * r16);
        r3[r4] = (short) ((((r15 - r12) * ((long) r8)) + (((long) r7) * r12)) / r15);
        r0 = r0 + 1;
        goto L3
    }

    @Override // defpackage.zi4
    public void d(int r5, int r6) {
        int r1 = 0;
    L4:
        if (r1 >= (((aj4) this.h).b * r6)) goto L6;
        ((short[]) this.e)[r5 + r1] = 0;
        r1 = r1 + 1;
        goto L4
    }

    @Override // defpackage.zi4
    public void e(int r8, int r9) {
        short[] r0 = (short[]) this.e;
        aj4 r1 = (aj4) this.h;
        int r2 = r1.h / r9;
        int r3 = r1.b;
        int r10 = r9 * r3;
        int r11 = r8 * r3;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L8;
        int r5 = 0;
        int r6 = 0;
    L5:
        if (r5 >= r10) goto L7;
        r6 = r6 + r0[((r4 * r10) + r11) + r5];
        r5 = r5 + 1;
        goto L5
    L7:
        ((short[]) this.d)[r4] = (short) (r6 / r10);
        r4 = r4 + 1;
        goto L3
    }

    @Override // defpackage.zi4
    public int f(int r2, int r3, int r4) {
        return s((short[]) this.e, r2, r3, r4);
    }

    @Override // defpackage.zi4
    public void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // defpackage.zi4
    public void g() {
        this.c = this.a;
    }

    @Override // defpackage.zi4
    public Object h() {
        return (short[]) this.e;
    }

    @Override // defpackage.zi4
    public Object i() {
        return (short[]) this.f;
    }

    @Override // defpackage.zi4
    public void j(int r3) {
        this.f = r((short[]) this.f, ((aj4) this.h).k, r3);
    }

    @Override // defpackage.zi4
    public boolean k() {
        int r0 = this.a;
        if (r0 != 0) goto L5;
        return false;
    L5:
        if (((aj4) this.h).p != 0) goto L8;
        return false;
    L8:
        if (this.b <= (r0 * 3)) goto L11;
        return false;
    L11:
        if ((r0 * 2) <= (this.c * 3)) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // defpackage.zi4
    public Object l() {
        return (short[]) this.g;
    }

    @Override // defpackage.zi4
    public void m(int r10, int r11, int r12, int r13, int r14) {
        short[] r0 = (short[]) this.f;
        short[] r9 = (short[]) this.e;
        int r2 = 0;
    L3:
        if (r2 >= r11) goto L8;
        int r3 = (r12 * r11) + r2;
        int r4 = (r14 * r11) + r2;
        int r5 = (r13 * r11) + r2;
        int r6 = 0;
    L5:
        if (r6 >= r10) goto L7;
        r0[r3] = (short) (((r9[r4] * r6) + ((r10 - r6) * r9[r5])) / r10);
        r3 = r3 + r11;
        r5 = r5 + r11;
        r4 = r4 + r11;
        r6 = r6 + 1;
        goto L5
    L7:
        r2 = r2 + 1;
        goto L3
    }

    @Override // defpackage.zi4
    public void n(int r3) {
        this.g = r((short[]) this.g, ((aj4) this.h).l, r3);
    }

    @Override // defpackage.zi4
    public int o() {
        return 2;
    }

    @Override // defpackage.zi4
    public void p(int r3) {
        this.e = r((short[]) this.e, ((aj4) this.h).j, r3);
    }

    @Override // defpackage.zi4
    public int q(int r3, int r4) {
        return s((short[]) this.d, 0, r3, r4);
    }

    public short[] r(short[] r2, int r3, int r4) {
        int r0 = r2.length;
        int r1 = ((aj4) this.h).b;
        int r5 = r0 / r1;
        if ((r3 + r4) > r5) goto L6;
        return r2;
    L6:
        return Arrays.copyOf(r2, (((r5 * 3) / 2) + r4) * r1);
    }

    public int s(short[] r10, int r11, int r12, int r13) {
        int r14 = r11 * ((aj4) this.h).b;
        int r1 = 255;
        int r2 = 1;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r12 > r13) goto L14;
        int r5 = 0;
        int r6 = 0;
    L5:
        if (r5 >= r12) goto L8;
        r6 = r6 + Math.abs(r10[r14 + r5] - r10[(r14 + r12) + r5]);
        r5 = r5 + 1;
        goto L5
    L8:
        if ((r6 * r3) >= (r2 * r12)) goto L11;
        r3 = r12;
        r2 = r6;
    L11:
        if ((r6 * r1) <= (r4 * r12)) goto L13;
        r1 = r12;
        r4 = r6;
    L13:
        r12 = r12 + 1;
        goto L3
    L14:
        this.a = r2 / r3;
        this.b = r4 / r1;
        return r3;
    }

    public void t(int r2) {
        this.a = v50.i(r2, 68);
        this.b = v50.i(r2, 20);
        this.c = v50.i(r2, 0);
        ((Paint) this.d).setColor(this.a);
    }

    public yb4(aj4 r3) {
        this.h = r3;
        int r0 = r3.h;
        this.d = new short[r0];
        int r1 = r0 * r3.b;
        this.e = new short[r1];
        this.f = new short[r1];
        this.g = new short[r1];
    }
}
