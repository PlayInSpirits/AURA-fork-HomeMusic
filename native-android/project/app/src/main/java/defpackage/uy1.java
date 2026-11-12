package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy1 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ uy1(Float f, qy1 qy1Var, Float f2, py1 py1Var) {
        this.n = 0;
        this.o = f;
        this.q = qy1Var;
        this.p = f2;
        this.r = py1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0402, code lost:
    
        if (r6.equals("status") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0219, code lost:
    
        if (r6.equals("hello") != false) goto L192;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.gf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws Throwable {
        int i;
        String strJ0;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        SharedPreferences sharedPreferencesC = null;
        switch (this.n) {
            case 0:
                Float f = (Float) this.o;
                qy1 qy1Var = (qy1) this.q;
                Float f2 = (Float) this.p;
                py1 py1Var = (py1) this.r;
                if (!f.equals(qy1Var.n) || !f2.equals(qy1Var.o)) {
                    qy1Var.n = f;
                    qy1Var.o = f2;
                    qy1Var.q = new yq4(py1Var, f, f2, null);
                    qy1Var.u.b.setValue(Boolean.TRUE);
                    qy1Var.r = false;
                    qy1Var.s = true;
                }
                return j15.a;
            case 1:
                LanReceiverService lanReceiverService = (LanReceiverService) this.o;
                String str = (String) this.p;
                String str2 = (String) this.q;
                JSONObject jSONObject = (JSONObject) this.r;
                if (lanReceiverService.o) {
                    boolean z = LanReceiverService.y;
                    if (kb4.a0(lanReceiverService).contains(str)) {
                        bl2 bl2Var = lanReceiverService.v;
                        if (bl2Var == null) {
                            h12.Q("browserFuture");
                            throw null;
                        }
                        bj2 bj2Var = (bj2) bl2Var.get();
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1273775369:
                                    if (str2.equals("previous")) {
                                        bj2Var.S();
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case -934531685:
                                    if (str2.equals("repeat")) {
                                        int i2 = jSONObject.getInt("mode");
                                        if (i2 < 0 || i2 >= 3) {
                                            kf2.n("Failed requirement.");
                                            return null;
                                        }
                                        bj2Var.p0(i2);
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case -892481550:
                                    break;
                                case -885581533:
                                    if (str2.equals("device_volume")) {
                                        AudioManager audioManager = (AudioManager) lanReceiverService.getSystemService(AudioManager.class);
                                        if (jSONObject.has("direction")) {
                                            int i3 = jSONObject.getInt("direction");
                                            if (i3 != 1 && i3 != -1) {
                                                kf2.n("Failed requirement.");
                                                return null;
                                            }
                                            audioManager.adjustStreamVolume(3, i3, 0);
                                        } else {
                                            audioManager.setStreamVolume(3, gb.m(jSONObject.getInt("level"), 0, audioManager.getStreamMaxVolume(3)), 0);
                                        }
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case -810883302:
                                    if (str2.equals("volume")) {
                                        bj2Var.R(gb.l((float) jSONObject.getDouble("value"), 0.0f, 1.0f));
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case -555126813:
                                    if (str2.equals("queue_state")) {
                                        bj2Var.getClass();
                                        int iOptInt = jSONObject.optInt("offset", 0);
                                        if (iOptInt < 0 || iOptInt > bj2Var.Q0()) {
                                            kf2.n("Failed requirement.");
                                            return null;
                                        }
                                        JSONArray jSONArray = new JSONArray();
                                        int iMin = Math.min(20, bj2Var.Q0() - iOptInt) + iOptInt;
                                        while (iOptInt < iMin) {
                                            do2 do2Var = bj2Var.Y(iOptInt).d;
                                            do2Var.getClass();
                                            Bundle bundle = do2Var.I;
                                            JSONObject jSONObjectPut = new JSONObject().put("id", bj2Var.Y(iOptInt).a);
                                            CharSequence charSequence = do2Var.c;
                                            JSONObject jSONObjectPut2 = jSONObjectPut.put("album", (charSequence == null || (string7 = charSequence.toString()) == null) ? "" : qm4.J0(256, string7)).put("cover", (bundle == null || (string6 = bundle.getString("coverArtId")) == null) ? "" : qm4.J0(512, string6)).put("albumId", (bundle == null || (string5 = bundle.getString("albumId")) == null) ? "" : qm4.J0(512, string5)).put("artistId", (bundle == null || (string4 = bundle.getString("artistId")) == null) ? "" : qm4.J0(512, string4)).put("suffix", (bundle == null || (string3 = bundle.getString("suffix")) == null) ? "" : qm4.J0(32, string3)).put("bitrate", bundle != null ? bundle.getInt("bitrate") : 0).put("duration", bundle != null ? bundle.getInt("duration") : 0);
                                            CharSequence charSequence2 = do2Var.a;
                                            if (charSequence2 == null || (string2 = charSequence2.toString()) == null) {
                                                i = 256;
                                                strJ0 = "";
                                            } else {
                                                i = 256;
                                                strJ0 = qm4.J0(256, string2);
                                            }
                                            JSONObject jSONObjectPut3 = jSONObjectPut2.put("title", strJ0);
                                            CharSequence charSequence3 = do2Var.b;
                                            jSONArray.put(jSONObjectPut3.put("artist", (charSequence3 == null || (string = charSequence3.toString()) == null) ? "" : qm4.J0(i, string)));
                                            iOptInt++;
                                        }
                                        JSONObject jSONObjectPut4 = new JSONObject().put("ok", true).put("items", jSONArray).put("index", bj2Var.o0()).put("count", bj2Var.Q0()).put("revision", LanReceiverService.e(bj2Var));
                                        jSONObjectPut4.getClass();
                                        return jSONObjectPut4;
                                    }
                                    break;
                                case 3377907:
                                    if (str2.equals("next")) {
                                        bj2Var.c0();
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case 3443508:
                                    if (str2.equals("play")) {
                                        bj2Var.m0();
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case 3526264:
                                    if (str2.equals("seek")) {
                                        long j = jSONObject.getLong("position");
                                        long duration = bj2Var.getDuration();
                                        bj2Var.O(gb.n(j, 0L, duration < 0 ? 0L : duration));
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case 99162322:
                                    break;
                                case 106440182:
                                    if (str2.equals("pause")) {
                                        bj2Var.c();
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case 109641799:
                                    if (str2.equals("speed")) {
                                        float f3 = (float) jSONObject.getDouble("speed");
                                        float f4 = (float) jSONObject.getDouble("pitch");
                                        if (Math.abs(f3) > Float.MAX_VALUE || Math.abs(f4) > Float.MAX_VALUE || 0.1f > f3 || f3 > 5.0f || 0.1f > f4 || f4 > 5.0f) {
                                            kf2.n("Failed requirement.");
                                            return null;
                                        }
                                        bj2Var.d(new qh3(f3, f4));
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                                case 110364485:
                                    if (str2.equals("timer")) {
                                        yf4 yf4VarC = yf4.c();
                                        String string8 = jSONObject.getString("mode");
                                        if (string8 != null) {
                                            int iHashCode = string8.hashCode();
                                            if (iHashCode != -1367724422) {
                                                if (iHashCode != 100571) {
                                                    if (iHashCode == 1064901855 && string8.equals("minutes")) {
                                                        int i4 = jSONObject.getInt("minutes");
                                                        if (1 > i4 || i4 >= 1441) {
                                                            kf2.n("Failed requirement.");
                                                            return null;
                                                        }
                                                        yf4VarC.a(false);
                                                        yf4VarC.g = false;
                                                        yf4VarC.e = (((long) i4) * 60000) + System.currentTimeMillis();
                                                        yf4VarC.f = true;
                                                        try {
                                                            App.b().getClass();
                                                            sharedPreferencesC = App.c();
                                                            break;
                                                        } catch (Exception unused) {
                                                        }
                                                        if (sharedPreferencesC != null) {
                                                            sharedPreferencesC.edit().putLong("sleep_timer_end_time_ms", yf4VarC.e).putBoolean("sleep_timer_end_of_track", yf4VarC.g).apply();
                                                        }
                                                        jq3 jq3Var = new jq3(8, yf4VarC);
                                                        yf4VarC.b = jq3Var;
                                                        yf4VarC.a.postDelayed(jq3Var, 1000L);
                                                        bj2Var.getClass();
                                                        return lanReceiverService.f(bj2Var);
                                                    }
                                                } else if (string8.equals("end")) {
                                                    yf4VarC.e();
                                                    bj2Var.getClass();
                                                    return lanReceiverService.f(bj2Var);
                                                }
                                            } else if (string8.equals("cancel")) {
                                                yf4VarC.a(true);
                                                bj2Var.getClass();
                                                return lanReceiverService.f(bj2Var);
                                            }
                                        }
                                        kf2.o("Unknown timer mode");
                                        return null;
                                    }
                                    break;
                                case 2072332025:
                                    if (str2.equals("shuffle")) {
                                        bj2Var.s(jSONObject.getBoolean("enabled"));
                                        bj2Var.getClass();
                                        return lanReceiverService.f(bj2Var);
                                    }
                                    break;
                            }
                        }
                        kf2.o("Unknown command");
                        return null;
                    }
                }
                kf2.n("Failed requirement.");
                return null;
            default:
                qc5 qc5Var = (qc5) this.o;
                UUID uuid = (UUID) this.p;
                mb1 mb1Var = (mb1) this.q;
                Context context = (Context) this.r;
                String string9 = uuid.toString();
                dd5 dd5VarH = qc5Var.c.h(string9);
                if (dd5VarH == null || f34.c(dd5VarH.b)) {
                    kf2.o("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    pq3 pq3Var = qc5Var.b;
                    synchronized (pq3Var.k) {
                        try {
                            cx.f().g(pq3.l, "Moving WorkSpec (" + string9 + ") to the foreground");
                            td5 td5Var = (td5) pq3Var.g.remove(string9);
                            if (td5Var != null) {
                                if (pq3Var.a == null) {
                                    PowerManager.WakeLock wakeLockA = y85.a(pq3Var.b, "ProcessorForegroundLck");
                                    pq3Var.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                pq3Var.f.put(string9, td5Var);
                                ud3.G0(pq3Var.b, wp4.c(pq3Var.b, q05.m(td5Var.a), mb1Var));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    rc5 rc5VarM = q05.m(dd5VarH);
                    String str3 = wp4.w;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", mb1Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mb1Var.b);
                    intent.putExtra("KEY_NOTIFICATION", mb1Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", rc5VarM.a);
                    intent.putExtra("KEY_GENERATION", rc5VarM.b);
                    context.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ uy1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }
}
