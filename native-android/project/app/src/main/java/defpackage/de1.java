package defpackage;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class de1 {
    public q80 a;
    public ce1 b;
    public vv3 c;
    public ViewPager2 d;
    public long e;
    public final /* synthetic */ ee1 f;

    public de1(ee1 r3) {
        this.f = r3;
        this.e = -1;
    }

    public static ViewPager2 a(RecyclerView r1) {
        ViewParent r2 = r1.getParent();
        if ((r2 instanceof ViewPager2) == true) goto L5;
        er1.o(r2, "Expected ViewPager2 instance. Got: ");
        return null;
    L5:
        return (ViewPager2) r2;
    }

    public final void b(boolean r13) {
        ee1 r0 = this.f;
        zh0 r1 = r0.w;
        xe2 r2 = r0.s;
        ld1 r3 = r0.r;
        if (r3.N() == false) goto L6;
        return;
    L6:
        if (this.d.getScrollState() == 0) goto L9;
        return;
    L9:
        if (r2.d() == false) goto L11;
        return;
    L11:
        if (r0.a() == 0) goto L66;
        int r4 = this.d.getCurrentItem();
        if (r4 >= r0.a()) goto L67;
        long r5 = r4;
        if (r5 != this.e) goto L20;
        if (r13 == true) goto L20;
        return;
    L20:
        kc1 r14 = (kc1) r2.b(r5);
        if (r14 != null) goto L23;
        return;
    L23:
        if (r14.y() == false) goto L69;
        this.e = r5;
        r3.getClass();
        po r15 = new po(r3);
        ArrayList r6 = new ArrayList();
        int r7 = 0;
        kc1 r8 = null;
        int r9 = 0;
    L27:
        if (r9 >= r2.h()) goto L45;
        long r10 = r2.e(r9);
        kc1 r11 = (kc1) r2.i(r9);
        if (r11.y() == false) goto L44;
        if (r10 == this.e) goto L38;
        r15.k(r11, r92.q);
        r1.getClass();
        ArrayList r12 = new ArrayList();
        Iterator r16 = ((CopyOnWriteArrayList) r1.o).iterator();
        if (r16.hasNext() == true) goto L37;
        r6.add(r12);
    L40:
        if (r10 != this.e) goto L42;
        boolean r17 = true;
    L43:
        r11.e0(r17);
        goto L44
    L42:
        r17 = false;
        goto L43
    L37:
        throw xa3.d(r16);
    L38:
        r8 = r11;
    L44:
        r9 = r9 + 1;
        goto L27
    L45:
        if (r8 == null) goto L52;
        r15.k(r8, r92.r);
        r1.getClass();
        ArrayList r18 = new ArrayList();
        Iterator r19 = ((CopyOnWriteArrayList) r1.o).iterator();
        if (r19.hasNext() == true) goto L50;
        r6.add(r18);
        goto L52
    L50:
        throw xa3.d(r19);
    L52:
        if (r15.a.isEmpty() == true) goto L63;
        r15.f();
        Collections.reverse(r6);
        int r110 = r6.size();
    L54:
        if (r7 >= r110) goto L70;
        Object r111 = r6.get(r7);
        r7 = r7 + 1;
        r1.getClass();
        zh0.B((List) r111);
        goto L54
    L70:
        return;
    L63:
        return;
    L69:
        return;
    L67:
        return;
    }
}
