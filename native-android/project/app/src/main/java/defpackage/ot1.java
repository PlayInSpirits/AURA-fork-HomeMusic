package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import android.widget.ToggleButton;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 {
    public static final ConcurrentHashMap a = null;
    public static final ConcurrentHashMap b = null;

    static {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    public static final void a(String r4) {
        mt1 r1 = mt1.n;
        j61 r2 = new j61(1);
        b.merge(r4, -1, r2);
        io1.b.postDelayed(new kt1(0, r4), WaveRetry.POLL_MS);
    }

    public static Child b(HubTracks$Item r41) {
        String r0 = r41.getRef();
        Integer r1 = null;
        if (r0 != null) goto L5;
    L28:
        return null;
    L5:
        if (qm4.u0(r0) == false) goto L8;
        r0 = null;
    L8:
        if (r0 == null) goto L28;
        Child r2 = new Child("hub:".concat(r0), null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        r2.setTitle(r41.getTitle());
        r2.setArtist(r41.getArtist());
        r2.setAlbum(r41.getAlbum());
        String r3 = r41.getCoverUrl();
        if (r3 != null) goto L13;
    L17:
        r3 = null;
    L18:
        r2.setCoverArtId(r3);
        Double r4 = r41.getDurationS();
        if (r4 == null) goto L21;
        r1 = Integer.valueOf((int) r4.doubleValue());
    L21:
        r2.setDuration(r1);
        String r5 = r2.getId();
        ConcurrentHashMap r6 = a;
        Child r7 = (Child) r6.get(r5);
        if (r7 == null) goto L26;
        Date r8 = r7.getStarred();
        if (r8 == null) goto L26;
        r2.setStarred(r8);
    L26:
        r6.put(r2.getId(), r2);
        return r2;
    L13:
        if (xm4.k0(r3, "http://", false) == true) goto L18;
        if (xm4.k0(r3, "https://", false) == false) goto L17;
        goto L17
    }

    public static final boolean c(String r2) {
        if (r2 != null) goto L5;
    L7:
        return false;
    L5:
        if (xm4.k0(r2, "hub:", false) != true) goto L7;
        return true;
    }

    public static final boolean d(Uri r1) {
        r1.getClass();
        return h12.c(r1.getScheme(), "homemusic-hub");
    }

    public static final void e(Context r3, Child r4) {
        r4.getClass();
        String r0 = r4.getId();
        if (r4.getStarred() == null) goto L5;
        boolean r1 = true;
    L6:
        g(r3, r4, !n61.f(1, r0, r1));
        return;
    L5:
        r1 = false;
        goto L6
    }

    public static final void f(ToggleButton r2, Supplier r3) {
        r2.getClass();
        lt1 r0 = new lt1(r2, r3, 0);
        r2.addOnAttachStateChangeListener(new bc(4, r0));
        if (r2.isAttachedToWindow() == false) goto L6;
        n61.f.addIfAbsent(r0);
        return;
    }

    public static void g(Context r13, Child r14, boolean r15) {
        r13.getClass();
        r14.getClass();
        String r0 = r14.getId();
        if (r14.getStarred() == null) goto L5;
        boolean r1 = true;
    L6:
        boolean r5 = n61.f(1, r0, r1);
        if (r5 != r15) goto L9;
        return;
    L9:
        b00 r2 = b00.a;
        String r6 = qm4.z0(r14.getId(), "hub:");
        monitor-enter(r2);
        kd3 r3 = b00.b();     // Catch: Throwable -> L24
        if (r3 != null) goto L15;
        monitor-exit(r2);
    L34:
        Toast.makeText(r13, r13.getString(R.string.homemusic_hub_action_failed, new Object[]{""}), 1).show();
        return;
    L15:
        String r4 = (String) r3.n;     // Catch: Throwable -> L24
        String r7 = (String) r3.o;     // Catch: Throwable -> L24
        r2.c(r4);     // Catch: Throwable -> L24
        String r8 = UUID.randomUUID().toString();     // Catch: Throwable -> L24
        r8.getClass();     // Catch: Throwable -> L24
        ih3 r9 = PlayEvent.Companion;     // Catch: Throwable -> L24
        long r10 = System.currentTimeMillis();     // Catch: Throwable -> L24
        r9.getClass();     // Catch: Throwable -> L24
        String r11 = ih3.a(r10);     // Catch: Throwable -> L24
        String r12 = rs1.f();     // Catch: Throwable -> L24
        rs1 r16 = rs1.a;     // Catch: Throwable -> L24
        vz r17 = new vz(r4, r7, r6, r15, r5, r8, r11, r12, rs1.c("hub:".concat(r6)));     // Catch: Throwable -> L24
        wz r18 = (wz) b00.c.getValue();     // Catch: Throwable -> L24 IOException -> L26
        monitor-enter(r18);     // Catch: Throwable -> L24 IOException -> L26
        r18.c(q40.F0(r17, r18.c));     // Catch: Throwable -> L28
        monitor-exit(r18);     // Catch: Throwable -> L24 IOException -> L26
        b00.f.put(r8, new a00("hub:".concat(r6), r5, r15, r8, r11, false));     // Catch: Throwable -> L24
        r2.d(0);     // Catch: Throwable -> L24
        monitor-exit(r2);
        return;
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24 IOException -> L26
    L26:
        e = move-exception;
        Log.w("CatalogFavorites", "save", e);     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        throw th;
    L5:
        r1 = false;
        goto L6
    }

    public static final Child h(String r41) {
        r41.getClass();
        ConcurrentHashMap r0 = a;
        Object r2 = r0.get(r41);
        if (r2 != null) goto L9;
        Child r1 = new Child(r41, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        Object r3 = r0.putIfAbsent(r41, r1);
        if (r3 != null) goto L7;
        r2 = r1;
        goto L9
    L7:
        r2 = r3;
    L9:
        return (Child) r2;
    }

    public static final String i(Uri r8, String r9) {
        r8.getClass();
        if (d(r8) == true) goto L9;
        if (uo.x(r8.toString()) != null) goto L9;
        return r9;
    L9:
        if (d(r8) == false) goto L11;
        r9 = r9.concat("|full-track-v1");
    L11:
        boolean r0 = jp1.a();
        boolean r1 = false;
        if (r0 == true) goto L27;
    L18:
        boolean r3 = false;
    L19:
        if (r0 == false) goto L22;
        if (r3 == true) goto L22;
        r1 = true;
    L22:
        Log.d("HubTracks", "variant of " + r8.getLastPathSegment() + ": economy=" + r0 + " originalCached=" + r3 + " -> light=" + r1);
        if (r1 == true) goto L25;
        return r9;
    L25:
        return r9.concat("|mobile");
    L27:
        se4 r4 = au0.D(App.a());     // Catch: Exception -> L26
        long r5 = nd0.a(r4.i(r9));     // Catch: Exception -> L26
        if (r5 == (-1)) goto L18;
        if (r4.j(r9, r5) == false) goto L18;
        r3 = true;
        goto L19
    }
}
