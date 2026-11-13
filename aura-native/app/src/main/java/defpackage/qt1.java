/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubUpdater;

public final class qt1
implements DialogInterface.OnClickListener {
    public final int n;
    public final Activity o;
    public final HubAppRelease p;

    public qt1(Activity activity, HubAppRelease hubAppRelease, int n16) {
        this.n = n16;
        this.o = activity;
        this.p = hubAppRelease;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int n16) {
        int n17 = this.n;
        HubAppRelease hubAppRelease = this.p;
        Activity activity = this.o;
        switch (n17) {
            default: {
                HubUpdater.h(activity, hubAppRelease, dialogInterface, n16);
                return;
            }
            case 0: 
        }
        HubUpdater.d(activity, hubAppRelease, dialogInterface, n16);
    }
}

