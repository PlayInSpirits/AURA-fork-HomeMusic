package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int n = 2;
    public final Object o;

    public ah0(bh0 bh0Var) {
        this.o = new WeakReference(bh0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.n;
        int i2 = 0;
        Object obj = this.o;
        switch (i) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                bh0 bh0Var = (bh0) ((WeakReference) obj).get();
                if (bh0Var != null) {
                    ArrayList arrayList = bh0Var.b;
                    View view = bh0Var.a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iA = bh0Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = bh0Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            int size = arrayList2.size();
                            while (i2 < size) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                ((cf4) obj2).m(iA, iA2);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(bh0Var.c);
                            }
                            bh0Var.c = null;
                            arrayList.clear();
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                x75 x75Var = (x75) ((WeakReference) obj).get();
                if (x75Var != null) {
                    ArrayList arrayList3 = x75Var.b;
                    View view2 = x75Var.a;
                    if (!arrayList3.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iA3 = x75Var.a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iA4 = x75Var.a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((iA3 > 0 || iA3 == Integer.MIN_VALUE) && (iA4 > 0 || iA4 == Integer.MIN_VALUE)) {
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            int size2 = arrayList4.size();
                            while (i2 < size2) {
                                Object obj3 = arrayList4.get(i2);
                                i2++;
                                ((cf4) obj3).m(iA3, iA4);
                            }
                            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(x75Var.c);
                            }
                            x75Var.c = null;
                            arrayList3.clear();
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) obj).q(0);
                break;
        }
        return true;
    }

    public ah0(x75 x75Var) {
        this.o = new WeakReference(x75Var);
    }

    public ah0(CoordinatorLayout coordinatorLayout) {
        this.o = coordinatorLayout;
    }
}
