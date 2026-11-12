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
import java.io.File;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e90 implements gf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ e90(int r1) {
        this.n = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r15 = this.n;
        TimeUnit r0 = TimeUnit.SECONDS;
        j15 r2 = j15.a;
        switch(r15) {
            case 0: goto L69;
            case 1: goto L67;
            case 2: goto L65;
            case 3: goto L63;
            case 4: goto L62;
            case 5: goto L73;
            case 6: goto L75;
            case 7: goto L50;
            case 8: goto L49;
            case 9: goto L46;
            case 10: goto L44;
            case 11: goto L42;
            case 12: goto L40;
            case 13: goto L39;
            case 14: goto L36;
            case 15: goto L35;
            case 16: goto L26;
            case 17: goto L25;
            case 18: goto L22;
            case 19: goto L21;
            case 20: goto L18;
            case 21: goto L16;
            case 22: goto L15;
            case 23: goto L15;
            case 24: goto L14;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L7;
            default: goto L5;
        };
    L8:
        u52.e = false;
        return r2;
    L10:
        u52.d = null;
        Handler r16 = u52.a;
        u52.m();
        return r2;
    L12:
        Handler r17 = u52.a;
        return r2;
    L14:
        u52.d = null;
        Handler r18 = u52.a;
        u52.m();
    L15:
        return r2;
    L16:
        wl4 r19 = yz1.a;
        return null;
    L18:
        l90 r110 = zx1.a;
        return dk0.a;
    L22:
        rr1 r111 = rr1.a;
        return (HubMe) rr1.d(new or1(10), new or1(11));
    L26:
        SharedPreferences r112 = App.a().getSharedPreferences("homemusic-listening", 0);
        String r1 = r112.getString("device_id", null);
        if (r1 != null) goto L77;
        r1 = UUID.randomUUID().toString();
        if (r112.edit().putString("device_id", r1).commit() == false) goto L32;
        r1.getClass();
        goto L77
    L32:
        kf2.o("Check failed.");
        return null;
    L77:
        return r1;
    L36:
        rs1 r5 = rs1.a;
        lh3 r113 = (lh3) rs1.b.getValue();
        int r4 = 1;
        Class<rs1> r6 = rs1.class;
        String r7 = "post";
        String r8 = "post(Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/PlaySender$Outcome;";
        q r3 = new q(r4, r5, r6, r7, r8, 0, 3);
        rr1 r9 = rr1.a;
        int r10 = 0;
        Class<rr1> r11 = rr1.class;
        String r12 = "supportsTypedFavorites";
        String r13 = "supportsTypedFavorites()Z";
        na r14 = new na(r10, r9, r11, r12, r13, 0, 4);
        int r20 = 0;
        Class<rr1> r21 = rr1.class;
        String r22 = "supportsCompensationChains";
        String r114 = "supportsCompensationChains()Z";
        na r23 = new na(r20, r9, r21, r22, r114, 0, 5);
        int r24 = 0;
        Class<b00> r115 = b00.class;
        String r116 = "currentAccount";
        String r117 = "currentAccount()Ljava/lang/String;";
        na r25 = new na(r24, b00.a, r115, r116, r117, 0, 6);
        int r26 = 0;
        Class<rr1> r27 = rr1.class;
        String r28 = "supportsListeningCheckpoints";
        String r118 = "supportsListeningCheckpoints()Z";
        return new nh3(r113, r3, r14, r23, r25, new na(r26, r9, r27, r28, r118, 0, 7));
    L40:
        n83 r119 = rr1.k().a();
        r0.getClass();
        r119.z = ze5.b(70, r0);
        return new o83(r119);
    L42:
        n83 r120 = rr1.k().a();
        TimeUnit r29 = TimeUnit.MILLISECONDS;
        r120.b(1500, r29);
        r120.z = ze5.b(1500, r29);
        r120.x = ze5.b(2500, r29);
        return new o83(r120);
    L44:
        n83 r121 = new n83();
        si1 r30 = rr1.d;
        r30.getClass();
        r121.k = r30;
        r121.b(15, r0);
        r121.z = ze5.b(60, r0);
        TimeUnit r31 = TimeUnit.MINUTES;
        r31.getClass();
        r121.A = ze5.b(10, r31);
        return new o83(r121);
    L46:
        n83 r122 = rr1.k().a();
        r122.k = be0.g;
        return new o83(r122);
    L50:
        rr1 r123 = rr1.a;
        return ((HubLikedSongs) rr1.d(new or1(6), new or1(7))).children(rr1.c());
    L63:
        l80.b("Unexpected call to default provider");
        throw new KotlinNothingValueException();
    L65:
        g90.b("LocalWindowInfo");
        throw null;
    L67:
        g90.b("LocalViewConfiguration");
        throw null;
    L69:
        g90.b("LocalUriHandler");
        throw null;
    L73:
        Method r124 = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);     // Catch: Throwable -> L72
        r124.setAccessible(true);     // Catch: Throwable -> L72
        return r124;
    L81:
        return null;
    L75:
        String[] r125 = we1.o;     // Catch: Throwable -> L71
        Method r126 = (Method) we1.q.getValue();     // Catch: Throwable -> L71
        if (r126 == null) goto L78;
        Class<?> r127 = r126.getReturnType();     // Catch: Throwable -> L71
        if (r127 == null) goto L79;
        Class r32 = Integer.TYPE;     // Catch: Throwable -> L71
        return r127.getDeclaredMethod("beginTransaction", new Class[]{r32, SQLiteTransactionListener.class, r32, CancellationSignal.class});
    L79:
        return null;
    L78:
        return null;
    L80:
        return null;
    L5:
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    L7:
        return new c72(3);
    L21:
        return HubUpdater.i();
    L25:
        return e35.Q();
    L35:
        return new lx0(new or1(23));
    L39:
        return new lh3(new File(App.a().getFilesDir(), "homemusic_play_events.json"));
    L49:
        throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
    L62:
        return Boolean.FALSE;
    }

    public /* synthetic */ e90(s12 r1, int r2) {
        this.n = r2;
    }
}
