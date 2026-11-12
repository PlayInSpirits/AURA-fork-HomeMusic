package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class re2 extends kc1 {
    public zc1 l0;

    public re2() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        Bundle r0 = this.s;
        if (r0 == null) goto L6;
        r0.getBoolean("single_page_mode");
        return;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r13, ViewGroup r14, Bundle r15) {
        r13.getClass();
        final int r0 = 0;
        View r16 = r13.inflate(R.layout.fragment_login_theme, r14, false);
        int r17 = R.id.card_amber;
        MaterialCardView r18 = (MaterialCardView) uo.s(r16, R.id.card_amber);
        if (r18 == null) goto L44;
        r17 = R.id.card_blue;
        MaterialCardView r1 = (MaterialCardView) uo.s(r16, R.id.card_blue);
        if (r1 == null) goto L44;
        r17 = R.id.card_coral;
        MaterialCardView r2 = (MaterialCardView) uo.s(r16, R.id.card_coral);
        if (r2 == null) goto L44;
        r17 = R.id.card_emerald;
        MaterialCardView r3 = (MaterialCardView) uo.s(r16, R.id.card_emerald);
        if (r3 == null) goto L44;
        r17 = R.id.card_flirt;
        MaterialCardView r4 = (MaterialCardView) uo.s(r16, R.id.card_flirt);
        if (r4 == null) goto L44;
        r17 = R.id.card_purple;
        MaterialCardView r5 = (MaterialCardView) uo.s(r16, R.id.card_purple);
        if (r5 == null) goto L44;
        r17 = R.id.card_slate;
        MaterialCardView r6 = (MaterialCardView) uo.s(r16, R.id.card_slate);
        if (r6 == null) goto L44;
        r17 = R.id.card_teal;
        MaterialCardView r7 = (MaterialCardView) uo.s(r16, R.id.card_teal);
        if (r7 == null) goto L44;
        r17 = R.id.chooseAccentColorContainer;
        if (((LinearLayout) uo.s(r16, R.id.chooseAccentColorContainer)) == null) goto L44;
        r17 = R.id.chooseAccentColorTitle;
        if (((TextView) uo.s(r16, R.id.chooseAccentColorTitle)) == null) goto L44;
        r17 = R.id.defaultDynamicSwitch;
        MaterialSwitch r8 = (MaterialSwitch) uo.s(r16, R.id.defaultDynamicSwitch);
        if (r8 == null) goto L44;
        ConstraintLayout r19 = (ConstraintLayout) r16;
        int r9 = R.id.mainSwitchesContainer;
        if (((LinearLayout) uo.s(r16, R.id.mainSwitchesContainer)) == null) goto L43;
        r9 = R.id.themesList;
        AutoCompleteTextView r10 = (AutoCompleteTextView) uo.s(r16, R.id.themesList);
        if (r10 == null) goto L43;
        r9 = R.id.themesListContainer;
        if (((TextInputLayout) uo.s(r16, R.id.themesListContainer)) == null) goto L43;
        r9 = R.id.trueBlackSwitch;
        MaterialSwitch r11 = (MaterialSwitch) uo.s(r16, R.id.trueBlackSwitch);
        if (r11 == null) goto L43;
        zc1 r110 = new zc1();
        r110.a = r19;
        r110.b = r18;
        r110.c = r1;
        r110.d = r2;
        r110.e = r3;
        r110.f = r4;
        r110.g = r5;
        r110.h = r6;
        r110.i = r7;
        r110.j = r8;
        r110.l = r10;
        r110.k = r11;
        this.l0 = r110;
        final int r111 = 1;
        if (xa3.u("dark_theme_black", false) == false) goto L35;
        zc1 r112 = this.l0;
        r112.getClass();
        ((MaterialSwitch) r112.k).setChecked(true);
    L35:
        zc1 r113 = this.l0;
        r113.getClass();
        ((MaterialSwitch) r113.k).setOnClickListener(new pe2(this, r0));
        zc1 r114 = this.l0;
        r114.getClass();
        ((MaterialSwitch) r114.j).setChecked(ud3.S());
        zc1 r115 = this.l0;
        r115.getClass();
        final int r12 = 5;
        ((MaterialSwitch) r115.j).setOnClickListener(new pe2(this, r12));
        String[] r116 = r().getStringArray(R.array.theme_list_titles);
        r116.getClass();
        List r117 = ti.r0(r116);
        final String[] r118 = r().getStringArray(R.array.theme_list_values);
        r118.getClass();
        ArrayAdapter r20 = new ArrayAdapter(Z(), android.R.layout.simple_dropdown_item_1line, r117);
        zc1 r21 = this.l0;
        r21.getClass();
        AutoCompleteTextView r22 = (AutoCompleteTextView) r21.l;
        r22.setAdapter(r20);
        r22.setThreshold(0);
        fa r23 = new fa(13, r20, r22);
        r22.setOnClickListener(new p6(25, r23));
        final int r24 = 3;
        r22.setOnFocusChangeListener(new p30(3, r23));
        int r25 = ti.m0(r118, ud3.H());
        if (r25 != (-1)) goto L38;
    L40:
        String r119 = ud3.H();
    L41:
        r22.setText(r119, false);
        r22.setOnItemClickListener(new qe2(r118, this));
        zc1 r120 = this.l0;
        r120.getClass();
        final int r26 = 6;
        ((MaterialCardView) r120.f).setOnClickListener(new pe2(this, r26));
        zc1 r121 = this.l0;
        r121.getClass();
        final int r27 = 7;
        ((MaterialCardView) r121.d).setOnClickListener(new pe2(this, r27));
        zc1 r122 = this.l0;
        r122.getClass();
        final int r28 = 8;
        ((MaterialCardView) r122.e).setOnClickListener(new pe2(this, r28));
        zc1 r123 = this.l0;
        r123.getClass();
        final int r29 = 9;
        ((MaterialCardView) r123.e).setOnClickListener(new pe2(this, r29));
        zc1 r124 = this.l0;
        r124.getClass();
        final int r30 = 10;
        ((MaterialCardView) r124.c).setOnClickListener(new pe2(this, r30));
        zc1 r125 = this.l0;
        r125.getClass();
        ((MaterialCardView) r125.g).setOnClickListener(new pe2(this, r111));
        zc1 r126 = this.l0;
        r126.getClass();
        final int r127 = 2;
        ((MaterialCardView) r126.b).setOnClickListener(new pe2(this, r127));
        zc1 r128 = this.l0;
        r128.getClass();
        ((MaterialCardView) r128.i).setOnClickListener(new pe2(this, r24));
        zc1 r129 = this.l0;
        r129.getClass();
        final int r130 = 4;
        ((MaterialCardView) r129.h).setOnClickListener(new pe2(this, r130));
        zc1 r131 = this.l0;
        r131.getClass();
        return (ConstraintLayout) r131.a;
    L38:
        if (r25 >= r117.size()) goto L40;
        r119 = (String) r117.get(r25);
    L43:
        r17 = r9;
    L44:
        nz2.n("Missing required view with ID: ".concat(r16.getResources().getResourceName(r17)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void T(View r2, Bundle r3) {
        r2.getClass();
        String r4 = ud3.m();
        if (r4.equals("DYNAMIC") == false) goto L5;
    L11:
        int r5 = Color.parseColor("#B5076B");
    L12:
        zc1 r1 = this.l0;
        r1.getClass();
        ((MaterialCardView) r1.f).setCardBackgroundColor(r5);
        return;
    L5:
        if (r4.length() == 0) goto L11;
        String r6 = qm4.z0(r4, "HEX:");
        if (xm4.k0(r6, "#", false) == false) goto L10;
        r5 = Color.parseColor(r6);
        goto L12
    L10:
        r5 = Color.parseColor("#".concat(r6));
        goto L12
    }

    public final void h0(String r3) {
        App.b().getClass();
        App.c().edit().putString("color_accent", r3).apply();
        nc1 r4 = l();
        r4.getClass();
        jz4.r((df) r4);
        nc1 r2 = l();
        if (r2 == null) goto L6;
        r2.recreate();
        return;
    }
}
