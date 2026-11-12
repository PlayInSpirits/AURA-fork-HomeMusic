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
    public final ArrayList q;
    public tu2 r;
    public boolean s;
    public final /* synthetic */ l43 t;

    public d43(l43 r1) {
        this.t = r1;
        this.q = new ArrayList();
        p();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size();
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final int c(int r2) {
        f43 r1 = (f43) this.q.get(r2);
        if ((r1 instanceof g43) == false) goto L7;
        return 2;
    L7:
        if ((r1 instanceof e43) == false) goto L11;
        return 3;
    L11:
        if ((r1 instanceof h43) == true) goto L13;
        tb4.e("Unknown item type.");
        return 0;
    L13:
        if (((h43) r1).a.hasSubMenu() == false) goto L16;
        return 1;
    L16:
        return 0;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r7, int r8) {
        View r9 = ((k43) r7).a;
        int r0 = c(r8);
        ArrayList r1 = this.q;
        l43 r2 = this.t;
        if (r0 != 0) goto L5;
        NavigationMenuItemView r10 = (NavigationMenuItemView) r9;
        r10.setIconTintList(r2.y);
        r10.setTextAppearance(r2.v);
        ColorStateList r3 = r2.x;
        if (r3 == null) goto L19;
        r10.setTextColor(r3);
    L19:
        Drawable r4 = r2.z;
        if (r4 == null) goto L22;
        Drawable r5 = r4.getConstantState().newDrawable();
    L23:
        WeakHashMap r6 = j65.a;
        r10.setBackground(r5);
        RippleDrawable r11 = r2.A;
        if (r11 == null) goto L26;
        r10.setForeground(r11.getConstantState().newDrawable());
    L26:
        h43 r12 = (h43) r1.get(r8);
        r10.setNeedsEmptyIcon(r12.b);
        int r13 = r2.B;
        int r14 = r2.C;
        r10.setPadding(r13, r14, r13, r14);
        r10.setIconPadding(r2.D);
        if (r2.J == false) goto L29;
        r10.setIconSize(r2.E);
    L29:
        r10.setMaxLines(r2.L);
        tu2 r15 = r12.a;
        r10.L = r2.w;
        r10.c(r15);
        j65.o(r10, new c43(this, r8, false));
        return;
    L22:
        r5 = null;
        goto L23
    L5:
        if (r0 != 1) goto L7;
        TextView r16 = (TextView) r9;
        r16.setText(((h43) r1.get(r8)).a.e);
        r16.setTextAppearance(r2.t);
        r16.setPadding(r2.H, r16.getPaddingTop(), r2.I, r16.getPaddingBottom());
        ColorStateList r17 = r2.u;
        if (r17 == null) goto L14;
        r16.setTextColor(r17);
    L14:
        j65.o(r16, new c43(this, r8, true));
        return;
    L7:
        if (r0 == 2) goto L9;
        return;
    L9:
        g43 r18 = (g43) r1.get(r8);
        r9.setPadding(r2.F, r18.a, r2.G, r18.b);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r4, int r5) {
        l43 r3 = this.t;
        if (r5 != 0) goto L5;
        LayoutInflater r1 = r3.s;
        i4 r6 = r3.P;
        View r7 = r1.inflate(R.layout.design_navigation_item, r4, false);
        j43 r8 = new j43(r7);
        r7.setOnClickListener(r6);
        return r8;
    L5:
        if (r5 == 1) goto L17;
        if (r5 == 2) goto L15;
        if (r5 == 3) goto L13;
        return null;
    L13:
        return new b43(r3.o);
    L15:
        return new b43(r3.s.inflate(R.layout.design_navigation_item_separator, r4, false));
    L17:
        return new b43(r3.s.inflate(R.layout.design_navigation_item_subheader, r4, false));
    }

    @Override // defpackage.dw3
    public final void n(cx3 r1) {
        k43 r2 = (k43) r1;
        if ((r2 instanceof j43) == false) goto L9;
        NavigationMenuItemView r0 = (NavigationMenuItemView) r2.a;
        FrameLayout r3 = r0.N;
        if (r3 == null) goto L7;
        r3.removeAllViews();
    L7:
        r0.M.setCompoundDrawables(null, null, null, null);
        return;
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
        if (this.s == false) goto L5;
        return;
    L5:
        this.s = true;
        ArrayList r2 = this.q;
        r2.clear();
        r2.add(new e43());
        l43 r3 = this.t;
        int r4 = r3.p.l().size();
        boolean r5 = false;
        int r6 = -1;
        int r7 = 0;
        boolean r8 = false;
        int r9 = 0;
    L6:
        if (r7 >= r4) goto L58;
        tu2 r10 = (tu2) r3.p.l().get(r7);
        if (r10.isChecked() == false) goto L11;
        q(r10);
    L11:
        if (r10.isCheckable() == false) goto L14;
        r10.f(r5);
    L14:
        if (r10.hasSubMenu() == false) goto L40;
        en4 r11 = r10.o;
        if (r11.hasVisibleItems() == false) goto L39;
        if (r7 == 0) goto L19;
        r2.add(new g43(r3.N, r5 ? 1 : 0));
    L19:
        r2.add(new h43(r10));
        int r12 = r2.size();
        int r13 = r11.f.size();
        int r14 = r5 ? 1 : 0;
        int r15 = r14;
    L20:
        if (r14 >= r13) goto L35;
        tu2 r1 = (tu2) r11.getItem(r14);
        if (r1.isVisible() == false) goto L34;
        if (r15 != 0) goto L28;
        if (r1.getIcon() == null) goto L28;
        r15 = 1;
    L28:
        if (r1.isCheckable() == false) goto L31;
        r1.f(r5);
    L31:
        if (r10.isChecked() == false) goto L33;
        q(r10);
    L33:
        r2.add(new h43(r1));
    L34:
        r14 = r14 + 1;
        r5 = false;
        goto L20
    L35:
        if (r15 == 0) goto L39;
        int r16 = r2.size();
    L37:
        if (r12 >= r16) goto L39;
        ((h43) r2.get(r12)).b = true;
        r12 = r12 + 1;
    L39:
        boolean r17 = true;
    L57:
        r7 = r7 + 1;
        r5 = false;
        goto L6
    L40:
        int r18 = r10.b;
        if (r18 == r6) goto L49;
        r9 = r2.size();
        if (r10.getIcon() == null) goto L45;
        r8 = true;
    L46:
        if (r7 == 0) goto L48;
        r9 = r9 + 1;
        int r19 = r3.N;
        r2.add(new g43(r19, r19));
    L48:
        r17 = true;
    L56:
        h43 r20 = new h43(r10);
        r20.b = r8;
        r2.add(r20);
        r6 = r18;
        goto L57
    L45:
        r8 = false;
        goto L46
    L49:
        if (r8 == true) goto L48;
        if (r10.getIcon() == null) goto L48;
        int r21 = r2.size();
        int r22 = r9;
    L53:
        if (r22 >= r21) goto L55;
        ((h43) r2.get(r22)).b = true;
        r22 = r22 + 1;
        goto L53
    L55:
        r17 = true;
        r8 = true;
        goto L56
    L58:
        this.s = r5 ? 1 : 0;
    }

    public final void q(tu2 r3) {
        if (this.r != r3) goto L5;
        return;
    L5:
        if (r3.isCheckable() == false) goto L13;
        tu2 r0 = this.r;
        if (r0 == null) goto L10;
        r0.setChecked(false);
    L10:
        this.r = r3;
        r3.setChecked(true);
        return;
    }
}
