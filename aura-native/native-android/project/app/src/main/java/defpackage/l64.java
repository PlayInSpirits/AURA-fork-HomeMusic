package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l64 extends rw3 {
    public q80 a;
    public final ViewPager2 b;
    public final p75 c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final k64 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public l64(ViewPager2 viewPager2) {
        this.b = viewPager2;
        p75 p75Var = viewPager2.w;
        this.c = p75Var;
        this.d = (LinearLayoutManager) p75Var.getLayoutManager();
        this.g = new k64();
        d();
    }

    @Override // defpackage.rw3
    public final void a(RecyclerView recyclerView, int i) {
        q80 q80Var;
        q80 q80Var2;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.P0();
            }
            c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        k64 k64Var = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            e();
            if (!this.k) {
                int i4 = k64Var.b;
                if (i4 != -1 && (q80Var2 = this.a) != null) {
                    q80Var2.b(i4, 0.0f, 0);
                }
            } else if (k64Var.c == 0) {
                int i5 = this.h;
                int i6 = k64Var.b;
                if (i5 != i6 && (q80Var = this.a) != null) {
                    q80Var.c(i6);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (k64Var.c == 0) {
                int i7 = this.i;
                int i8 = k64Var.b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    q80 q80Var3 = this.a;
                    if (q80Var3 != null) {
                        q80Var3.c(i8);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @Override // defpackage.rw3
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        q80 q80Var;
        this.k = true;
        e();
        boolean z = this.j;
        k64 k64Var = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.b.t.b.getLayoutDirection() == 1)) {
                        if (k64Var.c != 0) {
                            i3 = k64Var.b + 1;
                        }
                    }
                }
                i3 = k64Var.b;
            } else if (k64Var.c != 0) {
                i3 = k64Var.b + 1;
            } else {
                i3 = k64Var.b;
            }
            this.i = i3;
            if (this.h != i3 && (q80Var = this.a) != null) {
                q80Var.c(i3);
            }
        } else if (this.e == 0) {
            int i4 = k64Var.b;
            if (i4 == -1) {
                i4 = 0;
            }
            q80 q80Var2 = this.a;
            if (q80Var2 != null) {
                q80Var2.c(i4);
            }
        }
        int i5 = k64Var.b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = k64Var.a;
        int i6 = k64Var.c;
        q80 q80Var3 = this.a;
        if (q80Var3 != null) {
            q80Var3.b(i5, f, i6);
        }
        int i7 = k64Var.b;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && k64Var.c == 0 && this.f != 1) {
            c(0);
            d();
        }
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        q80 q80Var = this.a;
        if (q80Var != null) {
            q80Var.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        k64 k64Var = this.g;
        k64Var.b = -1;
        k64Var.a = 0.0f;
        k64Var.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a A[LOOP:2: B:64:0x013e->B:67:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014d A[SYNTHETIC] */
    public final void e() {
        int top;
        int iV;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iP0 = linearLayoutManager.P0();
        k64 k64Var = this.g;
        k64Var.b = iP0;
        if (iP0 == -1) {
            k64Var.b = -1;
            k64Var.a = 0.0f;
            k64Var.c = 0;
            return;
        }
        View viewQ = linearLayoutManager.q(iP0);
        if (viewQ == null) {
            k64Var.b = -1;
            k64Var.a = 0.0f;
            k64Var.c = 0;
            return;
        }
        int i3 = ((nw3) viewQ.getLayoutParams()).b.left;
        int i4 = ((nw3) viewQ.getLayoutParams()).b.right;
        int i5 = ((nw3) viewQ.getLayoutParams()).b.top;
        int i6 = ((nw3) viewQ.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = viewQ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewQ.getHeight() + i5 + i6;
        int width = viewQ.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.p;
        p75 p75Var = this.c;
        if (i7 == 0) {
            top = (viewQ.getLeft() - i3) - p75Var.getPaddingLeft();
            if (this.b.t.b.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewQ.getTop() - i5) - p75Var.getPaddingTop();
        }
        int i8 = -top;
        k64Var.c = i8;
        if (i8 >= 0) {
            k64Var.a = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iV2 = linearLayoutManager.v();
        if (iV2 != 0) {
            boolean z = linearLayoutManager.p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iV2, 2);
            for (int i9 = 0; i9 < iV2; i9++) {
                View viewU = linearLayoutManager.u(i9);
                if (viewU == null) {
                    kf2.o("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewU.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : kd.a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewU.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewU.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewU.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewU.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new ca1(9));
            int i10 = 1;
            while (true) {
                if (i10 >= iV2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[iV2 - 1][1] >= i13) {
                        if (linearLayoutManager.v() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                iV = linearLayoutManager.v();
                for (int i14 = 0; i14 < iV; i14++) {
                    if (!kd.a(linearLayoutManager.u(i14))) {
                        kf2.o("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.v() <= 1) {
            iV = linearLayoutManager.v();
            while (i14 < iV) {
                if (!kd.a(linearLayoutManager.u(i14))) {
                    kf2.o("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        kf2.o(f34.f(k64Var.c, "Page can only be offset by a positive amount, not by "));
    }
}
