package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 extends kw3 {
    public final int a;
    public final int b;
    public final int c;
    public final Paint d;
    public final Paint e;

    public js0(int r5, int r6, int r7, int r8, int r9) {
        Paint r0 = new Paint();
        this.d = r0;
        Paint r1 = new Paint();
        this.e = r1;
        float r2 = Resources.getSystem().getDisplayMetrics().density * 1.0f;
        this.c = r5;
        Paint.Cap r10 = Paint.Cap.ROUND;
        r0.setStrokeCap(r10);
        r0.setStrokeWidth(r2);
        r0.setStyle(Paint.Style.STROKE);
        r0.setAntiAlias(true);
        r0.setColor(r8);
        r1.setStrokeCap(r10);
        r1.setStrokeWidth(r2);
        r1.setStyle(Paint.Style.FILL);
        r1.setAntiAlias(true);
        r1.setColor(r9);
        this.b = r6;
        this.a = r7;
    }

    @Override // defpackage.kw3
    public final void f(Rect r1, View r2, RecyclerView r3, yw3 r4) {
        super.f(r1, r2, r3, r4);
        r1.bottom = this.a;
    }

    @Override // defpackage.kw3
    public final void h(Canvas r10, RecyclerView r11) {
        if (r11.getAdapter() == null) goto L27;
        int r0 = (int) Math.ceil(((double) r11.getAdapter().a()) / 5.0d);
        if (r0 <= 1) goto L28;
        int r1 = this.c;
        int r2 = r1 * 2;
        int r5 = 0;
        int r4 = Math.max(0, r0 - 1);
        int r6 = this.b;
        float r7 = (r11.getWidth() - ((r2 * r0) + (r4 * r6))) / 2.0f;
        float r3 = (r11.getHeight() - this.a) - (r6 / 4.0f);
        float r8 = r2 + r6;
        float r9 = r1;
        float r12 = r7 + r9;
        float r13 = r12;
    L9:
        if (r5 >= r0) goto L12;
        r10.drawCircle(r13, r3, r9, this.d);
        r13 = r13 + r8;
        r5 = r5 + 1;
        goto L9
    L12:
        if ((r11.getLayoutManager() instanceof GridLayoutManager) == false) goto L15;
        int r14 = ((GridLayoutManager) r11.getLayoutManager()).P0();
    L18:
        if (r14 != (-1)) goto L21;
        return;
    L21:
        if (r11.getLayoutManager().q(r14) == null) goto L30;
        r10.drawCircle((float) Math.ceil(((r8 * r14) / 5.0f) + r12), r3, r9, this.e);
        return;
    L30:
        return;
    L15:
        if ((r11.getLayoutManager() instanceof LinearLayoutManager) == false) goto L26;
        r14 = ((LinearLayoutManager) r11.getLayoutManager()).P0();
        goto L18
    L26:
        return;
    L28:
        return;
    }
}
