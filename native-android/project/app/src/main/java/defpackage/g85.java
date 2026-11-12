package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g85 extends f85 {
    @Override // defpackage.wr1
    public final float D(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.wr1
    public final void R(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.f85
    public final void V(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.f85
    public final void W(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.f85
    public final void X(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.f85
    public final void Y(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
