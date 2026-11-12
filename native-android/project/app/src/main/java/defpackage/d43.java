package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.homemusic.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d43 extends dw3 {
    public final ArrayList q = new ArrayList();
    public tu2 r;
    public boolean s;
    public final /* synthetic */ l43 t;

    public d43(l43 l43Var) {
        this.t = l43Var;
        p();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size();
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.dw3
    public final int c(int i) {
        f43 f43Var = (f43) this.q.get(i);
        if (f43Var instanceof g43) {
            return 2;
        }
        if (f43Var instanceof e43) {
            return 3;
        }
        if (f43Var instanceof h43) {
            return ((h43) f43Var).a.hasSubMenu() ? 1 : 0;
        }
        tb4.e("Unknown item type.");
        return 0;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        View view = ((k43) cx3Var).a;
        int iC = c(i);
        ArrayList arrayList = this.q;
        l43 l43Var = this.t;
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    return;
                }
                g43 g43Var = (g43) arrayList.get(i);
                view.setPadding(l43Var.F, g43Var.a, l43Var.G, g43Var.b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((h43) arrayList.get(i)).a.e);
            textView.setTextAppearance(l43Var.t);
            textView.setPadding(l43Var.H, textView.getPaddingTop(), l43Var.I, textView.getPaddingBottom());
            ColorStateList colorStateList = l43Var.u;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            j65.o(textView, new c43(this, i, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(l43Var.y);
        navigationMenuItemView.setTextAppearance(l43Var.v);
        ColorStateList colorStateList2 = l43Var.x;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = l43Var.z;
        Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = j65.a;
        navigationMenuItemView.setBackground(drawableNewDrawable);
        RippleDrawable rippleDrawable = l43Var.A;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        h43 h43Var = (h43) arrayList.get(i);
        navigationMenuItemView.setNeedsEmptyIcon(h43Var.b);
        int i2 = l43Var.B;
        int i3 = l43Var.C;
        navigationMenuItemView.setPadding(i2, i3, i2, i3);
        navigationMenuItemView.setIconPadding(l43Var.D);
        if (l43Var.J) {
            navigationMenuItemView.setIconSize(l43Var.E);
        }
        navigationMenuItemView.setMaxLines(l43Var.L);
        tu2 tu2Var = h43Var.a;
        navigationMenuItemView.L = l43Var.w;
        navigationMenuItemView.c(tu2Var);
        j65.o(navigationMenuItemView, new c43(this, i, false));
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        l43 l43Var = this.t;
        if (i == 0) {
            LayoutInflater layoutInflater = l43Var.s;
            i4 i4Var = l43Var.P;
            View viewInflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            j43 j43Var = new j43(viewInflate);
            viewInflate.setOnClickListener(i4Var);
            return j43Var;
        }
        if (i == 1) {
            return new b43(l43Var.s.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new b43(l43Var.s.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new b43(l43Var.o);
    }

    @Override // defpackage.dw3
    public final void n(cx3 cx3Var) {
        k43 k43Var = (k43) cx3Var;
        if (k43Var instanceof j43) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) k43Var.a;
            FrameLayout frameLayout = navigationMenuItemView.N;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.M.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p() {
        boolean z;
        if (this.s) {
            return;
        }
        this.s = true;
        ArrayList arrayList = this.q;
        arrayList.clear();
        arrayList.add(new e43());
        l43 l43Var = this.t;
        int size = l43Var.p.l().size();
        boolean z2 = false;
        int i = -1;
        int i2 = 0;
        boolean z3 = false;
        int size2 = 0;
        while (i2 < size) {
            tu2 tu2Var = (tu2) l43Var.p.l().get(i2);
            if (tu2Var.isChecked()) {
                q(tu2Var);
            }
            if (tu2Var.isCheckable()) {
                tu2Var.f(z2);
            }
            if (tu2Var.hasSubMenu()) {
                en4 en4Var = tu2Var.o;
                if (en4Var.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new g43(l43Var.N, z2 ? 1 : 0));
                    }
                    arrayList.add(new h43(tu2Var));
                    int size3 = en4Var.f.size();
                    int i3 = z2 ? 1 : 0;
                    int i4 = i3;
                    while (i3 < size3) {
                        tu2 tu2Var2 = (tu2) en4Var.getItem(i3);
                        if (tu2Var2.isVisible()) {
                            if (i4 == 0 && tu2Var2.getIcon() != null) {
                                i4 = 1;
                            }
                            if (tu2Var2.isCheckable()) {
                                tu2Var2.f(z2);
                            }
                            if (tu2Var.isChecked()) {
                                q(tu2Var);
                            }
                            arrayList.add(new h43(tu2Var2));
                        }
                        i3++;
                        z2 = false;
                    }
                    if (i4 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((h43) arrayList.get(size5)).b = true;
                        }
                    }
                }
                z = true;
            } else {
                int i5 = tu2Var.b;
                if (i5 != i) {
                    size2 = arrayList.size();
                    z3 = tu2Var.getIcon() != null;
                    if (i2 != 0) {
                        size2++;
                        int i6 = l43Var.N;
                        arrayList.add(new g43(i6, i6));
                    }
                } else {
                    if (!z3 && tu2Var.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i7 = size2; i7 < size6; i7++) {
                            ((h43) arrayList.get(i7)).b = true;
                        }
                        z = true;
                        z3 = true;
                    }
                    h43 h43Var = new h43(tu2Var);
                    h43Var.b = z3;
                    arrayList.add(h43Var);
                    i = i5;
                }
                z = true;
                h43 h43Var2 = new h43(tu2Var);
                h43Var2.b = z3;
                arrayList.add(h43Var2);
                i = i5;
            }
            i2++;
            z2 = false;
        }
        this.s = z2 ? 1 : 0;
    }

    public final void q(tu2 tu2Var) {
        if (this.r == tu2Var || !tu2Var.isCheckable()) {
            return;
        }
        tu2 tu2Var2 = this.r;
        if (tu2Var2 != null) {
            tu2Var2.setChecked(false);
        }
        this.r = tu2Var;
        tu2Var.setChecked(true);
    }
}
