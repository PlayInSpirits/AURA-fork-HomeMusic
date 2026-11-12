package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public final class rs3 {
    public static final rs3 a = new Object();
    public static final ExecutorService b = Executors.newSingleThreadExecutor(new ps3(0));
    public static final AtomicInteger c = new AtomicInteger(0);
    public static volatile ux d;
    public static volatile List e;
    public static final HashSet f;

    static {
        e = u01.n;
        f = new HashSet();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(Context object, qs3 object2, int n16) {
        Throwable throwable22;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Uri uri;
        block38: {
            block39: {
                uri = ((qs3)object2).a;
                object6 = au0.D((Context)object);
                object5 = new xi4(10);
                object4 = Collections.EMPTY_MAP;
                try {
                    object3 = new ii0(uri, 0L, 1, null, (Map)object4, 0L, -1L, null, 0);
                    object4 = ((xi4)object5).d((ii0)object3);
                    object6.getClass();
                    if (nd0.a(((se4)object6).i((String)object4)) != -1L || ((se4)object6).g(0L, 1L, (String)object4) <= 0L) break block38;
                    object3 = f;
                    // MONITORENTER : object3
                    boolean bl5 = ((HashSet)object3).add(object4);
                    // MONITOREXIT : object3
                    if (bl5) {
                        object3 = new StringBuilder("Head of ");
                        ((StringBuilder)object3).append((String)object4);
                        ((StringBuilder)object3).append(" has no length, loading it again");
                        Log.d((String)"QueuePreloader", (String)((StringBuilder)object3).toString());
                        ((se4)object6).m((String)object4);
                    }
                    break block38;
                }
                catch (Exception exception) {}
                break block39;
                catch (Exception exception) {
                    // empty catch block
                }
            }
            object3 = new StringBuilder("Could not check the head of ");
            ((StringBuilder)object3).append(uri);
            ((StringBuilder)object3).append(": ");
            ((StringBuilder)object3).append(object6);
            Log.d((String)"QueuePreloader", (String)((StringBuilder)object3).toString());
        }
        object6 = Collections.EMPTY_MAP;
        long l16 = ((qs3)object2).b;
        if (ot1.d(uri)) {
            object6 = Collections.singletonMap("X-HomeMusic-Prefetch", "1");
            object6.getClass();
        } else {
            object6 = v01.n;
        }
        object6 = new ii0(uri, 0L, 1, null, (Map)object6, 0L, l16, null, 0);
        // MONITORENTER : au0.class
        object4 = au0.B((Context)object);
        object3 = new xi4(10);
        bi0 bi02 = au0.x();
        object5 = object.getApplicationContext();
        bi02.getClass();
        object = au0.B((Context)object);
        object.getClass();
        // MONITOREXIT : au0.class
        object5 = new qx(new zj0((Context)object5, ((om1)bi02).m()), (se4)object);
        object4.getClass();
        object = new jx((se4)object4);
        object = new ux(new lx((se4)object4, (ci0)object5, new kp(false), (jx)object, (px)object3, 0), (ii0)object6, null, null);
        // MONITORENTER : this
        int n17 = c.get();
        if (n17 != n16) {
            // MONITOREXIT : this
            return;
        }
        d = object;
        // MONITOREXIT : this
        ((ux)object).a();
        l16 = ((qs3)object2).b;
        object2 = new StringBuilder("Pre-cached ");
        ((StringBuilder)object2).append(l16);
        ((StringBuilder)object2).append(" bytes of ");
        ((StringBuilder)object2).append(uri);
        Log.d((String)"QueuePreloader", (String)((StringBuilder)object2).toString());
        // MONITORENTER : this
        if (d != object) return;
        d = null;
        return;
        {
            catch (Throwable throwable22) {
            }
            catch (Exception exception) {}
            {
                object6 = new StringBuilder("Pre-cache aborted for ");
                ((StringBuilder)object6).append(uri);
                ((StringBuilder)object6).append(": ");
                ((StringBuilder)object6).append(exception);
                Log.d((String)"QueuePreloader", (String)((StringBuilder)object6).toString());
            }
            // MONITORENTER : this
            if (d != object) {
                // MONITOREXIT : this
                return;
            }
            d = null;
            return;
        }
        // MONITORENTER : this
        if (d != object) throw throwable22;
        d = null;
        throw throwable22;
    }

    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        c.incrementAndGet();
                        e = u01.n;
                        ux ux5 = d;
                        if (ux5 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    ux5.j = true;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(Context object, qi3 object2) {
        Object object3;
        Object object4;
        Object object5;
        block22: {
            boolean bl5;
            block24: {
                int n16;
                cu4 cu42;
                Context context;
                int n17;
                int n18;
                boolean bl6;
                block25: {
                    block23: {
                        bl6 = jp1.a();
                        ((Object)((Object)App.b())).getClass();
                        object5 = App.c().getString("precache_tracks_count", "0");
                        object5.getClass();
                        n17 = n18 = Integer.parseInt((String)object5);
                        if (bl6) {
                            n17 = n18;
                            if (n18 > 1) {
                                n17 = 1;
                            }
                        }
                        if (n17 <= 0) {
                            return;
                        }
                        if (ud3.F() <= 0L) {
                            return;
                        }
                        context = object.getApplicationContext();
                        if (xa3.u("precache_wifi_only", true)) {
                            context.getClass();
                            object5 = (ConnectivityManager)context.getSystemService(ConnectivityManager.class);
                            bl5 = object5 == null ? true : object5.isActiveNetworkMetered();
                            if (bl5) {
                                this.b();
                                return;
                            }
                        }
                        if (object4.f()) {
                            return;
                        }
                        object3 = com.eddyizm.tempus.homemusic.b.b;
                        if (object3 != null && ((WaveSession)object3).isWave((String)(object5 = (object5 = object4.a()) != null ? ((gn2)object5).a : null)) && !((WaveSession)object3).settled((String)object5)) {
                            this.b();
                            return;
                        }
                        context.getClass();
                        object3 = u01.n;
                        cu42 = object4.x0();
                        cu42.getClass();
                        if (!cu42.p()) break block23;
                        object5 = context;
                        break block24;
                    }
                    n16 = object4.o0();
                    if (n16 != -1) break block25;
                    object5 = context;
                    break block24;
                }
                ArrayList<qs3> arrayList = new ArrayList<qs3>(n17);
                n18 = n16;
                while (true) {
                    int n19;
                    block26: {
                        do2 do22;
                        block29: {
                            Object object6;
                            block28: {
                                block27: {
                                    object5 = context;
                                    object3 = arrayList;
                                    if (arrayList.size() >= n17) break;
                                    n19 = cu42.e(n18, object4.h(), object4.D0());
                                    object5 = context;
                                    object3 = arrayList;
                                    if (n19 == -1) break;
                                    if (n19 == n16) {
                                        object5 = context;
                                        object3 = arrayList;
                                        break;
                                    }
                                    object6 = object4.Y(n19);
                                    object6.getClass();
                                    object3 = ((gn2)object6).a;
                                    do22 = ((gn2)object6).d;
                                    object5 = do22.I;
                                    object5 = object5 != null ? object5.getString("type") : null;
                                    if (h12.c(object5, "radio")) break block26;
                                    object3.getClass();
                                    if (xm4.k0((String)object3, "ir-", false)) break block26;
                                    au0.w(context).getClass();
                                    if (eu0.d((String)object3)) break block26;
                                    object5 = ((gn2)object6).b;
                                    if (object5 == null) break block27;
                                    object5 = object3 = ((bn2)object5).a;
                                    if (object3 != null) break block28;
                                }
                                object5 = object3 = ((gn2)object6).f.a;
                                if (object3 == null) break block26;
                            }
                            if (!h12.c(object3 = object5.getScheme(), "http") && !h12.c(object3, "https") && !ot1.d((Uri)object5)) break block26;
                            if (ot1.d((Uri)object5)) break block29;
                            object3 = object5.getQueryParameter("format");
                            object6 = object5.getQueryParameter("maxBitRate");
                            if (object3 != null && !object3.equals("raw") || object6 != null && !object6.equals("0")) break block26;
                        }
                        int n26 = (object3 = do22.I) != null ? object3.getInt("bitrate") : 0;
                        int n27 = 10;
                        n18 = n26;
                        if (xm4.e0(new xi4(10).d(new ii0((Uri)object5, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0)), "|mobile", false)) {
                            n18 = 1 <= n26 && n26 < 160 ? n26 : 160;
                        }
                        if (n18 <= 0) {
                            n18 = 320;
                        }
                        long l16 = (long)n18 * 1000L / 8L;
                        n18 = bl6 ? n27 : 15;
                        arrayList.add(new qs3((Uri)object5, Math.max(262144L, l16 * (long)n18 + 65536L)));
                    }
                    n18 = n19;
                }
            }
            object4 = new Object();
            // MONITORENTER : this
            bl5 = object3.equals(e);
            if (!bl5) break block22;
            return;
        }
        ((hx3)object4).n = c.incrementAndGet();
        e = object3;
        ux ux5 = d;
        if (ux5 != null) {
            ux5.j = true;
        }
        if (object3.isEmpty()) {
            return;
        }
        b.execute(new qo2(object3, object4, object5, 14));
    }
}

