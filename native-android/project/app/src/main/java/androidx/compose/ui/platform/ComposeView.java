package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b0;
import defpackage.bc;
import defpackage.h80;
import defpackage.jo;
import defpackage.k65;
import defpackage.kf2;
import defpackage.lv3;
import defpackage.rg1;
import defpackage.uc5;
import defpackage.wf1;
import defpackage.wr1;
import defpackage.xj0;
import defpackage.z;
import defpackage.zd3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends b0 {
    public static final /* synthetic */ int y = 0;
    public final zd3 w;
    public boolean x;

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        bc bcVar = new bc(7, this);
        addOnAttachStateChangeListener(bcVar);
        k65 k65Var = new k65(this);
        wr1.A(this).a.add(k65Var);
        this.s = new jo(this, bcVar, k65Var, 9);
        this.w = uc5.B(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // defpackage.b0
    public final void a(int i, rg1 rg1Var) {
        rg1Var.S(420213850);
        int i2 = 2;
        int i3 = (rg1Var.g(this) ? 4 : 2) | i;
        if (rg1Var.K(i3 & 1, (i3 & 3) != 2)) {
            wf1 wf1Var = (wf1) this.w.getValue();
            if (wf1Var == null) {
                rg1Var.R(-1238823553);
            } else {
                rg1Var.R(98585282);
                wf1Var.invoke(rg1Var, 0);
            }
            rg1Var.o(false);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new z(i, i2, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.b0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.x;
    }

    public final void setContent(wf1 wf1Var) {
        h80 h80Var;
        View view;
        this.x = true;
        this.w.setValue(wf1Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            if (this.q == null && !isAttachedToWindow() && ((h80Var = this.r) == null || (view = h80Var.a) == null || !view.isAttachedToWindow())) {
                kf2.o("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
            } else {
                e();
            }
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, xj0 xj0Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
