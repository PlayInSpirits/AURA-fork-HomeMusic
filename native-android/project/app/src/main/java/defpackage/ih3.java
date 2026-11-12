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
    public static String a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        str.getClass();
        return str;
    }

    public static PlayEvent b(String str, String str2, String str3, long j, Long l, Long l2, String str4, String str5, String str6, Long l3, String str7, Map map, String str8, String str9) {
        Double dValueOf;
        str.getClass();
        str2.getClass();
        boolean zK0 = xm4.k0(str2, "hub:", false);
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strA = a(j);
        Double dValueOf2 = null;
        String strZ0 = zK0 ? qm4.z0(str2, "hub:") : null;
        String str10 = zK0 ? null : str2;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            dValueOf = Double.valueOf(jLongValue / 1000.0d);
        } else {
            dValueOf = null;
        }
        if (l2 != null) {
            Long l4 = l2.longValue() > 0 ? l2 : null;
            if (l4 != null) {
                dValueOf2 = Double.valueOf(l4.longValue() / 1000.0d);
            }
        }
        return new PlayEvent(string, strA, str, strZ0, str10, dValueOf, dValueOf2, str4, str3, null, null, null, null, null, false, str7, str5, str6, l3, map, null, str8, str9, 1080832, null);
    }

    public static /* synthetic */ PlayEvent c(ih3 ih3Var, String str, String str2, String str3, long j, String str4, int i) {
        String str5 = (i & 64) != 0 ? null : str4;
        ih3Var.getClass();
        return b(str, str2, str3, j, null, null, str5, null, null, null, null, null, null, null);
    }
}
