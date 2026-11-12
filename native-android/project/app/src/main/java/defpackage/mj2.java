package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends uj2 {
    public final /* synthetic */ oj2 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ pn2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj2(pn2 pn2Var, String str, oj2 oj2Var, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.i = pn2Var;
        this.e = oj2Var;
        this.f = str2;
        this.g = bundle;
        this.h = bundle2;
    }

    @Override // defpackage.uj2
    public final void d(Object obj) {
        List list = (List) obj;
        oi oiVar = this.i.r;
        oj2 oj2Var = this.e;
        hg3 hg3Var = oj2Var.e;
        String str = oj2Var.a;
        hg3Var.getClass();
        Object obj2 = oiVar.get(((Messenger) hg3Var.o).getBinder());
        String str2 = this.f;
        if (obj2 != oj2Var) {
            l93.A("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
            return;
        }
        try {
            hg3Var.H(str2, list, this.g, this.h);
        } catch (RemoteException unused) {
            l93.q0("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
