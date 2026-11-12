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

    public a80(i94 i94Var, k02 k02Var, td0 td0Var, rm2 rm2Var, ra raVar) {
        this.a = i94Var;
        this.b = k02Var;
        this.c = rm2Var;
        this.d = raVar;
        this.e = new td0(td0Var.n.J(sq0.o));
        this.f = new sy3(k02Var.d - k02Var.b, new z70(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(a80 a80Var, ScrollCaptureSession scrollCaptureSession, k02 k02Var, wd0 wd0Var) {
        y70 y70Var;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionH;
        int i3;
        k02 k02Var2;
        int i4;
        int iM;
        int iM2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (wd0Var instanceof y70) {
            y70Var = (y70) wd0Var;
            int i7 = y70Var.t;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                y70Var.t = i7 - Integer.MIN_VALUE;
            } else {
                y70Var = new y70(a80Var, wd0Var);
            }
        } else {
            y70Var = new y70(a80Var, wd0Var);
        }
        Object obj = y70Var.r;
        int i8 = y70Var.t;
        xe0 xe0Var = xe0.n;
        if (i8 == 0) {
            kb4.X(obj);
            i = k02Var.b;
            i2 = k02Var.d;
            sy3 sy3Var = a80Var.f;
            y70Var.n = scrollCaptureSession;
            y70Var.o = k02Var;
            y70Var.p = i;
            y70Var.q = i2;
            y70Var.t = 1;
            if (i > i2) {
                sy3Var.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i9 = i2 - i;
            int i10 = sy3Var.a;
            if (i9 > i10) {
                kf2.e(xa3.e(i9, i10, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            Object objA = sy3Var.a((((i9 / 2) + i) - (i10 / 2)) - sy3Var.c, y70Var);
            Object obj2 = j15.a;
            if (objA != xe0Var) {
                objA = obj2;
            }
            if (objA == xe0Var) {
                obj2 = objA;
            }
            if (obj2 != xe0Var) {
            }
            return xe0Var;
        }
        if (i8 == 1) {
            int i11 = y70Var.q;
            int i12 = y70Var.p;
            k02 k02Var3 = y70Var.o;
            ScrollCaptureSession scrollCaptureSessionH2 = db.h(y70Var.n);
            kb4.X(obj);
            i = i12;
            k02Var = k02Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionH2;
        } else {
            if (i8 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = y70Var.q;
            i4 = y70Var.p;
            k02Var2 = y70Var.o;
            scrollCaptureSessionH = db.h(y70Var.n);
            kb4.X(obj);
        }
        sy3 sy3Var2 = a80Var.f;
        iM = gb.m(i4 - ji2.L(sy3Var2.c), 0, sy3Var2.a);
        sy3 sy3Var3 = a80Var.f;
        iM2 = gb.m(i3 - ji2.L(sy3Var3.c), 0, sy3Var3.a);
        i5 = k02Var2.a;
        i6 = k02Var2.c;
        if (iM == iM2) {
            return k02.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionH.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM);
            k02 k02Var4 = a80Var.b;
            canvasLockHardwareCanvas.translate(-k02Var4.a, -k02Var4.b);
            a80Var.d.getRootView().draw(canvasLockHardwareCanvas);
            int iL = ji2.L(a80Var.f.c);
            return new k02(i5, iM + iL, i6, iM2 + iL);
        } finally {
            scrollCaptureSessionH.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        k52 k52Var = new k52(15);
        y70Var.n = scrollCaptureSession;
        y70Var.o = k02Var;
        y70Var.p = i;
        y70Var.q = i2;
        y70Var.t = 2;
        if (vr1.x(y70Var.getContext()).a(k52Var, y70Var) != xe0Var) {
            scrollCaptureSessionH = scrollCaptureSession;
            i3 = i2;
            k02Var2 = k02Var;
            i4 = i;
            sy3 sy3Var4 = a80Var.f;
            iM = gb.m(i4 - ji2.L(sy3Var4.c), 0, sy3Var4.a);
            sy3 sy3Var5 = a80Var.f;
            iM2 = gb.m(i3 - ji2.L(sy3Var5.c), 0, sy3Var5.a);
            i5 = k02Var2.a;
            i6 = k02Var2.c;
            if (iM == iM2) {
                return k02.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionH.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM);
            k02 k02Var5 = a80Var.b;
            canvasLockHardwareCanvas.translate(-k02Var5.a, -k02Var5.b);
            a80Var.d.getRootView().draw(canvasLockHardwareCanvas);
            int iL2 = ji2.L(a80Var.f.c);
            return new k02(i5, iM + iL2, i6, iM2 + iL2);
        }
        return xe0Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        fu.G(this.e, j63.o, null, new p(this, runnable, null, 6), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final sk4 sk4VarG = fu.G(this.e, null, null, new x70(this, scrollCaptureSession, rect, consumer, null, 0), 3);
        sk4VarG.M(new x(7, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: b80
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                sk4VarG.f(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(uo.U(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        ((zd3) this.c.o).setValue(Boolean.TRUE);
        runnable.run();
    }
}
