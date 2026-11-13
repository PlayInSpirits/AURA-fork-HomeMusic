/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.DialogInterface;
import com.eddyizm.tempus.homemusic.HubUpdater;

public final class st1
implements DialogInterface.OnDismissListener {
    public final boolean n;

    public st1(boolean bl5) {
        this.n = bl5;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        HubUpdater.k(this.n, dialogInterface);
    }
}

