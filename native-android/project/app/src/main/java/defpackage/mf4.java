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

    public mf4(int r1) {
        this.n = r1;
        switch(r1) {
            case 6: goto L8;
            case 7: goto L6;
            default: goto L5;
        };
    L6:
        this.p = new Object();
        return;
    L8:
        this.p = Collections.newSetFromMap(new WeakHashMap());
        this.q = new HashSet();
        return;
    }

    public static String b(Class r2) {
        int r0 = r2.getModifiers();
        if (Modifier.isInterface(r0) == false) goto L7;
        return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(r2.getName());
    L7:
        if (Modifier.isAbstract(r0) == true) goto L9;
        return null;
    L9:
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(r2.getName());
    }

    public static mf4 f(Context r2) {
        if (r != null) goto L16;
        monitor-enter(mf4.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (r != null) goto L11;
        r = new mf4(r2.getApplicationContext());     // Catch: Throwable -> L9
    L11:
        monitor-exit(mf4.class);     // Catch: Throwable -> L9
    L16:
        return r;
    }

    @Override // defpackage.zj2
    public /* bridge */ /* synthetic */ ak2 a(ml3 r1) {
        return d(r1);
    }

    public boolean c(pz3 r3) {
        boolean r0 = true;
        if (r3 != null) goto L5;
        return true;
    L5:
        boolean r1 = ((Set) this.p).remove(r3);
        if (((HashSet) this.q).remove(r3) == true) goto L10;
        if (r1 == true) goto L10;
        r0 = false;
    L10:
        if (r0 == false) goto L12;
        r3.clear();
    L12:
        return r0;
    }

    public yk d(ml3 r7) {
        String r1 = ((dk2) r7.a).a;
        yk r2 = null;
        Trace.beginSection("createCodec:" + r1);     // Catch: Exception -> L24
        MediaCodec r0 = MediaCodec.createByCodecName(r1);     // Catch: Exception -> L24
    L9:
        e = e;
    L26:
        if (r2 != null) goto L29;
        if (r0 == null) goto L30;
        r0.release();
    L30:
        throw e;
    L29:
        r2.a();
        goto L30
    L5:
        if (this.o == true) goto L7;
    L11:
        ck2 r3 = new bl(r0, (HandlerThread) ((xk) this.q).get());     // Catch: Exception -> L9
        int r4 = 0;
    L12:
        yk r5 = new yk(r0, (HandlerThread) ((xk) this.p).get(), r3, (ns3) r7.f);     // Catch: Exception -> L9
        Trace.endSection();     // Catch: Exception -> L20
        Surface r6 = (Surface) r7.d;     // Catch: Exception -> L20
        if (r6 == null) goto L16;
    L22:
        yk.b(r5, (MediaFormat) r7.b, r6, (MediaCrypto) r7.e, r4);     // Catch: Exception -> L20
        return r5;
    L16:
        if (((dk2) r7.a).h == false) goto L22;
        if (Build.VERSION.SDK_INT < 35) goto L22;
        r4 = r4 | 8;     // Catch: Exception -> L20
    L20:
        e = e;
        r2 = r5;
        goto L26
    L7:
        if (Build.VERSION.SDK_INT < 36) goto L11;
        r3 = new pz1(27, r0);     // Catch: Exception -> L9
        r4 = 4;
    L24:
        e = e;
        r0 = null;
        goto L26
    }

    public o73 e(TypeToken r8) {
        Type r0 = r8.getType();
        Class r9 = r8.getRawType();
        Map r1 = (Map) this.p;
        i80 r3 = null;
        if (r1.get(r0) == null) goto L5;
        kf2.k();
        return null;
    L5:
        if (r1.get(r9) == null) goto L7;
        kf2.k();
        return null;
    L7:
        if (EnumSet.class.isAssignableFrom(r9) == false) goto L10;
        o73 r2 = new d34(17, r0);
    L13:
        if (r2 == null) goto L15;
        return r2;
    L15:
        fu.x((List) this.q);
        if (Modifier.isAbstract(r9.getModifiers()) == false) goto L74;
    L17:
        o73 r4 = null;
    L27:
        if (r4 == null) goto L30;
        return r4;
    L30:
        if (Collection.class.isAssignableFrom(r9) == false) goto L42;
        if (SortedSet.class.isAssignableFrom(r9) == false) goto L35;
        r3 = new i80(5);
    L58:
        if (r3 == null) goto L60;
        return r3;
    L60:
        String r5 = b(r9);
        if (r5 == null) goto L65;
        return new vc0(r5);
    L65:
        if (this.o == false) goto L68;
        return new zh0(15, r9);
    L68:
        return new uc0(0, "Unable to create instance of " + r9 + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    L35:
        if (Set.class.isAssignableFrom(r9) == false) goto L38;
        r3 = new i80(6);
        goto L58
    L38:
        if (Queue.class.isAssignableFrom(r9) == false) goto L40;
        r3 = new i80(7);
        goto L58
    L40:
        r3 = new i80(8);
        goto L58
    L42:
        if (Map.class.isAssignableFrom(r9) == false) goto L58;
        if (ConcurrentNavigableMap.class.isAssignableFrom(r9) == false) goto L47;
        r3 = new i80(9);
        goto L58
    L47:
        if (ConcurrentMap.class.isAssignableFrom(r9) == false) goto L50;
        r3 = new i80(10);
        goto L58
    L50:
        if (SortedMap.class.isAssignableFrom(r9) == false) goto L53;
        r3 = new i80(11);
        goto L58
    L53:
        if ((r0 instanceof ParameterizedType) == true) goto L55;
    L57:
        r3 = new i80(13);
        goto L58
    L55:
        if (String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) r0).getActualTypeArguments()[0]).getRawType()) == true) goto L57;
        r3 = new i80(12);
        goto L58
    L74:
        Constructor r6 = r9.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L73
        hw r7 = ox3.a;
        r6.setAccessible(true);     // Catch: Exception -> L22
        String r10 = null;
    L24:
        if (r10 == null) goto L26;
        r4 = new uc0(1, r10);
        goto L27
    L26:
        r4 = new zg5(r6);
    L22:
        e = move-exception;
        r10 = "Failed making constructor '" + ox3.b(r6) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
        goto L24
    L10:
        if (r9 != EnumMap.class) goto L12;
        r2 = new zh0(16, r0);
        goto L13
    L12:
        r2 = null;
        goto L13
    }

    public void g() {
        if (this.o == false) goto L5;
        return;
    L5:
        if (((HashSet) this.q).isEmpty() == true) goto L23;
        ll r0 = (ll) this.p;
        sd0 r1 = (sd0) r0.q;
        boolean r3 = false;
        if (((ConnectivityManager) r1.get()).getActiveNetwork() == null) goto L10;
        boolean r2 = true;
    L11:
        r0.o = r2;
        ((ConnectivityManager) r1.get()).registerDefaultNetworkCallback((oy1) r0.r);     // Catch: RuntimeException -> L14
        r3 = true;
    L18:
        this.o = r3;
        return;
    L14:
        e = move-exception;
        if (Log.isLoggable("ConnectivityMonitor", 5) == false) goto L18;
        Log.w("ConnectivityMonitor", "Failed to register callback", e);
        goto L18
    L10:
        r2 = false;
        goto L11
    }

    @Override // defpackage.kg1
    public void h(Object r8) {
        Bitmap r9 = (Bitmap) r8;
        s63 r0 = (s63) this.p;
        if (this.o == true) goto L6;
        r0.d(r9);
        vl2 r7 = (vl2) this.q;
        rm2 r5 = new rm2(r0.a());
        lo2 r2 = (lo2) r7.o;
        int r3 = r7.p;
        kn2 r4 = (kn2) r7.q;
        r2.r.execute(new ct0(r2, r3, r4, r5, 2));
        return;
    }

    public void i(hk5 r3) {
        Object r0 = this.p;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (((ArrayDeque) this.q) != null) goto L9;
        this.q = new ArrayDeque();     // Catch: Throwable -> L7
    L9:
        ((ArrayDeque) this.q).add(r3);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public void j(jw r3) {
        Object r0 = this.p;
        monitor-enter(r0);
    L24:
        th = move-exception;
        throw th;
    L5:
        if (((ArrayDeque) this.q) != null) goto L7;
    L26:
        monitor-exit(r0);     // Catch: Throwable -> L24
        return;
    L7:
        if (this.o == true) goto L26;
        this.o = true;     // Catch: Throwable -> L24
        monitor-exit(r0);     // Catch: Throwable -> L24
    L11:
        Object r1 = this.p;
        monitor-enter(r1);
        hk5 r2 = (hk5) ((ArrayDeque) this.q).poll();     // Catch: Throwable -> L18
        if (r2 == null) goto L15;
        monitor-exit(r1);     // Catch: Throwable -> L18
        r2.a(r3);
        goto L11
    L15:
        this.o = false;     // Catch: Throwable -> L18
        monitor-exit(r1);     // Catch: Throwable -> L18
        return;
    L18:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.kg1
    public void o(Throwable r2) {
        if (this.o == true) goto L6;
        l93.q0("NotificationProvider", "Failed to load bitmap: " + r2.getMessage());
        return;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public void onError() {
        ((d34) this.p).J(((Child) this.q).getId(), null, this.o, null);
    }

    public String toString() {
        switch(this.n) {
            case 2: goto L9;
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return super.toString() + "{numRequests=" + ((Set) this.p).size() + ", isPaused=" + this.o + "}";
    L9:
        return ((Map) this.p).toString();
    }

    public mf4(Map r2, boolean r3, List r4) {
        this.n = 2;
        this.p = r2;
        this.o = r3;
        this.q = r4;
    }

    public mf4(Context r3) {
        this.n = 0;
        this.q = new HashSet();
        this.p = new ll(new sd0(new aj(r3)), new kf4(this));
    }

    public mf4(xk r2, xk r3) {
        this.n = 1;
        this.p = r2;
        this.q = r3;
        this.o = true;
    }

    public mf4(d34 r2, Child r3, boolean r4) {
        this.n = 5;
        this.p = r2;
        this.q = r3;
        this.o = r4;
    }

    public mf4(s63 r2, vl2 r3) {
        this.n = 3;
        this.p = r2;
        this.q = r3;
    }
}
