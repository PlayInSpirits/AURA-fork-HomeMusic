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
    public static final fp0 D = null;
    public final zj4 A;
    public float B;
    public boolean C;
    public final mw0 y;
    public final ak4 z;

    static {
        D = new fp0();
    }

    public gp0(Context r3, jq r4, mw0 r5) {
        super(r3, r4);
        this.C = false;
        this.y = r5;
        r5.b = this;
        ak4 r6 = new ak4();
        this.z = r6;
        r6.b = 1.0d;
        r6.c = false;
        r6.a = Math.sqrt(50.0d);
        r6.c = false;
        zj4 r7 = new zj4(this);
        this.A = r7;
        r7.k = r6;
        if (this.u == 1.0f) goto L6;
        this.u = 1.0f;
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r11) {
        Rect r0 = new Rect();
        if (getBounds().isEmpty() == false) goto L5;
        return;
    L5:
        if (isVisible() == true) goto L7;
        return;
    L7:
        if (r11.getClipBounds(r0) == false) goto L13;
        r11.save();
        Rect r1 = getBounds();
        float r2 = b();
        mw0 r3 = this.y;
        r3.a.a();
        r3.a(r11, r1, r2);
        Paint r6 = this.v;
        r3.c(r11, r6);
        int r9 = g12.l(this.o.c[0], this.w);
        float r8 = this.B;
        this.y.b(r11, r6, 0.0f, r8, r9);
        r11.restore();
        return;
    }

    @Override // defpackage.cw0
    public final boolean f(boolean r3, boolean r4, boolean r5) {
        boolean r6 = super.f(r3, r4, r5);
        ee r7 = this.p;
        ContentResolver r8 = this.n.getContentResolver();
        r7.getClass();
        float r9 = Settings.Global.getFloat(r8, "animator_duration_scale", 1.0f);
        if (r9 != 0.0f) goto L6;
        this.C = true;
        return r6;
    L6:
        this.C = false;
        float r1 = 50.0f / r9;
        ak4 r2 = this.z;
        r2.getClass();
        if (r1 <= 0.0f) goto L10;
        r2.a = Math.sqrt(r1);
        r2.c = false;
        return r6;
    L10:
        kf2.n("Spring stiffness constant must be positive.");
        return false;
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
    public final boolean onLevelChange(int r9) {
        boolean r0 = this.C;
        zj4 r3 = this.A;
        if (r0 == false) goto L6;
        r3.b();
        this.B = r9 / 10000.0f;
        invalidateSelf();
        return true;
    L6:
        r3.b = this.B * 10000.0f;
        r3.c = true;
        float r8 = r9;
        if (r3.f == false) goto L11;
        r3.l = r8;
        return true;
    L11:
        if (r3.k != null) goto L13;
        r3.k = new ak4(r8);
    L13:
        ak4 r10 = r3.k;
        double r4 = r8;
        r10.i = r4;
        double r5 = (float) r4;
        if (r5 <= 3.4028234663852886E38d) goto L16;
        er1.l("Final position of the spring cannot be greater than the max value.");
        return false;
    L16:
        if (r5 < (-3.4028234663852886E38d)) goto L47;
        double r6 = Math.abs(r3.h * 0.75f);
        r10.d = r6;
        r10.e = r6 * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L46;
        boolean r11 = r3.f;
        if (r11 == true) goto L44;
        if (r11 == true) goto L44;
        r3.f = true;
        if (r3.c == true) goto L25;
        fp0 r12 = r3.e;
        gp0 r13 = r3.d;
        r12.getClass();
        r3.b = r13.B * 10000.0f;
    L25:
        float r14 = r3.b;
        if (r14 <= Float.MAX_VALUE) goto L28;
    L42:
        kf2.n("Starting value need to be in between min value and max value");
        return false;
    L28:
        if (r14 < (-3.4028235E38f)) goto L42;
        ThreadLocal r15 = td.f;
        if (r15.get() != null) goto L32;
        r15.set(new td());
    L32:
        td r16 = (td) r15.get();
        ArrayList r17 = r16.b;
        if (r17.size() != 0) goto L39;
        if (r16.d != null) goto L37;
        r16.d = new yc5(r16.c);
    L37:
        yc5 r18 = r16.d;
        ((Choreographer) r18.o).postFrameCallback((sd) r18.p);
    L39:
        if (r17.contains(r3) == true) goto L44;
        r17.add(r3);
        return true;
    L44:
        return true;
    L46:
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    L47:
        er1.l("Final position of the spring cannot be less than the min value.");
        return false;
    }
}
