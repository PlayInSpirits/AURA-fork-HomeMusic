package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lb5 extends kb5 {
    public lb5(pb5 pb5Var, WindowInsets windowInsets) {
        super(pb5Var, windowInsets);
    }

    @Override // defpackage.cb5, defpackage.mb5
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(ob5.a(i));
        return boundingRects;
    }

    @Override // defpackage.cb5, defpackage.mb5
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(ob5.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.cb5, defpackage.mb5
    public void p() {
    }
}
