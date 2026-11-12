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
    public final ArrayList n = new ArrayList();
    public final Context o;

    public hr4(Context context) {
        this.o = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.o;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        try {
            for (Intent intentZ = te5.z(context, componentName); intentZ != null; intentZ = te5.z(context, intentZ.getComponent())) {
                arrayList.add(size, intentZ);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            kf2.o("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.o.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.n.iterator();
    }
}
