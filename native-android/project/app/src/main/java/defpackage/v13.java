package defpackage;

import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.WaveSession;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v13 {
    public static final Set a = null;

    static {
        a = ti.t0(new String[]{"album", "artist", SmartContexts.LIKED, "search", "queue", "library"});
    }

    public static final String a(String r1) {
        if (r1 != null) goto L4;
        return "playlist";
    L4:
        if (qm4.u0(r1) == false) goto L7;
        return "playlist";
    L7:
        return xa3.g("playlist:", r1);
    }

    public static String b(String r3, String r4) {
        if (r3.equals("queue") == true) goto L5;
    L13:
        return r3;
    L5:
        if (r4 != null) goto L7;
    L9:
        if (r4 == null) goto L13;
        if (xm4.k0(r4, WaveSession.CONTEXT_PREFIX, false) != true) goto L13;
        return r4;
    L7:
        if (xm4.k0(r4, "mix:", false) != true) goto L9;
        return r4;
    }

    public static final String c(String r2) {
        if (r2 == null) goto L25;
        int r0 = r2.hashCode();
        if (r0 == (-241049756)) goto L21;
        if (r0 == 802434261) goto L16;
        if (r0 == 1434555764) goto L11;
        return "queue";
    L11:
        if (r2.equals("MEDIA_BY_ARTIST") == false) goto L28;
        return "artist";
    L28:
        return "queue";
    L16:
        if (r2.equals("MEDIA_FROM_ALBUM") == false) goto L29;
        return "album";
    L29:
        return "queue";
    L21:
        if (r2.equals("MEDIA_STARRED") == false) goto L30;
        return SmartContexts.LIKED;
    L30:
        return "queue";
    L25:
        return "queue";
    }
}
