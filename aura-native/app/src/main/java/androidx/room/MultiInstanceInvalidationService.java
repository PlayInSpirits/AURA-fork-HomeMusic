package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.az2;
import defpackage.zy2;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int n;
    public final LinkedHashMap o = new LinkedHashMap();
    public final az2 p = new az2(this);
    public final zy2 q = new zy2(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.q;
    }
}
