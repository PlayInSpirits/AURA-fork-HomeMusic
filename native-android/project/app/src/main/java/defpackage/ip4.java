package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ip4 extends cx2 implements sn3, oo0, rn3 {
    public Object B;
    public Object C;
    public PointerInputEventHandler D;
    public sk4 E;
    public kn3 F;
    public final f13 G;
    public final f13 H;
    public final f13 I;
    public kn3 J;

    public ip4(Object r1, Object r2, PointerInputEventHandler r3) {
        this.B = r1;
        this.C = r2;
        this.D = r3;
        this.F = gp4.a;
        f13 r4 = new f13(new hp4[16]);
        this.G = r4;
        this.H = r4;
        this.I = new f13(new hp4[16]);
    }

    @Override // defpackage.oo0
    public final float J() {
        return j51.O(this).J.J();
    }

    @Override // defpackage.rn3
    public final void Z() {
        r0();
    }

    @Override // defpackage.eo0, defpackage.rn3
    public final void b() {
        r0();
    }

    @Override // defpackage.oo0
    public final float g() {
        return j51.O(this).J.g();
    }

    @Override // defpackage.cx2
    public final void j0() {
        r0();
    }

    @Override // defpackage.rn3
    public final void n(kn3 r4, ln3 r5, long r6) {
        if (r5 != ln3.n) goto L5;
        this.F = r4;
    L5:
        vd0 r7 = null;
        if (this.E != null) goto L8;
        this.E = fu.G(e0(), null, ze0.q, new ac0(this, r7, 7), 1);
    L8:
        q0(r4, r5);
        List r8 = r4.a;
        int r9 = r8.size();
        int r0 = 0;
    L9:
        if (r0 >= r9) goto L14;
        if (gi1.i((on3) r8.get(r0)) == false) goto L15;
        r0 = r0 + 1;
    L15:
        this.J = r4;
        return;
    L14:
        r4 = null;
        goto L15
    }

    public final void q0(kn3 r7, ln3 r8) {
        f13 r0 = this.H;
        monitor-enter(r0);
        f13 r1 = this.I;     // Catch: Throwable -> L38
        r1.c(r1.p, this.G);     // Catch: Throwable -> L38
        monitor-exit(r0);
        int r2 = r8.ordinal();     // Catch: Throwable -> L15
        if (r2 != 0) goto L9;
    L26:
        f13 r3 = this.I;     // Catch: Throwable -> L15
        Object[] r4 = r3.n;     // Catch: Throwable -> L15
        int r5 = r3.p;     // Catch: Throwable -> L15
        int r6 = 0;
    L27:
        if (r6 >= r5) goto L34;
        hp4 r9 = (hp4) r4[r6];     // Catch: Throwable -> L15
        if (r8 != r9.q) goto L33;
        cz r10 = r9.p;     // Catch: Throwable -> L15
        if (r10 == null) goto L33;
        r9.p = null;     // Catch: Throwable -> L15
        r10.resumeWith(r7);     // Catch: Throwable -> L15
    L33:
        r6 = r6 + 1;
    L34:
        this.I.g();
        return;
    L9:
        if (r2 != 1) goto L11;
        f13 r11 = this.I;     // Catch: Throwable -> L15
        int r12 = r11.p - 1;     // Catch: Throwable -> L15
        Object[] r13 = r11.n;     // Catch: Throwable -> L15
        if (r12 >= r13.length) goto L34;
    L19:
        if (r12 < 0) goto L34;
        hp4 r14 = (hp4) r13[r12];     // Catch: Throwable -> L15
        if (r8 != r14.q) goto L25;
        cz r15 = r14.p;     // Catch: Throwable -> L15
        if (r15 == null) goto L25;
        r14.p = null;     // Catch: Throwable -> L15
        r15.resumeWith(r7);     // Catch: Throwable -> L15
    L25:
        r12 = r12 - 1;     // Catch: Throwable -> L15
        goto L19
    L11:
        if (r2 == 2) goto L26;
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        this.I.g();
        throw th;
    L38:
        th = move-exception;
        throw th;
    }

    public final void r0() {
        sk4 r0 = this.E;
        if (r0 == null) goto L6;
        r0.p(new PointerInputResetException());
        this.E = null;
        return;
    }

    @Override // defpackage.rn3
    public final void t() {
        kn3 r1 = this.J;
        if (r1 == null) goto L15;
        List r2 = r1.a;
        int r3 = r2.size();
        int r4 = 0;
        int r5 = 0;
    L6:
        if (r5 >= r3) goto L19;
        if (((on3) r2.get(r5)).d == true) goto L9;
        r5 = r5 + 1;
        goto L6
    L9:
        ArrayList r6 = new ArrayList(r2.size());
        int r7 = r2.size();
    L10:
        if (r4 >= r7) goto L12;
        on3 r8 = (on3) r2.get(r4);
        long r9 = r8.a;
        long r11 = r8.c;
        long r10 = r8.b;
        float r14 = r8.e;
        boolean r12 = r8.d;
        r6.add(new on3(r9, r10, r11, false, r14, r10, r11, r12, r12, r8.i, 0, 1.0f, 0));
        r4 = r4 + 1;
        goto L10
    L12:
        kn3 r13 = new kn3(r6, null);
        this.F = r13;
        q0(r13, ln3.n);
        q0(r13, ln3.o);
        q0(r13, ln3.p);
        this.J = null;
        return;
    L19:
        return;
    }
}
