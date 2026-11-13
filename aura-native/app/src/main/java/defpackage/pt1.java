/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.Activity;
import android.widget.TextView;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public final class pt1
implements Runnable {
    public final long n;
    public final LinearProgressIndicator o;
    public final TextView p;
    public final long q;
    public final HubUpdater r;
    public final Activity s;

    public pt1(long l16, LinearProgressIndicator linearProgressIndicator, TextView textView, long l17, HubUpdater hubUpdater, Activity activity) {
        this.n = l16;
        this.o = linearProgressIndicator;
        this.p = textView;
        this.q = l17;
        this.r = hubUpdater;
        this.s = activity;
    }

    @Override
    public final void run() {
        HubUpdater hubUpdater = this.r;
        Activity activity = this.s;
        HubUpdater.a(this.n, this.o, this.p, this.q, hubUpdater, activity);
    }
}

