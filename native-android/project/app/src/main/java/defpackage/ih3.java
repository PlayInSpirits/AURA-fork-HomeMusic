package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ih3 {
    public static String a(long r3) {
        SimpleDateFormat r0 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        r0.setTimeZone(TimeZone.getTimeZone("UTC"));
        String r4 = r0.format(new Date(r3));
        r4.getClass();
        return r4;
    }

    public static PlayEvent b(String r30, String r31, String r32, long r33, Long r35, Long r36, String r37, String r38, String r39, Long r40, String r41, Map r42, String r43, String r44) {
        r30.getClass();
        r31.getClass();
        boolean r1 = xm4.k0(r31, "hub:", false);
        String r5 = UUID.randomUUID().toString();
        r5.getClass();
        String r6 = a(r33);
        Double r3 = null;
        if (r1 == false) goto L5;
        String r8 = qm4.z0(r31, "hub:");
    L6:
        if (r1 == false) goto L8;
        String r9 = null;
    L10:
        if (r35 == null) goto L15;
        long r12 = r35.longValue();
        if (r12 >= 0) goto L14;
        r12 = 0;
    L14:
        Double r2 = Double.valueOf(r12 / 1000.0d);
    L16:
        if (r36 == null) goto L24;
        if (r36.longValue() <= 0) goto L20;
        Long r4 = r36;
    L21:
        if (r4 == null) goto L24;
        r3 = Double.valueOf(r4.longValue() / 1000.0d);
        goto L24
    L20:
        r4 = null;
    L24:
        return new PlayEvent(r5, r6, r30, r8, r9, r2, r3, r37, r32, null, null, null, null, null, false, r41, r38, r39, r40, r42, null, r43, r44, 1080832, null);
    L15:
        r2 = null;
        goto L16
    L8:
        r9 = r31;
        goto L10
    L5:
        r8 = null;
        goto L6
    }

    public static /* synthetic */ PlayEvent c(ih3 r16, String r17, String r18, String r19, long r20, String r22, int r23) {
        if ((r23 & 64) == 0) goto L5;
        String r8 = null;
    L6:
        r16.getClass();
        return b(r17, r18, r19, r20, null, null, r8, null, null, null, null, null, null, null);
    L5:
        r8 = r22;
        goto L6
    }
}
