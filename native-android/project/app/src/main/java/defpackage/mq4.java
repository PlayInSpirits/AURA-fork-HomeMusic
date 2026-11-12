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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq4(TabLayout tabLayout, Context context) {
        super(context);
        this.x = tabLayout;
        this.w = 2;
        e(context);
        int i = tabLayout.r;
        int i2 = tabLayout.s;
        int i3 = tabLayout.t;
        int i4 = tabLayout.u;
        WeakHashMap weakHashMap = j65.a;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!tabLayout.P ? 1 : 0);
        setClickable(true);
        c65.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private yo getBadge() {
        return this.r;
    }

    private yo getOrCreateBadge() {
        if (this.r == null) {
            this.r = new yo(getContext(), null);
        }
        b();
        yo yoVar = this.r;
        if (yoVar != null) {
            return yoVar;
        }
        kf2.o("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.r != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.q;
            if (view != null) {
                yo yoVar = this.r;
                if (yoVar != null) {
                    if (yoVar.d() != null) {
                        yoVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(yoVar);
                    }
                }
                this.q = null;
            }
        }
    }

    public final void b() {
        if (this.r != null) {
            if (this.s != null) {
                a();
                return;
            }
            TextView textView = this.o;
            if (textView == null || this.n == null) {
                a();
                return;
            }
            if (this.q == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.o;
            if (this.r == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            yo yoVar = this.r;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            yoVar.setBounds(rect);
            yoVar.i(textView2, null);
            if (yoVar.d() != null) {
                yoVar.d().setForeground(yoVar);
            } else {
                textView2.getOverlay().add(yoVar);
            }
            this.q = textView2;
        }
    }

    public final void c(View view) {
        yo yoVar = this.r;
        if (yoVar == null || view != this.q) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        yoVar.setBounds(rect);
        yoVar.i(view, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public final void d() {
        boolean z;
        f();
        kq4 kq4Var = this.n;
        if (kq4Var == null) {
            z = false;
        } else {
            TabLayout tabLayout = kq4Var.d;
            if (tabLayout == null) {
                kf2.n("Tab not attached to a TabLayout");
                return;
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != kq4Var.b) {
                z = false;
            } else {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if ((drawable == null || !drawable.isStateful()) ? false : this.v.setState(drawableState)) {
            invalidate();
            this.x.invalidate();
        }
    }

    public final void e(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.x;
        int i = tabLayout.F;
        if (i != 0) {
            Drawable drawableR = zz1.r(context, i);
            this.v = drawableR;
            if (drawableR != null && drawableR.isStateful()) {
                this.v.setState(getDrawableState());
            }
        } else {
            this.v = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.A != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListA = l24.a(tabLayout.A);
            boolean z = tabLayout.T;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = j65.a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i;
        ViewParent parent;
        kq4 kq4Var = this.n;
        View view = kq4Var != null ? kq4Var.c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.s;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.s);
                }
                addView(view);
            }
            this.s = view;
            TextView textView = this.o;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.p;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.p.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.t = textView2;
            if (textView2 != null) {
                this.w = textView2.getMaxLines();
            }
            this.u = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.s;
            if (view3 != null) {
                removeView(view3);
                this.s = null;
            }
            this.t = null;
            this.u = null;
        }
        if (this.s == null) {
            if (this.p == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(app.homemusic.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.p = imageView2;
                addView(imageView2, 0);
            }
            if (this.o == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(app.homemusic.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.o = textView3;
                addView(textView3);
                this.w = this.o.getMaxLines();
            }
            TextView textView4 = this.o;
            TabLayout tabLayout = this.x;
            textView4.setTextAppearance(tabLayout.v);
            if (!isSelected() || (i = tabLayout.x) == -1) {
                this.o.setTextAppearance(tabLayout.w);
            } else {
                this.o.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.y;
            if (colorStateList != null) {
                this.o.setTextColor(colorStateList);
            }
            g(this.o, this.p, true);
            b();
            ImageView imageView3 = this.p;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new lq4(this, imageView3));
            }
            TextView textView5 = this.o;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new lq4(this, textView5));
            }
        } else {
            TextView textView6 = this.t;
            if (textView6 != null || this.u != null) {
                g(textView6, this.u, false);
            }
        }
        if (kq4Var == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        kq4 kq4Var = this.n;
        CharSequence charSequence = kq4Var != null ? kq4Var.a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                this.n.getClass();
                z2 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iL = (z2 && imageView.getVisibility() == 0) ? (int) vr1.l(getContext(), 8) : 0;
            if (this.x.P) {
                if (iL != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iL);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iL != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iL;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        e35.S(this, zIsEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.o, this.p, this.s};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.o, this.p, this.s};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public kq4 getTab() {
        return this.n;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        yo yoVar = this.r;
        if (yoVar != null && yoVar.isVisible()) {
            accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.r.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) u3.a(0, 1, this.n.b, 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(app.homemusic.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.x;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.G, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.o != null) {
            float f = tabLayout.D;
            int i3 = this.w;
            ImageView imageView = this.p;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.o;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.E;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.o.getTextSize();
            int lineCount = this.o.getLineCount();
            int maxLines = this.o.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.O == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.o.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.o.setTextSize(0, f);
                this.o.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.n == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        kq4 kq4Var = this.n;
        TabLayout tabLayout = kq4Var.d;
        if (tabLayout != null) {
            tabLayout.i(kq4Var, true);
            return true;
        }
        kf2.n("Tab not attached to a TabLayout");
        return false;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.o;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.s;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(kq4 kq4Var) {
        if (kq4Var != this.n) {
            this.n = kq4Var;
            d();
        }
    }
}
