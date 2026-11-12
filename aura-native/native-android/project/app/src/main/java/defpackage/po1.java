package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.viewmodel.a;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class po1 extends pp0 {
    public xc5 B0;
    public a C0;
    public ro1 D0;

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.C0.c = null;
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Dialog dialog = this.w0;
        Objects.requireNonNull(dialog);
        f9 f9Var = (f9) dialog;
        final int i = 0;
        f9Var.i(-1).setOnClickListener(new View.OnClickListener(this) { // from class: no1
            public final /* synthetic */ po1 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                po1 po1Var = this.o;
                switch (i2) {
                    case 0:
                        a aVar = po1Var.C0;
                        List list = po1Var.D0.q;
                        aVar.getClass();
                        ud3.l0(list);
                        po1Var.i0(false, false);
                        break;
                    default:
                        po1Var.C0.getClass();
                        ud3.l0(null);
                        po1Var.i0(false, false);
                        break;
                }
            }
        });
        final int i2 = 1;
        f9Var.i(-3).setOnClickListener(new View.OnClickListener(this) { // from class: no1
            public final /* synthetic */ po1 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                po1 po1Var = this.o;
                switch (i3) {
                    case 0:
                        a aVar = po1Var.C0;
                        List list = po1Var.D0.q;
                        aVar.getClass();
                        ud3.l0(list);
                        po1Var.i0(false, false);
                        break;
                    default:
                        po1Var.C0.getClass();
                        ud3.l0(null);
                        po1Var.i0(false, false);
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.B0.p;
        Z();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.B0.p).setHasFixedSize(true);
        ro1 ro1Var = new ro1();
        ro1Var.q = Collections.EMPTY_LIST;
        this.D0 = ro1Var;
        ((RecyclerView) this.B0.p).setAdapter(ro1Var);
        ro1 ro1Var2 = this.D0;
        ro1Var2.q = this.C0.c();
        ro1Var2.d();
        new f22(new oo1(this)).i((RecyclerView) this.B0.p);
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        View viewInflate = o().inflate(R.layout.dialog_home_rearrangement, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.home_sector_item_recycler_view);
        if (recyclerView == null) {
            nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.home_sector_item_recycler_view)));
            return null;
        }
        this.B0 = new xc5(6, (LinearLayout) viewInflate, recyclerView);
        nc1 nc1VarX = X();
        e75 e75VarD = nc1VarX.d();
        b75 b75VarR = gh0.r(nc1VarX);
        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
        i30 i30VarA = kx3.a(a.class);
        String strB = i30VarA.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.C0 = (a) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        vg2 vg2VarQ = new vg2(Z(), 0).q((LinearLayout) this.B0.o);
        vg2VarQ.p(R.string.home_rearrangement_dialog_title);
        vg2 vg2VarL = vg2VarQ.l(R.string.home_rearrangement_dialog_positive_button, new wr(3));
        vg2VarL.k(R.string.home_rearrangement_dialog_neutral_button, new wr(3));
        return vg2VarL.j(R.string.home_rearrangement_dialog_negative_button, new wr(4)).create();
    }
}
