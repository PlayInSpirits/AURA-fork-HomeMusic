package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class az2 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public az2(MultiInstanceInvalidationService r1) {
        this.a = r1;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface r1, Object r2) {
        ((uu1) r1).getClass();
        r2.getClass();
        this.a.o.remove((Integer) r2);
    }
}
