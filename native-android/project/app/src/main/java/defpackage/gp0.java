package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 extends cw0 {
    public static final fp0 D = new fp0();
    public final zj4 A;
    public float B;
    public boolean C;
    public final mw0 y;
    public final ak4 z;

    public gp0(Context context, jq jqVar, mw0 mw0Var) {
        super(context, jqVar);
        this.C = false;
        this.y = mw0Var;
        mw0Var.b = this;
        ak4 ak4Var = new ak4();
        this.z = ak4Var;
        ak4Var.b = 1.0d;
        ak4Var.c = false;
        ak4Var.a = Math.sqrt(50.0d);
        ak4Var.c = false;
        zj4 zj4Var = new zj4(this);
        this.A = zj4Var;
        zj4Var.k = ak4Var;
        if (this.u != 1.0f) {
            this.u = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            mw0 mw0Var = this.y;
            mw0Var.a.a();
            mw0Var.a(canvas, bounds, fB);
            Paint paint = this.v;
            mw0Var.c(canvas, paint);
            int iL = g12.l(this.o.c[0], this.w);
            this.y.b(canvas, paint, 0.0f, this.B, iL);
            canvas.restore();
        }
    }

    @Override // defpackage.cw0
    public final boolean f(boolean z, boolean z2, boolean z3) {
        boolean zF = super.f(z, z2, z3);
        ee eeVar = this.p;
        ContentResolver contentResolver = this.n.getContentResolver();
        eeVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.C = true;
            return zF;
        }
        this.C = false;
        float f2 = 50.0f / f;
        ak4 ak4Var = this.z;
        ak4Var.getClass();
        if (f2 <= 0.0f) {
            kf2.n("Spring stiffness constant must be positive.");
            return false;
        }
        ak4Var.a = Math.sqrt(f2);
        ak4Var.c = false;
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.y.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.y.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.A.b();
        this.B = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.C;
        zj4 zj4Var = this.A;
        if (z) {
            zj4Var.b();
            this.B = i / 10000.0f;
            invalidateSelf();
            return true;
        }
        zj4Var.b = this.B * 10000.0f;
        zj4Var.c = true;
        float f = i;
        if (zj4Var.f) {
            zj4Var.l = f;
            return true;
        }
        if (zj4Var.k == null) {
            zj4Var.k = new ak4(f);
        }
        ak4 ak4Var = zj4Var.k;
        double d = f;
        ak4Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            er1.l("Final position of the spring cannot be greater than the max value.");
            return false;
        }
        if (d2 < -3.4028234663852886E38d) {
            er1.l("Final position of the spring cannot be less than the min value.");
            return false;
        }
        double dAbs = Math.abs(zj4Var.h * 0.75f);
        ak4Var.d = dAbs;
        ak4Var.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z2 = zj4Var.f;
        if (!z2 && !z2) {
            zj4Var.f = true;
            if (!zj4Var.c) {
                fp0 fp0Var = zj4Var.e;
                gp0 gp0Var = zj4Var.d;
                fp0Var.getClass();
                zj4Var.b = gp0Var.B * 10000.0f;
            }
            float f2 = zj4Var.b;
            if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
                kf2.n("Starting value need to be in between min value and max value");
                return false;
            }
            ThreadLocal threadLocal = td.f;
            if (threadLocal.get() == null) {
                threadLocal.set(new td());
            }
            td tdVar = (td) threadLocal.get();
            ArrayList arrayList = tdVar.b;
            if (arrayList.size() == 0) {
                if (tdVar.d == null) {
                    tdVar.d = new yc5(tdVar.c);
                }
                yc5 yc5Var = tdVar.d;
                ((Choreographer) yc5Var.o).postFrameCallback((sd) yc5Var.p);
            }
            if (!arrayList.contains(zj4Var)) {
                arrayList.add(zj4Var);
                return true;
            }
        }
        return true;
    }
}
