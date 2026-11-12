package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vg3 extends qq2 {
    public static final ArrayList F;
    public static final ArrayList G;
    public int A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final ui1 v;
    public final MediaRouter w;
    public final ar2 x;
    public final br2 y;
    public final MediaRouter.RouteCategory z;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        F = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        G = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public vg3(Context context, ui1 ui1Var) {
        super(context, new om1(10, new ComponentName("android", vg3.class.getName())));
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.v = ui1Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.w = mediaRouter;
        this.x = new ar2(this);
        this.y = new br2(this);
        this.z = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        s();
    }

    public static yg3 m(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof yg3) {
            return (yg3) tag;
        }
        return null;
    }

    public static void t(yg3 yg3Var) {
        int i;
        MediaRouter.UserRouteInfo userRouteInfo = yg3Var.b;
        wq2 wq2Var = yg3Var.a;
        userRouteInfo.setName(wq2Var.d);
        userRouteInfo.setPlaybackType(wq2Var.l);
        userRouteInfo.setPlaybackStream(wq2Var.m);
        userRouteInfo.setVolume(wq2Var.p);
        userRouteInfo.setVolumeMax(wq2Var.q);
        if (!wq2Var.e()) {
            i = wq2Var.o;
        } else if (yq2.c == null) {
            i = 0;
        } else {
            yq2.c().getClass();
            i = wq2Var.o;
        }
        userRouteInfo.setVolumeHandling(i);
        userRouteInfo.setDescription(wq2Var.e);
    }

    @Override // defpackage.qq2
    public final oq2 b(String str) {
        int iJ = j(str);
        if (iJ >= 0) {
            return new wg3(((xg3) this.D.get(iJ)).a);
        }
        return null;
    }

    @Override // defpackage.qq2
    public final void e(up2 up2Var) {
        boolean zB;
        int i = 0;
        if (up2Var != null) {
            up2Var.a();
            ArrayList arrayListB = up2Var.b.b();
            int size = arrayListB.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) arrayListB.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            zB = up2Var.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.A == i && this.B == zB) {
            return;
        }
        this.A = i;
        this.B = zB;
        s();
    }

    public final boolean h(MediaRouter.RouteInfo routeInfo) {
        String str;
        if (m(routeInfo) != null || i(routeInfo) >= 0) {
            return false;
        }
        String str2 = this.w.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(l(routeInfo).hashCode()));
        if (j(str2) >= 0) {
            int i = 2;
            while (true) {
                Locale locale = Locale.US;
                str = str2 + "_" + i;
                if (j(str) < 0) {
                    break;
                }
                i++;
            }
            str2 = str;
        }
        xg3 xg3Var = new xg3(routeInfo, str2);
        r(xg3Var);
        this.D.add(xg3Var);
        return true;
    }

    public final int i(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xg3) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int j(String str) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xg3) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int k(wq2 wq2Var) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((yg3) arrayList.get(i)).a == wq2Var) {
                return i;
            }
        }
        return -1;
    }

    public final String l(MediaRouter.RouteInfo routeInfo) {
        int i;
        Context context = this.n;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = routeInfo.getDeviceType();
        if (deviceType == 1) {
            i = R.string.mr_route_name_tv;
        } else if (deviceType != 2) {
            i = deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth;
        } else {
            i = R.string.mr_route_name_speaker;
        }
        return context.getString(i);
    }

    public final void n(wq2 wq2Var) {
        qq2 qq2VarC = wq2Var.c();
        MediaRouter mediaRouter = this.w;
        if (qq2VarC == this) {
            int i = i(mediaRouter.getSelectedRoute(8388611));
            if (i < 0 || !((xg3) this.D.get(i)).b.equals(wq2Var.b)) {
                return;
            }
            wq2Var.k(false);
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.z);
        yg3 yg3Var = new yg3(wq2Var, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(yg3Var);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.y);
        t(yg3Var);
        this.E.add(yg3Var);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    public final void o(wq2 wq2Var) {
        int iK;
        if (wq2Var.c() == this || (iK = k(wq2Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((yg3) this.E.remove(iK)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.w.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    public final void p(wq2 wq2Var) {
        if (wq2Var.g()) {
            qq2 qq2VarC = wq2Var.c();
            MediaRouter mediaRouter = this.w;
            if (qq2VarC != this) {
                int iK = k(wq2Var);
                if (iK >= 0) {
                    mediaRouter.selectRoute(8388611, ((yg3) this.E.get(iK)).b);
                    return;
                }
                return;
            }
            int iJ = j(wq2Var.b);
            if (iJ >= 0) {
                mediaRouter.selectRoute(8388611, ((xg3) this.D.get(iJ)).a);
            }
        }
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.D;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            sp2 sp2Var = ((xg3) arrayList2.get(i)).c;
            if (sp2Var == null) {
                kf2.n("route must not be null");
                return;
            } else {
                if (arrayList.contains(sp2Var)) {
                    kf2.n("route descriptor already added");
                    return;
                }
                arrayList.add(sp2Var);
            }
        }
        f(new xk0(arrayList, false));
    }

    public final void r(xg3 xg3Var) {
        String str = xg3Var.b;
        MediaRouter.RouteInfo routeInfo = xg3Var.a;
        ss0 ss0Var = new ss0(str, l(routeInfo));
        Bundle bundle = (Bundle) ss0Var.n;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            ss0Var.n(F);
        }
        if ((supportedTypes & 2) != 0) {
            ss0Var.n(G);
        }
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        bundle.putInt("deviceType", routeInfo.getDeviceType());
        xg3Var.c = ss0Var.r();
    }

    public final void s() {
        boolean z = this.C;
        ar2 ar2Var = this.x;
        MediaRouter mediaRouter = this.w;
        if (z) {
            mediaRouter.removeCallback(ar2Var);
        }
        this.C = true;
        mediaRouter.addCallback(this.A, ar2Var, (this.B ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zH = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zH |= h((MediaRouter.RouteInfo) obj);
        }
        if (zH) {
            q();
        }
    }
}
