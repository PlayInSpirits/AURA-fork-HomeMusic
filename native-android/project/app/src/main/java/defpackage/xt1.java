package defpackage;

import android.webkit.JavascriptInterface;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.homemusic.WaveOut;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 {
    public static final xt1 a = null;
    public static volatile yr1 b;
    public static volatile es1 c;
    public static volatile es1 d;
    public static volatile zr1 e;
    public static volatile yr1 f;
    public static volatile zr1 g;
    public static volatile boolean h;

    static {
        a = new xt1();
    }

    @JavascriptInterface
    public final String appVersion() {
        return "1.14.7";
    }

    @JavascriptInterface
    public final boolean isEmbedded() {
        return true;
    }

    @JavascriptInterface
    public final void onUnauthorized() {
        io1.b.post(new u6(16));
    }

    @JavascriptInterface
    public final void pauseNative() {
        io1.b.post(new u6(15));
    }

    @JavascriptInterface
    public final void play(String r3, int r4) {
        Object r2 = null;
        String[] r5 = (String[]) rr1.c.d(String[].class, r3);     // Catch: Throwable -> L7
        if (r5 == null) goto L9;
        Object r6 = ti.r0(r5);     // Catch: Throwable -> L7
    L12:
        if ((r6 instanceof s14) == true) goto L15;
        r2 = r6;
    L15:
        List r7 = (List) r2;
        if (r7 != null) goto L18;
        return;
    L18:
        if (r7.isEmpty() == true) goto L25;
        io1.b.post(new vt1(r4, 0, r7));
        return;
    L25:
        return;
    L9:
        r6 = null;
    L7:
        th = move-exception;
        r6 = new s14(th);
        goto L12
    }

    @JavascriptInterface
    public final void playQueue(String r3, int r4) {
        Object r2 = null;
        HubTracks$Item[] r5 = (HubTracks$Item[]) rr1.c.d(HubTracks$Item[].class, r3);     // Catch: Throwable -> L7
        if (r5 == null) goto L9;
        Object r6 = ti.r0(r5);     // Catch: Throwable -> L7
    L12:
        if ((r6 instanceof s14) == true) goto L15;
        r2 = r6;
    L15:
        List r7 = (List) r2;
        if (r7 != null) goto L18;
        return;
    L18:
        if (r7.isEmpty() == true) goto L25;
        io1.b.post(new vt1(r4, 1, r7));
        return;
    L25:
        return;
    L9:
        r6 = null;
    L7:
        th = move-exception;
        r6 = new s14(th);
        goto L12
    }

    @JavascriptInterface
    public final void playWave(String r3) {
        Object r2 = (WaveOut) rr1.c.d(WaveOut.class, r3);     // Catch: Throwable -> L4
    L7:
        if ((r2 instanceof s14) == false) goto L9;
        r2 = null;
    L9:
        WaveOut r4 = (WaveOut) r2;
        if (r4 != null) goto L12;
        return;
    L12:
        io1.b.post(new qa1(15, r4));
        return;
    L4:
        th = move-exception;
        r2 = new s14(th);
        goto L7
    }

    @JavascriptInterface
    public final void shareText(String r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (qm4.u0(r3) == true) goto L9;
        io1.b.post(new kt1(3, r3));
        return;
    }

    @JavascriptInterface
    public final void webPlayer(final boolean r2) {
        io1.b.post(new wt1(r2));
    }
}
