package defpackage;

import android.app.ApplicationExitInfo;
import android.content.res.loader.ResourcesLoader;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.util.CloseGuard;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l3 {
    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo d(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ ResourcesLoader e() {
        return new ResourcesLoader();
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info g(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder h(gy3 gy3Var) {
        return new RouteDiscoveryPreference.Builder(gy3Var, false);
    }

    public static /* synthetic */ CloseGuard k() {
        return new CloseGuard();
    }

    public static /* bridge */ /* synthetic */ CloseGuard l(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ void s() {
    }
}
