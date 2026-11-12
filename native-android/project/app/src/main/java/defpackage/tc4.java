package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tc4 extends cx3 {
    public final x12 u;
    public final /* synthetic */ uc4 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public tc4(uc4 uc4Var, x12 x12Var) {
        this.v = uc4Var;
        ConstraintLayout constraintLayout = x12Var.a;
        super(constraintLayout);
        this.u = x12Var;
        final int i = 1;
        x12Var.e.setSelected(true);
        x12Var.c.setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: sc4
            public final /* synthetic */ tc4 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                tc4 tc4Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        uc4 uc4Var2 = tc4Var.v;
                        bundle.putParcelable("share_object", (Parcelable) uc4Var2.s.get(tc4Var.c()));
                        uc4Var2.r.onShareClick(bundle);
                        break;
                    default:
                        tc4Var.s();
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(21, this));
        x12Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: sc4
            public final /* synthetic */ tc4 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                tc4 tc4Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        uc4 uc4Var2 = tc4Var.v;
                        bundle.putParcelable("share_object", (Parcelable) uc4Var2.s.get(tc4Var.c()));
                        uc4Var2.r.onShareClick(bundle);
                        break;
                    default:
                        tc4Var.s();
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        uc4 uc4Var = this.v;
        bundle.putParcelable("share_object", (Parcelable) uc4Var.s.get(c()));
        uc4Var.r.onShareLongClick(bundle);
    }
}
