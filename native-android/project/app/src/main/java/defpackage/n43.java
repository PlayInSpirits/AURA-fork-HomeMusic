package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n43 implements e23 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeakReference b;
    public final /* synthetic */ v23 c;

    public /* synthetic */ n43(WeakReference r1, v23 r2, int r3) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    @Override // defpackage.e23
    public final void a(v23 r4, r23 r5) {
        int r6 = this.a;
        int r0 = 0;
        v23 r1 = this.c;
        WeakReference r2 = this.b;
        r5.getClass();
        switch(r6) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        s33 r7 = (s33) r2.get();
        if (r7 != null) goto L8;
        r1.getClass();
        r1.p.remove(this);
        return;
    L8:
        if ((r5 instanceof rp0) == true) goto L31;
        Menu r3 = r7.getMenu();
        r3.getClass();
        int r8 = r3.size();
    L11:
        if (r0 >= r8) goto L32;
        MenuItem r9 = r3.getItem(r0);
        r9.getClass();
        if (uo.y(r9.getItemId(), r5) == false) goto L15;
        r9.setChecked(true);
    L15:
        r0 = r0 + 1;
        goto L11
    L32:
        return;
    L31:
        return;
    L17:
        NavigationView r10 = (NavigationView) r2.get();
        if (r10 != null) goto L21;
        r1.getClass();
        r1.p.remove(this);
        return;
    L21:
        if ((r5 instanceof rp0) == true) goto L33;
        Menu r11 = r10.getMenu();
        r11.getClass();
        int r12 = r11.size();
    L24:
        if (r0 >= r12) goto L34;
        MenuItem r13 = r11.getItem(r0);
        r13.getClass();
        r13.setChecked(uo.y(r13.getItemId(), r5));
        r0 = r0 + 1;
        goto L24
    L34:
        return;
    }
}
