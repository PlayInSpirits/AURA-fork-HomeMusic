package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xh2<S> extends pp0 {
    public final LinkedHashSet B0;
    public final LinkedHashSet C0;
    public final LinkedHashSet D0;
    public final LinkedHashSet E0;
    public int F0;
    public ze4 G0;
    public cg3 H0;
    public dy I0;
    public nh2 J0;
    public int K0;
    public CharSequence L0;
    public boolean M0;
    public int N0;
    public int O0;
    public CharSequence P0;
    public int Q0;
    public CharSequence R0;
    public TextView S0;
    public TextView T0;
    public CheckableImageButton U0;
    public fi2 V0;
    public Button W0;
    public boolean X0;
    public CharSequence Y0;
    public CharSequence Z0;

    public xh2() {
        this.B0 = new LinkedHashSet();
        this.C0 = new LinkedHashSet();
        this.D0 = new LinkedHashSet();
        this.E0 = new LinkedHashSet();
    }

    public static int p0(Context r6) {
        Resources r7 = r6.getResources();
        int r0 = r7.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar r1 = a35.d();
        r1.set(5, 1);
        Calendar r2 = a35.c(r1);
        r2.get(2);
        r2.get(1);
        int r5 = r2.getMaximum(7);
        r2.getActualMaximum(5);
        r2.getTimeInMillis();
        int r3 = r7.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int r4 = r3 * r5;
        int r8 = r5 - 1;
        int r9 = r8 * r7.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        return r9 + (r4 + (r0 * 2));
    }

    public static boolean q0(Context r2, int r3) {
        TypedArray r4 = r2.obtainStyledAttributes(zz1.F(R.attr.materialCalendarStyle, r2, nh2.class.getCanonicalName()).data, new int[]{r3});
        boolean r5 = r4.getBoolean(0, false);
        r4.recycle();
        return r5;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void F(Bundle r4) {
        super.F(r4);
        if (r4 != null) goto L5;
        r4 = this.s;
    L5:
        this.F0 = r4.getInt("OVERRIDE_THEME_RES_ID");
        this.G0 = (ze4) r4.getParcelable("DATE_SELECTOR_KEY");
        this.I0 = (dy) r4.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (r4.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) goto L19;
        this.K0 = r4.getInt("TITLE_TEXT_RES_ID_KEY");
        this.L0 = r4.getCharSequence("TITLE_TEXT_KEY");
        this.N0 = r4.getInt("INPUT_MODE_KEY");
        this.O0 = r4.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.P0 = r4.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.Q0 = r4.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.R0 = r4.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence r5 = this.L0;
        if (r5 != null) goto L11;
        r5 = Z().getResources().getText(this.K0);
    L11:
        this.Y0 = r5;
        if (r5 == null) goto L16;
        CharSequence[] r0 = TextUtils.split(String.valueOf(r5), "\n");
        if (r0.length <= 1) goto L17;
        r5 = r0[0];
    L17:
        this.Z0 = r5;
        return;
    L16:
        r5 = null;
        goto L17
    L19:
        kf2.k();
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r6, ViewGroup r7, Bundle r8) {
        if (this.M0 == false) goto L5;
        int r9 = R.layout.mtrl_picker_fullscreen;
    L6:
        View r10 = r6.inflate(r9, r7);
        Context r11 = r10.getContext();
        if (this.M0 == false) goto L9;
        r10.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(p0(r11), -2));
    L10:
        TextView r12 = (TextView) r10.findViewById(R.id.mtrl_picker_header_selection_text);
        this.T0 = r12;
        WeakHashMap r0 = j65.a;
        int r1 = 1;
        r12.setAccessibilityLiveRegion(1);
        this.U0 = (CheckableImageButton) r10.findViewById(R.id.mtrl_picker_header_toggle);
        this.S0 = (TextView) r10.findViewById(R.id.mtrl_picker_title_text);
        this.U0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton r13 = this.U0;
        StateListDrawable r2 = new StateListDrawable();
        r2.addState(new int[]{android.R.attr.state_checked}, zz1.r(r11, R.drawable.material_ic_calendar_black_24dp));
        int r3 = 0;
        r2.addState(new int[0], zz1.r(r11, R.drawable.material_ic_edit_black_24dp));
        r13.setImageDrawable(r2);
        CheckableImageButton r14 = this.U0;
        if (this.N0 == 0) goto L13;
        boolean r15 = true;
    L14:
        r14.setChecked(r15);
        j65.o(this.U0, null);
        CheckableImageButton r16 = this.U0;
        if (this.N0 != 1) goto L17;
        String r17 = r16.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
    L18:
        this.U0.setContentDescription(r17);
        this.U0.setOnClickListener(new p6(26, this));
        this.W0 = (Button) r10.findViewById(R.id.confirm_button);
        if (n0().n == null) goto L21;
        boolean r18 = true;
    L22:
        Button r19 = this.W0;
        if (r18 == false) goto L25;
        r19.setEnabled(true);
    L26:
        this.W0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence r20 = this.P0;
        if (r20 == null) goto L29;
        this.W0.setText(r20);
    L32:
        this.W0.setOnClickListener(new vh2(this, r3));
        Button r21 = (Button) r10.findViewById(R.id.cancel_button);
        r21.setTag("CANCEL_BUTTON_TAG");
        CharSequence r22 = this.R0;
        if (r22 == null) goto L35;
        r21.setText(r22);
    L38:
        r21.setOnClickListener(new vh2(this, r1));
        return r10;
    L35:
        int r23 = this.Q0;
        if (r23 == 0) goto L38;
        r21.setText(r23);
        goto L38
    L29:
        int r24 = this.O0;
        if (r24 == 0) goto L32;
        this.W0.setText(r24);
        goto L32
    L25:
        r19.setEnabled(false);
        goto L26
    L21:
        r18 = false;
        goto L22
    L17:
        r17 = r16.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        goto L18
    L13:
        r15 = false;
        goto L14
    L9:
        r10.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(p0(r11), -1));
        goto L10
    L5:
        r9 = R.layout.mtrl_picker_dialog;
        goto L6
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void Q(Bundle r6) {
        super.Q(r6);
        r6.putInt("OVERRIDE_THEME_RES_ID", this.F0);
        r6.putParcelable("DATE_SELECTOR_KEY", this.G0);
        dy r1 = this.I0;
        cy r0 = new cy();
        r0.a = cy.f;
        r0.b = cy.g;
        r0.e = new pi0(Long.MIN_VALUE);
        r0.a = r1.n.s;
        r0.b = r1.o.s;
        r0.c = Long.valueOf(r1.q.s);
        r0.d = r1.r;
        r0.e = r1.p;
        nh2 r2 = this.J0;
        if (r2 != null) goto L5;
        ix2 r3 = null;
    L6:
        if (r3 == null) goto L8;
        r0.c = Long.valueOf(r3.s);
    L8:
        r6.putParcelable("CALENDAR_CONSTRAINTS_KEY", r0.a());
        r6.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r6.putInt("TITLE_TEXT_RES_ID_KEY", this.K0);
        r6.putCharSequence("TITLE_TEXT_KEY", this.L0);
        r6.putInt("INPUT_MODE_KEY", this.N0);
        r6.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.O0);
        r6.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.P0);
        r6.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.Q0);
        r6.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.R0);
        return;
    L5:
        r3 = r2.p0;
        goto L6
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Window r0 = k0().getWindow();
        if (this.M0 == false) goto L53;
        r0.setLayout(-1, -1);
        r0.setBackgroundDrawable(this.V0);
        if (this.X0 == true) goto L54;
        View r1 = a0().findViewById(R.id.fullscreen_header);
        if ((r1.getBackground() instanceof ColorDrawable) == false) goto L10;
        Integer r2 = Integer.valueOf(((ColorDrawable) r1.getBackground()).getColor());
    L11:
        boolean r3 = false;
        if (r2 != null) goto L14;
    L17:
        boolean r5 = true;
    L18:
        int r6 = g12.s(r0.getContext(), android.R.attr.colorBackground, -16777216);
        if (r5 == false) goto L21;
        r2 = Integer.valueOf(r6);
    L21:
        l93.d0(r0, false);
        r0.getContext();
        Context r7 = r0.getContext();
        int r8 = Build.VERSION.SDK_INT;
        if (r8 >= 27) goto L24;
        int r9 = v50.i(g12.s(r7, android.R.attr.navigationBarColor, -16777216), 128);
    L25:
        r0.setStatusBarColor(0);
        r0.setNavigationBarColor(r9);
        boolean r4 = g12.B(r2.intValue());
        if (g12.B(0) == true) goto L30;
        if (r4 == true) goto L30;
        boolean r10 = false;
    L31:
        om1 r11 = new om1(r0.getDecorView());
        if (r8 < 35) goto L34;
        su3 r12 = new tb5(r0, r11);
    L39:
        r12.D(r10);
        boolean r13 = g12.B(r6);
        if (g12.B(r9) == true) goto L43;
        if (r9 != 0) goto L44;
        if (r13 == true) goto L43;
    L44:
        om1 r14 = new om1(r0.getDecorView());
        int r15 = Build.VERSION.SDK_INT;
        if (r15 < 35) goto L47;
        su3 r16 = new tb5(r0, r14);
    L52:
        r16.C(r3);
        int r17 = r1.getPaddingTop();
        int r18 = r1.getLayoutParams().height;
        j83 r19 = new j83();
        r19.n = r18;
        r19.p = r1;
        r19.o = r17;
        WeakHashMap r20 = j65.a;
        a65.c(r1, r19);
        this.X0 = true;
        goto L54
    L47:
        if (r15 < 30) goto L49;
        r16 = new sb5(r0, r14);
        goto L52
    L49:
        if (r15 < 26) goto L51;
        r16 = new rb5(r0, r14);
        goto L52
    L51:
        r16 = new qb5(r0, r14);
    L43:
        r3 = true;
        goto L44
    L34:
        if (r8 < 30) goto L36;
        r12 = new sb5(r0, r11);
        goto L39
    L36:
        if (r8 < 26) goto L38;
        r12 = new rb5(r0, r11);
        goto L39
    L38:
        r12 = new qb5(r0, r11);
    L30:
        r10 = true;
        goto L31
    L24:
        r9 = 0;
        goto L25
    L14:
        if (r2.intValue() == 0) goto L17;
        r5 = false;
        goto L18
    L10:
        r2 = null;
    L54:
        r0();
        return;
    L53:
        r0.setLayout(-2, -2);
        int r21 = r().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
        Rect r22 = new Rect(r21, r21, r21, r21);
        r0.setBackgroundDrawable(new InsetDrawable(this.V0, r21, r21, r21, r21));
        r0.getDecorView().setOnTouchListener(new uz1(k0(), r22));
        goto L54
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        this.H0.l0.clear();
        super.S();
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r6) {
        Context r0 = Z();
        Context r1 = Z();
        int r2 = this.F0;
        if (r2 != 0) goto L6;
        n0().getClass();
        r2 = zz1.F(R.attr.materialCalendarTheme, r1, xh2.class.getCanonicalName()).data;
    L6:
        Dialog r7 = new Dialog(r0, r2);
        Context r3 = r7.getContext();
        this.M0 = q0(r3, android.R.attr.windowFullscreen);
        this.V0 = new fi2(r3, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray r4 = r3.obtainStyledAttributes(null, ht3.x, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int r5 = r4.getColor(1, 0);
        r4.recycle();
        this.V0.j(r3);
        this.V0.m(ColorStateList.valueOf(r5));
        fi2 r8 = this.V0;
        View r9 = r7.getWindow().getDecorView();
        WeakHashMap r10 = j65.a;
        r8.l(r9.getElevation());
        return r7;
    }

    public final ze4 n0() {
        if (this.G0 != null) goto L6;
        this.G0 = (ze4) this.s.getParcelable("DATE_SELECTOR_KEY");
    L6:
        return this.G0;
    }

    public final String o0() {
        ze4 r0 = n0();
        Context r2 = n();
        r0.getClass();
        Resources r3 = r2.getResources();
        Long r1 = r0.n;
        if (r1 != null) goto L7;
        return r3.getString(R.string.mtrl_picker_date_header_unselected);
    L7:
        return r3.getString(R.string.mtrl_picker_date_header_selected, new Object[]{hw.q(r1.longValue())});
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r2) {
        Iterator r1 = this.D0.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((DialogInterface.OnCancelListener) r1.next()).onCancel(r2);
        goto L4
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r3) {
        Iterator r0 = this.E0.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((DialogInterface.OnDismissListener) r0.next()).onDismiss(r3);
        goto L4
    L6:
        ViewGroup r1 = (ViewGroup) this.T;
        if (r1 == null) goto L9;
        r1.removeAllViews();
    L9:
        super.onDismiss(r3);
    }

    public final void r0() {
        Context r0 = Z();
        int r1 = this.F0;
        if (r1 != 0) goto L6;
        n0().getClass();
        r1 = zz1.F(R.attr.materialCalendarTheme, r0, xh2.class.getCanonicalName()).data;
    L6:
        ze4 r2 = n0();
        dy r3 = this.I0;
        nh2 r4 = new nh2();
        Bundle r5 = new Bundle();
        r5.putInt("THEME_RES_ID_KEY", r1);
        r5.putParcelable("GRID_SELECTOR_KEY", r2);
        r5.putParcelable("CALENDAR_CONSTRAINTS_KEY", r3);
        r5.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r5.putParcelable("CURRENT_MONTH_KEY", r3.q);
        r4.c0(r5);
        this.J0 = r4;
        cg3 r6 = r4;
        if (this.N0 != 1) goto L9;
        ze4 r7 = n0();
        dy r8 = this.I0;
        ii2 r9 = new ii2();
        Bundle r10 = new Bundle();
        r10.putInt("THEME_RES_ID_KEY", r1);
        r10.putParcelable("DATE_SELECTOR_KEY", r7);
        r10.putParcelable("CALENDAR_CONSTRAINTS_KEY", r8);
        r9.c0(r10);
        r6 = r9;
    L9:
        this.H0 = r6;
        TextView r11 = this.S0;
        if (this.N0 == 1) goto L12;
    L14:
        CharSequence r12 = this.Y0;
    L15:
        r11.setText(r12);
        s0(o0());
        ld1 r13 = m();
        r13.getClass();
        po r14 = new po(r13);
        r14.j(R.id.mtrl_calendar_frame, this.H0, null);
        r14.f();
        this.H0.h0(new wh2(0, this));
        return;
    L12:
        if (r().getConfiguration().orientation != 2) goto L14;
        r12 = this.Z0;
        goto L15
    }

    public final void s0(String r6) {
        TextView r0 = this.T0;
        ze4 r1 = n0();
        Context r2 = Z();
        r1.getClass();
        Resources r3 = r2.getResources();
        Long r4 = r1.n;
        if (r4 != null) goto L5;
        String r5 = r3.getString(R.string.mtrl_picker_announce_current_selection_none);
    L6:
        r0.setContentDescription(r3.getString(R.string.mtrl_picker_announce_current_selection, new Object[]{r5}));
        this.T0.setText(r6);
        return;
    L5:
        r5 = hw.q(r4.longValue());
        goto L6
    }
}
