package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f70 implements i54 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ f70(nc1 nc1Var, int i) {
        this.a = i;
        this.b = nc1Var;
    }

    @Override // defpackage.i54
    public final Bundle a() {
        int i = this.a;
        nc1 nc1Var = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                j70 j70Var = nc1Var.u;
                j70Var.getClass();
                LinkedHashMap linkedHashMap = j70Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(j70Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(j70Var.g));
                return bundle;
        }
        while (nc1.l(nc1Var.k())) {
        }
        nc1Var.I.d(q92.ON_STOP);
        return new Bundle();
    }
}
