package defpackage;

import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.WaveSession;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v13 {
    public static final Set a = ti.t0(new String[]{"album", "artist", SmartContexts.LIKED, "search", "queue", "library"});

    public static final String a(String str) {
        return (str == null || qm4.u0(str)) ? "playlist" : xa3.g("playlist:", str);
    }

    public static String b(String str, String str2) {
        if (str.equals("queue")) {
            if (str2 != null && xm4.k0(str2, "mix:", false)) {
                return str2;
            }
            if (str2 != null && xm4.k0(str2, WaveSession.CONTEXT_PREFIX, false)) {
                return str2;
            }
        }
        return str;
    }

    public static final String c(String str) {
        if (str == null) {
            return "queue";
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -241049756) {
            return !str.equals("MEDIA_STARRED") ? "queue" : SmartContexts.LIKED;
        }
        if (iHashCode != 802434261) {
            return (iHashCode == 1434555764 && str.equals("MEDIA_BY_ARTIST")) ? "artist" : "queue";
        }
        return !str.equals("MEDIA_FROM_ALBUM") ? "queue" : "album";
    }
}
