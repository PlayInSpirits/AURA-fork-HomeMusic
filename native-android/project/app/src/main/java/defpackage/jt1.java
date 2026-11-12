package defpackage;

import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubTrackSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jt1 {
    public static final Map a = lg2.X(new kd3("hitmoz", "Hitmos"), new kd3("hitmos_fm", "Hitmos FM"), new kd3("ytdlp", "YouTube"), new kd3("yt_reupload", "YouTube"), new kd3("upload", "загружено вручную"), new kd3("manual", "добавлено вручную"));

    public static final String a(String str, String str2) {
        if (str != null) {
            if (qm4.u0(str)) {
                str = null;
            }
            if (str != null) {
                String str3 = (String) a.get(str);
                if (str3 != null) {
                    str = str3;
                }
                return (str2 == null || qm4.u0(str2) || !xm4.k0(str2, "http", false)) ? str : b11.o(str, "\n", str2);
            }
        }
        return null;
    }

    public static String b(String str) throws HubException {
        HubTrackSource hubTrackSource;
        HubTrackSource hubTrackSource2;
        if (!ot1.c(str)) {
            try {
                rr1 rr1Var = rr1.a;
                hubTrackSource = (HubTrackSource) rr1.d(new rs0(3, str), new or1(13));
            } catch (HubException e) {
                if (e.n != 404) {
                    throw e;
                }
                hubTrackSource = null;
            }
            if (hubTrackSource != null) {
                return a(hubTrackSource.getSource(), hubTrackSource.getSourceUrl());
            }
            return null;
        }
        String strZ0 = qm4.z0(str, "hub:");
        try {
            rr1 rr1Var2 = rr1.a;
            hubTrackSource2 = (HubTrackSource) rr1.d(new rs0(4, strZ0), new or1(14));
        } catch (HubException e2) {
            if (e2.n != 404) {
                throw e2;
            }
            hubTrackSource2 = null;
        }
        if (hubTrackSource2 == null) {
            return null;
        }
        String kind = hubTrackSource2.getKind();
        if (h12.c(kind, "full")) {
            return a(hubTrackSource2.getProvider(), hubTrackSource2.getPageUrl());
        }
        if (h12.c(kind, "preview")) {
            return "Deezer, превью 30 сек";
        }
        return null;
    }
}
