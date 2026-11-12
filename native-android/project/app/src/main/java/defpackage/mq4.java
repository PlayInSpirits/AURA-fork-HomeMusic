package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mq4 extends LinearLayout {
    public static final /* synthetic */ int y = 0;
    public kq4 n;
    public TextView o;
    public ImageView p;
    public View q;
    public yo r;
    public View s;
    public TextView t;
    public ImageView u;
    public Drawable v;
    public int w;
    public final /* synthetic */ TabLayout x;

    public mq4(TabLayout r5, Context r6) {
        this.x = r5;
        super(r6);
        this.w = 2;
        e(r6);
        int r7 = r5.r;
        int r0 = r5.s;
        int r1 = r5.t;
        int r2 = r5.u;
        WeakHashMap r3 = j65.a;
        setPaddingRelative(r7, r0, r1, r2);
        setGravity(17);
        setOrientation(!r5.P ? 1 : 0);
        setClickable(true);
        c65.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private yo getBadge() {
        return this.r;
    }

    private yo getOrCreateBadge() {
        if (this.r != null) goto L5;
        this.r = new yo(getContext(), null);
    L5:
        b();
        yo r3 = this.r;
        if (r3 == null) goto L8;
        return r3;
    L8:
        kf2.o("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.r == null) goto L18;
        setClipChildren(true);
        setClipToPadding(true);
        ViewGroup r1 = (ViewGroup) getParent();
        if (r1 == null) goto L7;
        r1.setClipChildren(true);
        r1.setClipToPadding(true);
    L7:
        View r0 = this.q;
        if (r0 == null) goto L19;
        yo r2 = this.r;
        if (r2 != null) goto L13;
    L16:
        this.q = null;
        return;
    L13:
        if (r2.d() == null) goto L15;
        r2.d().setForeground(null);
        goto L16
    L15:
        r0.getOverlay().remove(r2);
        goto L16
    L19:
        return;
    }

    public final void b() {
        if (this.r != null) goto L5;
        return;
    L5:
        if (this.s == null) goto L8;
        a();
        return;
    L8:
        TextView r0 = this.o;
        if (r0 != null) goto L11;
    L28:
        a();
        return;
    L11:
        if (this.n == null) goto L28;
        if (this.q == r0) goto L26;
        a();
        TextView r1 = this.o;
        if (this.r == null) goto L30;
        if (r1 == null) goto L31;
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup r2 = (ViewGroup) getParent();
        if (r2 == null) goto L20;
        r2.setClipChildren(false);
        r2.setClipToPadding(false);
    L20:
        yo r3 = this.r;
        Rect r4 = new Rect();
        r1.getDrawingRect(r4);
        r3.setBounds(r4);
        r3.i(r1, null);
        if (r3.d() == null) goto L23;
        r3.d().setForeground(r3);
    L24:
        this.q = r1;
        return;
    L23:
        r1.getOverlay().add(r3);
        goto L24
    L31:
        return;
    L30:
        return;
    L26:
        c(r0);
    }

    public final void c(View r2) {
        yo r0 = this.r;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r2 != this.q) goto L9;
        Rect r1 = new Rect();
        r2.getDrawingRect(r1);
        r0.setBounds(r1);
        r0.i(r2, null);
        return;
    }

    public final void d() {
        f();
        kq4 r0 = this.n;
        if (r0 == null) goto L13;
        TabLayout r1 = r0.d;
        if (r1 == null) goto L11;
        int r2 = r1.getSelectedTabPosition();
        if (r2 == (-1)) goto L13;
        if (r2 != r0.b) goto L13;
        boolean r3 = true;
    L14:
        setSelected(r3);
        return;
    L11:
        kf2.n("Tab not attached to a TabLayout");
        return;
    L13:
        r3 = false;
        goto L14
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] r0 = getDrawableState();
        Drawable r1 = this.v;
        if (r1 != null) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L11;
        invalidate();
        this.x.invalidate();
        return;
    L11:
        return;
    L5:
        if (r1.isStateful() == false) goto L7;
        r2 = this.v.setState(r0);
        goto L8
    }

    public final void e(Context r7) {
        TabLayout r0 = this.x;
        int r1 = r0.F;
        GradientDrawable r2 = null;
        if (r1 == 0) goto L9;
        Drawable r8 = zz1.r(r7, r1);
        this.v = r8;
        if (r8 != null) goto L7;
    L10:
        GradientDrawable r9 = new GradientDrawable();
        r9.setColor(0);
        Drawable r10 = r9;
        if (r0.A == null) goto L19;
        GradientDrawable r3 = new GradientDrawable();
        r3.setCornerRadius(1.0E-5f);
        r3.setColor(-1);
        ColorStateList r4 = l24.a(r0.A);
        boolean r5 = r0.T;
        GradientDrawable r11 = r9;
        if (r5 == false) goto L15;
        r11 = null;
    L15:
        if (r5 == true) goto L18;
        r2 = r3;
    L18:
        r10 = new RippleDrawable(r4, r11, r2);
    L19:
        WeakHashMap r6 = j65.a;
        setBackground(r10);
        r0.invalidate();
        return;
    L7:
        if (r8.isStateful() == false) goto L10;
        this.v.setState(getDrawableState());
        goto L10
    L9:
        this.v = null;
        goto L10
    }

    public final void f() {
        kq4 r0 = this.n;
        if (r0 == null) goto L5;
        View r2 = r0.c;
    L6:
        if (r2 == null) goto L27;
        ViewParent r3 = r2.getParent();
        if (r3 == this) goto L17;
        if (r3 == null) goto L11;
        ((ViewGroup) r3).removeView(r2);
    L11:
        View r4 = this.s;
        if (r4 == null) goto L16;
        ViewParent r5 = r4.getParent();
        if (r5 == null) goto L16;
        ((ViewGroup) r5).removeView(this.s);
    L16:
        addView(r2);
    L17:
        this.s = r2;
        TextView r6 = this.o;
        if (r6 == null) goto L20;
        r6.setVisibility(8);
    L20:
        ImageView r7 = this.p;
        if (r7 == null) goto L23;
        r7.setVisibility(8);
        this.p.setImageDrawable(null);
    L23:
        TextView r8 = (TextView) r2.findViewById(R.id.text1);
        this.t = r8;
        if (r8 == null) goto L26;
        this.w = r8.getMaxLines();
    L26:
        this.u = (ImageView) r2.findViewById(R.id.icon);
    L32:
        if (this.s == null) goto L34;
        TextView r9 = this.t;
        if (r9 == null) goto L59;
    L60:
        g(r9, this.u, false);
    L61:
        if (r0 != null) goto L63;
        return;
    L63:
        if (TextUtils.isEmpty(null) == true) goto L67;
        setContentDescription(null);
        return;
    L67:
        return;
    L59:
        if (this.u == null) goto L61;
    L34:
        if (this.p != null) goto L37;
        ImageView r10 = (ImageView) LayoutInflater.from(getContext()).inflate(app.homemusic.R.layout.design_layout_tab_icon, this, false);
        this.p = r10;
        addView(r10, 0);
    L37:
        if (this.o != null) goto L39;
        TextView r11 = (TextView) LayoutInflater.from(getContext()).inflate(app.homemusic.R.layout.design_layout_tab_text, this, false);
        this.o = r11;
        addView(r11);
        this.w = this.o.getMaxLines();
    L39:
        TextView r12 = this.o;
        TabLayout r13 = this.x;
        r12.setTextAppearance(r13.v);
        if (isSelected() == false) goto L44;
        int r14 = r13.x;
        if (r14 == (-1)) goto L44;
        this.o.setTextAppearance(r14);
    L45:
        ColorStateList r15 = r13.y;
        if (r15 == null) goto L48;
        this.o.setTextColor(r15);
    L48:
        g(this.o, this.p, true);
        b();
        ImageView r16 = this.p;
        if (r16 == null) goto L52;
        r16.addOnLayoutChangeListener(new lq4(this, r16));
    L52:
        TextView r17 = this.o;
        if (r17 == null) goto L61;
        r17.addOnLayoutChangeListener(new lq4(this, r17));
    L44:
        this.o.setTextAppearance(r13.w);
        goto L45
    L27:
        View r18 = this.s;
        if (r18 == null) goto L30;
        removeView(r18);
        this.s = null;
    L30:
        this.t = null;
        this.u = null;
        goto L32
    L5:
        r2 = null;
        goto L6
    }

    public final void g(TextView r8, ImageView r9, boolean r10) {
        kq4 r0 = this.n;
        CharSequence r1 = null;
        if (r0 == null) goto L5;
        CharSequence r2 = r0.a;
    L7:
        if (r9 == null) goto L9;
        r9.setVisibility(8);
        r9.setImageDrawable(null);
    L9:
        boolean r3 = TextUtils.isEmpty(r2);
        if (r8 == null) goto L24;
        if (r3 == true) goto L13;
        this.n.getClass();
        boolean r5 = true;
    L14:
        if (r3 == true) goto L16;
        CharSequence r6 = r2;
    L17:
        r8.setText(r6);
        if (r5 == false) goto L20;
        int r7 = 0;
    L21:
        r8.setVisibility(r7);
        if (r3 == true) goto L25;
        setVisibility(0);
    L25:
        if (r10 == false) goto L41;
        if (r9 == null) goto L41;
        ViewGroup.MarginLayoutParams r11 = (ViewGroup.MarginLayoutParams) r9.getLayoutParams();
        if (r5 == true) goto L30;
    L32:
        int r12 = 0;
    L34:
        if (this.x.P == false) goto L39;
        if (r12 == r11.getMarginEnd()) goto L41;
        r11.setMarginEnd(r12);
        r11.bottomMargin = 0;
        r9.setLayoutParams(r11);
        r9.requestLayout();
        goto L41
    L39:
        if (r12 == r11.bottomMargin) goto L41;
        r11.bottomMargin = r12;
        r11.setMarginEnd(0);
        r9.setLayoutParams(r11);
        r9.requestLayout();
        goto L41
    L30:
        if (r9.getVisibility() != 0) goto L32;
        r12 = (int) vr1.l(getContext(), 8);
    L41:
        if (r3 == true) goto L43;
        r1 = r2;
    L43:
        e35.S(this, r1);
        return;
    L20:
        r7 = 8;
        goto L21
    L16:
        r6 = null;
        goto L17
    L13:
        r5 = false;
        goto L14
    L24:
        r5 = false;
        goto L25
    L5:
        r2 = null;
        goto L7
    }

    public int getContentHeight() {
        int r4 = 0;
        View[] r3 = {this.o, this.p, this.s};
        int r8 = 0;
        int r1 = 0;
        boolean r5 = false;
    L3:
        if (r4 >= 3) goto L17;
        View r6 = r3[r4];
        if (r6 == null) goto L15;
        if (r6.getVisibility() != 0) goto L15;
        if (r5 == false) goto L10;
        r1 = Math.min(r1, r6.getTop());
    L11:
        if (r5 == false) goto L13;
        r8 = Math.max(r8, r6.getBottom());
    L14:
        r5 = true;
        goto L15
    L13:
        r8 = r6.getBottom();
        goto L14
    L10:
        r1 = r6.getTop();
    L15:
        r4 = r4 + 1;
        goto L3
    L17:
        return r8 - r1;
    }

    public int getContentWidth() {
        int r4 = 0;
        View[] r3 = {this.o, this.p, this.s};
        int r8 = 0;
        int r1 = 0;
        boolean r5 = false;
    L3:
        if (r4 >= 3) goto L17;
        View r6 = r3[r4];
        if (r6 == null) goto L15;
        if (r6.getVisibility() != 0) goto L15;
        if (r5 == false) goto L10;
        r1 = Math.min(r1, r6.getLeft());
    L11:
        if (r5 == false) goto L13;
        r8 = Math.max(r8, r6.getRight());
    L14:
        r5 = true;
        goto L15
    L13:
        r8 = r6.getRight();
        goto L14
    L10:
        r1 = r6.getLeft();
    L15:
        r4 = r4 + 1;
        goto L3
    L17:
        return r8 - r1;
    }

    public kq4 getTab() {
        return this.n;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r8) {
        super.onInitializeAccessibilityNodeInfo(r8);
        yo r0 = this.r;
        if (r0 != null) goto L5;
    L7:
        r8.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) u3.a(0, 1, this.n.b, 1, false, isSelected()).a);
        if (isSelected() == false) goto L10;
        r8.setClickable(false);
        r8.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.g.a);
    L10:
        r8.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(app.homemusic.R.string.item_view_role_description));
        return;
    L5:
        if (r0.isVisible() == false) goto L7;
        r8.setContentDescription(getContentDescription() + ", " + this.r.c());
        goto L7
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
        int r0 = View.MeasureSpec.getSize(r8);
        int r1 = View.MeasureSpec.getMode(r8);
        TabLayout r2 = this.x;
        int r3 = r2.getTabMaxWidth();
        if (r3 <= 0) goto L7;
        if (r1 == 0) goto L6;
        if (r0 <= r3) goto L7;
    L6:
        r8 = View.MeasureSpec.makeMeasureSpec(r2.G, Integer.MIN_VALUE);
    L7:
        super.onMeasure(r8, r9);
        if (this.o == null) goto L34;
        float r4 = r2.D;
        int r5 = this.w;
        ImageView r6 = this.p;
        if (r6 != null) goto L12;
    L14:
        TextView r7 = this.o;
        if (r7 != null) goto L17;
    L19:
        float r10 = this.o.getTextSize();
        int r11 = this.o.getLineCount();
        int r12 = this.o.getMaxLines();
        if (r4 != r10) goto L24;
        if (r12 < 0) goto L35;
        if (r5 != r12) goto L24;
        return;
    L35:
        return;
    L24:
        if (r2.O != 1) goto L32;
        if (r4 <= r10) goto L32;
        if (r11 != 1) goto L32;
        Layout r13 = this.o.getLayout();
        if (r13 != null) goto L30;
        return;
    L30:
        if (((r4 / r13.getPaint().getTextSize()) * r13.getLineWidth(0)) <= ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L32;
        return;
    L32:
        this.o.setTextSize(0, r4);
        this.o.setMaxLines(r5);
        super.onMeasure(r8, r9);
        return;
    L17:
        if (r7.getLineCount() <= 1) goto L19;
        r4 = r2.E;
        goto L19
    L12:
        if (r6.getVisibility() != 0) goto L14;
        r5 = 1;
        goto L19
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean r0 = super.performClick();
        if (this.n != null) goto L5;
        return r0;
    L5:
        if (r0 == true) goto L7;
        playSoundEffect(0);
    L7:
        kq4 r2 = this.n;
        TabLayout r1 = r2.d;
        if (r1 == null) goto L11;
        r1.i(r2, true);
        return true;
    L11:
        kf2.n("Tab not attached to a TabLayout");
        return false;
    }

    @Override // android.view.View
    public void setSelected(boolean r2) {
        isSelected();
        super.setSelected(r2);
        TextView r0 = this.o;
        if (r0 == null) goto L5;
        r0.setSelected(r2);
    L5:
        ImageView r1 = this.p;
        if (r1 == null) goto L8;
        r1.setSelected(r2);
    L8:
        View r3 = this.s;
        if (r3 == null) goto L12;
        r3.setSelected(r2);
        return;
    }

    public void setTab(kq4 r2) {
        if (r2 == this.n) goto L6;
        this.n = r2;
        d();
        return;
    }
}
