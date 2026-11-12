package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a80 implements ScrollCaptureCallback {
    public final i94 a;
    public final k02 b;
    public final rm2 c;
    public final ra d;
    public final td0 e;
    public final sy3 f;

    public a80(i94 r1, k02 r2, td0 r3, rm2 r4, ra r5) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
        this.d = r5;
        this.e = new td0(r3.n.J(sq0.o));
        this.f = new sy3(r2.d - r2.b, new z70(this, null));
    }

    public static final Object a(a80 r8, ScrollCaptureSession r9, k02 r10, wd0 r11) {
        if ((r11 instanceof y70) == false) goto L7;
        y70 r0 = (y70) r11;
        int r1 = r0.t;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.t = r1 - Integer.MIN_VALUE;
    L8:
        Object r12 = r0.r;
        int r2 = r0.t;
        xe0 r5 = xe0.n;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L15;
        if (r2 != 2) goto L13;
        int r13 = r0.q;
        int r14 = r0.p;
        k02 r3 = r0.o;
        ScrollCaptureSession r4 = db.h(r0.n);
        kb4.X(r12);
    L32:
        sy3 r15 = r8.f;
        int r16 = gb.m(r14 - ji2.L(r15.c), 0, r15.a);
        sy3 r17 = r8.f;
        int r18 = gb.m(r13 - ji2.L(r17.c), 0, r17.a);
        int r19 = r3.a;
        int r6 = r3.c;
        if (r16 == r18) goto L35;
        Canvas r7 = db.i(r4).lockHardwareCanvas();
        r7.save();     // Catch: Throwable -> L40
        r7.translate(-r19, -r16);     // Catch: Throwable -> L40
        k02 r20 = r8.b;     // Catch: Throwable -> L40
        r7.translate(-r20.a, -r20.b);     // Catch: Throwable -> L40
        r8.d.getRootView().draw(r7);     // Catch: Throwable -> L40
        db.C(r4).unlockCanvasAndPost(r7);
        int r21 = ji2.L(r8.f.c);
        return new k02(r19, r16 + r21, r6, r18 + r21);
    L40:
        th = move-exception;
        db.C(r4).unlockCanvasAndPost(r7);
        throw th;
    L35:
        return k02.e;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        int r22 = r0.q;
        int r110 = r0.p;
        k02 r23 = r0.o;
        ScrollCaptureSession r24 = db.h(r0.n);
        kb4.X(r12);
        int r111 = r110;
        r10 = r23;
        int r25 = r22;
        r9 = r24;
    L28:
        k52 r26 = new k52(15);
        r0.n = r9;
        r0.o = r10;
        r0.p = r111;
        r0.q = r25;
        r0.t = 2;
        if (vr1.x(r0.getContext()).a(r26, r0) != r5) goto L31;
    L30:
        return r5;
    L31:
        r4 = r9;
        r13 = r25;
        r3 = r10;
        r14 = r111;
        goto L32
    L16:
        kb4.X(r12);
        r111 = r10.b;
        r25 = r10.d;
        sy3 r27 = r8.f;
        r0.n = r9;
        r0.o = r10;
        r0.p = r111;
        r0.q = r25;
        r0.t = 1;
        if (r111 > r25) goto L45;
        int r28 = r25 - r111;
        int r29 = r27.a;
        if (r28 > r29) goto L43;
        Object r30 = r27.a((((r28 / 2) + r111) - (r29 / 2)) - r27.c, r0);
        Object r31 = j15.a;
        if (r30 == r5) goto L24;
        r30 = r31;
    L24:
        if (r30 != r5) goto L26;
        r31 = r30;
    L26:
        if (r31 != r5) goto L28;
    L43:
        kf2.e(xa3.e(r28, r29, "Expected range (", ") to be ≤ viewportSize="));
        return null;
    L45:
        r27.getClass();
        throw new IllegalArgumentException(("Expected min=" + r111 + " ≤ max=" + r25).toString());
    L7:
        r0 = new y70(r8, r11);
        goto L8
    }

    public final void onScrollCaptureEnd(Runnable r5) {
        j63 r0 = j63.o;
        vd0 r3 = null;
        p r1 = new p(this, r5, r3, 6);
        fu.G(this.e, r0, null, r1, 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession r8, CancellationSignal r9, Rect r10, Consumer r11) {
        x70 r0 = new x70(this, r8, r10, r11, null, 0);
        final sk4 r7 = fu.G(this.e, null, null, r0, 3);
        r7.M(new x(7, r9));
        r9.setOnCancelListener(new b80(r7));
    }

    public final void onScrollCaptureSearch(CancellationSignal r1, Consumer r2) {
        r2.accept(uo.U(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession r1, CancellationSignal r2, Runnable r3) {
        this.f.c = 0.0f;
        ((zd3) this.c.o).setValue(Boolean.TRUE);
        r3.run();
    }
}
