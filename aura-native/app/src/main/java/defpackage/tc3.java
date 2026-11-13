package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tc3 extends db2 {
    public final /* synthetic */ int q;
    public final /* synthetic */ xg0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc3(xg0 xg0Var, Context context, int i) {
        super(context);
        this.q = i;
        this.r = xg0Var;
    }

    @Override // defpackage.db2
    public final float d(DisplayMetrics displayMetrics) {
        int i;
        switch (this.q) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // defpackage.db2
    public int e(int i) {
        switch (this.q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // defpackage.db2
    public final void h(View view, ww3 ww3Var) {
        int i = this.q;
        DecelerateInterpolator decelerateInterpolator = this.j;
        xg0 xg0Var = this.r;
        switch (i) {
            case 0:
                int[] b = xg0Var.b(xg0Var.a.getLayoutManager(), view);
                int i2 = b[0];
                int i3 = b[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i2), Math.abs(i3))) / 0.3356d);
                if (ceil > 0) {
                    ww3Var.a = i2;
                    ww3Var.b = i3;
                    ww3Var.c = ceil;
                    ww3Var.e = decelerateInterpolator;
                    ww3Var.f = true;
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = xg0Var.a;
                if (recyclerView != null) {
                    int[] b2 = xg0Var.b(recyclerView.getLayoutManager(), view);
                    int i4 = b2[0];
                    int i5 = b2[1];
                    int ceil2 = (int) Math.ceil(e(Math.max(Math.abs(i4), Math.abs(i5))) / 0.3356d);
                    if (ceil2 > 0) {
                        ww3Var.a = i4;
                        ww3Var.b = i5;
                        ww3Var.c = ceil2;
                        ww3Var.e = decelerateInterpolator;
                        ww3Var.f = true;
                        break;
                    }
                }
                break;
        }
    }
}
