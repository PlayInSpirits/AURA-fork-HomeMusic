package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o43 implements gw0 {
    public final /* synthetic */ NavigationView a;

    public o43(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // defpackage.gw0
    public final void a(float f) {
    }

    @Override // defpackage.gw0
    public final void b(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            qp4 qp4Var = navigationView.G;
            Objects.requireNonNull(qp4Var);
            view.post(new qa1(23, qp4Var));
        }
    }

    @Override // defpackage.gw0
    public final void c(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            qp4 qp4Var = navigationView.G;
            ah2 ah2Var = (ah2) qp4Var.a;
            if (ah2Var != null) {
                ah2Var.c((View) qp4Var.c);
            }
        }
    }
}
