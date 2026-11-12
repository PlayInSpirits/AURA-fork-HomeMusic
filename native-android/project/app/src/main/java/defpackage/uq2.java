package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uq2 {
    public final oq2 a;
    public final int b;
    public final boolean c;
    public final wq2 d;
    public final wq2 e;
    public final wq2 f;
    public final ArrayList g;
    public final WeakReference h;
    public boolean i;
    public boolean j;

    public uq2(ui1 r2, wq2 r3, oq2 r4, int r5, boolean r6, wq2 r7, Collection r8) {
        this.i = false;
        this.j = false;
        this.h = new WeakReference(r2);
        this.e = r3;
        this.a = r4;
        this.b = r5;
        this.c = r6;
        this.d = r2.c;
        this.f = r7;
        if (r8 != null) goto L5;
        ArrayList r9 = null;
    L6:
        this.g = r9;
        r2.a.postDelayed(new qa1(20, this), 15000);
        return;
    L5:
        r9 = new ArrayList(r8);
        goto L6
    }

    public final void a() {
        if (this.i == false) goto L5;
        return;
    L5:
        if (this.j == true) goto L13;
        this.j = true;
        oq2 r1 = this.a;
        if (r1 == null) goto L12;
        r1.h(0);
        r1.d();
        return;
    L12:
        return;
    }

    public final void b() {
        yq2.b();
        if (this.i == false) goto L5;
        return;
    L5:
        if (this.j == true) goto L46;
        WeakReference r0 = this.h;
        ui1 r1 = (ui1) r0.get();
        if (r1 != null) goto L10;
    L40:
        a();
        return;
    L10:
        if (r1.e != this) goto L40;
        this.i = true;
        r1.e = null;
        ui1 r2 = (ui1) r0.get();
        wq2 r3 = this.d;
        int r4 = this.b;
        if (r2 == null) goto L27;
        HashMap r5 = r2.b;
        if (r2.c != r3) goto L27;
        Message r6 = r2.a.obtainMessage(263, r3);
        r6.arg1 = r4;
        r6.sendToTarget();
        oq2 r7 = r2.d;
        if (r7 == null) goto L20;
        r7.h(r4);
        r2.d.d();
    L20:
        if (r5.isEmpty() == true) goto L26;
        Iterator r8 = r5.values().iterator();
    L23:
        if (r8.hasNext() == false) goto L25;
        oq2 r9 = (oq2) r8.next();
        r9.h(r4);
        r9.d();
        goto L23
    L25:
        r5.clear();
    L26:
        r2.d = null;
    L27:
        ui1 r10 = (ui1) r0.get();
        if (r10 == null) goto L47;
        wq2 r11 = this.e;
        r10.c = r11;
        r10.d = this.a;
        ri1 r12 = r10.a;
        boolean r13 = this.c;
        wq2 r14 = this.f;
        if (r14 != null) goto L33;
        r12.getClass();
        Message r15 = r12.obtainMessage(262, new ti1(r3, r11, r13));
        r15.arg1 = r4;
        r15.sendToTarget();
    L34:
        r10.b.clear();
        r10.h();
        r10.l();
        ArrayList r16 = this.g;
        if (r16 == null) goto L44;
        tq2 r17 = r10.c.a();
        if (r17 == null) goto L45;
        r17.o(r16);
        return;
    L45:
        return;
    L44:
        return;
    L33:
        r12.getClass();
        Message r18 = r12.obtainMessage(264, new ti1(r14, r11, r13));
        r18.arg1 = r4;
        r18.sendToTarget();
        goto L34
    L47:
        return;
    }
}
