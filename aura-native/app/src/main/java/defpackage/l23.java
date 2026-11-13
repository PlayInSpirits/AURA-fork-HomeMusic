package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l23 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ n23 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l23(n23 n23Var, int i) {
        super(0);
        this.n = i;
        this.o = n23Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        List list;
        int i = this.n;
        boolean z = false;
        n23 n23Var = this.o;
        switch (i) {
            case 0:
                kd3 kd3Var = (kd3) n23Var.j.getValue();
                return (kd3Var == null || (list = (List) kd3Var.n) == null) ? new ArrayList() : list;
            case 1:
                String str = n23Var.a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                fragment.getClass();
                n23.a(fragment, arrayList, sb);
                return new kd3(arrayList, sb.toString());
            case 2:
                String str2 = (String) n23Var.l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                kd3 kd3Var2 = (kd3) n23Var.j.getValue();
                if (kd3Var2 != null) {
                    return (String) kd3Var2.o;
                }
                return null;
            case 4:
                String str3 = n23Var.a;
                if (str3 != null && Uri.parse(str3).getQuery() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                String str4 = n23Var.n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = n23Var.e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                String str6 = n23Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) n23Var.g.getValue()).booleanValue()) {
                    Uri parse = Uri.parse(str6);
                    for (String str7 : parse.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str7);
                        if (queryParameters.size() > 1) {
                            kf2.e(f34.h("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                            return null;
                        }
                        String str8 = (String) q40.x0(queryParameters);
                        if (str8 == null) {
                            n23Var.i = true;
                            str8 = str7;
                        }
                        Matcher matcher = n23.r.matcher(str8);
                        k23 k23Var = new k23();
                        int i2 = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            group.getClass();
                            k23Var.b.add(group);
                            str8.getClass();
                            sb2.append(Pattern.quote(str8.substring(i2, matcher.start())));
                            sb2.append("(.+?)?");
                            i2 = matcher.end();
                        }
                        if (i2 < str8.length()) {
                            sb2.append(Pattern.quote(str8.substring(i2)));
                        }
                        k23Var.a = xm4.i0(sb2.toString(), ".*", "\\E.*\\Q");
                        str7.getClass();
                        linkedHashMap.put(str7, k23Var);
                    }
                }
                return linkedHashMap;
        }
    }
}
