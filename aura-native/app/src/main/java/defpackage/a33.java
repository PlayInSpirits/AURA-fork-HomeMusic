package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a33 extends h33 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a33(int i, boolean z) {
        super(z);
        this.r = i;
    }

    public static int[] g(String str) {
        str.getClass();
        return new int[]{((Number) h33.b.d(str)).intValue()};
    }

    public static long[] h(String str) {
        str.getClass();
        return new long[]{((Number) h33.f.d(str)).longValue()};
    }

    public static boolean[] i(String str) {
        str.getClass();
        return new boolean[]{((Boolean) h33.l.d(str)).booleanValue()};
    }

    @Override // defpackage.h33
    public final Object a(String str, Bundle bundle) {
        switch (this.r) {
            case 0:
                bundle.getClass();
                str.getClass();
                return (boolean[]) bundle.get(str);
            case 1:
                bundle.getClass();
                str.getClass();
                boolean[] zArr = (boolean[]) bundle.get(str);
                if (zArr != null) {
                    return ti.s0(zArr);
                }
                return null;
            case 2:
                bundle.getClass();
                str.getClass();
                return (float[]) bundle.get(str);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                bundle.getClass();
                str.getClass();
                float[] fArr = (float[]) bundle.get(str);
                if (fArr != null) {
                    return ti.p0(fArr);
                }
                return null;
            case 4:
                bundle.getClass();
                str.getClass();
                return (int[]) bundle.get(str);
            case 5:
                bundle.getClass();
                str.getClass();
                int[] iArr = (int[]) bundle.get(str);
                if (iArr == null) {
                    return null;
                }
                int length = iArr.length;
                if (length == 0) {
                    return u01.n;
                }
                if (length == 1) {
                    return gb.O(Integer.valueOf(iArr[0]));
                }
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i : iArr) {
                    arrayList.add(Integer.valueOf(i));
                }
                return arrayList;
            case 6:
                bundle.getClass();
                str.getClass();
                return (long[]) bundle.get(str);
            case 7:
                bundle.getClass();
                str.getClass();
                long[] jArr = (long[]) bundle.get(str);
                if (jArr != null) {
                    return ti.q0(jArr);
                }
                return null;
            case 8:
                bundle.getClass();
                str.getClass();
                return (String[]) bundle.get(str);
            default:
                bundle.getClass();
                str.getClass();
                String[] strArr = (String[]) bundle.get(str);
                if (strArr != null) {
                    return ti.r0(strArr);
                }
                return null;
        }
    }

    @Override // defpackage.h33
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // defpackage.h33
    public final Object c(Object obj, String str) {
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] i = i(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(i, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                b33 b33Var = h33.l;
                return list != null ? q40.G0(list, gb.O(b33Var.d(str))) : gb.O(b33Var.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                return copyOf2;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List list2 = (List) obj;
                return list2 != null ? q40.G0(list2, gb.O(Float.valueOf(Float.parseFloat(str)))) : gb.O(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] g = g(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(g, 0, copyOf3, length3, 1);
                return copyOf3;
            case 5:
                List list3 = (List) obj;
                b33 b33Var2 = h33.b;
                return list3 != null ? q40.G0(list3, gb.O(b33Var2.d(str))) : gb.O(b33Var2.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] h = h(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(h, 0, copyOf4, length4, 1);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                b33 b33Var3 = h33.f;
                return list4 != null ? q40.G0(list4, gb.O(b33Var3.d(str))) : gb.O(b33Var3.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, copyOf5, length5, 1);
                return (String[]) copyOf5;
            default:
                List list5 = (List) obj;
                return list5 != null ? q40.G0(list5, gb.O(str)) : gb.O(str);
        }
    }

    @Override // defpackage.h33
    public final Object d(String str) {
        switch (this.r) {
            case 0:
                return i(str);
            case 1:
                str.getClass();
                return gb.O(h33.l.d(str));
            case 2:
                str.getClass();
                return new float[]{Float.parseFloat(str)};
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                str.getClass();
                return gb.O(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return g(str);
            case 5:
                str.getClass();
                return gb.O(h33.b.d(str));
            case 6:
                return h(str);
            case 7:
                str.getClass();
                return gb.O(h33.f.d(str));
            case 8:
                str.getClass();
                return new String[]{str};
            default:
                str.getClass();
                return gb.O(str);
        }
    }

    @Override // defpackage.h33
    public final void e(Bundle bundle, String str, Object obj) {
        int i = 0;
        long[] jArr = null;
        float[] fArr = null;
        switch (this.r) {
            case 0:
                str.getClass();
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                bundle.putBooleanArray(str, list != null ? q40.N0(list) : null);
                break;
            case 2:
                str.getClass();
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List list2 = (List) obj;
                str.getClass();
                if (list2 != null) {
                    fArr = new float[list2.size()];
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        fArr[i] = ((Number) it.next()).floatValue();
                        i++;
                    }
                }
                bundle.putFloatArray(str, fArr);
                break;
            case 4:
                str.getClass();
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                List list3 = (List) obj;
                str.getClass();
                bundle.putIntArray(str, list3 != null ? q40.P0(list3) : null);
                break;
            case 6:
                str.getClass();
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 != null) {
                    jArr = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        jArr[i] = ((Number) it2.next()).longValue();
                        i++;
                    }
                }
                bundle.putLongArray(str, jArr);
                break;
            case 8:
                str.getClass();
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                List list5 = (List) obj;
                str.getClass();
                bundle.putStringArray(str, list5 != null ? (String[]) list5.toArray(new String[0]) : null);
                break;
        }
    }
}
