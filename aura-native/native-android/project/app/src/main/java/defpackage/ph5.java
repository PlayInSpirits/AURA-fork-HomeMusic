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
    public static final WeakHashMap q = new WeakHashMap();
    public final Map n = Collections.synchronizedMap(new oi(0));
    public int o = 0;
    public Bundle p;

    @Override // defpackage.x92
    public final LifecycleCallback c() {
        return (LifecycleCallback) df5.class.cast(this.n.get("ConnectionlessLifecycleHelper"));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // defpackage.x92
    public final Activity e() {
        return getActivity();
    }

    @Override // defpackage.x92
    public final void g(df5 df5Var) {
        Map map = this.n;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            kf2.n("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            return;
        }
        map.put("ConnectionlessLifecycleHelper", df5Var);
        if (this.o > 0) {
            new zw2(Looper.getMainLooper(), 4).post(new qf5(2, this, df5Var));
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).b(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = 1;
        this.p = bundle;
        for (Map.Entry entry : this.n.entrySet()) {
            ((LifecycleCallback) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.o = 5;
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.o = 3;
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.n.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.o = 2;
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.o = 4;
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }
}
