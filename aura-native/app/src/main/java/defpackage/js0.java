/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.kw3;
import defpackage.yw3;

public final class js0
extends kw3 {
    public final int a;
    public final int b;
    public final int c;
    public final Paint d;
    public final Paint e;

    public js0(int n16, int n17, int n18, int n19, int n26) {
        Paint paint;
        Paint paint2;
        this.d = paint2 = new Paint();
        this.e = paint = new Paint();
        float f16 = Resources.getSystem().getDisplayMetrics().density * 1.0f;
        this.c = n16;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(f16);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(n19);
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(f16);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(n26);
        this.b = n17;
        this.a = n18;
    }

    @Override
    public final void f(Rect rect, View view, RecyclerView recyclerView, yw3 yw32) {
        super.f(rect, view, recyclerView, yw32);
        rect.bottom = this.a;
    }

    @Override
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        block5: {
            int n16;
            float f16;
            float f17;
            float f18;
            float f19;
            block7: {
                block6: {
                    int n17;
                    if (recyclerView.getAdapter() == null || (n17 = (int)Math.ceil((double)recyclerView.getAdapter().a() / 5.0)) <= 1) break block5;
                    int n18 = this.c;
                    int n19 = n18 * 2;
                    f19 = n19 * n17;
                    int n26 = Math.max(0, n17 - 1);
                    int n27 = this.b;
                    float f26 = n26 * n27;
                    f26 = ((float)recyclerView.getWidth() - (f19 + f26)) / 2.0f;
                    f18 = (float)(recyclerView.getHeight() - this.a) - (float)n27 / 4.0f;
                    f17 = n19 + n27;
                    f16 = n18;
                    f26 = f19 = f26 + f16;
                    for (n16 = 0; n16 < n17; ++n16) {
                        canvas.drawCircle(f26, f18, f16, this.d);
                        f26 += f17;
                    }
                    if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) break block6;
                    n16 = ((GridLayoutManager)recyclerView.getLayoutManager()).P0();
                    break block7;
                }
                if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) break block5;
                n16 = ((LinearLayoutManager)recyclerView.getLayoutManager()).P0();
            }
            if (n16 != -1 && recyclerView.getLayoutManager().q(n16) != null) {
                canvas.drawCircle((float)Math.ceil(f17 * (float)n16 / 5.0f + f19), f18, f16, this.e);
            }
        }
    }
}

