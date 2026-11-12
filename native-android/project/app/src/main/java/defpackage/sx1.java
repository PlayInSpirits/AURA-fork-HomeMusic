package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sx1 extends cw0 {
    public final mw0 y;
    public rx1 z;

    public sx1(Context r1, jq r2, mw0 r3, rx1 r4) {
        super(r1, r2);
        this.y = r3;
        r3.b = this;
        this.z = r4;
        r4.a = this;
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
        if (r11.getClipBounds(r0) == false) goto L18;
        r11.save();
        Rect r1 = getBounds();
        float r2 = b();
        mw0 r3 = this.y;
        r3.a.a();
        r3.a(r11, r1, r2);
        Paint r6 = this.v;
        r3.c(r11, r6);
        int r4 = 0;
    L10:
        rx1 r5 = this.z;
        int[] r7 = (int[]) r5.c;
        if (r4 >= r7.length) goto L13;
        float[] r8 = (float[]) r5.b;
        int r9 = r4 * 2;
        float r10 = r8[r9];
        float r12 = r8[r9 + 1];
        int r13 = r7[r4];
        this.y.b(r11, r6, r10, r12, r13);
        r4 = r4 + 1;
        goto L10
    L13:
        r11.restore();
        return;
    }

    @Override // defpackage.cw0
    public final boolean f(boolean r4, boolean r5, boolean r6) {
        boolean r7 = super.f(r4, r5, r6);
        if (isRunning() == true) goto L5;
        this.z.d();
    L5:
        ee r0 = this.p;
        ContentResolver r1 = this.n.getContentResolver();
        r0.getClass();
        Settings.Global.getFloat(r1, "animator_duration_scale", 1.0f);
        if (r4 == false) goto L10;
        if (r6 == false) goto L10;
        this.z.j();
    L10:
        return r7;
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
