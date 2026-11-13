package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qz extends kw3 {
    public final Paint a;
    public final List b;

    public qz() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.kw3
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((k42) it.next()).getClass();
            paint.setColor(v50.c(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).G0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.i(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.f(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).q.g(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.h(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
