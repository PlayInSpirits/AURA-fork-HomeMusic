package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 extends h12 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h20(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    private final void S(int i) {
    }

    @Override // defpackage.h12
    public final void H(int i) {
        switch (this.e) {
            case 0:
                break;
            default:
                xr4 xr4Var = (xr4) this.f;
                xr4Var.e = true;
                wr4 wr4Var = (wr4) xr4Var.f.get();
                if (wr4Var != null) {
                    wr4Var.a();
                }
                break;
        }
    }

    @Override // defpackage.h12
    public final void I(Typeface typeface, boolean z) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                k20 k20Var = chip.r;
                chip.setText(k20Var.P0 ? k20Var.R : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    xr4 xr4Var = (xr4) obj;
                    xr4Var.e = true;
                    wr4 wr4Var = (wr4) xr4Var.f.get();
                    if (wr4Var != null) {
                        wr4Var.a();
                    }
                    break;
                }
                break;
        }
    }
}
