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
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static final void a(String str) {
        mt1 mt1Var = mt1.n;
        b.merge(str, -1, new j61(1));
        io1.b.postDelayed(new kt1(0, str), WaveRetry.POLL_MS);
    }

    public static Child b(HubTracks$Item hubTracks$Item) {
        Date starred;
        String ref = hubTracks$Item.getRef();
        if (ref != null) {
            if (qm4.u0(ref)) {
                ref = null;
            }
            if (ref != null) {
                Child child = new Child("hub:".concat(ref), null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
                child.setTitle(hubTracks$Item.getTitle());
                child.setArtist(hubTracks$Item.getArtist());
                child.setAlbum(hubTracks$Item.getAlbum());
                String coverUrl = hubTracks$Item.getCoverUrl();
                if (coverUrl == null || (!xm4.k0(coverUrl, "http://", false) && !xm4.k0(coverUrl, "https://", false))) {
                    coverUrl = null;
                }
                child.setCoverArtId(coverUrl);
                Double durationS = hubTracks$Item.getDurationS();
                child.setDuration(durationS != null ? Integer.valueOf((int) durationS.doubleValue()) : null);
                String id = child.getId();
                ConcurrentHashMap concurrentHashMap = a;
                Child child2 = (Child) concurrentHashMap.get(id);
                if (child2 != null && (starred = child2.getStarred()) != null) {
                    child.setStarred(starred);
                }
                concurrentHashMap.put(child.getId(), child);
                return child;
            }
        }
        return null;
    }

    public static final boolean c(String str) {
        return str != null && xm4.k0(str, "hub:", false);
    }

    public static final boolean d(Uri uri) {
        uri.getClass();
        return h12.c(uri.getScheme(), "homemusic-hub");
    }

    public static final void e(Context context, Child child) {
        child.getClass();
        g(context, child, !n61.f(1, child.getId(), child.getStarred() != null));
    }

    public static final void f(ToggleButton toggleButton, Supplier supplier) {
        toggleButton.getClass();
        lt1 lt1Var = new lt1(toggleButton, supplier, 0);
        toggleButton.addOnAttachStateChangeListener(new bc(4, lt1Var));
        if (toggleButton.isAttachedToWindow()) {
            n61.f.addIfAbsent(lt1Var);
        }
    }

    public static void g(Context context, Child child, boolean z) {
        context.getClass();
        child.getClass();
        boolean zF = n61.f(1, child.getId(), child.getStarred() != null);
        if (zF == z) {
            return;
        }
        b00 b00Var = b00.a;
        String strZ0 = qm4.z0(child.getId(), "hub:");
        synchronized (b00Var) {
            kd3 kd3VarB = b00.b();
            if (kd3VarB != null) {
                String str = (String) kd3VarB.n;
                String str2 = (String) kd3VarB.o;
                b00Var.c(str);
                String string = UUID.randomUUID().toString();
                string.getClass();
                ih3 ih3Var = PlayEvent.Companion;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ih3Var.getClass();
                String strA = ih3.a(jCurrentTimeMillis);
                String strF = rs1.f();
                rs1 rs1Var = rs1.a;
                vz vzVar = new vz(str, str2, strZ0, z, zF, string, strA, strF, rs1.c("hub:".concat(strZ0)));
                try {
                    wz wzVar = (wz) b00.c.getValue();
                    synchronized (wzVar) {
                        wzVar.c(q40.F0(vzVar, wzVar.c));
                    }
                    b00.f.put(string, new a00("hub:".concat(strZ0), zF, z, string, strA, false));
                    b00Var.d(0L);
                    return;
                } catch (IOException e) {
                    Log.w("CatalogFavorites", "save", e);
                }
            }
            Toast.makeText(context, context.getString(R.string.homemusic_hub_action_failed, ""), 1).show();
        }
    }

    public static final Child h(String str) {
        str.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            Child child = new Child(str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, child);
            obj = objPutIfAbsent == null ? child : objPutIfAbsent;
        }
        return (Child) obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    public static final String i(Uri uri, String str) {
        boolean z;
        uri.getClass();
        if (!d(uri) && uo.x(uri.toString()) == null) {
            return str;
        }
        if (d(uri)) {
            str = str.concat("|full-track-v1");
        }
        boolean zA = jp1.a();
        boolean z2 = false;
        if (zA) {
            try {
                se4 se4VarD = au0.D(App.a());
                long jA = nd0.a(se4VarD.i(str));
                if (jA == -1 || !se4VarD.j(str, jA)) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Exception unused) {
            }
        } else {
            z = false;
        }
        if (zA && !z) {
            z2 = true;
        }
        Log.d("HubTracks", "variant of " + uri.getLastPathSegment() + ": economy=" + zA + " originalCached=" + z + " -> light=" + z2);
        return z2 ? str.concat("|mobile") : str;
    }
}
