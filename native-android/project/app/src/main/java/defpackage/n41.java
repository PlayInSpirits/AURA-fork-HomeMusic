package defpackage;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n41 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public n41(int r2) {
        this.a = 2;
        this.b = r2;
        byte[] r3 = new byte[131];
        this.f = r3;
        r3[2] = 1;
    }

    public void a(byte[] r4, int r5, int r6) {
        if (this.d == true) goto L5;
        return;
    L5:
        int r7 = r6 - r5;
        byte[] r0 = (byte[]) this.f;
        int r1 = r0.length;
        int r2 = this.c + r7;
        if (r1 >= r2) goto L8;
        this.f = Arrays.copyOf(r0, r2 * 2);
    L8:
        System.arraycopy(r4, r5, (byte[]) this.f, this.c, r7);
        this.c += r7;
    }

    public void b() {
        boolean r0 = this.d;
        qz0 r1 = (qz0) this.f;
        if (r0 == false) goto L5;
        int r2 = r1.i();
    L6:
        this.c = r2;
        return;
    L5:
        r2 = r1.m();
        goto L6
    }

    public void c(View r5, int r6) {
        qz0 r0 = (qz0) this.f;
        int r2 = 0;
        if (Integer.MIN_VALUE != r0.a) goto L5;
        int r1 = 0;
    L6:
        if (r1 < 0) goto L17;
        boolean r3 = this.d;
        qz0 r4 = (qz0) this.f;
        if (r3 == false) goto L14;
        int r7 = r4.d(r5);
        qz0 r8 = (qz0) this.f;
        if (Integer.MIN_VALUE == r8.a) goto L13;
        r2 = r8.n() - r8.a;
    L13:
        this.c = r2 + r7;
    L15:
        this.b = r6;
        return;
    L14:
        this.c = r4.g(r5);
        goto L15
    L17:
        this.b = r6;
        boolean r9 = this.d;
        qz0 r10 = (qz0) this.f;
        if (r9 == false) goto L25;
        int r11 = (r10.i() - r1) - ((qz0) this.f).d(r5);
        this.c = ((qz0) this.f).i() - r11;
        if (r11 <= 0) goto L31;
        int r12 = this.c - ((qz0) this.f).e(r5);
        int r13 = ((qz0) this.f).m();
        int r14 = r12 - (Math.min(((qz0) this.f).g(r5) - r13, 0) + r13);
        if (r14 >= 0) goto L32;
        this.c = Math.min(r11, -r14) + this.c;
        return;
    L32:
        return;
    L31:
        return;
    L25:
        int r15 = r10.g(r5);
        int r16 = r15 - ((qz0) this.f).m();
        this.c = r15;
        if (r16 <= 0) goto L33;
        int r17 = (((qz0) this.f).i() - Math.min(0, (((qz0) this.f).i() - r1) - ((qz0) this.f).d(r5))) - (((qz0) this.f).e(r5) + r15);
        if (r17 >= 0) goto L34;
        this.c -= Math.min(r16, -r17);
        return;
    L34:
        return;
    L33:
        return;
    L5:
        r1 = r0.n() - r0.a;
        goto L6
    }

    public boolean d(int r3) {
        if (this.d == true) goto L5;
        return false;
    L5:
        this.c -= r3;
        this.d = false;
        this.e = true;
        return true;
    }

    public void e(int r3) {
        boolean r0 = this.d;
        if (r3 <= 0) goto L5;
        boolean r1 = true;
    L6:
        this.d = r0 | r1;
        this.b += r3;
        return;
    L5:
        r1 = false;
        goto L6
    }

    public void f() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.d = false;
        this.e = false;
        return;
    L6:
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public void g(int r4) {
        boolean r1 = true;
        rr2.w(!this.d);
        if (r4 == this.b) goto L6;
        r1 = false;
    L6:
        this.d = r1;
        if (r1 == false) goto L10;
        this.c = 3;
        this.e = false;
        return;
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }

    public n41(ph3 r2) {
        this.a = 0;
        this.f = r2;
    }

    public n41() {
        this.a = 1;
        f();
    }
}
