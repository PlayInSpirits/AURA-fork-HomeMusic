package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.eddyizm.tempus.helper.recyclerview.FastScrollbar;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.w = false;
                break;
            case 6:
                ((dq) obj).d();
                break;
            case 7:
                super.onAnimationCancel(animator);
                FastScrollbar fastScrollbar = (FastScrollbar) obj;
                fastScrollbar.n.setVisibility(4);
                fastScrollbar.r = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.w = false;
                break;
            case 1:
                qd qdVar = (qd) obj;
                ArrayList arrayList = new ArrayList(qdVar.r);
                int size = arrayList.size();
                while (i2 < size) {
                    ((hq) arrayList.get(i2)).a(qdVar);
                    i2++;
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                uq uqVar = (uq) obj;
                ViewGroup s = vr1.s(uqVar);
                c05 c05Var = s != null ? new c05(s) : null;
                ArrayList arrayList2 = uqVar.x;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ((ViewOverlay) c05Var.n).remove((kv4) obj2);
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.K(5);
                WeakReference weakReference = bottomSheetBehavior.h0;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.h0.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                ix0 ix0Var = (ix0) obj;
                ix0Var.p();
                ix0Var.r.start();
                break;
            case 5:
                ((ExpandableTransformationBehavior) obj).o = null;
                break;
            case 6:
                ((dq) obj).e();
                break;
            case 7:
                super.onAnimationEnd(animator);
                FastScrollbar fastScrollbar = (FastScrollbar) obj;
                fastScrollbar.n.setVisibility(4);
                fastScrollbar.r = null;
                break;
            case 8:
                m81 m81Var = (m81) obj;
                m81Var.q = 0;
                m81Var.l = null;
                break;
            case 9:
                ((HideBottomViewOnScrollBehavior) obj).u = null;
                break;
            case 10:
            default:
                super.onAnimationEnd(animator);
                break;
            case 11:
                dh2 dh2Var = (dh2) obj;
                dh2Var.b.setTranslationY(0.0f);
                dh2Var.c(0.0f);
                break;
            case 12:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(0);
                    break;
                }
                break;
            case 13:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.C;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.C.get()).requestLayout();
                    break;
                }
                break;
            case 14:
                ((dx4) obj).l();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 10:
                super.onAnimationRepeat(animator);
                va2 va2Var = (va2) this.b;
                va2Var.g = (va2Var.g + 1) % va2Var.f.c.length;
                va2Var.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                qd qdVar = (qd) obj;
                ArrayList arrayList = new ArrayList(qdVar.r);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((hq) arrayList.get(i2)).b(qdVar);
                }
                break;
            case 6:
                ((dq) obj).f(animator);
                break;
            case 8:
                m81 m81Var = (m81) obj;
                m81Var.r.a(0, false);
                m81Var.q = 2;
                m81Var.l = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
