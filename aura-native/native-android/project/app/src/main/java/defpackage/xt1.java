package defpackage;

import android.webkit.JavascriptInterface;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.homemusic.WaveOut;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 {
    public static final xt1 a = new xt1();
    public static volatile yr1 b;
    public static volatile es1 c;
    public static volatile es1 d;
    public static volatile zr1 e;
    public static volatile yr1 f;
    public static volatile zr1 g;
    public static volatile boolean h;

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
    public final void play(String str, int i) {
        Object s14Var;
        try {
            String[] strArr = (String[]) rr1.c.d(String[].class, str);
            s14Var = strArr != null ? ti.r0(strArr) : null;
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        List list = (List) (s14Var instanceof s14 ? null : s14Var);
        if (list == null || list.isEmpty()) {
            return;
        }
        io1.b.post(new vt1(i, 0, list));
    }

    @JavascriptInterface
    public final void playQueue(String str, int i) {
        Object s14Var;
        try {
            HubTracks$Item[] hubTracks$ItemArr = (HubTracks$Item[]) rr1.c.d(HubTracks$Item[].class, str);
            s14Var = hubTracks$ItemArr != null ? ti.r0(hubTracks$ItemArr) : null;
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        List list = (List) (s14Var instanceof s14 ? null : s14Var);
        if (list == null || list.isEmpty()) {
            return;
        }
        io1.b.post(new vt1(i, 1, list));
    }

    @JavascriptInterface
    public final void playWave(String str) {
        Object s14Var;
        try {
            s14Var = (WaveOut) rr1.c.d(WaveOut.class, str);
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        if (s14Var instanceof s14) {
            s14Var = null;
        }
        WaveOut waveOut = (WaveOut) s14Var;
        if (waveOut == null) {
            return;
        }
        io1.b.post(new qa1(15, waveOut));
    }

    @JavascriptInterface
    public final void shareText(String str) {
        if (str == null || qm4.u0(str)) {
            return;
        }
        io1.b.post(new kt1(3, str));
    }

    @JavascriptInterface
    public final void webPlayer(final boolean z) {
        io1.b.post(new Runnable() { // from class: wt1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2 = z;
                xt1.h = z2;
                zr1 zr1Var = xt1.g;
                if (zr1Var != null) {
                    zr1Var.invoke(Boolean.valueOf(z2));
                }
            }
        });
    }
}
