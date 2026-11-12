package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g11 extends LinearLayout {
    public ImageView.ScaleType A;
    public View.OnLongClickListener B;
    public CharSequence C;
    public final mh D;
    public boolean E;
    public EditText F;
    public final AccessibilityManager G;
    public g3 H;
    public final e11 I;
    public final TextInputLayout n;
    public final FrameLayout o;
    public final CheckableImageButton p;
    public ColorStateList q;
    public PorterDuff.Mode r;
    public View.OnLongClickListener s;
    public final CheckableImageButton t;
    public final tu u;
    public int v;
    public final LinkedHashSet w;
    public ColorStateList x;
    public PorterDuff.Mode y;
    public int z;

    public g11(TextInputLayout r19, jv3 r20) {
        super(r19.getContext());
        this.v = 0;
        this.w = new LinkedHashSet();
        this.I = new e11(this);
        f11 r4 = new f11(this);
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.n = r19;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout r6 = new FrameLayout(getContext());
        this.o = r6;
        r6.setVisibility(8);
        r6.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater r7 = LayoutInflater.from(getContext());
        CheckableImageButton r11 = (CheckableImageButton) r7.inflate(R.layout.design_text_input_end_icon, this, false);
        r11.setId(R.id.text_input_error_icon);
        if (h12.z(getContext()) == false) goto L5;
        ((ViewGroup.MarginLayoutParams) r11.getLayoutParams()).setMarginStart(0);
    L5:
        this.p = r11;
        CheckableImageButton r8 = (CheckableImageButton) r7.inflate(R.layout.design_text_input_end_icon, r6, false);
        r8.setId(R.id.text_input_end_icon);
        if (h12.z(getContext()) == false) goto L8;
        ((ViewGroup.MarginLayoutParams) r8.getLayoutParams()).setMarginStart(0);
    L8:
        this.t = r8;
        tu r10 = new tu();
        r10.c = new SparseArray();
        r10.d = this;
        TypedArray r12 = (TypedArray) r20.o;
        r10.a = r12.getResourceId(28, 0);
        r10.b = r12.getResourceId(52, 0);
        this.u = r10;
        CharSequence r13 = null;
        mh r14 = new mh(getContext(), null);
        this.D = r14;
        TypedArray r15 = (TypedArray) r20.o;
        if (r15.hasValue(38) == false) goto L12;
        this.q = h12.r(getContext(), r20, 38);
    L12:
        if (r15.hasValue(39) == false) goto L15;
        this.r = vr1.B(r15.getInt(39, -1), null);
    L15:
        if (r15.hasValue(37) == false) goto L17;
        h(r20.c(37));
    L17:
        r11.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap r16 = j65.a;
        r11.setImportantForAccessibility(2);
        r11.setClickable(false);
        r11.setPressable(false);
        r11.setFocusable(false);
        if (r15.hasValue(53) == true) goto L26;
        if (r15.hasValue(32) == false) goto L23;
        this.x = h12.r(getContext(), r20, 32);
    L23:
        if (r15.hasValue(33) == false) goto L26;
        this.y = vr1.B(r15.getInt(33, -1), null);
    L26:
        if (r15.hasValue(30) == false) goto L34;
        f(r15.getInt(30, 0));
        if (r15.hasValue(27) == false) goto L32;
        CharSequence r9 = r15.getText(27);
        if (r8.getContentDescription() == r9) goto L32;
        r8.setContentDescription(r9);
    L32:
        r8.setCheckable(r15.getBoolean(26, true));
    L44:
        int r17 = r15.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (r17 >= 0) goto L47;
        kf2.n("endIconSize cannot be less than 0");
        throw null;
    L47:
        if (r17 == this.z) goto L50;
        this.z = r17;
        r8.setMinimumWidth(r17);
        r8.setMinimumHeight(r17);
        r11.setMinimumWidth(r17);
        r11.setMinimumHeight(r17);
    L50:
        if (r15.hasValue(31) == false) goto L52;
        ImageView.ScaleType r18 = au0.h(r15.getInt(31, -1));
        this.A = r18;
        r8.setScaleType(r18);
        r11.setScaleType(r18);
    L52:
        r14.setVisibility(8);
        r14.setId(R.id.textinput_suffix_text);
        r14.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        r14.setAccessibilityLiveRegion(1);
        r14.setTextAppearance(r15.getResourceId(72, 0));
        if (r15.hasValue(73) == false) goto L55;
        r14.setTextColor(r20.b(73));
    L55:
        CharSequence r2 = r15.getText(71);
        if (TextUtils.isEmpty(r2) == true) goto L59;
        r13 = r2;
    L59:
        this.C = r13;
        r14.setText(r2);
        m();
        r6.addView(r8);
        addView(r14);
        addView(r6);
        addView(r11);
        r19.r0.add(r4);
        if (r19.q == null) goto L62;
        r4.a(r19);
    L62:
        addOnAttachStateChangeListener(new bc(2, this));
        return;
    L34:
        if (r15.hasValue(53) == false) goto L44;
        if (r15.hasValue(54) == false) goto L39;
        this.x = h12.r(getContext(), r20, 54);
    L39:
        if (r15.hasValue(55) == false) goto L41;
        this.y = vr1.B(r15.getInt(55, -1), null);
    L41:
        f(r15.getBoolean(53, false) ? 1 : 0);
        CharSequence r21 = r15.getText(51);
        if (r8.getContentDescription() == r21) goto L44;
        r8.setContentDescription(r21);
        goto L44
    }

    public final h11 a() {
        int r0 = this.v;
        tu r4 = this.u;
        SparseArray r1 = (SparseArray) r4.c;
        h11 r2 = (h11) r1.get(r0);
        if (r2 != null) goto L22;
        g11 r3 = (g11) r4.d;
        if (r0 == (-1)) goto L19;
        int r5 = 1;
        if (r0 == 0) goto L18;
        if (r0 != 1) goto L10;
        h11 r6 = new ee3(r3, r4.b);
    L20:
        r1.append(r0, r6);
        return r6;
    L10:
        if (r0 != 2) goto L12;
        r6 = new s30(r3);
        goto L20
    L12:
        if (r0 != 3) goto L14;
        r6 = new ix0(r3);
        goto L20
    L14:
        kf2.n(f34.f(r0, "Invalid end icon mode: "));
        return null;
    L18:
        r6 = new vg0(r3, r5);
        goto L20
    L19:
        r6 = new vg0(r3, 0);
        goto L20
    L22:
        return r2;
    }

    public final int b() {
        if (c() == false) goto L5;
    L8:
        CheckableImageButton r0 = this.t;
        int r1 = r0.getMeasuredWidth();
        int r2 = ((ViewGroup.MarginLayoutParams) r0.getLayoutParams()).getMarginStart() + r1;
    L9:
        WeakHashMap r3 = j65.a;
        int r4 = getPaddingEnd();
        return (this.D.getPaddingEnd() + r4) + r2;
    L5:
        if (d() == true) goto L8;
        r2 = 0;
        goto L9
    }

    public final boolean c() {
        if (this.o.getVisibility() == 0) goto L5;
        return false;
    L5:
        if (this.t.getVisibility() != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean d() {
        if (this.p.getVisibility() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void e(boolean r6) {
        h11 r0 = a();
        boolean r1 = r0.j();
        CheckableImageButton r2 = this.t;
        boolean r3 = true;
        if (r1 == false) goto L7;
        boolean r4 = r2.q;
        if (r4 == r0.k()) goto L7;
        r2.setChecked(!r4);
        boolean r5 = true;
    L9:
        if ((r0 instanceof ix0) == false) goto L13;
        boolean r7 = r2.isActivated();
        if (r7 == ((ix0) r0).l) goto L13;
        r2.setActivated(!r7);
    L14:
        if (r6 == true) goto L18;
        if (r3 == true) goto L18;
        return;
    L18:
        au0.Q(this.n, r2, this.x);
        return;
    L13:
        r3 = r5;
    L7:
        r5 = false;
        goto L9
    }

    public final void f(int r9) {
        if (this.v != r9) goto L5;
        return;
    L5:
        h11 r0 = a();
        g3 r1 = this.H;
        AccessibilityManager r2 = this.G;
        if (r1 == null) goto L9;
        if (r2 == null) goto L9;
        r2.removeTouchExplorationStateChangeListener(new h3(r1));
    L9:
        CharSequence r3 = null;
        this.H = null;
        r0.r();
        this.v = r9;
        Iterator r4 = this.w.iterator();
        if (r4.hasNext() == true) goto L46;
        if (r9 == 0) goto L14;
        boolean r5 = true;
    L15:
        g(r5);
        h11 r6 = a();
        int r7 = this.u.a;
        if (r7 != 0) goto L18;
        r7 = r6.d();
    L18:
        if (r7 == 0) goto L20;
        Drawable r8 = zz1.r(getContext(), r7);
    L21:
        CheckableImageButton r10 = this.t;
        r10.setImageDrawable(r8);
        TextInputLayout r11 = this.n;
        if (r8 == null) goto L24;
        au0.b(r11, r10, this.x, this.y);
        au0.Q(r11, r10, this.x);
    L24:
        int r12 = r6.c();
        if (r12 == 0) goto L28;
        r3 = getResources().getText(r12);
    L28:
        if (r10.getContentDescription() == r3) goto L30;
        r10.setContentDescription(r3);
    L30:
        r10.setCheckable(r6.j());
        if (r6.i(r11.getBoxBackgroundMode()) == false) goto L43;
        r6.q();
        g3 r13 = r6.h();
        this.H = r13;
        if (r13 == null) goto L38;
        if (r2 == null) goto L38;
        WeakHashMap r14 = j65.a;
        if (isAttachedToWindow() == false) goto L38;
        r2.addTouchExplorationStateChangeListener(new h3(this.H));
    L38:
        View.OnClickListener r15 = r6.f();
        View.OnLongClickListener r16 = this.B;
        r10.setOnClickListener(r15);
        au0.R(r10, r16);
        EditText r17 = this.F;
        if (r17 == null) goto L41;
        r6.l(r17);
        i(r6);
    L41:
        au0.b(r11, r10, this.x, this.y);
        e(true);
        return;
    L43:
        nz2.d(r11.getBoxBackgroundMode(), r9, " is not supported by the end icon mode ", "The current box background mode ");
        return;
    L20:
        r8 = null;
        goto L21
    L14:
        r5 = false;
        goto L15
    L46:
        throw xa3.d(r4);
    }

    public final void g(boolean r2) {
        if (c() == r2) goto L9;
        if (r2 == false) goto L6;
        int r3 = 0;
    L7:
        this.t.setVisibility(r3);
        j();
        l();
        this.n.q();
        return;
    L6:
        r3 = 8;
        goto L7
    }

    public final void h(Drawable r3) {
        CheckableImageButton r0 = this.p;
        r0.setImageDrawable(r3);
        k();
        ColorStateList r4 = this.q;
        PorterDuff.Mode r1 = this.r;
        au0.b(this.n, r0, r4, r1);
    }

    public final void i(h11 r3) {
        if (this.F != null) goto L6;
        return;
    L6:
        if (r3.e() == null) goto L9;
        this.F.setOnFocusChangeListener(r3.e());
    L9:
        if (r3.g() == null) goto L12;
        this.t.setOnFocusChangeListener(r3.g());
        return;
    }

    public final void j() {
        int r1 = 8;
        if (this.t.getVisibility() == 0) goto L5;
    L7:
        int r0 = 8;
    L8:
        this.o.setVisibility(r0);
        if (this.C != null) goto L11;
    L13:
        char r2 = '\b';
    L15:
        if (c() == false) goto L17;
    L19:
        r1 = 0;
    L20:
        setVisibility(r1);
        return;
    L17:
        if (d() == true) goto L19;
        if (r2 != 0) goto L20;
    L11:
        if (this.E == true) goto L13;
        r2 = 0;
        goto L15
    L5:
        if (d() == true) goto L7;
        r0 = 0;
        goto L8
    }

    public final void k() {
        CheckableImageButton r0 = this.p;
        Drawable r1 = r0.getDrawable();
        TextInputLayout r2 = this.n;
        if (r1 != null) goto L5;
    L9:
        int r3 = 8;
    L10:
        r0.setVisibility(r3);
        j();
        l();
        if (this.v == 0) goto L13;
        return;
    L13:
        r2.q();
        return;
    L5:
        if (r2.w.q == false) goto L9;
        if (r2.m() == false) goto L9;
        r3 = 0;
        goto L10
    }

    public final void l() {
        TextInputLayout r0 = this.n;
        if (r0.q != null) goto L6;
        return;
    L6:
        if (c() == false) goto L8;
    L11:
        int r1 = 0;
    L12:
        int r2 = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int r3 = r0.q.getPaddingTop();
        int r4 = r0.q.getPaddingBottom();
        WeakHashMap r5 = j65.a;
        this.D.setPaddingRelative(r2, r3, r1, r4);
        return;
    L8:
        if (d() == true) goto L11;
        EditText r6 = r0.q;
        WeakHashMap r7 = j65.a;
        r1 = r6.getPaddingEnd();
        goto L12
    }

    public final void m() {
        mh r0 = this.D;
        int r1 = r0.getVisibility();
        boolean r3 = false;
        if (this.C != null) goto L5;
    L7:
        int r2 = 8;
    L8:
        if (r1 == r2) goto L13;
        h11 r4 = a();
        if (r2 != 0) goto L12;
        r3 = true;
    L12:
        r4.o(r3);
    L13:
        j();
        r0.setVisibility(r2);
        this.n.q();
        return;
    L5:
        if (this.E == true) goto L7;
        r2 = 0;
        goto L8
    }
}
