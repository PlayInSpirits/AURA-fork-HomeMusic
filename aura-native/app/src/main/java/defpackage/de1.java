package defpackage;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class de1 {
    public q80 a;
    public ce1 b;
    public vv3 c;
    public ViewPager2 d;
    public long e = -1;
    public final /* synthetic */ ee1 f;

    public de1(ee1 ee1Var) {
        this.f = ee1Var;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        er1.o(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    public final void b(boolean z) {
        int currentItem;
        kc1 kc1Var;
        ee1 ee1Var = this.f;
        zh0 zh0Var = ee1Var.w;
        xe2 xe2Var = ee1Var.s;
        ld1 ld1Var = ee1Var.r;
        if (ld1Var.N() || this.d.getScrollState() != 0 || xe2Var.d() || ee1Var.a() == 0 || (currentItem = this.d.getCurrentItem()) >= ee1Var.a()) {
            return;
        }
        long j = currentItem;
        if ((j != this.e || z) && (kc1Var = (kc1) xe2Var.b(j)) != null && kc1Var.y()) {
            this.e = j;
            ld1Var.getClass();
            po poVar = new po(ld1Var);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            kc1 kc1Var2 = null;
            for (int i2 = 0; i2 < xe2Var.h(); i2++) {
                long e = xe2Var.e(i2);
                kc1 kc1Var3 = (kc1) xe2Var.i(i2);
                if (kc1Var3.y()) {
                    if (e != this.e) {
                        poVar.k(kc1Var3, r92.q);
                        zh0Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((CopyOnWriteArrayList) zh0Var.o).iterator();
                        if (it.hasNext()) {
                            throw xa3.d(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        kc1Var2 = kc1Var3;
                    }
                    kc1Var3.e0(e == this.e);
                }
            }
            if (kc1Var2 != null) {
                poVar.k(kc1Var2, r92.r);
                zh0Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((CopyOnWriteArrayList) zh0Var.o).iterator();
                if (it2.hasNext()) {
                    throw xa3.d(it2);
                }
                arrayList.add(arrayList3);
            }
            if (poVar.a.isEmpty()) {
                return;
            }
            poVar.f();
            Collections.reverse(arrayList);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zh0Var.getClass();
                zh0.B((List) obj);
            }
        }
    }
}
