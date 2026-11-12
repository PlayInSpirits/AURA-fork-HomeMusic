package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.viewmodel.b;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xc4 extends pp0 {
    public ns3 B0;
    public b C0;
    public rc4 D0;
    public xh2 E0;
    public String F0;
    public String G0;
    public long H0;

    public xc4() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Share r0 = this.D0.d;
        if (r0 == null) goto L5;
        ((TextInputEditText) this.B0.p).setText(r0.getDescription());
    L5:
        this.H0 = this.D0.d.getExpires().getTime();
        ((TextInputEditText) this.B0.q).setText(g12.x(new Date(this.H0)));
        final int r1 = 0;
        ((TextInputEditText) this.B0.q).setFocusable(false);
        ((TextInputEditText) this.B0.q).setOnLongClickListener(null);
        ((TextInputEditText) this.B0.q).setOnClickListener(new vc4(this, r1));
        Dialog r2 = this.w0;
        Objects.requireNonNull(r2);
        final int r3 = 1;
        ((f9) r2).i(-1).setOnClickListener(new vc4(this, r3));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r7) {
        nc1 r8 = X();
        e75 r0 = r8.d();
        b75 r1 = gh0.r(r8);
        bq4 r2 = new bq4(r0, r1, b11.e(r8, r1));
        i30 r9 = kx3.a(b.class);
        String r3 = r9.b();
        if (r3 == null) goto L16;
        this.C0 = (b) r2.l(r9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r3));
        nc1 r10 = X();
        e75 r4 = r10.d();
        b75 r5 = gh0.r(r10);
        bq4 r6 = new bq4(r4, r5, b11.e(r10, r5));
        i30 r11 = kx3.a(rc4.class);
        String r12 = r11.b();
        if (r12 == null) goto L14;
        this.D0 = (rc4) r6.l(r11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r12));
        View r13 = o().inflate(R.layout.dialog_share_update, null, false);
        int r14 = R.id.share_description_text_view;
        TextInputEditText r15 = (TextInputEditText) uo.s(r13, R.id.share_description_text_view);
        if (r15 == null) goto L12;
        r14 = R.id.share_expiration_text_view;
        TextInputEditText r16 = (TextInputEditText) uo.s(r13, R.id.share_expiration_text_view);
        if (r16 == null) goto L12;
        this.B0 = new ns3((LinearLayout) r13, r15, r16, 3);
        vg2 r17 = new vg2(Z(), 0).q((LinearLayout) this.B0.o);
        r17.p(R.string.share_update_dialog_title);
        return r17.l(R.string.share_update_dialog_positive_button, new wr(3)).j(R.string.share_update_dialog_negative_button, new wr(13)).create();
    L12:
        nz2.n("Missing required view with ID: ".concat(r13.getResources().getResourceName(r14)));
        return null;
    L14:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L16:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
