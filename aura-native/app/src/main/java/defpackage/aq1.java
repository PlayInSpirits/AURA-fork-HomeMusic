package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class aq1 {
    public static final pl1[] a;
    public static final Map b;

    static {
        pl1 pl1Var = new pl1(pl1.i, "");
        yw ywVar = pl1.f;
        pl1 pl1Var2 = new pl1(ywVar, "GET");
        pl1 pl1Var3 = new pl1(ywVar, "POST");
        yw ywVar2 = pl1.g;
        pl1 pl1Var4 = new pl1(ywVar2, "/");
        pl1 pl1Var5 = new pl1(ywVar2, "/index.html");
        yw ywVar3 = pl1.h;
        pl1 pl1Var6 = new pl1(ywVar3, "http");
        pl1 pl1Var7 = new pl1(ywVar3, "https");
        yw ywVar4 = pl1.e;
        pl1[] pl1VarArr = {pl1Var, pl1Var2, pl1Var3, pl1Var4, pl1Var5, pl1Var6, pl1Var7, new pl1(ywVar4, "200"), new pl1(ywVar4, "204"), new pl1(ywVar4, "206"), new pl1(ywVar4, "304"), new pl1(ywVar4, "400"), new pl1(ywVar4, "404"), new pl1(ywVar4, "500"), new pl1("accept-charset", ""), new pl1("accept-encoding", "gzip, deflate"), new pl1("accept-language", ""), new pl1("accept-ranges", ""), new pl1("accept", ""), new pl1("access-control-allow-origin", ""), new pl1("age", ""), new pl1("allow", ""), new pl1("authorization", ""), new pl1("cache-control", ""), new pl1("content-disposition", ""), new pl1("content-encoding", ""), new pl1("content-language", ""), new pl1("content-length", ""), new pl1("content-location", ""), new pl1("content-range", ""), new pl1("content-type", ""), new pl1("cookie", ""), new pl1("date", ""), new pl1("etag", ""), new pl1("expect", ""), new pl1("expires", ""), new pl1("from", ""), new pl1("host", ""), new pl1("if-match", ""), new pl1("if-modified-since", ""), new pl1("if-none-match", ""), new pl1("if-range", ""), new pl1("if-unmodified-since", ""), new pl1("last-modified", ""), new pl1("link", ""), new pl1("location", ""), new pl1("max-forwards", ""), new pl1("proxy-authenticate", ""), new pl1("proxy-authorization", ""), new pl1("range", ""), new pl1("referer", ""), new pl1("refresh", ""), new pl1("retry-after", ""), new pl1("server", ""), new pl1("set-cookie", ""), new pl1("strict-transport-security", ""), new pl1("transfer-encoding", ""), new pl1("user-agent", ""), new pl1("vary", ""), new pl1("via", ""), new pl1("www-authenticate", "")};
        a = pl1VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(pl1VarArr[i].a)) {
                linkedHashMap.put(pl1VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(yw ywVar) {
        ywVar.getClass();
        int d = ywVar.d();
        for (int i = 0; i < d; i++) {
            byte i2 = ywVar.i(i);
            if (65 <= i2 && i2 < 91) {
                mj0.i("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ywVar.q()));
                return;
            }
        }
    }
}
