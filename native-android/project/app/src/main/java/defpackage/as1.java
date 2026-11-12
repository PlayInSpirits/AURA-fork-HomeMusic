package defpackage;

import android.webkit.WebView;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class as1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ as1(HubFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        HubFragment r3 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        List r1 = HubFragment.y0;
        r3.n0();
        if (hw.i == null) goto L12;
        WebView r4 = hw.g;
        if (r4 == null) goto L13;
        r4.evaluateJavascript("window.dispatchEvent(new Event(" + rr1.c.j("hm:resume") + "));", null);
        return;
    L13:
        return;
    L12:
        return;
    L10:
        List r2 = HubFragment.y0;
        r3.n0();
    }
}
