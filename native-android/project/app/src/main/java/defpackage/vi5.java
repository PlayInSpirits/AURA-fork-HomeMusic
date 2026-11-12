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
    public static final WeakHashMap o0 = new WeakHashMap();
    public final Map l0 = Collections.synchronizedMap(new oi(0));
    public int m0 = 0;
    public Bundle n0;

    @Override // defpackage.kc1
    public final void D(int i, int i2, Intent intent) {
        super.D(i, i2, intent);
        Iterator it = this.l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).b(i, i2, intent);
        }
    }

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.m0 = 1;
        this.n0 = bundle;
        for (Map.Entry entry : this.l0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // defpackage.kc1
    public final void I() {
        this.R = true;
        this.m0 = 5;
        Iterator it = this.l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        this.m0 = 3;
        Iterator it = this.l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d();
        }
    }

    @Override // defpackage.kc1
    public final void Q(Bundle bundle) {
        for (Map.Entry entry : this.l0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        this.m0 = 2;
        Iterator it = this.l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // defpackage.kc1
    public final void S() {
        this.R = true;
        this.m0 = 4;
        Iterator it = this.l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // defpackage.x92
    public final LifecycleCallback c() {
        return (LifecycleCallback) df5.class.cast(this.l0.get("ConnectionlessLifecycleHelper"));
    }

    @Override // defpackage.x92
    public final void g(df5 df5Var) {
        Map map = this.l0;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            kf2.n("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            return;
        }
        map.put("ConnectionlessLifecycleHelper", df5Var);
        if (this.m0 > 0) {
            new zw2(Looper.getMainLooper(), 4).post(new qf5(3, this, df5Var));
        }
    }

    @Override // defpackage.kc1
    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }
}
