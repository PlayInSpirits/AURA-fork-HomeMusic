package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
    public final LinkedHashSet B0 = new LinkedHashSet();
    public final LinkedHashSet C0 = new LinkedHashSet();
    public final LinkedHashSet D0 = new LinkedHashSet();
    public final LinkedHashSet E0 = new LinkedHashSet();
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

    public static int p0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarD = a35.d();
        calendarD.set(5, 1);
        Calendar calendarC = a35.c(calendarD);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean q0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(zz1.F(R.attr.materialCalendarStyle, context, nh2.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.s;
        }
        this.F0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.G0 = (ze4) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.I0 = (dy) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            kf2.k();
            return;
        }
        this.K0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.L0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.N0 = bundle.getInt("INPUT_MODE_KEY");
        this.O0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.P0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.Q0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.R0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.L0;
        if (text == null) {
            text = Z().getResources().getText(this.K0);
        }
        this.Y0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.Z0 = text;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.M0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.M0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.T0 = textView;
        WeakHashMap weakHashMap = j65.a;
        int i = 1;
        textView.setAccessibilityLiveRegion(1);
        this.U0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.S0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.U0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.U0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, zz1.r(context, R.drawable.material_ic_calendar_black_24dp));
        int i2 = 0;
        stateListDrawable.addState(new int[0], zz1.r(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.U0.setChecked(this.N0 != 0);
        j65.o(this.U0, null);
        CheckableImageButton checkableImageButton2 = this.U0;
        this.U0.setContentDescription(this.N0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.U0.setOnClickListener(new p6(26, this));
        this.W0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        boolean z = n0().n != null;
        Button button = this.W0;
        if (z) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.W0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.P0;
        if (charSequence != null) {
            this.W0.setText(charSequence);
        } else {
            int i3 = this.O0;
            if (i3 != 0) {
                this.W0.setText(i3);
            }
        }
        this.W0.setOnClickListener(new vh2(this, i2));
        Button button2 = (Button) viewInflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.R0;
        if (charSequence2 != null) {
            button2.setText(charSequence2);
        } else {
            int i4 = this.Q0;
            if (i4 != 0) {
                button2.setText(i4);
            }
        }
        button2.setOnClickListener(new vh2(this, i));
        return viewInflate;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void Q(Bundle bundle) {
        super.Q(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.F0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.G0);
        dy dyVar = this.I0;
        cy cyVar = new cy();
        cyVar.a = cy.f;
        cyVar.b = cy.g;
        cyVar.e = new pi0(Long.MIN_VALUE);
        cyVar.a = dyVar.n.s;
        cyVar.b = dyVar.o.s;
        cyVar.c = Long.valueOf(dyVar.q.s);
        cyVar.d = dyVar.r;
        cyVar.e = dyVar.p;
        nh2 nh2Var = this.J0;
        ix2 ix2Var = nh2Var == null ? null : nh2Var.p0;
        if (ix2Var != null) {
            cyVar.c = Long.valueOf(ix2Var.s);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cyVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.K0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.L0);
        bundle.putInt("INPUT_MODE_KEY", this.N0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.O0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.P0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.Q0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.R0);
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        su3 rb5Var;
        su3 rb5Var2;
        super.R();
        Window window = k0().getWindow();
        if (this.M0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.V0);
            if (!this.X0) {
                View viewFindViewById = a0().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iS = g12.s(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iS);
                }
                l93.d0(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int i2 = i < 27 ? v50.i(g12.s(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i2);
                boolean z3 = g12.B(0) || g12.B(numValueOf.intValue());
                om1 om1Var = new om1(window.getDecorView());
                if (i >= 35) {
                    rb5Var = new tb5(window, om1Var);
                } else if (i >= 30) {
                    rb5Var = new sb5(window, om1Var);
                } else {
                    rb5Var = i >= 26 ? new rb5(window, om1Var) : new qb5(window, om1Var);
                }
                rb5Var.D(z3);
                boolean zB = g12.B(iS);
                if (g12.B(i2) || (i2 == 0 && zB)) {
                    z = true;
                }
                om1 om1Var2 = new om1(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 35) {
                    rb5Var2 = new tb5(window, om1Var2);
                } else if (i3 >= 30) {
                    rb5Var2 = new sb5(window, om1Var2);
                } else {
                    rb5Var2 = i3 >= 26 ? new rb5(window, om1Var2) : new qb5(window, om1Var2);
                }
                rb5Var2.C(z);
                int paddingTop = viewFindViewById.getPaddingTop();
                int i4 = viewFindViewById.getLayoutParams().height;
                j83 j83Var = new j83();
                j83Var.n = i4;
                j83Var.p = viewFindViewById;
                j83Var.o = paddingTop;
                WeakHashMap weakHashMap = j65.a;
                a65.c(viewFindViewById, j83Var);
                this.X0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = r().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.V0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new uz1(k0(), rect));
        }
        r0();
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        this.H0.l0.clear();
        super.S();
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        Context contextZ = Z();
        Context contextZ2 = Z();
        int i = this.F0;
        if (i == 0) {
            n0().getClass();
            i = zz1.F(R.attr.materialCalendarTheme, contextZ2, xh2.class.getCanonicalName()).data;
        }
        Dialog dialog = new Dialog(contextZ, i);
        Context context = dialog.getContext();
        this.M0 = q0(context, android.R.attr.windowFullscreen);
        this.V0 = new fi2(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ht3.x, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.V0.j(context);
        this.V0.m(ColorStateList.valueOf(color));
        fi2 fi2Var = this.V0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = j65.a;
        fi2Var.l(decorView.getElevation());
        return dialog;
    }

    public final ze4 n0() {
        if (this.G0 == null) {
            this.G0 = (ze4) this.s.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.G0;
    }

    public final String o0() {
        ze4 ze4VarN0 = n0();
        Context contextN = n();
        ze4VarN0.getClass();
        Resources resources = contextN.getResources();
        Long l = ze4VarN0.n;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, hw.q(l.longValue()));
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.D0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.T;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void r0() {
        Context contextZ = Z();
        int i = this.F0;
        if (i == 0) {
            n0().getClass();
            i = zz1.F(R.attr.materialCalendarTheme, contextZ, xh2.class.getCanonicalName()).data;
        }
        ze4 ze4VarN0 = n0();
        dy dyVar = this.I0;
        nh2 nh2Var = new nh2();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", ze4VarN0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", dyVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", dyVar.q);
        nh2Var.c0(bundle);
        this.J0 = nh2Var;
        cg3 cg3Var = nh2Var;
        if (this.N0 == 1) {
            ze4 ze4VarN1 = n0();
            dy dyVar2 = this.I0;
            ii2 ii2Var = new ii2();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", ze4VarN1);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", dyVar2);
            ii2Var.c0(bundle2);
            cg3Var = ii2Var;
        }
        this.H0 = cg3Var;
        this.S0.setText((this.N0 == 1 && r().getConfiguration().orientation == 2) ? this.Z0 : this.Y0);
        s0(o0());
        ld1 ld1VarM = m();
        ld1VarM.getClass();
        po poVar = new po(ld1VarM);
        poVar.j(R.id.mtrl_calendar_frame, this.H0, null);
        poVar.f();
        this.H0.h0(new wh2(0, this));
    }

    public final void s0(String str) {
        TextView textView = this.T0;
        ze4 ze4VarN0 = n0();
        Context contextZ = Z();
        ze4VarN0.getClass();
        Resources resources = contextZ.getResources();
        Long l = ze4VarN0.n;
        textView.setContentDescription(resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : hw.q(l.longValue())));
        this.T0.setText(str);
    }
}
