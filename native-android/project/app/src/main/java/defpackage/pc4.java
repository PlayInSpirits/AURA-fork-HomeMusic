package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pc4 extends ViewOutlineProvider {
    public final Rect a;
    public final /* synthetic */ ShapeableImageView b;

    public pc4(ShapeableImageView r1) {
        this.b = r1;
        this.a = new Rect();
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r3, Outline r4) {
        ShapeableImageView r5 = this.b;
        if (r5.y != null) goto L6;
        return;
    L6:
        if (r5.x != null) goto L8;
        r5.x = new fi2(r5.y);
    L8:
        RectF r0 = r5.r;
        Rect r2 = this.a;
        r0.round(r2);
        r5.x.setBounds(r2);
        r5.x.getOutline(r4);
    }
}
