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

    public /* synthetic */ qt1(Activity activity, HubAppRelease hubAppRelease, int i) {
        this.n = i;
        this.o = activity;
        this.p = hubAppRelease;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.n;
        HubAppRelease hubAppRelease = this.p;
        Activity activity = this.o;
        switch (i2) {
            case 0:
                HubUpdater.download$lambda$0$1$1$0(activity, hubAppRelease, dialogInterface, i);
                break;
            default:
                HubUpdater.offer$lambda$3(activity, hubAppRelease, dialogInterface, i);
                break;
        }
    }
}
