package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p25 {
    public final long a;
    public final gn2 b;
    public final String c;
    public final jw4 d;

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    public p25(long j, gn2 gn2Var, String str) {
        String strP;
        String strConcat;
        int iHashCode;
        Uri uri;
        gn2Var.getClass();
        this.a = j;
        this.b = gn2Var;
        this.c = str;
        Set set = q25.Q;
        Bundle bundle = gn2Var.d.I;
        String str2 = null;
        String string = bundle != null ? bundle.getString("type") : null;
        String queryParameter = (string == null || ((iHashCode = string.hashCode()) == -405568764 ? !string.equals("podcast") : !(iHashCode == 104263205 && string.equals("music"))) || str == null || (uri = Uri.parse(str)) == null) ? null : uri.getQueryParameter("format");
        if (queryParameter == null) {
            strP = e03.p(bundle);
            if (strP != null && strP.length() > 0) {
                str2 = strP;
            }
            if (str2 == null) {
                strConcat = "audio/x-unknown";
            } else {
                queryParameter = str2;
                strConcat = "audio/".concat(queryParameter);
            }
        } else {
            queryParameter = (queryParameter.length() <= 0 || queryParameter.equals("raw")) ? null : queryParameter;
            if (queryParameter == null) {
                strP = e03.p(bundle);
                if (strP != null) {
                    str2 = strP;
                }
                if (str2 == null) {
                    strConcat = "audio/x-unknown";
                } else {
                    queryParameter = str2;
                    strConcat = "audio/".concat(queryParameter);
                }
            } else {
                strConcat = "audio/".concat(queryParameter);
            }
        }
        sb1 sb1Var = new sb1();
        sb1Var.a = "upnp";
        sb1Var.m = lw2.m(strConcat);
        this.d = new jw4(gb.O(new iw4(new sv4(String.valueOf(j), new tb1(sb1Var)), false, new int[]{4}, new boolean[]{true})));
    }
}
