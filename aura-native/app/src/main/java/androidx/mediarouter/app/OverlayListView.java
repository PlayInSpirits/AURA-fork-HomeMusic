package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.hd5;
import defpackage.pb3;
import defpackage.qp2;
import defpackage.wq2;
import defpackage.xa3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList n;

    public OverlayListView(Context context) {
        super(context);
        this.n = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pb3 pb3Var = (pb3) it.next();
                BitmapDrawable bitmapDrawable = pb3Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = pb3Var.a;
                Rect rect = pb3Var.c;
                if (pb3Var.k) {
                    z = false;
                } else {
                    float max = pb3Var.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - pb3Var.i) / pb3Var.e)) : 0.0f;
                    Interpolator interpolator = pb3Var.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i = (int) (pb3Var.g * interpolation);
                    Rect rect2 = pb3Var.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float a = xa3.a(pb3Var.h, 1.0f, interpolation, 1.0f);
                    pb3Var.b = a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (a * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (pb3Var.j && max >= 1.0f) {
                        pb3Var.k = true;
                        hd5 hd5Var = pb3Var.l;
                        if (hd5Var != null) {
                            qp2 qp2Var = (qp2) hd5Var.p;
                            qp2Var.W.remove((wq2) hd5Var.o);
                            qp2Var.S.notifyDataSetChanged();
                        }
                    }
                    z = !pb3Var.k;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new ArrayList();
    }
}
