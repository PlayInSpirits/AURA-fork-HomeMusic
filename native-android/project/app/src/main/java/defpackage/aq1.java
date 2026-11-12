package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq1 {
    public static final pl1[] a = null;
    public static final Map b = null;

    static {
        pl1 r1 = new pl1(pl1.i, "");
        yw r3 = pl1.f;
        pl1 r0 = new pl1(r3, "GET");
        pl1 r4 = new pl1(r3, "POST");
        yw r5 = pl1.g;
        pl1 r6 = new pl1(r5, "/");
        pl1 r7 = new pl1(r5, "/index.html");
        yw r8 = pl1.h;
        pl1 r9 = new pl1(r8, "http");
        pl1 r10 = new pl1(r8, "https");
        yw r11 = pl1.e;
        pl1[] r2 = {r1, r0, r4, r6, r7, r9, r10, new pl1(r11, "200"), new pl1(r11, "204"), new pl1(r11, "206"), new pl1(r11, "304"), new pl1(r11, "400"), new pl1(r11, "404"), new pl1(r11, "500"), new pl1("accept-charset", ""), new pl1("accept-encoding", "gzip, deflate"), new pl1("accept-language", ""), new pl1("accept-ranges", ""), new pl1("accept", ""), new pl1("access-control-allow-origin", ""), new pl1("age", ""), new pl1("allow", ""), new pl1("authorization", ""), new pl1("cache-control", ""), new pl1("content-disposition", ""), new pl1("content-encoding", ""), new pl1("content-language", ""), new pl1("content-length", ""), new pl1("content-location", ""), new pl1("content-range", ""), new pl1("content-type", ""), new pl1("cookie", ""), new pl1("date", ""), new pl1("etag", ""), new pl1("expect", ""), new pl1("expires", ""), new pl1("from", ""), new pl1("host", ""), new pl1("if-match", ""), new pl1("if-modified-since", ""), new pl1("if-none-match", ""), new pl1("if-range", ""), new pl1("if-unmodified-since", ""), new pl1("last-modified", ""), new pl1("link", ""), new pl1("location", ""), new pl1("max-forwards", ""), new pl1("proxy-authenticate", ""), new pl1("proxy-authorization", ""), new pl1("range", ""), new pl1("referer", ""), new pl1("refresh", ""), new pl1("retry-after", ""), new pl1("server", ""), new pl1("set-cookie", ""), new pl1("strict-transport-security", ""), new pl1("transfer-encoding", ""), new pl1("user-agent", ""), new pl1("vary", ""), new pl1("via", ""), new pl1("www-authenticate", "")};
        a = r2;
        LinkedHashMap r12 = new LinkedHashMap(61);
        int r13 = 0;
    L3:
        if (r13 >= 61) goto L8;
        if (r12.containsKey(r2[r13].a) == true) goto L7;
        Integer r14 = Integer.valueOf(r13);
        r12.put(r2[r13].a, r14);
    L7:
        r13 = r13 + 1;
        goto L3
    L8:
        Map r15 = Collections.unmodifiableMap(r12);
        r15.getClass();
        b = r15;
    }

    public static void a(yw r4) {
        r4.getClass();
        int r0 = r4.d();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        byte r2 = r4.i(r1);
        if (65 > r2) goto L11;
        if (r2 >= 91) goto L11;
        mj0.i("PROTOCOL_ERROR response malformed: mixed case name: ".concat(r4.q()));
        return;
    L11:
        r1 = r1 + 1;
        goto L3
    }
}
