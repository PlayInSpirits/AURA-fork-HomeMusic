package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qt1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Activity o;
    public final /* synthetic */ HubAppRelease p;

    public /* synthetic */ qt1(Activity r1, HubAppRelease r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r3, int r4) {
        int r0 = this.n;
        HubAppRelease r1 = this.p;
        Activity r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        HubUpdater.h(r2, r1, r3, r4);
        return;
    L6:
        HubUpdater.d(r2, r1, r3, r4);
    }
}
