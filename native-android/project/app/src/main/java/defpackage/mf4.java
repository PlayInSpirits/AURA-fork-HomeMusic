package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mf4 implements zj2, kg1, StarCallback {
    public static volatile mf4 r;
    public final /* synthetic */ int n;
    public boolean o;
    public Object p;
    public Object q;

    public mf4(int i) {
        this.n = i;
        switch (i) {
            case 6:
                this.p = Collections.newSetFromMap(new WeakHashMap());
                this.q = new HashSet();
                break;
            case 7:
                this.p = new Object();
                break;
        }
    }

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static mf4 f(Context context) {
        if (r == null) {
            synchronized (mf4.class) {
                try {
                    if (r == null) {
                        r = new mf4(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return r;
    }

    public boolean c(pz3 pz3Var) {
        boolean z = true;
        if (pz3Var == null) {
            return true;
        }
        boolean zRemove = ((Set) this.p).remove(pz3Var);
        if (!((HashSet) this.q).remove(pz3Var) && !zRemove) {
            z = false;
        }
        if (z) {
            pz3Var.clear();
        }
        return z;
    }

    @Override // defpackage.zj2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public yk a(ml3 ml3Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        ck2 blVar;
        int i;
        String str = ((dk2) ml3Var.a).a;
        yk ykVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.o || Build.VERSION.SDK_INT < 36) {
                    blVar = new bl(mediaCodecCreateByCodecName, (HandlerThread) ((xk) this.q).get());
                    i = 0;
                } else {
                    blVar = new pz1(27, mediaCodecCreateByCodecName);
                    i = 4;
                }
                yk ykVar2 = new yk(mediaCodecCreateByCodecName, (HandlerThread) ((xk) this.p).get(), blVar, (ns3) ml3Var.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) ml3Var.d;
                    if (surface == null && ((dk2) ml3Var.a).h && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    yk.b(ykVar2, (MediaFormat) ml3Var.b, surface, (MediaCrypto) ml3Var.e, i);
                    return ykVar2;
                } catch (Exception e) {
                    e = e;
                    ykVar = ykVar2;
                    if (ykVar != null) {
                        ykVar.a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    public o73 e(TypeToken typeToken) {
        o73 zh0Var;
        String str;
        o73 uc0Var;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = (Map) this.p;
        i80 i80Var = null;
        if (map.get(type) != null) {
            kf2.k();
            return null;
        }
        if (map.get(rawType) != null) {
            kf2.k();
            return null;
        }
        if (EnumSet.class.isAssignableFrom(rawType)) {
            zh0Var = new d34(17, type);
        } else {
            zh0Var = rawType == EnumMap.class ? new zh0(16, type) : null;
        }
        if (zh0Var != null) {
            return zh0Var;
        }
        fu.x((List) this.q);
        if (Modifier.isAbstract(rawType.getModifiers())) {
            uc0Var = null;
        } else {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                hw hwVar = ox3.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + ox3.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
                }
                uc0Var = str != null ? new uc0(1, str) : new zg5(declaredConstructor);
            } catch (NoSuchMethodException unused) {
                uc0Var = null;
            }
        }
        if (uc0Var != null) {
            return uc0Var;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                i80Var = new i80(5);
            } else if (Set.class.isAssignableFrom(rawType)) {
                i80Var = new i80(6);
            } else {
                i80Var = Queue.class.isAssignableFrom(rawType) ? new i80(7) : new i80(8);
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                i80Var = new i80(9);
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                i80Var = new i80(10);
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                i80Var = new i80(11);
            } else {
                i80Var = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new i80(13) : new i80(12);
            }
        }
        if (i80Var != null) {
            return i80Var;
        }
        String strB = b(rawType);
        if (strB != null) {
            return new vc0(strB);
        }
        if (this.o) {
            return new zh0(15, rawType);
        }
        return new uc0(0, "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public void g() {
        if (this.o || ((HashSet) this.q).isEmpty()) {
            return;
        }
        ll llVar = (ll) this.p;
        sd0 sd0Var = (sd0) llVar.q;
        boolean z = false;
        llVar.o = ((ConnectivityManager) sd0Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) sd0Var.get()).registerDefaultNetworkCallback((oy1) llVar.r);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.o = z;
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        s63 s63Var = (s63) this.p;
        if (this.o) {
            return;
        }
        s63Var.d(bitmap);
        vl2 vl2Var = (vl2) this.q;
        rm2 rm2Var = new rm2(s63Var.a());
        lo2 lo2Var = (lo2) vl2Var.o;
        lo2Var.r.execute(new ct0(lo2Var, vl2Var.p, (kn2) vl2Var.q, rm2Var, 2));
    }

    public void i(hk5 hk5Var) {
        synchronized (this.p) {
            try {
                if (((ArrayDeque) this.q) == null) {
                    this.q = new ArrayDeque();
                }
                ((ArrayDeque) this.q).add(hk5Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(jw jwVar) {
        hk5 hk5Var;
        synchronized (this.p) {
            if (((ArrayDeque) this.q) != null && !this.o) {
                this.o = true;
                while (true) {
                    synchronized (this.p) {
                        try {
                            hk5Var = (hk5) ((ArrayDeque) this.q).poll();
                            if (hk5Var == null) {
                                this.o = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hk5Var.a(jwVar);
                }
            }
        }
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        if (this.o) {
            return;
        }
        l93.q0("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public void onError() {
        ((d34) this.p).J(((Child) this.q).getId(), null, this.o, null);
    }

    public String toString() {
        switch (this.n) {
            case 2:
                return ((Map) this.p).toString();
            case 6:
                return super.toString() + "{numRequests=" + ((Set) this.p).size() + ", isPaused=" + this.o + "}";
            default:
                return super.toString();
        }
    }

    public mf4(Map map, boolean z, List list) {
        this.n = 2;
        this.p = map;
        this.o = z;
        this.q = list;
    }

    public mf4(Context context) {
        this.n = 0;
        this.q = new HashSet();
        this.p = new ll(new sd0(new aj(context)), new kf4(this));
    }

    public mf4(xk xkVar, xk xkVar2) {
        this.n = 1;
        this.p = xkVar;
        this.q = xkVar2;
        this.o = true;
    }

    public mf4(d34 d34Var, Child child, boolean z) {
        this.n = 5;
        this.p = d34Var;
        this.q = child;
        this.o = z;
    }

    public mf4(s63 s63Var, vl2 vl2Var) {
        this.n = 3;
        this.p = s63Var;
        this.q = vl2Var;
    }
}
