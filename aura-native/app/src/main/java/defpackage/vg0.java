package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vg0 extends h11 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg0(g11 g11Var, int i) {
        super(g11Var);
        this.e = i;
    }

    @Override // defpackage.h11
    public void q() {
        switch (this.e) {
            case 0:
                g11 g11Var = this.b;
                g11Var.B = null;
                CheckableImageButton checkableImageButton = g11Var.t;
                checkableImageButton.setOnLongClickListener(null);
                au0.R(checkableImageButton, null);
                break;
        }
    }
}
