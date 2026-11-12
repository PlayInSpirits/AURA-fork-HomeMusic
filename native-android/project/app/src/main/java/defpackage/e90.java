package defpackage;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubLikedSongs;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.File;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e90 implements gf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ e90(int i) {
        this.n = i;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        Class<?> returnType;
        int i = this.n;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                g90.b("LocalUriHandler");
                throw null;
            case 1:
                g90.b("LocalViewConfiguration");
                throw null;
            case 2:
                g90.b("LocalWindowInfo");
                throw null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                l80.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 4:
                return Boolean.FALSE;
            case 5:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 6:
                try {
                    String[] strArr = we1.o;
                    Method method = (Method) we1.q.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 7:
                rr1 rr1Var = rr1.a;
                return ((HubLikedSongs) rr1.d(new or1(6), new or1(7))).children(rr1.c());
            case 8:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 9:
                n83 n83VarA = rr1.k().a();
                n83VarA.k = be0.g;
                return new o83(n83VarA);
            case 10:
                n83 n83Var = new n83();
                si1 si1Var = rr1.d;
                si1Var.getClass();
                n83Var.k = si1Var;
                n83Var.b(15L, timeUnit);
                n83Var.z = ze5.b(60L, timeUnit);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                timeUnit2.getClass();
                n83Var.A = ze5.b(10L, timeUnit2);
                return new o83(n83Var);
            case 11:
                n83 n83VarA2 = rr1.k().a();
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                n83VarA2.b(1500L, timeUnit3);
                n83VarA2.z = ze5.b(1500L, timeUnit3);
                n83VarA2.x = ze5.b(2500L, timeUnit3);
                return new o83(n83VarA2);
            case 12:
                n83 n83VarA3 = rr1.k().a();
                timeUnit.getClass();
                n83VarA3.z = ze5.b(70L, timeUnit);
                return new o83(n83VarA3);
            case 13:
                return new lh3(new File(App.a().getFilesDir(), "homemusic_play_events.json"));
            case 14:
                rs1 rs1Var = rs1.a;
                lh3 lh3Var = (lh3) rs1.b.getValue();
                q qVar = new q(1, rs1Var, rs1.class, "post", "post(Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/PlaySender$Outcome;", 0, 3);
                rr1 rr1Var2 = rr1.a;
                return new nh3(lh3Var, qVar, new na(0, rr1Var2, rr1.class, "supportsTypedFavorites", "supportsTypedFavorites()Z", 0, 4), new na(0, rr1Var2, rr1.class, "supportsCompensationChains", "supportsCompensationChains()Z", 0, 5), new na(0, b00.a, b00.class, "currentAccount", "currentAccount()Ljava/lang/String;", 0, 6), new na(0, rr1Var2, rr1.class, "supportsListeningCheckpoints", "supportsListeningCheckpoints()Z", 0, 7));
            case 15:
                return new lx0(new or1(23));
            case WaveRetry.MAX_FAILURES /* 16 */:
                SharedPreferences sharedPreferences = App.a().getSharedPreferences("homemusic-listening", 0);
                String string = sharedPreferences.getString("device_id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    if (!sharedPreferences.edit().putString("device_id", string).commit()) {
                        kf2.o("Check failed.");
                        return null;
                    }
                    string.getClass();
                }
                return string;
            case 17:
                return e35.Q();
            case 18:
                rr1 rr1Var3 = rr1.a;
                return (HubMe) rr1.d(new or1(10), new or1(11));
            case 19:
                return HubUpdater.updateHttp_delegate$lambda$0();
            case 20:
                l90 l90Var = zx1.a;
                return dk0.a;
            case 21:
                wl4 wl4Var = yz1.a;
                return null;
            case 24:
                u52.d = null;
                Handler handler = u52.a;
                u52.m();
            case 22:
            case 23:
                return j15Var;
            case 25:
                Handler handler2 = u52.a;
                return j15Var;
            case 26:
                u52.d = null;
                Handler handler3 = u52.a;
                u52.m();
                return j15Var;
            case 27:
                u52.e = false;
                return j15Var;
            case 28:
                return new c72(3);
            default:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }
}
