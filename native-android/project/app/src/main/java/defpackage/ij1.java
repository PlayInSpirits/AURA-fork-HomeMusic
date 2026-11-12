package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ij1 implements Handler.Callback {
    public static final Status C = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status D = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object E = new Object();
    public static ij1 F;
    public final zw2 A;
    public volatile boolean B;
    public long n;
    public boolean o;
    public kr4 p;
    public r61 q;
    public final Context r;
    public final ej1 s;
    public final hd5 t;
    public final AtomicInteger u;
    public final AtomicInteger v;
    public final ConcurrentHashMap w;
    public df5 x;
    public final qi y;
    public final qi z;

    public ij1(Context context, Looper looper) {
        ej1 ej1Var = ej1.c;
        this.n = 10000L;
        this.o = false;
        this.u = new AtomicInteger(1);
        this.v = new AtomicInteger(0);
        this.w = new ConcurrentHashMap(5, 0.75f, 1);
        this.x = null;
        this.y = new qi(0);
        this.z = new qi(0);
        this.B = true;
        this.r = context;
        zw2 zw2Var = new zw2(looper, this, 2);
        Looper.getMainLooper();
        this.A = zw2Var;
        this.s = ej1Var;
        this.t = new hd5(23);
        PackageManager packageManager = context.getPackageManager();
        if (kb4.h == null) {
            kb4.h = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (kb4.h.booleanValue()) {
            this.B = false;
        }
        zw2Var.sendMessage(zw2Var.obtainMessage(6));
    }

    public static Status d(ve veVar, ka0 ka0Var) {
        return new Status(17, "API: " + ((String) veVar.b.o) + " is not available on this device. Connection failed with: " + String.valueOf(ka0Var), ka0Var.p, ka0Var);
    }

    public static ij1 f(Context context) {
        ij1 ij1Var;
        HandlerThread handlerThread;
        synchronized (E) {
            if (F == null) {
                synchronized (tk5.g) {
                    try {
                        handlerThread = tk5.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            tk5.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = tk5.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ej1.b;
                F = new ij1(applicationContext, looper);
            }
            ij1Var = F;
        }
        return ij1Var;
    }

    public final void a(df5 df5Var) {
        synchronized (E) {
            try {
                if (this.x != df5Var) {
                    this.x = df5Var;
                    this.y.clear();
                }
                this.y.addAll(df5Var.s);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (this.o) {
            return false;
        }
        e34 e34Var = (e34) d34.E().o;
        if (e34Var != null && !e34Var.o) {
            return false;
        }
        int i = ((SparseIntArray) this.t.o).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean c(ka0 ka0Var, int i) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        ej1 ej1Var = this.s;
        Context context = this.r;
        ej1Var.getClass();
        synchronized (zz1.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = zz1.a;
            if (context2 == null || (bool = zz1.b) == null || context2 != applicationContext) {
                zz1.b = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    zz1.b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        zz1.b = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        zz1.b = Boolean.FALSE;
                    }
                }
                zz1.a = applicationContext;
                zBooleanValue = zz1.b.booleanValue();
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            int i2 = ka0Var.o;
            if (i2 == 0 || (activity = ka0Var.p) == null) {
                Intent intentA = ej1Var.a(i2, context, null);
                activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
            }
            if (activity != null) {
                int i3 = ka0Var.o;
                int i4 = GoogleApiActivity.o;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                ej1Var.f(context, i3, PendingIntent.getActivity(context, 0, intent, gg5.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final gf5 e(dj1 dj1Var) {
        ve veVar = dj1Var.e;
        ConcurrentHashMap concurrentHashMap = this.w;
        gf5 gf5Var = (gf5) concurrentHashMap.get(veVar);
        if (gf5Var == null) {
            gf5Var = new gf5(this, dj1Var);
            concurrentHashMap.put(veVar, gf5Var);
        }
        if (gf5Var.f.i0()) {
            this.z.add(veVar);
        }
        gf5Var.j();
        return gf5Var;
    }

    public final void g(ka0 ka0Var, int i) {
        if (c(ka0Var, i)) {
            return;
        }
        zw2 zw2Var = this.A;
        zw2Var.sendMessage(zw2Var.obtainMessage(5, i, 0, ka0Var));
    }

    /* JADX WARN: Code duplicated, block: B:173:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e1  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 gf5, still in use, count: 2, list:
          (r2v8 gf5) from 0x039d: IGET (r2v8 gf5) A[WRAPPED] (LINE:926) gf5.k int
          (r2v8 gf5) from 0x03a3: PHI (r2 I:??) = (r2v5 gf5), (r2v8 gf5) binds: [B:171:0x03a2, B:229:0x03a3] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.handleMessage(android.os.Message):boolean");
    }
}
