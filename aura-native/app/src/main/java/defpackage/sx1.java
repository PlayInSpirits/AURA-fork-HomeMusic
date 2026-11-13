package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sx1 extends cw0 {
    public final mw0 y;
    public rx1 z;

    public sx1(Context context, jq jqVar, mw0 mw0Var, rx1 rx1Var) {
        super(context, jqVar);
        this.y = mw0Var;
        mw0Var.b = this;
        this.z = rx1Var;
        rx1Var.a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        Rect bounds = getBounds();
        float b = b();
        mw0 mw0Var = this.y;
        mw0Var.a.a();
        mw0Var.a(canvas, bounds, b);
        Paint paint = this.v;
        mw0Var.c(canvas, paint);
        int i = 0;
        while (true) {
            rx1 rx1Var = this.z;
            int[] iArr = (int[]) rx1Var.c;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            float[] fArr = (float[]) rx1Var.b;
            int i2 = i * 2;
            this.y.b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // defpackage.cw0
    public final boolean f(boolean z, boolean z2, boolean z3) {
        boolean f = super.f(z, z2, z3);
        if (!isRunning()) {
            this.z.d();
        }
        ee eeVar = this.p;
        ContentResolver contentResolver = this.n.getContentResolver();
        eeVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.z.j();
        }
        return f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.y.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.y.e();
    }
}
