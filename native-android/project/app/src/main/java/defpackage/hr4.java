package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr4 implements Iterable {
    public final ArrayList n;
    public final Context o;

    public hr4(Context r2) {
        this.n = new ArrayList();
        this.o = r2;
    }

    public final void a(ComponentName r3) {
        Context r0 = this.o;
        ArrayList r2 = this.n;
        int r1 = r2.size();
        Intent r4 = te5.z(r0, r3);     // Catch: PackageManager.NameNotFoundException -> L8
    L4:
        if (r4 == null) goto L7;
        r2.add(r1, r4);     // Catch: PackageManager.NameNotFoundException -> L8
        r4 = te5.z(r0, r4.getComponent());     // Catch: PackageManager.NameNotFoundException -> L8
        goto L4
    L7:
        return;
    L8:
        e = move-exception;
        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
        throw new IllegalArgumentException(e);
    }

    public final void b() {
        ArrayList r0 = this.n;
        if (r0.isEmpty() == true) goto L6;
        Intent[] r1 = (Intent[]) r0.toArray(new Intent[0]);
        r1[0] = new Intent(r1[0]).addFlags(268484608);
        this.o.startActivities(r1, null);
        return;
    L6:
        kf2.o("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.n.iterator();
    }
}
