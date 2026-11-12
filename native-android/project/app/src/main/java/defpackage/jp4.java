package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jp4 extends hw {
    public int j;
    public int k = -1;
    public final /* synthetic */ SwipeDismissBehavior l;

    public jp4(SwipeDismissBehavior swipeDismissBehavior) {
        this.l = swipeDismissBehavior;
    }

    @Override // defpackage.hw
    public final void A(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.l;
        float f = width * swipeDismissBehavior.s;
        float width2 = view.getWidth() * swipeDismissBehavior.t;
        float fAbs = Math.abs(i - this.j);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // defpackage.hw
    public final void B(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        zg5 zg5Var;
        this.k = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.l;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = j65.a;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.r;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.j;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.j;
                    if (left < i2) {
                        i = this.j - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.j - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.j) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.j;
                    if (left < i2) {
                        i = this.j - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.j - width;
                }
                z = true;
            } else {
                i = this.j;
            }
        }
        if (swipeDismissBehavior.n.q(i, view.getTop())) {
            ua4 ua4Var = new ua4(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = j65.a;
            view.postOnAnimation(ua4Var);
        } else {
            if (!z || (zg5Var = swipeDismissBehavior.o) == null) {
                return;
            }
            zg5Var.y(view);
        }
    }

    @Override // defpackage.hw
    public final boolean Q(View view, int i) {
        int i2 = this.k;
        return (i2 == -1 || i2 == i) && this.l.w(view);
    }

    @Override // defpackage.hw
    public final int d(View view, int i) {
        int width;
        int width2;
        WeakHashMap weakHashMap = j65.a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.l.r;
        if (i2 == 0) {
            width = this.j;
            if (z) {
                width -= view.getWidth();
                width2 = this.j;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.j;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.j + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.j;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.hw
    public final int e(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.hw
    public final int o(View view) {
        return view.getWidth();
    }

    @Override // defpackage.hw
    public final void y(View view, int i) {
        this.k = i;
        this.j = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.l;
            swipeDismissBehavior.q = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.q = false;
        }
    }

    @Override // defpackage.hw
    public final void z(int i) {
        zg5 zg5Var = this.l.o;
        if (zg5Var != null) {
            br brVar = ((fr) zg5Var.n).v;
            if (i == 0) {
                na4.z().O(brVar);
            } else if (i == 1 || i == 2) {
                na4.z().K(brVar);
            }
        }
    }
}
