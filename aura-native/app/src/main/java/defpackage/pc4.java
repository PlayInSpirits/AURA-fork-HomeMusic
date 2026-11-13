package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pc4 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public pc4(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.y == null) {
            return;
        }
        if (shapeableImageView.x == null) {
            shapeableImageView.x = new fi2(shapeableImageView.y);
        }
        RectF rectF = shapeableImageView.r;
        Rect rect = this.a;
        rectF.round(rect);
        shapeableImageView.x.setBounds(rect);
        shapeableImageView.x.getOutline(outline);
    }
}
