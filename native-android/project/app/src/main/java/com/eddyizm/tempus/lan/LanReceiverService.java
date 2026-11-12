package com.eddyizm.tempus.lan;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.media.AudioManager;
import android.net.nsd.NsdManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import defpackage.aj2;
import defpackage.au0;
import defpackage.b02;
import defpackage.b11;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.cb4;
import defpackage.do2;
import defpackage.f35;
import defpackage.f52;
import defpackage.fa;
import defpackage.fi0;
import defpackage.g52;
import defpackage.gb;
import defpackage.gf1;
import defpackage.gi1;
import defpackage.gm0;
import defpackage.gn2;
import defpackage.h12;
import defpackage.i02;
import defpackage.i52;
import defpackage.j02;
import defpackage.j51;
import defpackage.j52;
import defpackage.kb4;
import defpackage.kf2;
import defpackage.q40;
import defpackage.q63;
import defpackage.qi3;
import defpackage.qm4;
import defpackage.r40;
import defpackage.s63;
import defpackage.sk2;
import defpackage.ti;
import defpackage.tp;
import defpackage.u01;
import defpackage.ud3;
import defpackage.vs3;
import defpackage.w10;
import defpackage.w42;
import defpackage.ws1;
import defpackage.x;
import defpackage.x7;
import defpackage.xc5;
import defpackage.yf4;
import java.io.DataOutputStream;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LanReceiverService extends Service {
    public static volatile long A;
    public static final ConcurrentHashMap B = new ConcurrentHashMap();
    public static volatile boolean y;
    public static volatile String z;
    public SSLServerSocket r;
    public NsdManager t;
    public boolean u;
    public bl2 v;
    public String w;
    public final Handler n = new Handler(Looper.getMainLooper());
    public volatile boolean o = true;
    public final ThreadPoolExecutor p = new ThreadPoolExecutor(4, 4, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(4));
    public final Semaphore q = new Semaphore(2);
    public final ConcurrentHashMap.KeySetView s = ConcurrentHashMap.newKeySet();
    public final i52 x = new i52(this);

    public static void a(LanReceiverService lanReceiverService, j52 j52Var) {
        bl2 bl2Var = lanReceiverService.v;
        if (bl2Var == null) {
            h12.Q("browserFuture");
            throw null;
        }
        if (bl2Var.isDone()) {
            try {
                bl2 bl2Var2 = lanReceiverService.v;
                if (bl2Var2 != null) {
                    ((bj2) bl2Var2.get()).r0(j52Var);
                } else {
                    h12.Q("browserFuture");
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String e(qi3 qi3Var) {
        byte[] bytes = q40.B0(gb.g0(0, qi3Var.Q0()), "\u0000", null, null, new x(19, qi3Var), 30).getBytes(w10.a);
        bytes.getClass();
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        bArrDigest.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [u01] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    public final synchronized JSONObject b(final JSONObject jSONObject, String str) {
        final String string;
        final g52 g52Var;
        final ?? arrayList;
        SubsonicResponse subsonicResponse;
        try {
            String string2 = jSONObject.getString("server");
            String str2 = this.w;
            str2.getClass();
            int i = 1;
            boolean z2 = false;
            byte[] bytes = qm4.L0(str2, '/').getBytes(w10.a);
            bytes.getClass();
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
            bArrDigest.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i2 = 0;
            for (byte b : bArrDigest) {
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) "");
                }
                sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            sb.append((CharSequence) "");
            if (!h12.c(string2, sb.toString())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            string = jSONObject.getString("action");
            g52Var = new g52(this, str, i);
            if (ti.t0(new String[]{"replace", "append", "next"}).contains(string)) {
                JSONArray jSONArray = jSONObject.getJSONArray("ids");
                j02 j02VarG0 = gb.g0(0, jSONArray.length());
                ArrayList arrayList2 = new ArrayList(r40.k0(j02VarG0, 10));
                Iterator it = j02VarG0.iterator();
                while (((i02) it).p) {
                    arrayList2.add(jSONArray.getString(((b02) it).nextInt()));
                }
                j51.T(arrayList2);
                if (h12.c(string, "replace")) {
                    int size = arrayList2.size();
                    int i3 = jSONObject.getInt("index");
                    if (i3 < 0 || i3 >= size) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() + 90000;
                ArrayList arrayList3 = new ArrayList(r40.k0(arrayList2, 10));
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    String str3 = (String) obj;
                    g52Var.invoke();
                    if (Thread.currentThread().isInterrupted() || SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    Call callM = App.f(z2).c().m(str3);
                    ArrayList arrayList4 = arrayList2;
                    callM.timeout().g(10L, TimeUnit.SECONDS);
                    Response responseExecute = callM.execute();
                    if (!responseExecute.isSuccessful()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    ApiResponse apiResponse = (ApiResponse) responseExecute.body();
                    Child song = (apiResponse == null || (subsonicResponse = apiResponse.getSubsonicResponse()) == null) ? null : subsonicResponse.getSong();
                    if (song == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList3.add(song);
                    arrayList2 = arrayList4;
                    z2 = false;
                }
                arrayList = new ArrayList(r40.k0(arrayList3, 10));
                int size3 = arrayList3.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj2 = arrayList3.get(i5);
                    i5++;
                    arrayList.add(gi1.K((Child) obj2));
                }
            } else {
                arrayList = u01.n;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (JSONObject) d(new gf1() { // from class: d52
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:120:0x02a6 A[LOOP:0: B:118:0x029f->B:120:0x02a6, LOOP_END] */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x0215, code lost:
            
                if ((((long) r4) + ((long) r5)) > 500) goto L123;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x021b, code lost:
            
                if (r1.Q0() != 0) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x021d, code lost:
            
                r4 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0220, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x0225, code lost:
            
                if (r3.equals("next") == false) goto L114;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x0227, code lost:
            
                if (r4 != false) goto L114;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x0229, code lost:
            
                r3 = r1.o0() + 1;
                r5 = r2.v;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0231, code lost:
            
                if (r5 == null) goto L112;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x0233, code lost:
            
                r5 = (defpackage.bj2) r5.get();
                r6 = r0.size();
                r8 = r0.size() + r1.Q0();
                r7 = defpackage.bo2.a;
                r7 = new android.os.Bundle();
                r7.putInt("play_next_insert_pos", r3);
                r7.putInt("play_next_count", r6);
                r7.putInt("play_next_target_count", r8);
                r5 = r5.b1(new defpackage.va4("com.eddyizm.tempus.PLAY_NEXT_FIXUP", android.os.Bundle.EMPTY), r7);
                r5.f(new defpackage.lg1(0, r5, new defpackage.tv1()), defpackage.gq0.n);
                r1.N0(r0, r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x027c, code lost:
            
                defpackage.h12.Q("browserFuture");
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x027f, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x0280, code lost:
            
                r1.w0(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x0283, code lost:
            
                if (r4 == false) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x0285, code lost:
            
                r1.b();
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x02c8, code lost:
            
                defpackage.kf2.n("Failed requirement.");
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x02cb, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
            
                if (r3.equals("next") != false) goto L97;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
            
                if (r3.equals("append") != false) goto L97;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0202, code lost:
            
                r4 = r1.Q0();
                r5 = r0.size();
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x020a, code lost:
            
                if (r4 < 0) goto L123;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x020c, code lost:
            
                if (r5 <= 0) goto L123;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // defpackage.gf1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() throws JSONException, InterruptedException {
                Object obj3;
                int iNextInt;
                ArrayList arrayList5;
                Iterator it2;
                g52 g52Var2 = g52Var;
                LanReceiverService lanReceiverService = this;
                String str4 = string;
                JSONObject jSONObject2 = jSONObject;
                List list = arrayList;
                boolean z3 = LanReceiverService.y;
                g52Var2.invoke();
                bl2 bl2Var = lanReceiverService.v;
                if (bl2Var == null) {
                    h12.Q("browserFuture");
                    throw null;
                }
                bj2 bj2Var = (bj2) bl2Var.get();
                if (!ti.t0(new String[]{"replace", "append", "next"}).contains(str4)) {
                    String strOptString = jSONObject2.optString("revision");
                    strOptString.getClass();
                    bj2Var.getClass();
                    String strE = LanReceiverService.e(bj2Var);
                    if (strOptString.length() <= 0 || !strOptString.equals(strE)) {
                        JSONObject jSONObjectPut = new JSONObject().put("error", "queue_changed");
                        jSONObjectPut.getClass();
                        return jSONObjectPut;
                    }
                }
                if (str4 != null) {
                    obj3 = null;
                    switch (str4.hashCode()) {
                        case -1411068134:
                            break;
                        case -934610812:
                            if (str4.equals("remove")) {
                                int i6 = jSONObject2.getInt("from");
                                int i7 = jSONObject2.getInt("to");
                                int iQ0 = bj2Var.Q0();
                                if (i6 < 0 || i6 > iQ0 || i6 > i7 || i7 > iQ0) {
                                    kf2.n("Failed requirement.");
                                    return null;
                                }
                                bj2Var.P(i6, i7);
                                j02 j02VarG1 = gb.g0(0, bj2Var.Q0());
                                arrayList5 = new ArrayList(r40.k0(j02VarG1, 10));
                                it2 = j02VarG1.iterator();
                                while (((i02) it2).p) {
                                    arrayList5.add(gi1.N(bj2Var.Y(((b02) it2).nextInt())));
                                }
                                new vs3().c(arrayList5, true, 0);
                                return lanReceiverService.f(bj2Var);
                            }
                            break;
                        case -906021636:
                            if (str4.equals("select")) {
                                int i8 = jSONObject2.getInt("index");
                                if (i8 < 0 || i8 >= bj2Var.Q0()) {
                                    kf2.n("Failed requirement.");
                                    return null;
                                }
                                bj2Var.n(i8, 0L);
                                bj2Var.b();
                                bj2Var.m0();
                                j02 j02VarG2 = gb.g0(0, bj2Var.Q0());
                                arrayList5 = new ArrayList(r40.k0(j02VarG2, 10));
                                it2 = j02VarG2.iterator();
                                while (((i02) it2).p) {
                                    arrayList5.add(gi1.N(bj2Var.Y(((b02) it2).nextInt())));
                                }
                                new vs3().c(arrayList5, true, 0);
                                return lanReceiverService.f(bj2Var);
                            }
                            break;
                        case 3357649:
                            if (str4.equals("move")) {
                                int i9 = jSONObject2.getInt("from");
                                int i10 = jSONObject2.getInt("to");
                                int iQ1 = bj2Var.Q0();
                                if (i9 < 0 || i9 >= iQ1 || i10 < 0 || i10 >= iQ1) {
                                    kf2.n("Failed requirement.");
                                    return null;
                                }
                                bj2Var.t0(i9, i10);
                                j02 j02VarG3 = gb.g0(0, bj2Var.Q0());
                                arrayList5 = new ArrayList(r40.k0(j02VarG3, 10));
                                it2 = j02VarG3.iterator();
                                while (((i02) it2).p) {
                                    arrayList5.add(gi1.N(bj2Var.Y(((b02) it2).nextInt())));
                                }
                                new vs3().c(arrayList5, true, 0);
                                return lanReceiverService.f(bj2Var);
                            }
                            break;
                        case 3377907:
                            break;
                        case 94746189:
                            if (str4.equals("clear")) {
                                bj2Var.r();
                                j02 j02VarG4 = gb.g0(0, bj2Var.Q0());
                                arrayList5 = new ArrayList(r40.k0(j02VarG4, 10));
                                it2 = j02VarG4.iterator();
                                while (((i02) it2).p) {
                                    arrayList5.add(gi1.N(bj2Var.Y(((b02) it2).nextInt())));
                                }
                                new vs3().c(arrayList5, true, 0);
                                return lanReceiverService.f(bj2Var);
                            }
                            break;
                        case 1093755131:
                            if (str4.equals("reorder")) {
                                JSONArray jSONArray2 = jSONObject2.getJSONArray("ids");
                                j02 j02VarG5 = gb.g0(0, jSONArray2.length());
                                ArrayList arrayList6 = new ArrayList(r40.k0(j02VarG5, 10));
                                Iterator it3 = j02VarG5.iterator();
                                while (((i02) it3).p) {
                                    arrayList6.add(jSONArray2.getString(((b02) it3).nextInt()));
                                }
                                j02 j02VarG6 = gb.g0(0, bj2Var.Q0());
                                ArrayList arrayList7 = new ArrayList(r40.k0(j02VarG6, 10));
                                Iterator it4 = j02VarG6.iterator();
                                while (((i02) it4).p) {
                                    arrayList7.add(bj2Var.Y(((b02) it4).nextInt()).a);
                                }
                                Map mapM = vr1.m(new b52(arrayList7));
                                c52 c52Var = new c52();
                                c52Var.a = arrayList6;
                                if (!h12.c(mapM, vr1.m(c52Var))) {
                                    kf2.n("Failed requirement.");
                                    return null;
                                }
                                int size4 = arrayList6.size();
                                int i11 = 0;
                                int i12 = 0;
                                while (i12 < size4) {
                                    Object obj4 = arrayList6.get(i12);
                                    i12++;
                                    int i13 = i11 + 1;
                                    if (i11 < 0) {
                                        gb.c0();
                                        throw null;
                                    }
                                    String str5 = (String) obj4;
                                    Iterator it5 = gb.g0(i11, bj2Var.Q0()).iterator();
                                    do {
                                        if (!((i02) it5).p) {
                                            kf2.m("Collection contains no element matching the predicate.");
                                            return null;
                                        }
                                        iNextInt = ((b02) it5).nextInt();
                                    } while (!h12.c(bj2Var.Y(iNextInt).a, str5));
                                    if (iNextInt != i11) {
                                        bj2Var.t0(iNextInt, i11);
                                    }
                                    i11 = i13;
                                }
                                j02 j02VarG7 = gb.g0(0, bj2Var.Q0());
                                arrayList5 = new ArrayList(r40.k0(j02VarG7, 10));
                                it2 = j02VarG7.iterator();
                                while (((i02) it2).p) {
                                    arrayList5.add(gi1.N(bj2Var.Y(((b02) it2).nextInt())));
                                }
                                new vs3().c(arrayList5, true, 0);
                                return lanReceiverService.f(bj2Var);
                            }
                            break;
                        case 1094496948:
                            if (str4.equals("replace")) {
                                int i14 = jSONObject2.getInt("index");
                                if (i14 < 0 || i14 >= list.size()) {
                                    kf2.n("Failed requirement.");
                                    return null;
                                }
                                long jOptLong = jSONObject2.optLong("position", 0L);
                                bj2Var.T(list, i14, jOptLong >= 0 ? jOptLong : 0L);
                                bj2Var.b();
                                bj2Var.m0();
                                j02 j02VarG8 = gb.g0(0, bj2Var.Q0());
                                arrayList5 = new ArrayList(r40.k0(j02VarG8, 10));
                                it2 = j02VarG8.iterator();
                                while (((i02) it2).p) {
                                    arrayList5.add(gi1.N(bj2Var.Y(((b02) it2).nextInt())));
                                }
                                new vs3().c(arrayList5, true, 0);
                                return lanReceiverService.f(bj2Var);
                            }
                            break;
                    }
                } else {
                    obj3 = null;
                }
                kf2.o("Unknown queue edit");
                return obj3;
            }
        });
    }

    public final synchronized JSONObject c(JSONObject jSONObject, final String str) {
        JSONObject jSONObjectPut;
        SubsonicResponse subsonicResponse;
        try {
            String string = jSONObject.getString("server");
            String str2 = this.w;
            str2.getClass();
            int i = 1;
            boolean z2 = false;
            byte[] bytes = qm4.L0(str2, '/').getBytes(w10.a);
            bytes.getClass();
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
            bArrDigest.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i2 = 0;
            for (byte b : bArrDigest) {
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) "");
                }
                sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            sb.append((CharSequence) "");
            if (!h12.c(string, sb.toString())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("ids");
            int length = jSONArray.length();
            if (1 > length || length >= 501) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            final int i3 = jSONObject.getInt("index");
            if (i3 < 0 || i3 >= jSONArray.length()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            final long j = jSONObject.getLong("position");
            if (j < 0) {
                j = 0;
            }
            j02 j02VarG0 = gb.g0(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(r40.k0(j02VarG0, 10));
            Iterator it = j02VarG0.iterator();
            while (((i02) it).p) {
                arrayList.add(jSONArray.getString(((b02) it).nextInt()));
            }
            au0.U(arrayList, i3, j);
            long jElapsedRealtime = SystemClock.elapsedRealtime() + 90000;
            j02 j02VarG1 = gb.g0(0, jSONArray.length());
            ArrayList arrayList2 = new ArrayList(r40.k0(j02VarG1, 10));
            Iterator it2 = j02VarG1.iterator();
            while (((i02) it2).p) {
                int iNextInt = ((b02) it2).nextInt();
                if (!this.o || Thread.currentThread().isInterrupted() || SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (!kb4.a0(this).contains(str) || !h12.c(ud3.D(), this.w)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String string2 = jSONArray.getString(iNextInt);
                int length2 = string2.length();
                if (i > length2 || length2 >= 513) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Call callM = App.f(z2).c().m(string2);
                callM.timeout().g(10L, TimeUnit.SECONDS);
                Response responseExecute = callM.execute();
                if (!responseExecute.isSuccessful()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ApiResponse apiResponse = (ApiResponse) responseExecute.body();
                Child song = (apiResponse == null || (subsonicResponse = apiResponse.getSubsonicResponse()) == null) ? null : subsonicResponse.getSong();
                if (song == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                arrayList2.add(song);
                i = 1;
                z2 = false;
            }
            final ArrayList arrayList3 = new ArrayList(r40.k0(arrayList2, 10));
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                arrayList3.add(gi1.K((Child) obj));
            }
            d(new gf1() { // from class: e52
                @Override // defpackage.gf1
                public final Object invoke() {
                    LanReceiverService lanReceiverService = this.n;
                    String str3 = str;
                    ArrayList arrayList4 = arrayList3;
                    int i5 = i3;
                    long j2 = j;
                    if (lanReceiverService.o) {
                        boolean z3 = LanReceiverService.y;
                        if (kb4.a0(lanReceiverService).contains(str3) && h12.c(ud3.D(), lanReceiverService.w)) {
                            bl2 bl2Var = lanReceiverService.v;
                            if (bl2Var == null) {
                                h12.Q("browserFuture");
                                throw null;
                            }
                            bj2 bj2Var = (bj2) bl2Var.get();
                            bj2Var.T(arrayList4, i5, j2);
                            bj2Var.b();
                            bj2Var.m0();
                            return j15.a;
                        }
                    }
                    kf2.n("Failed requirement.");
                    return null;
                }
            });
            new vs3().c(arrayList2, true, 0);
            jSONObjectPut = new JSONObject().put("ok", true);
            jSONObjectPut.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return jSONObjectPut;
    }

    public final Object d(gf1 gf1Var) throws Exception {
        bl2 bl2Var = this.v;
        if (bl2Var == null) {
            h12.Q("browserFuture");
            throw null;
        }
        if (!bl2Var.isDone()) {
            kf2.n("Failed requirement.");
            return null;
        }
        FutureTask futureTask = new FutureTask(new tp(2, gf1Var));
        this.n.post(futureTask);
        try {
            return futureTask.get(5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            futureTask.cancel(false);
            throw e;
        }
    }

    public final JSONObject f(qi3 qi3Var) throws JSONException {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        do2 do2VarK0 = qi3Var.K0();
        do2VarK0.getClass();
        AudioManager audioManager = (AudioManager) getSystemService(AudioManager.class);
        JSONObject jSONObjectPut = new JSONObject().put("ok", true).put("remoteVersion", 4);
        String str2 = this.w;
        str2.getClass();
        byte[] bytes = qm4.L0(str2, '/').getBytes(w10.a);
        bytes.getClass();
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        bArrDigest.getClass();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb.append((CharSequence) "");
        JSONObject jSONObjectPut2 = jSONObjectPut.put("server", sb.toString()).put("name", kb4.M(this));
        CharSequence charSequence = do2VarK0.a;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("title", (charSequence == null || (string4 = charSequence.toString()) == null) ? "" : qm4.J0(256, string4));
        CharSequence charSequence2 = do2VarK0.b;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("artist", (charSequence2 == null || (string3 = charSequence2.toString()) == null) ? "" : qm4.J0(256, string3));
        CharSequence charSequence3 = do2VarK0.c;
        JSONObject jSONObjectPut5 = jSONObjectPut4.put("album", (charSequence3 == null || (string2 = charSequence3.toString()) == null) ? "" : qm4.J0(256, string2));
        Bundle bundle = do2VarK0.I;
        JSONObject jSONObjectPut6 = jSONObjectPut5.put("cover", (bundle == null || (string = bundle.getString("coverArtId")) == null) ? "" : qm4.J0(512, string));
        long jM0 = qi3Var.M0();
        if (jM0 < 0) {
            jM0 = 0;
        }
        JSONObject jSONObjectPut7 = jSONObjectPut6.put("position", jM0);
        long duration = qi3Var.getDuration();
        JSONObject jSONObjectPut8 = jSONObjectPut7.put("duration", duration >= 0 ? duration : 0L).put("playing", qi3Var.h0()).put("playWhenReady", qi3Var.q()).put("volume", Float.valueOf(qi3Var.B())).put("index", qi3Var.o0()).put("deviceVolume", audioManager.getStreamVolume(3)).put("deviceVolumeMax", audioManager.getStreamMaxVolume(3)).put("shuffle", qi3Var.D0()).put("repeat", qi3Var.h());
        gn2 gn2VarA = qi3Var.a();
        if (gn2VarA != null && (str = gn2VarA.a) != null) {
            str3 = str;
        }
        JSONObject jSONObjectPut9 = jSONObjectPut8.put("id", str3).put("speed", Float.valueOf(qi3Var.i().a)).put("pitch", Float.valueOf(qi3Var.i().b)).put("timerActive", yf4.c().f).put("timerEnd", yf4.c().g).put("timerRemaining", yf4.c().d()).put("next", qi3Var.f0()).put("previous", qi3Var.I()).put("count", qi3Var.Q0()).put("revision", e(qi3Var));
        jSONObjectPut9.getClass();
        return jSONObjectPut9;
    }

    public final void g(SSLSocket sSLSocket, String str) throws Exception {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        int i = 0;
        j52 j52Var = new j52(i, arrayBlockingQueue);
        int i2 = 9;
        d(new fa(i2, this, j52Var));
        w42 w42Var = w42.a;
        w42.a.a("Receiver live updates started", null);
        while (this.o && !Thread.currentThread().isInterrupted()) {
            try {
                JSONObject jSONObject = (JSONObject) d(new g52(this, str, i));
                jSONObject.getClass();
                String string = jSONObject.toString();
                string.getClass();
                byte[] bytes = string.getBytes(w10.a);
                bytes.getClass();
                int length = bytes.length;
                if (1 > length || length >= 131073) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                DataOutputStream dataOutputStream = new DataOutputStream(sSLSocket.getOutputStream());
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                dataOutputStream.flush();
                arrayBlockingQueue.poll(1L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                this.n.post(new ws1(i2, this, j52Var));
                w42 w42Var2 = w42.a;
                w42.a.a("Receiver live updates stopped", null);
                throw th;
            }
        }
        this.n.post(new ws1(i2, this, j52Var));
        w42 w42Var3 = w42.a;
        w42.a.a("Receiver live updates stopped", null);
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        xc5 xc5Var = null;
        z = null;
        w42 w42Var = w42.a;
        w42.a.a("Receiver starting", null);
        this.w = ud3.D();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (Build.VERSION.SDK_INT >= 26) {
            gm0.n();
            notificationManager.createNotificationChannel(gm0.C(getString(R.string.lan_title)));
        }
        int i = 0;
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) LanPlaybackActivity.class), 67108864);
        PendingIntent service = PendingIntent.getService(this, 1, new Intent(this, (Class<?>) LanReceiverService.class).setAction("stop"), 67108864);
        s63 s63Var = new s63(this, "lan_receiver");
        s63Var.v.icon = R.drawable.ic_queue;
        s63Var.e = s63.b(getString(R.string.lan_available));
        s63Var.f = s63.b(kb4.M(this));
        s63Var.g = activity;
        s63Var.c(2, true);
        s63Var.b.add(new q63(null, getString(R.string.lan_disable), service));
        startForeground(7301, s63Var.a());
        Object systemService = getSystemService((Class<Object>) NsdManager.class);
        systemService.getClass();
        this.t = (NsdManager) systemService;
        cb4 cb4Var = new cb4(this, new ComponentName(this, (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(this)));
        }
        b11.w(bl2Var, new bj2(this, cb4Var, bundle, aj2Var, looperX, bl2Var, xc5Var), new Handler(looperX));
        this.v = bl2Var;
        y = true;
        new Thread(new f52(this, i), "tempus-lan-listener").start();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        w42 w42Var = w42.a;
        w42.a.a("Receiver stopping", null);
        this.o = false;
        y = false;
        A = 0L;
        B.clear();
        try {
            SSLServerSocket sSLServerSocket = this.r;
            if (sSLServerSocket != null) {
                sSLServerSocket.close();
            }
        } catch (Throwable unused) {
        }
        ConcurrentHashMap.KeySetView keySetView = this.s;
        keySetView.getClass();
        Iterator it = keySetView.iterator();
        while (it.hasNext()) {
            try {
                ((Socket) it.next()).close();
            } catch (Throwable unused2) {
            }
        }
        this.p.shutdownNow();
        if (this.u) {
            try {
                NsdManager nsdManager = this.t;
                if (nsdManager == null) {
                    h12.Q("nsd");
                    throw null;
                }
                nsdManager.unregisterService(this.x);
            } catch (Throwable unused3) {
            }
        }
        bl2 bl2Var = this.v;
        if (bl2Var == null) {
            h12.Q("browserFuture");
            throw null;
        }
        sk2.Z0(bl2Var);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!h12.c(intent != null ? intent.getAction() : null, "stop")) {
            return 2;
        }
        stopSelf();
        return 2;
    }
}
