package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 extends qq2 {
    public static final /* synthetic */ int F = 0;
    public final uo2 A;
    public final ym B;
    public ArrayList C;
    public final ArrayMap D;
    public String E;
    public final MediaRouter2 v;
    public final hg3 w;
    public final ArrayMap x;
    public final MediaRouter2$RouteCallback y;
    public final yo2 z;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public zo2(Context context, hg3 hg3Var) {
        super(context, null);
        this.x = new ArrayMap();
        this.z = new yo2(this);
        this.A = new uo2(this);
        this.C = new ArrayList();
        this.D = new ArrayMap();
        this.v = MediaRouter2.getInstance(context);
        this.w = hg3Var;
        this.B = new ym(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.y = new xo2(this, 1);
        } else {
            this.y = new xo2(this, 0);
        }
    }

    @Override // defpackage.qq2
    public final nq2 a(String str, pq2 pq2Var) {
        Iterator it = this.x.entrySet().iterator();
        while (it.hasNext()) {
            vo2 vo2Var = (vo2) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, vo2Var.f)) {
                return vo2Var;
            }
        }
        return null;
    }

    @Override // defpackage.qq2
    public final oq2 b(String str) {
        return new wo2(0, (String) this.D.get(str), null);
    }

    @Override // defpackage.qq2
    public final oq2 d(String str, String str2) {
        int i;
        vo2 vo2Var;
        sp2 sp2Var;
        String str3 = (String) this.D.get(str);
        Iterator it = this.x.values().iterator();
        do {
            i = 0;
            if (!it.hasNext()) {
                Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
                return new wo2(i, str3, null);
            }
            vo2Var = (vo2) it.next();
            sp2Var = vo2Var.o;
        } while (!TextUtils.equals(str2, sp2Var != null ? sp2Var.d() : vo2Var.g.getId()));
        return new wo2(i, str3, vo2Var);
    }

    @Override // defpackage.qq2
    public final void e(up2 up2Var) {
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        int i = yq2.c == null ? 0 : yq2.c().z;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.y;
        uo2 uo2Var = this.A;
        yo2 yo2Var = this.z;
        if (i <= 0) {
            this.v.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.v.unregisterTransferCallback(yo2Var);
            this.v.unregisterControllerCallback(uo2Var);
            return;
        }
        yq2.c().getClass();
        if (up2Var == null) {
            up2Var = new up2(rq2.c, false);
        }
        up2Var.a();
        ArrayList arrayListB = up2Var.b.b();
        arrayListB.remove("android.media.intent.category.LIVE_AUDIO");
        c52 c52Var = new c52();
        c52Var.a(arrayListB);
        rq2 rq2VarD = c52Var.d();
        boolean zB = up2Var.b();
        if (rq2VarD == null) {
            kf2.n("selector must not be null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("selector", rq2VarD.a);
        bundle.putBoolean("activeScan", zB);
        MediaRouter2 mediaRouter2 = this.v;
        rq2VarD.a();
        if (rq2VarD.b.contains(null)) {
            l3.C();
            routeDiscoveryPreferenceBuild = to2.e(new ArrayList()).build();
        } else {
            boolean z = bundle.getBoolean("activeScan");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListB2 = rq2VarD.b();
            int size = arrayListB2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListB2.get(i2);
                i2++;
                String str = (String) obj;
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                    case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                        break;
                    case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                        break;
                }
                arrayList.add(str);
            }
            routeDiscoveryPreferenceBuild = to2.f(arrayList, z).build();
        }
        ym ymVar = this.B;
        mediaRouter2.registerRouteCallback(ymVar, mediaRouter2$RouteCallback, routeDiscoveryPreferenceBuild);
        this.v.registerTransferCallback(ymVar, yo2Var);
        this.v.registerControllerCallback(ymVar, uo2Var);
    }

    public final MediaRoute2Info h(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MediaRoute2Info mediaRoute2InfoG = l3.g(obj);
            if (TextUtils.equals(mediaRoute2InfoG.getId(), str)) {
                return mediaRoute2InfoG;
            }
        }
        return null;
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.v.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoG = l3.g(it.next());
            if (mediaRoute2InfoG != null && !arraySet.contains(mediaRoute2InfoG) && !mediaRoute2InfoG.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoG);
                arrayList.add(mediaRoute2InfoG);
            }
        }
        if (arrayList.equals(this.C)) {
            return;
        }
        this.C = arrayList;
        ArrayMap arrayMap = this.D;
        arrayMap.clear();
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            MediaRoute2Info mediaRoute2InfoG2 = l3.g(obj);
            Bundle extras = mediaRoute2InfoG2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoG2);
            } else {
                arrayMap.put(mediaRoute2InfoG2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.C;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            sp2 sp2VarG = bu.G(l3.g(obj2));
            if (sp2VarG != null) {
                arrayList3.add(sp2VarG);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                sp2 sp2Var = (sp2) obj3;
                if (sp2Var == null) {
                    kf2.n("route must not be null");
                    return;
                } else {
                    if (arrayList5.contains(sp2Var)) {
                        kf2.n("route descriptor already added");
                        return;
                    }
                    arrayList5.add(sp2Var);
                }
            }
        }
        f(new xk0(arrayList5, true));
    }

    public final void j(MediaRouter2.RoutingController routingController) {
        ss0 ss0Var;
        vo2 vo2Var = (vo2) this.x.get(routingController);
        if (vo2Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList arrayListP = bu.p(selectedRoutes);
        sp2 sp2VarG = bu.G(l3.g(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.n.getString(R.string.mr_dialog_default_group_name);
        sp2 sp2Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    sp2Var = new sp2(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (sp2Var == null) {
            ss0Var = new ss0(routingController.getId(), string);
            Bundle bundle2 = (Bundle) ss0Var.n;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            ss0 ss0Var2 = new ss0();
            ss0Var2.o = new ArrayList();
            ss0Var2.p = new ArrayList();
            ss0Var2.q = new HashSet();
            ss0Var2.n = new Bundle(sp2Var.a);
            ss0Var2.o = sp2Var.c();
            ss0Var2.p = sp2Var.b();
            ss0Var2.q = sp2Var.a();
            ss0Var = ss0Var2;
        }
        Bundle bundle3 = (Bundle) ss0Var.n;
        bundle3.putInt("volume", routingController.getVolume());
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        ((ArrayList) ss0Var.p).clear();
        ss0Var.n(sp2VarG.b());
        ((ArrayList) ss0Var.o).clear();
        ss0Var.p(arrayListP);
        sp2 sp2VarR = ss0Var.r();
        ArrayList arrayListP2 = bu.p(routingController.getSelectableRoutes());
        ArrayList arrayListP3 = bu.p(routingController.getDeselectableRoutes());
        xk0 xk0Var = this.t;
        if (xk0Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<sp2> list = (List) xk0Var.p;
        if (!list.isEmpty()) {
            for (sp2 sp2Var2 : list) {
                String strD = sp2Var2.d();
                arrayList.add(new mq2(sp2Var2, arrayListP.contains(strD) ? 3 : 1, arrayListP3.contains(strD), arrayListP2.contains(strD), true));
            }
        }
        vo2Var.o = sp2VarR;
        vo2Var.l(sp2VarR, arrayList);
    }
}
