package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qg4 extends fr {
    public static final int[] E = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager C;
    public boolean D;

    public qg4(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.C = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    public static qg4 h(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            kf2.n("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(E);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        qg4 qg4Var = new qg4(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) qg4Var.i.getChildAt(0)).getMessageView().setText(charSequence);
        qg4Var.k = i;
        return qg4Var;
    }

    public final void i(int i, View.OnClickListener onClickListener) {
        CharSequence text = this.h.getText(i);
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.D = false;
        } else {
            this.D = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new j8(23, this, onClickListener));
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public final void j() {
        na4 na4VarZ = na4.z();
        AccessibilityManager accessibilityManager = this.C;
        int recommendedTimeoutMillis = this.k;
        boolean z = false;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = this.D;
            if (i >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, (z2 ? 4 : 0) | 3);
            } else if (z2 && accessibilityManager.isTouchExplorationEnabled()) {
                recommendedTimeoutMillis = -2;
            }
        }
        br brVar = this.v;
        synchronized (na4VarZ.n) {
            try {
                if (na4VarZ.G(brVar)) {
                    rg4 rg4Var = (rg4) na4VarZ.p;
                    rg4Var.b = recommendedTimeoutMillis;
                    ((Handler) na4VarZ.o).removeCallbacksAndMessages(rg4Var);
                    na4VarZ.P((rg4) na4VarZ.p);
                    return;
                }
                rg4 rg4Var2 = (rg4) na4VarZ.q;
                if (rg4Var2 != null && rg4Var2.a.get() == brVar) {
                    z = true;
                }
                if (z) {
                    ((rg4) na4VarZ.q).b = recommendedTimeoutMillis;
                } else {
                    na4VarZ.q = new rg4(recommendedTimeoutMillis, brVar);
                }
                rg4 rg4Var3 = (rg4) na4VarZ.p;
                if (rg4Var3 == null || !na4VarZ.j(rg4Var3, 4)) {
                    na4VarZ.p = null;
                    na4VarZ.Q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
