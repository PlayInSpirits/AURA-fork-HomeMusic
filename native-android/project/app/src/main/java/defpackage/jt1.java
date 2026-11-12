package defpackage;

import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubTrackSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jt1 {
    public static final Map a = null;

    static {
        a = lg2.X(new kd3[]{new kd3("hitmoz", "Hitmos"), new kd3("hitmos_fm", "Hitmos FM"), new kd3("ytdlp", "YouTube"), new kd3("yt_reupload", "YouTube"), new kd3("upload", "загружено вручную"), new kd3("manual", "добавлено вручную")});
    }

    public static final String a(String r2, String r3) {
        if (r2 != null) goto L5;
    L22:
        return null;
    L5:
        if (qm4.u0(r2) == false) goto L8;
        r2 = null;
    L8:
        if (r2 == null) goto L22;
        String r0 = (String) a.get(r2);
        if (r0 == null) goto L13;
        r2 = r0;
    L13:
        if (r3 != null) goto L15;
        return r2;
    L15:
        if (qm4.u0(r3) == false) goto L18;
        return r2;
    L18:
        if (xm4.k0(r3, "http", false) == true) goto L21;
        return r2;
    L21:
        return b11.o(r2, "\n", r3);
    }

    public static String b(String r4) {
        if (ot1.c(r4) == false) goto L33;
        String r5 = qm4.z0(r4, "hub:");
        rr1 r0 = rr1.a;     // Catch: HubException -> L17
        HubTrackSource r6 = (HubTrackSource) rr1.d(new rs0(4, r5), new or1(14));     // Catch: HubException -> L17
    L21:
        if (r6 != null) goto L23;
        return null;
    L23:
        String r1 = r6.getKind();
        if (h12.c(r1, "full") == false) goto L27;
        return a(r6.getProvider(), r6.getPageUrl());
    L27:
        if (h12.c(r1, "preview") == false) goto L37;
        return "Deezer, превью 30 сек";
    L37:
        return null;
    L17:
        e = move-exception;
        if (e.n != 404) goto L30;
        r6 = null;
        goto L21
    L30:
        throw e;
    L33:
        rr1 r2 = rr1.a;     // Catch: HubException -> L6
        HubTrackSource r7 = (HubTrackSource) rr1.d(new rs0(3, r4), new or1(13));     // Catch: HubException -> L6
    L10:
        if (r7 != null) goto L12;
        return null;
    L12:
        return a(r7.getSource(), r7.getSourceUrl());
    L6:
        e = move-exception;
        if (e.n != 404) goto L13;
        r7 = null;
        goto L10
    L13:
        throw e;
    }
}
