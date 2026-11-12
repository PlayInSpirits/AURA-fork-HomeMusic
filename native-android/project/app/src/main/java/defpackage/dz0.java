package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dz0 extends cz0 {
    @Override // defpackage.bz0, defpackage.zy0, defpackage.ez0
    public void b(up4 r6, up4 r7, Window r8, View r9, boolean r10, boolean r11) {
        r6.getClass();
        r7.getClass();
        r8.getClass();
        r9.getClass();
        l93.d0(r8, false);
        r8.setStatusBarColor(0);
        r8.setNavigationBarColor(0);
        if ((r9 instanceof ViewGroup) == false) goto L5;
        ViewGroup r12 = (ViewGroup) r9;
    L7:
        if (r12 == null) goto L29;
        int r0 = 0;
    L10:
        if (r0 >= r12.getChildCount()) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == false) goto L29;
        int r2 = r0 + 1;
        View r3 = r12.getChildAt(r0);
        if (r3 == null) goto L28;
        Object r4 = r3.getTag();
        if ((r4 instanceof List) == false) goto L26;
        List r5 = (List) r4;
        if (r5.size() != 4) goto L26;
        if ((r5.get(0) instanceof i50) == false) goto L26;
        Iterator r13 = ((Iterable) r4).iterator();
    L24:
        if (r13.hasNext() == false) goto L29;
        r13.next();
    L26:
        r0 = r2;
        goto L10
    L28:
        throw new IndexOutOfBoundsException();
    L12:
        r1 = false;
    L29:
        kz.x(r8);
        om1 r14 = new om1(r9);
        int r15 = Build.VERSION.SDK_INT;
        if (r15 < 35) goto L33;
        su3 r16 = new tb5(r8, r14);
    L39:
        r16.D(!r10);
        r16.C(!r11);
        return;
    L33:
        if (r15 < 30) goto L36;
        r16 = new sb5(r8, r14);
        goto L39
    L36:
        if (r15 < 26) goto L38;
        r16 = new rb5(r8, r14);
        goto L39
    L38:
        r16 = new qb5(r8, r14);
        goto L39
    L5:
        r12 = null;
        goto L7
    }
}
