package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pz extends db2 {
    public final /* synthetic */ int q;

    public /* synthetic */ pz(Context r2) {
        this.q = 1;
        super(r2);
    }

    @Override // defpackage.db2
    public int b(View r2, int r3) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return super.b(r2, r3);
    }

    @Override // defpackage.db2
    public int c(View r2, int r3) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return super.c(r2, r3);
    }

    @Override // defpackage.db2
    public float d(DisplayMetrics r2) {
        switch(this.q) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.d(r2);
    L7:
        return 100.0f / r2.densityDpi;
    }

    @Override // defpackage.db2
    public PointF f(int r2) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return null;
    L5:
        return super.f(r2);
    }

    public pz(CarouselLayoutManager r1, Context r2) {
        this.q = 0;
        super(r2);
    }
}
