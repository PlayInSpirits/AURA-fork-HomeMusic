/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package com.eddyizm.tempus.homemusic;

import defpackage.*;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.HubMixToday;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public final class MixOfflineWorker
extends Worker {
    public static final Object e = new Object();

    public MixOfflineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final nc2 d() {
        if (!xa3.u("homemusic_mix_offline", true)) return new mc2();
        if (!pt0.c()) {
            return new mc2();
        }
        if (ud3.o() != null) {
            return new mc2();
        }
        if (jp1.b()) {
            return new Object();
        }
        try {
            Object object = e;
            synchronized (object) {
                return this.e();
            }
        }
        catch (Exception exception) {
            String string = exception.getMessage();
            StringBuilder stringBuilder = new StringBuilder("mix download: ");
            stringBuilder.append(string);
            Log.d((String)"MixOffline", (String)stringBuilder.toString());
            return new Object();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final nc2 e() {
        var1_1 = 0;
        var10_2 = ((HubMixToday)rr1.d(new or1(0), new or1(1))).getMix();
        if (var10_2 == null) {
            return new mc2();
        }
        var8_3 = var10_2.getNdPlaylistId();
        if (var8_3 != null) {
            if (qm4.u0((CharSequence)var8_3)) {
                var8_3 = null;
            }
            if (var8_3 != null) {
                var11_6 = App.f(false);
                var8_3 = (ApiResponse)var11_6.g().F((String)var8_3).execute().body();
                if (var8_3 != null && (var8_3 = var8_3.getSubsonicResponse()) != null && (var8_3 = var8_3.getPlaylist()) != null && (var8_3 = var8_3.getEntries()) != null) {
                    var9_7 = new ArrayList<Child>();
                    var12_8 = var8_3.iterator();
                    while (true) {
                        var8_3 = var9_7;
                        if (var12_8.hasNext()) {
                            var8_3 = var12_8.next();
                            if (ot1.c(((Child)var8_3).getId())) continue;
                            var9_7.add((Object)var8_3);
                            continue;
                        }
                        break;
                    }
                } else {
                    var8_3 = null;
                }
                var9_7 = var8_3;
                if (var8_3 == null) {
                    var9_7 = u01.n;
                }
                if (var9_7.isEmpty()) {
                    return new mc2();
                }
                var8_3 = (ApiResponse)var11_6.a().s().execute().body();
                if (var8_3 != null && (var8_3 = var8_3.getSubsonicResponse()) != null && (var8_3 = var8_3.getStarred2()) != null && (var11_6 = var8_3.getSongs()) != null) {
                    var8_3 = new ArrayList<String>(r40.k0((Iterable)var11_6, 10));
                    var11_6 = var11_6.iterator();
                    while (var11_6.hasNext()) {
                        var8_3.add(((Child)var11_6.next()).getId());
                    }
                    var16_9 = q40.T0(var8_3);
                    var13_10 = this.a;
                    var12_8 = au0.w((Context)var13_10);
                    var8_3 = gi1.E();
                    var14_11 = var8_3.b;
                    var11_6 = new ArrayList<E>(r40.k0(var9_7, 10));
                    var15_12 = var9_7.iterator();
                    while (var15_12.hasNext()) {
                        var11_6.add(((Child)var15_12.next()).getId());
                    }
                    var17_13 = (Iterable)var14_11;
                    var15_12 = q40.G0((Collection)var11_6, var17_13);
                    var14_11 = new ArrayList<E>();
                    var3_14 = var15_12.size();
                    while (var1_1 < var3_14) {
                        var19_17 /* !! */  = var15_12.get(var1_1);
                        var2_15 = var1_1 + 1;
                        var18_16 = (String)var19_17 /* !! */ ;
                        var12_8.getClass();
                        var1_1 = var2_15;
                        if (!eu0.d((String)var18_16)) continue;
                        var14_11.add(var19_17 /* !! */ );
                        var1_1 = var2_15;
                    }
                    var15_12 = q40.T0((Iterable)var14_11);
                    var4_18 = var10_2.getId();
                    var18_16 = q40.T0((Iterable)var11_6);
                    var14_11 = new ArrayList<E>();
                    for (T var21_20 : var17_13) {
                        var19_17 /* !! */  = (String)var21_20;
                        if (var18_16.contains(var19_17 /* !! */ ) || var16_9.contains(var19_17 /* !! */ )) continue;
                        var14_11.add(var21_20);
                    }
                    var16_9 = new ArrayList<E>();
                    for (E var19_17 : var17_13) {
                        if (!var18_16.contains((String)var19_17 /* !! */ )) continue;
                        var16_9.add(var19_17 /* !! */ );
                    }
                    var8_3 = var8_3.a == var4_18 ? var8_3.c : z01.n;
                    var17_13 = new ArrayList<E>();
                    var2_15 = var11_6.size();
                    for (var1_1 = 0; var1_1 < var2_15; ++var1_1) {
                        var19_17 /* !! */  = var11_6.get(var1_1);
                        var18_16 = (String)var19_17 /* !! */ ;
                        if (var15_12.contains(var18_16) || var8_3.contains(var18_16)) continue;
                        var17_13.add(var19_17 /* !! */ );
                    }
                    var15_12 = q40.t0(var17_13);
                    var16_9 = q40.T0(var16_9);
                    var11_6 = new ow2(var4_18, (Set)var16_9, (Set)var8_3);
                    var4_18 = var10_2.getId();
                    var1_1 = var15_12.size();
                    var2_15 = var14_11.size();
                    var3_14 = var16_9.size();
                    var8_3 = new StringBuilder("mix ");
                    var8_3.append(var4_18);
                    var8_3.append(": download ");
                    var8_3.append(var1_1);
                    var8_3.append(", remove ");
                    var8_3.append(var2_15);
                    var8_3.append(", kept ");
                    var8_3.append(var3_14);
                    Log.i((String)"MixOffline", (String)var8_3.toString());
                    var12_8.getClass();
                    var10_2 = AppDatabase.y().w();
                    var2_15 = var14_11.size();
                    block11: for (var1_1 = 0; var1_1 < var2_15; ++var1_1) {
                        var8_3 = new pb0(var10_2, (String)var14_11.get(var1_1), 1);
                        var16_9 = new Thread((Runnable)var8_3);
                        var16_9.start();
                        try {
                            var16_9.join();
                            var8_3 = (Download)var8_3.q;
                        }
                        catch (InterruptedException var8_4) {
                            var8_4.printStackTrace();
                            var8_3 = null;
                        }
                        if (var8_3 == null) {
                            continue block11;
                        }
                        var12_8.e(gi1.G((Child)var8_3), (Download)var8_3);
                    }
                    gi1.V((ow2)var11_6);
                    var1_1 = var2_15 = lg2.W(r40.k0(var9_7, 10));
                    if (var2_15 < 16) {
                        var1_1 = 16;
                    }
                    var10_2 = new LinkedHashMap<String, Object>(var1_1);
                    var8_3 = var9_7.iterator();
                    while (var8_3.hasNext()) {
                        var9_7 = var8_3.next();
                        var10_2.put(((Child)var9_7).getId(), var9_7);
                    }
                    var8_3 = var9_7 = var13_10.getExternalFilesDir(null);
                    if (var9_7 == null) {
                        var8_3 = var13_10.getFilesDir();
                    }
                    var13_10 = var15_12.iterator();
                    var9_7 = var11_6;
                    block14: while (var13_10.hasNext()) {
                        var11_6 = (String)var13_10.next();
                        var14_11 = (Child)var10_2.get(var11_6);
                        if (var14_11 == null) continue;
                        if (!this.b() && !jp1.b()) {
                            if (eu0.e.contains(var11_6)) continue;
                            var6_21 = var8_3.getUsableSpace();
                            if (var6_21 - (var4_18 = (var15_12 = var14_11.getSize()) != null ? var15_12.longValue() : 0L) >= 0x80000000L) {
                                var15_12 = kb4.Q(var9_7.b, var11_6);
                                var16_9 = kb4.Q(var9_7.c, var11_6);
                                var9_7 = new ow2(var9_7.a, (Set)var15_12, (Set)var16_9);
                                gi1.V((ow2)var9_7);
                                if (!var12_8.b(gi1.G((Child)var14_11), new Download((Child)var14_11), true)) {
                                    return new Object();
                                }
                                var4_18 = System.currentTimeMillis();
                                while (System.currentTimeMillis() < var4_18 + 300000L) {
                                    var14_11 = eu0.c((String)var11_6);
                                    if (var14_11 != null && var14_11.intValue() == 3 || var14_11 != null && var14_11.intValue() == 4) continue block14;
                                    if (this.b() || jp1.b()) break;
                                    Thread.sleep(1000L);
                                }
                                var10_2 = new pb0(AppDatabase.y().w(), (String)var11_6, 1);
                                var8_3 = new Thread((Runnable)var10_2);
                                var8_3.start();
                                try {
                                    var8_3.join();
                                    var8_3 = (Download)var10_2.q;
                                }
                                catch (InterruptedException var8_5) {
                                    var8_5.printStackTrace();
                                    var8_3 = null;
                                }
                                if (var8_3 != null) {
                                    var12_8.e(gi1.G((Child)var8_3), (Download)var8_3);
                                }
                                var8_3 = kb4.K(var9_7.b, var11_6);
                                var10_2 = kb4.K(var9_7.c, var11_6);
                                App.b().getClass();
                                App.c().edit().putString("homemusic_mix_offline_state", q40.B0(gb.P(new String[]{String.valueOf(var9_7.a), q40.B0((Iterable)var8_3, ",", null, null, null, 62), q40.B0((Iterable)var10_2, ",", null, null, null, 62)}), "\n", null, null, null, 62)).apply();
                                return new Object();
                            }
                            Log.i((String)"MixOffline", (String)"mix: no room left");
                            return new mc2();
                        }
                        return new Object();
                    }
                    return new mc2();
                }
                return new Object();
            }
        }
        return new mc2();
    }
}

