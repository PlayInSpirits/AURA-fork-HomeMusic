package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.eddyizm.tempus.App;
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

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Share share = this.D0.d;
        if (share != null) {
            ((TextInputEditText) this.B0.p).setText(share.getDescription());
        }
        this.H0 = this.D0.d.getExpires().getTime();
        ((TextInputEditText) this.B0.q).setText(g12.x(new Date(this.H0)));
        final int i = 0;
        ((TextInputEditText) this.B0.q).setFocusable(false);
        ((TextInputEditText) this.B0.q).setOnLongClickListener(null);
        ((TextInputEditText) this.B0.q).setOnClickListener(new View.OnClickListener(this) { // from class: vc4
            public final /* synthetic */ xc4 o;

            {
                this.o = this;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0129 A[PHI: r3
  0x0129: PHI (r3v10 ix2) = (r3v9 ix2), (r3v16 ix2) binds: [B:24:0x013e, B:19:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:21:0x012b  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ix2 ix2Var;
                int i2 = i;
                xc4 xc4Var = this.o;
                switch (i2) {
                    case 0:
                        cy cyVar = new cy();
                        cyVar.a = cy.f;
                        cyVar.b = cy.g;
                        cyVar.e = new pi0(Long.MIN_VALUE);
                        cyVar.e = new pi0(a35.d().getTimeInMillis());
                        dy dyVarA = cyVar.a();
                        ix2 ix2Var2 = dyVarA.o;
                        ix2 ix2Var3 = dyVarA.n;
                        ze4 ze4Var = new ze4();
                        ze4Var.n = Long.valueOf(a35.a(xc4Var.H0));
                        if (dyVarA.q == null) {
                            if (ze4Var.a().isEmpty()) {
                                ix2Var = new ix2(a35.d());
                                if (ix2Var.compareTo(ix2Var3) >= 0) {
                                    ix2Var3 = ix2Var;
                                }
                            } else {
                                ix2Var = ix2.c(((Long) ze4Var.a().iterator().next()).longValue());
                                if (ix2Var.compareTo(ix2Var3) < 0 || ix2Var.compareTo(ix2Var2) > 0) {
                                    ix2Var = new ix2(a35.d());
                                    if (ix2Var.compareTo(ix2Var3) >= 0 && ix2Var.compareTo(ix2Var2) <= 0) {
                                        ix2Var3 = ix2Var;
                                    }
                                } else {
                                    ix2Var3 = ix2Var;
                                }
                            }
                            dyVarA.q = ix2Var3;
                        }
                        xh2 xh2Var = new xh2();
                        Bundle bundle = new Bundle();
                        bundle.putInt("OVERRIDE_THEME_RES_ID", 0);
                        bundle.putParcelable("DATE_SELECTOR_KEY", ze4Var);
                        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", dyVarA);
                        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                        bundle.putInt("TITLE_TEXT_RES_ID_KEY", R.string.mtrl_picker_date_header_title);
                        bundle.putCharSequence("TITLE_TEXT_KEY", null);
                        bundle.putInt("INPUT_MODE_KEY", 0);
                        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
                        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
                        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
                        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
                        xh2Var.c0(bundle);
                        xc4Var.E0 = xh2Var;
                        xh2Var.B0.add(new wc4(xc4Var));
                        xc4Var.E0.m0(xc4Var.X().k(), null);
                        break;
                    default:
                        Editable text = ((TextInputEditText) xc4Var.B0.p).getText();
                        Objects.requireNonNull(text);
                        xc4Var.F0 = text.toString().trim();
                        Editable text2 = ((TextInputEditText) xc4Var.B0.q).getText();
                        Objects.requireNonNull(text2);
                        xc4Var.G0 = text2.toString().trim();
                        if (TextUtils.isEmpty(xc4Var.F0)) {
                            ((TextInputEditText) xc4Var.B0.p).setError(xc4Var.s(R.string.error_required));
                        } else if (!TextUtils.isEmpty(xc4Var.G0)) {
                            rc4 rc4Var = xc4Var.D0;
                            String str = xc4Var.F0;
                            long j = xc4Var.H0;
                            hh3 hh3Var = rc4Var.c;
                            String id = rc4Var.d.getId();
                            Long lValueOf = Long.valueOf(j);
                            hh3Var.getClass();
                            wo0 wo0VarI = App.e(ud3.D()).i();
                            wo0VarI.getClass();
                            Log.d("BrowsingClient", "updateShare()");
                            ((hd4) wo0VarI.o).d(((pn4) wo0VarI.n).f(), id, str, lValueOf).enqueue(new hh3(25));
                            xc4Var.C0.g(xc4Var.X());
                            Dialog dialog = xc4Var.w0;
                            Objects.requireNonNull(dialog);
                            dialog.dismiss();
                        } else {
                            ((TextInputEditText) xc4Var.B0.q).setError(xc4Var.s(R.string.error_required));
                        }
                        break;
                }
            }
        });
        Dialog dialog = this.w0;
        Objects.requireNonNull(dialog);
        final int i2 = 1;
        ((f9) dialog).i(-1).setOnClickListener(new View.OnClickListener(this) { // from class: vc4
            public final /* synthetic */ xc4 o;

            {
                this.o = this;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0129 A[PHI: r3
  0x0129: PHI (r3v10 ix2) = (r3v9 ix2), (r3v16 ix2) binds: [B:24:0x013e, B:19:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:21:0x012b  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ix2 ix2Var;
                int i3 = i2;
                xc4 xc4Var = this.o;
                switch (i3) {
                    case 0:
                        cy cyVar = new cy();
                        cyVar.a = cy.f;
                        cyVar.b = cy.g;
                        cyVar.e = new pi0(Long.MIN_VALUE);
                        cyVar.e = new pi0(a35.d().getTimeInMillis());
                        dy dyVarA = cyVar.a();
                        ix2 ix2Var2 = dyVarA.o;
                        ix2 ix2Var3 = dyVarA.n;
                        ze4 ze4Var = new ze4();
                        ze4Var.n = Long.valueOf(a35.a(xc4Var.H0));
                        if (dyVarA.q == null) {
                            if (ze4Var.a().isEmpty()) {
                                ix2Var = new ix2(a35.d());
                                if (ix2Var.compareTo(ix2Var3) >= 0) {
                                    ix2Var3 = ix2Var;
                                }
                            } else {
                                ix2Var = ix2.c(((Long) ze4Var.a().iterator().next()).longValue());
                                if (ix2Var.compareTo(ix2Var3) < 0 || ix2Var.compareTo(ix2Var2) > 0) {
                                    ix2Var = new ix2(a35.d());
                                    if (ix2Var.compareTo(ix2Var3) >= 0 && ix2Var.compareTo(ix2Var2) <= 0) {
                                        ix2Var3 = ix2Var;
                                    }
                                } else {
                                    ix2Var3 = ix2Var;
                                }
                            }
                            dyVarA.q = ix2Var3;
                        }
                        xh2 xh2Var = new xh2();
                        Bundle bundle = new Bundle();
                        bundle.putInt("OVERRIDE_THEME_RES_ID", 0);
                        bundle.putParcelable("DATE_SELECTOR_KEY", ze4Var);
                        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", dyVarA);
                        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                        bundle.putInt("TITLE_TEXT_RES_ID_KEY", R.string.mtrl_picker_date_header_title);
                        bundle.putCharSequence("TITLE_TEXT_KEY", null);
                        bundle.putInt("INPUT_MODE_KEY", 0);
                        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
                        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
                        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
                        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
                        xh2Var.c0(bundle);
                        xc4Var.E0 = xh2Var;
                        xh2Var.B0.add(new wc4(xc4Var));
                        xc4Var.E0.m0(xc4Var.X().k(), null);
                        break;
                    default:
                        Editable text = ((TextInputEditText) xc4Var.B0.p).getText();
                        Objects.requireNonNull(text);
                        xc4Var.F0 = text.toString().trim();
                        Editable text2 = ((TextInputEditText) xc4Var.B0.q).getText();
                        Objects.requireNonNull(text2);
                        xc4Var.G0 = text2.toString().trim();
                        if (TextUtils.isEmpty(xc4Var.F0)) {
                            ((TextInputEditText) xc4Var.B0.p).setError(xc4Var.s(R.string.error_required));
                        } else if (!TextUtils.isEmpty(xc4Var.G0)) {
                            rc4 rc4Var = xc4Var.D0;
                            String str = xc4Var.F0;
                            long j = xc4Var.H0;
                            hh3 hh3Var = rc4Var.c;
                            String id = rc4Var.d.getId();
                            Long lValueOf = Long.valueOf(j);
                            hh3Var.getClass();
                            wo0 wo0VarI = App.e(ud3.D()).i();
                            wo0VarI.getClass();
                            Log.d("BrowsingClient", "updateShare()");
                            ((hd4) wo0VarI.o).d(((pn4) wo0VarI.n).f(), id, str, lValueOf).enqueue(new hh3(25));
                            xc4Var.C0.g(xc4Var.X());
                            Dialog dialog2 = xc4Var.w0;
                            Objects.requireNonNull(dialog2);
                            dialog2.dismiss();
                        } else {
                            ((TextInputEditText) xc4Var.B0.q).setError(xc4Var.s(R.string.error_required));
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        nc1 nc1VarX = X();
        e75 e75VarD = nc1VarX.d();
        b75 b75VarR = gh0.r(nc1VarX);
        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
        i30 i30VarA = kx3.a(b.class);
        String strB = i30VarA.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.C0 = (b) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        nc1 nc1VarX2 = X();
        e75 e75VarD2 = nc1VarX2.d();
        b75 b75VarR2 = gh0.r(nc1VarX2);
        bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
        i30 i30VarA2 = kx3.a(rc4.class);
        String strB2 = i30VarA2.b();
        if (strB2 == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.D0 = (rc4) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
        View viewInflate = o().inflate(R.layout.dialog_share_update, (ViewGroup) null, false);
        int i = R.id.share_description_text_view;
        TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.share_description_text_view);
        if (textInputEditText != null) {
            i = R.id.share_expiration_text_view;
            TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(viewInflate, R.id.share_expiration_text_view);
            if (textInputEditText2 != null) {
                this.B0 = new ns3((LinearLayout) viewInflate, textInputEditText, textInputEditText2, 3);
                vg2 vg2VarQ = new vg2(Z(), 0).q((LinearLayout) this.B0.o);
                vg2VarQ.p(R.string.share_update_dialog_title);
                return vg2VarQ.l(R.string.share_update_dialog_positive_button, new wr(3)).j(R.string.share_update_dialog_negative_button, new wr(13)).create();
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
