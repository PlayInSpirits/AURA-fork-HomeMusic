package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l23 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ n23 o;

    public /* synthetic */ l23(n23 r1, int r2) {
        this.n = r2;
        this.o = r1;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        boolean r2 = false;
        n23 r15 = this.o;
        switch(r0) {
            case 0: goto L56;
            case 1: goto L49;
            case 2: goto L45;
            case 3: goto L41;
            case 4: goto L34;
            case 5: goto L30;
            case 6: goto L26;
            default: goto L4;
        };
    L4:
        String r1 = r15.a;
        LinkedHashMap r3 = new LinkedHashMap();
        if (((Boolean) r15.g.getValue()).booleanValue() == false) goto L25;
        Uri r5 = Uri.parse(r1);
        Iterator<String> r6 = r5.getQueryParameterNames().iterator();
    L9:
        if (r6.hasNext() == false) goto L25;
        String r7 = r6.next();
        StringBuilder r8 = new StringBuilder();
        List<String> r9 = r5.getQueryParameters(r7);
        if (r9.size() > 1) goto L23;
        String r10 = (String) q40.x0(r9);
        if (r10 != null) goto L15;
        r15.i = true;
        r10 = r7;
    L15:
        Matcher r11 = n23.r.matcher(r10);
        k23 r12 = new k23();
        int r13 = 0;
    L17:
        if (r11.find() == false) goto L20;
        String r14 = r11.group(1);
        r14.getClass();
        r12.b.add(r14);
        r10.getClass();
        r8.append(Pattern.quote(r10.substring(r13, r11.start())));
        r8.append("(.+?)?");
        r13 = r11.end();
        goto L17
    L20:
        if (r13 >= r10.length()) goto L22;
        r8.append(Pattern.quote(r10.substring(r13)));
    L22:
        r12.a = xm4.i0(r8.toString(), ".*", "\\E.*\\Q");
        r7.getClass();
        r3.put(r7, r12);
        goto L9
    L23:
        kf2.e(f34.h("Query parameter ", r7, " must only be present once in ", r1, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
        return null;
    L25:
        return r3;
    L26:
        String r16 = r15.e;
        if (r16 != null) goto L29;
        return null;
    L29:
        return Pattern.compile(r16, 2);
    L30:
        String r17 = r15.n;
        if (r17 != null) goto L33;
        return null;
    L33:
        return Pattern.compile(r17);
    L34:
        String r18 = r15.a;
        if (r18 == null) goto L40;
        if (Uri.parse(r18).getQuery() == null) goto L40;
        r2 = true;
    L40:
        return Boolean.valueOf(r2);
    L41:
        kd3 r19 = (kd3) r15.j.getValue();
        if (r19 != null) goto L44;
        return null;
    L44:
        return (String) r19.o;
    L45:
        String r110 = (String) r15.l.getValue();
        if (r110 != null) goto L48;
        return null;
    L48:
        return Pattern.compile(r110, 2);
    L49:
        String r111 = r15.a;
        if (r111 != null) goto L52;
        return null;
    L52:
        if (Uri.parse(r111).getFragment() == null) goto L73;
        ArrayList r4 = new ArrayList();
        String r112 = Uri.parse(r111).getFragment();
        StringBuilder r20 = new StringBuilder();
        r112.getClass();
        n23.a(r112, r4, r20);
        return new kd3(r4, r20.toString());
    L73:
        return null;
    L56:
        kd3 r113 = (kd3) r15.j.getValue();
        if (r113 == null) goto L61;
        List r114 = (List) r113.n;
        if (r114 == null) goto L61;
        return r114;
    L61:
        return new ArrayList();
    }
}
