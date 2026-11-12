package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vi5 extends kc1 implements x92 {
    public static final WeakHashMap o0 = null;
    public final Map l0;
    public int m0;
    public Bundle n0;

    static {
        o0 = new WeakHashMap();
    }

    public vi5() {
        this.l0 = Collections.synchronizedMap(new oi(0));
        this.m0 = 0;
    }

    @Override // defpackage.kc1
    public final void D(int r2, int r3, Intent r4) {
        super.D(r2, r3, r4);
        Iterator r1 = this.l0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).b(r2, r3, r4);
        goto L4
    }

    @Override // defpackage.kc1
    public final void F(Bundle r3) {
        super.F(r3);
        this.m0 = 1;
        this.n0 = r3;
        Iterator r2 = this.l0.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        Map.Entry r0 = (Map.Entry) r2.next();
        LifecycleCallback r1 = (LifecycleCallback) r0.getValue();
        if (r3 == null) goto L8;
        Bundle r4 = r3.getBundle((String) r0.getKey());
    L9:
        r1.c(r4);
        goto L4
    L8:
        r4 = null;
        goto L9
    }

    @Override // defpackage.kc1
    public final void I() {
        this.R = true;
        this.m0 = 5;
        Iterator r1 = this.l0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).getClass();
        goto L4
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        this.m0 = 3;
        Iterator r1 = this.l0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).d();
        goto L4
    }

    @Override // defpackage.kc1
    public final void Q(Bundle r4) {
        Iterator r3 = this.l0.entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        Map.Entry r0 = (Map.Entry) r3.next();
        Bundle r1 = new Bundle();
        ((LifecycleCallback) r0.getValue()).e(r1);
        r4.putBundle((String) r0.getKey(), r1);
        goto L4
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        this.m0 = 2;
        Iterator r1 = this.l0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).f();
        goto L4
    }

    @Override // defpackage.kc1
    public final void S() {
        this.R = true;
        this.m0 = 4;
        Iterator r1 = this.l0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).g();
        goto L4
    }

    @Override // defpackage.x92
    public final LifecycleCallback c() {
        return (LifecycleCallback) df5.class.cast(this.l0.get("ConnectionlessLifecycleHelper"));
    }

    @Override // defpackage.x92
    public final void g(df5 r4) {
        Map r0 = this.l0;
        if (r0.containsKey("ConnectionlessLifecycleHelper") == true) goto L8;
        r0.put("ConnectionlessLifecycleHelper", r4);
        if (this.m0 <= 0) goto L10;
        new zw2(Looper.getMainLooper(), 4).post(new qf5(3, this, r4));
        return;
    L10:
        return;
    L8:
        kf2.n("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
    }

    @Override // defpackage.kc1
    public final void j(String r1, FileDescriptor r2, PrintWriter r3, String[] r4) {
        super.j(r1, r2, r3, r4);
        Iterator r0 = this.l0.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((LifecycleCallback) r0.next()).getClass();
        goto L4
    }
}
