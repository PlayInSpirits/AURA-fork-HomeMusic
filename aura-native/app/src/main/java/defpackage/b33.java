package defpackage;

import android.net.Uri;
import android.os.Bundle;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b33 extends h33 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b33(int i, boolean z) {
        super(z);
        this.r = i;
    }

    @Override // defpackage.h33
    public final Object a(String str, Bundle bundle) {
        switch (this.r) {
            case 0:
                bundle.getClass();
                str.getClass();
                return (Boolean) bundle.get(str);
            case 1:
                bundle.getClass();
                str.getClass();
                Object obj = bundle.get(str);
                obj.getClass();
                return (Float) obj;
            case 2:
                bundle.getClass();
                str.getClass();
                Object obj2 = bundle.get(str);
                obj2.getClass();
                return (Integer) obj2;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                bundle.getClass();
                str.getClass();
                Object obj3 = bundle.get(str);
                obj3.getClass();
                return (Long) obj3;
            case 4:
                bundle.getClass();
                str.getClass();
                Object obj4 = bundle.get(str);
                obj4.getClass();
                return (Integer) obj4;
            default:
                bundle.getClass();
                str.getClass();
                return (String) bundle.get(str);
        }
    }

    @Override // defpackage.h33
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // defpackage.h33
    public final Object d(String str) {
        int parseInt;
        long parseLong;
        int parseInt2;
        boolean z = true;
        switch (this.r) {
            case 0:
                str.getClass();
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        kf2.n("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                str.getClass();
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                str.getClass();
                if (xm4.k0(str, "0x", false)) {
                    String substring = str.substring(2);
                    ya4.g(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                str.getClass();
                String substring2 = xm4.e0(str, "L", false) ? str.substring(0, str.length() - 1) : str;
                if (xm4.k0(str, "0x", false)) {
                    String substring3 = substring2.substring(2);
                    ya4.g(16);
                    parseLong = Long.parseLong(substring3, 16);
                } else {
                    parseLong = Long.parseLong(substring2);
                }
                return Long.valueOf(parseLong);
            case 4:
                str.getClass();
                if (xm4.k0(str, "0x", false)) {
                    String substring4 = str.substring(2);
                    ya4.g(16);
                    parseInt2 = Integer.parseInt(substring4, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.h33
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue2);
                break;
            default:
                str.getClass();
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // defpackage.h33
    public String f(Object obj) {
        switch (this.r) {
            case 5:
                String str = (String) obj;
                String encode = str != null ? Uri.encode(str) : null;
                return encode == null ? "null" : encode;
            default:
                return super.f(obj);
        }
    }
}
