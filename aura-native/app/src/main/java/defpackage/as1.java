package defpackage;

import android.webkit.WebView;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class as1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ as1(HubFragment hubFragment, int i) {
        this.n = i;
        this.o = hubFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        int i = this.n;
        HubFragment hubFragment = this.o;
        switch (i) {
            case 0:
                List list = HubFragment.y0;
                hubFragment.n0();
                break;
            default:
                List list2 = HubFragment.y0;
                hubFragment.n0();
                if (hw.i != null && (webView = hw.g) != null) {
                    webView.evaluateJavascript("window.dispatchEvent(new Event(" + rr1.c.j("hm:resume") + "));", null);
                    break;
                }
                break;
        }
    }
}
