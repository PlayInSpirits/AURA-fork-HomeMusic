package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class el4 extends LinearLayout {
    public final TextInputLayout n;
    public final mh o;
    public CharSequence p;
    public final CheckableImageButton q;
    public ColorStateList r;
    public PorterDuff.Mode s;
    public int t;
    public ImageView.ScaleType u;
    public View.OnLongClickListener v;
    public boolean w;

    public el4(TextInputLayout r11, jv3 r12) {
        super(r11.getContext());
        this.n = r11;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton r1 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.q = r1;
        CharSequence r6 = null;
        mh r2 = new mh(getContext(), null);
        this.o = r2;
        if (h12.z(getContext()) == false) goto L5;
        ((ViewGroup.MarginLayoutParams) r1.getLayoutParams()).setMarginEnd(0);
    L5:
        View.OnLongClickListener r5 = this.v;
        r1.setOnClickListener(null);
        au0.R(r1, r5);
        this.v = null;
        r1.setOnLongClickListener(null);
        au0.R(r1, null);
        TypedArray r7 = (TypedArray) r12.o;
        if (r7.hasValue(69) == false) goto L9;
        this.r = h12.r(getContext(), r12, 69);
    L9:
        if (r7.hasValue(70) == false) goto L12;
        this.s = vr1.B(r7.getInt(70, -1), null);
    L12:
        if (r7.hasValue(66) == false) goto L19;
        b(r12.c(66));
        if (r7.hasValue(65) == false) goto L18;
        CharSequence r8 = r7.getText(65);
        if (r1.getContentDescription() == r8) goto L18;
        r1.setContentDescription(r8);
    L18:
        r1.setCheckable(r7.getBoolean(64, true));
    L19:
        int r9 = r7.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (r9 >= 0) goto L22;
        kf2.n("startIconSize cannot be less than 0");
        throw null;
    L22:
        if (r9 == this.t) goto L25;
        this.t = r9;
        r1.setMinimumWidth(r9);
        r1.setMinimumHeight(r9);
    L25:
        if (r7.hasValue(68) == false) goto L27;
        ImageView.ScaleType r4 = au0.h(r7.getInt(68, -1));
        this.u = r4;
        r1.setScaleType(r4);
    L27:
        r2.setVisibility(8);
        r2.setId(R.id.textinput_prefix_text);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap r13 = j65.a;
        r2.setAccessibilityLiveRegion(1);
        r2.setTextAppearance(r7.getResourceId(60, 0));
        if (r7.hasValue(61) == false) goto L30;
        r2.setTextColor(r12.b(61));
    L30:
        CharSequence r14 = r7.getText(59);
        if (TextUtils.isEmpty(r14) == true) goto L34;
        r6 = r14;
    L34:
        this.p = r6;
        r2.setText(r14);
        e();
        addView(r1);
        addView(r2);
    }

    public final int a() {
        CheckableImageButton r0 = this.q;
        if (r0.getVisibility() != 0) goto L5;
        int r1 = r0.getMeasuredWidth();
        int r2 = ((ViewGroup.MarginLayoutParams) r0.getLayoutParams()).getMarginEnd() + r1;
    L6:
        WeakHashMap r3 = j65.a;
        int r4 = getPaddingStart();
        return (this.o.getPaddingStart() + r4) + r2;
    L5:
        r2 = 0;
        goto L6
    }

    public final void b(Drawable r4) {
        CheckableImageButton r0 = this.q;
        r0.setImageDrawable(r4);
        if (r4 == null) goto L6;
        ColorStateList r5 = this.r;
        PorterDuff.Mode r1 = this.s;
        TextInputLayout r2 = this.n;
        au0.b(r2, r0, r5, r1);
        c(true);
        au0.Q(r2, r0, this.r);
        return;
    L6:
        c(false);
        View.OnLongClickListener r6 = this.v;
        r0.setOnClickListener(null);
        au0.R(r0, r6);
        this.v = null;
        r0.setOnLongClickListener(null);
        au0.R(r0, null);
        if (r0.getContentDescription() == null) goto L10;
        r0.setContentDescription(null);
        return;
    }

    public final void c(boolean r4) {
        CheckableImageButton r0 = this.q;
        int r2 = 0;
        if (r0.getVisibility() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == r4) goto L12;
        if (r4 == true) goto L10;
        r2 = 8;
    L10:
        r0.setVisibility(r2);
        d();
        e();
        return;
    L12:
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void d() {
        EditText r0 = this.n.q;
        if (r0 != null) goto L6;
        return;
    L6:
        if (this.q.getVisibility() != 0) goto L8;
        int r1 = 0;
    L9:
        int r2 = r0.getCompoundPaddingTop();
        int r3 = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int r4 = r0.getCompoundPaddingBottom();
        WeakHashMap r5 = j65.a;
        this.o.setPaddingRelative(r1, r2, r3, r4);
        return;
    L8:
        WeakHashMap r6 = j65.a;
        r1 = r0.getPaddingStart();
        goto L9
    }

    public final void e() {
        int r1 = 8;
        if (this.p != null) goto L5;
    L7:
        int r0 = 8;
    L9:
        if (this.q.getVisibility() == 0) goto L11;
        if (r0 == 0) goto L11;
    L12:
        setVisibility(r1);
        this.o.setVisibility(r0);
        this.n.q();
        return;
    L11:
        r1 = 0;
        goto L12
    L5:
        if (this.w == true) goto L7;
        r0 = 0;
        goto L9
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        d();
    }
}
