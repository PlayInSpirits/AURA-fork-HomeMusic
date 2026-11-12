package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k20 k20Var = ((Chip) obj).r;
                if (k20Var == null) {
                    outline.setAlpha(0.0f);
                } else {
                    k20Var.getOutline(outline);
                }
                break;
            case 1:
                nc4 nc4Var = (nc4) obj;
                if (nc4Var.c != null && !nc4Var.d.isEmpty()) {
                    RectF rectF = nc4Var.d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, nc4Var.g);
                    break;
                }
                break;
            default:
                Path path = ((oc4) obj).e;
                if (!path.isEmpty()) {
                    outline.setPath(path);
                }
                break;
        }
    }
}
