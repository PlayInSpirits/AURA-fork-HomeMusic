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

    public js0(int i, int i2, int i3, int i4, int i5) {
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        float f = Resources.getSystem().getDisplayMetrics().density * 1.0f;
        this.c = i;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(i5);
        this.b = i2;
        this.a = i3;
    }

    @Override // defpackage.kw3
    public final void f(Rect rect, View view, RecyclerView recyclerView, yw3 yw3Var) {
        super.f(rect, view, recyclerView, yw3Var);
        rect.bottom = this.a;
    }

    @Override // defpackage.kw3
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int iCeil;
        int iP0;
        if (recyclerView.getAdapter() != null && (iCeil = (int) Math.ceil(((double) recyclerView.getAdapter().a()) / 5.0d)) > 1) {
            int i = this.c;
            int i2 = i * 2;
            int iMax = Math.max(0, iCeil - 1);
            int i3 = this.b;
            float width = (recyclerView.getWidth() - ((i2 * iCeil) + (iMax * i3))) / 2.0f;
            float height = (recyclerView.getHeight() - this.a) - (i3 / 4.0f);
            float f = i2 + i3;
            float f2 = i;
            float f3 = width + f2;
            float f4 = f3;
            for (int i4 = 0; i4 < iCeil; i4++) {
                canvas.drawCircle(f4, height, f2, this.d);
                f4 += f;
            }
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                iP0 = ((GridLayoutManager) recyclerView.getLayoutManager()).P0();
            } else if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                return;
            } else {
                iP0 = ((LinearLayoutManager) recyclerView.getLayoutManager()).P0();
            }
            if (iP0 == -1 || recyclerView.getLayoutManager().q(iP0) == null) {
                return;
            }
            canvas.drawCircle((float) Math.ceil(((f * iP0) / 5.0f) + f3), height, f2, this.e);
        }
    }
}
