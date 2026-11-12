package defpackage;

import android.app.Activity;
import android.app.Fragment;
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
public final class ph5 extends Fragment implements x92 {
    public static final WeakHashMap q = null;
    public final Map n;
    public int o;
    public Bundle p;

    static {
        q = new WeakHashMap();
    }

    public ph5() {
        this.n = Collections.synchronizedMap(new oi(0));
        this.o = 0;
    }

    @Override // defpackage.x92
    public final LifecycleCallback c() {
        return (LifecycleCallback) df5.class.cast(this.n.get("ConnectionlessLifecycleHelper"));
    }

    @Override // android.app.Fragment
    public final void dump(String r1, FileDescriptor r2, PrintWriter r3, String[] r4) {
        super.dump(r1, r2, r3, r4);
        Iterator r0 = this.n.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((LifecycleCallback) r0.next()).getClass();
        goto L4
    }

    @Override // defpackage.x92
    public final Activity e() {
        return getActivity();
    }

    @Override // defpackage.x92
    public final void g(df5 r4) {
        Map r0 = this.n;
        if (r0.containsKey("ConnectionlessLifecycleHelper") == true) goto L8;
        r0.put("ConnectionlessLifecycleHelper", r4);
        if (this.o <= 0) goto L10;
        new zw2(Looper.getMainLooper(), 4).post(new qf5(2, this, r4));
        return;
    L10:
        return;
    L8:
        kf2.n("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r2, int r3, Intent r4) {
        super.onActivityResult(r2, r3, r4);
        Iterator r1 = this.n.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).b(r2, r3, r4);
        goto L4
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle r3) {
        super.onCreate(r3);
        this.o = 1;
        this.p = r3;
        Iterator r2 = this.n.entrySet().iterator();
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

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.o = 5;
        Iterator r1 = this.n.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).getClass();
        goto L4
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.o = 3;
        Iterator r1 = this.n.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).d();
        goto L4
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle r4) {
        super.onSaveInstanceState(r4);
        if (r4 == null) goto L9;
        Iterator r3 = this.n.entrySet().iterator();
    L7:
        if (r3.hasNext() == false) goto L11;
        Map.Entry r0 = (Map.Entry) r3.next();
        Bundle r1 = new Bundle();
        ((LifecycleCallback) r0.getValue()).e(r1);
        r4.putBundle((String) r0.getKey(), r1);
        goto L7
    L11:
        return;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.o = 2;
        Iterator r1 = this.n.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).f();
        goto L4
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.o = 4;
        Iterator r1 = this.n.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((LifecycleCallback) r1.next()).g();
        goto L4
    }
}
