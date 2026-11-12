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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qz extends kw3 {
    public final Paint a;
    public final List b;

    public qz() {
        Paint r0 = new Paint();
        this.a = r0;
        this.b = Collections.unmodifiableList(new ArrayList());
        r0.setStrokeWidth(5.0f);
        r0.setColor(-65281);
    }

    @Override // defpackage.kw3
    public final void h(Canvas r8, RecyclerView r9) {
        float r0 = r9.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint r6 = this.a;
        r6.setStrokeWidth(r0);
        Iterator r7 = this.b.iterator();
    L4:
        if (r7.hasNext() == false) goto L10;
        ((k42) r7.next()).getClass();
        r6.setColor(v50.c(-65281, 0.0f, -16776961));
        if (((CarouselLayoutManager) r9.getLayoutManager()).G0() == false) goto L8;
        Canvas r1 = r8;
        r1.drawLine(0.0f, ((CarouselLayoutManager) r9.getLayoutManager()).q.i(), 0.0f, ((CarouselLayoutManager) r9.getLayoutManager()).q.f(), r6);
    L9:
        r8 = r1;
        goto L4
    L8:
        r1 = r8;
        r1.drawLine(((CarouselLayoutManager) r9.getLayoutManager()).q.g(), 0.0f, ((CarouselLayoutManager) r9.getLayoutManager()).q.h(), 0.0f, r6);
        goto L9
    }
}
