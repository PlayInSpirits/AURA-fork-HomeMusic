package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.viewmodel.a;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class po1 extends pp0 {
    public xc5 B0;
    public a C0;
    public ro1 D0;

    public po1() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.C0.c = null;
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Dialog r0 = this.w0;
        Objects.requireNonNull(r0);
        f9 r1 = (f9) r0;
        final int r3 = 0;
        r1.i(-1).setOnClickListener(new no1(this, r3));
        final int r2 = 1;
        r1.i(-3).setOnClickListener(new no1(this, r2));
        RecyclerView r4 = (RecyclerView) this.B0.p;
        Z();
        r4.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.B0.p).setHasFixedSize(true);
        ro1 r5 = new ro1();
        r5.q = Collections.EMPTY_LIST;
        this.D0 = r5;
        ((RecyclerView) this.B0.p).setAdapter(r5);
        ro1 r6 = this.D0;
        r6.q = this.C0.c();
        r6.d();
        new f22(new oo1(this)).i((RecyclerView) this.B0.p);
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r6) {
        View r7 = o().inflate(R.layout.dialog_home_rearrangement, null, false);
        RecyclerView r3 = (RecyclerView) uo.s(r7, R.id.home_sector_item_recycler_view);
        if (r3 == null) goto L10;
        this.B0 = new xc5(6, (LinearLayout) r7, r3);
        nc1 r8 = X();
        e75 r0 = r8.d();
        b75 r4 = gh0.r(r8);
        bq4 r5 = new bq4(r0, r4, b11.e(r8, r4));
        i30 r9 = kx3.a(a.class);
        String r1 = r9.b();
        if (r1 == null) goto L8;
        this.C0 = (a) r5.l(r9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r1));
        vg2 r10 = new vg2(Z(), 0).q((LinearLayout) this.B0.o);
        r10.p(R.string.home_rearrangement_dialog_title);
        vg2 r11 = r10.l(R.string.home_rearrangement_dialog_positive_button, new wr(3));
        r11.k(R.string.home_rearrangement_dialog_neutral_button, new wr(3));
        return r11.j(R.string.home_rearrangement_dialog_negative_button, new wr(4)).create();
    L8:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L10:
        nz2.n("Missing required view with ID: ".concat(r7.getResources().getResourceName(R.id.home_sector_item_recycler_view)));
        return null;
    }
}
