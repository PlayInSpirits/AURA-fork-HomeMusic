package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f70 implements i54 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ f70(nc1 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.i54
    public final Bundle a() {
        int r0 = this.a;
        nc1 r4 = this.b;
        switch(r0) {
            case 0: goto L8;
            default: goto L5;
        };
    L8:
        Bundle r1 = new Bundle();
        j70 r5 = r4.u;
        r5.getClass();
        LinkedHashMap r2 = r5.b;
        r1.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(r2.values()));
        r1.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(r2.keySet()));
        r1.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(r5.d));
        r1.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(r5.g));
        return r1;
    L5:
        if (nc1.l(r4.k()) == true) goto L5;
        r4.I.d(q92.ON_STOP);
        return new Bundle();
    }
}
