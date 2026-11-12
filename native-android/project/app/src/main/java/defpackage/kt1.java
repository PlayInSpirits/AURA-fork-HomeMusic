package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.util.Log;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.b;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    public /* synthetic */ kt1(int r1, String r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = 1;
        String r4 = this.o;
        switch(r0) {
            case 0: goto L37;
            case 1: goto L25;
            case 2: goto L19;
            case 3: goto L8;
            default: goto L4;
        };
    L4:
        File r5 = xt3.e(r4);
        if (r5.exists() == false) goto L41;
        r5.delete();
        return;
    L41:
        return;
    L8:
        MutableContextWrapper r2 = hw.h;
        Activity r3 = null;
        if (r2 == null) goto L11;
        Context r6 = r2.getBaseContext();
    L13:
        if ((r6 instanceof Activity) == false) goto L15;
        r3 = (Activity) r6;
    L15:
        if (r3 == null) goto L42;
        Intent r7 = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", r4);
        r7.getClass();
        r3.startActivity(Intent.createChooser(r7, r3.getString(R.string.homemusic_share_title)));
        return;
    L42:
        return;
    L11:
        r6 = null;
        goto L13
    L19:
        WaveSession r8 = b.b;
        if (r8 != null) goto L22;
        return;
    L22:
        if (r8.isWave(r4) != true) goto L44;
        b.c();
        return;
    L44:
        return;
    L25:
        ConcurrentHashMap r9 = ot1.b;
        Integer r10 = (Integer) r9.get(r4);
        if (r10 == null) goto L28;
        int r11 = r10.intValue();
    L29:
        if (r11 > 0) goto L45;
        r9.remove(r4);
        au0.D(App.a()).m(r4);     // Catch: Exception -> L34
        Log.d("HubTracks", "dropped the original stored as a light stream: " + r4);     // Catch: Exception -> L34
        return;
    L34:
        e = move-exception;
        Log.w("HubTracks", "could not drop " + r4, e);
        return;
    L45:
        return;
    L28:
        r11 = 0;
        goto L29
    L37:
        io1.a.execute(new kt1(r1, r4));
    }
}
