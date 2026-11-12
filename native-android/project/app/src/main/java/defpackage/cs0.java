package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs0 implements i54 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i54
    public final Bundle a() {
        Bundle bundle;
        kd3[] kd3VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Map mapC = ((y44) obj).c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapC.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 1:
                return ((ld1) obj).W();
            case 2:
                v23 v23Var = (v23) obj;
                LinkedHashMap linkedHashMap = v23Var.m;
                LinkedHashMap linkedHashMap2 = v23Var.l;
                ii iiVar = v23Var.g;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle3 = new Bundle();
                for (Map.Entry entry2 : lg2.a0(v23Var.u.a).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Bundle bundleH = ((t43) entry2.getValue()).h();
                    if (bundleH != null) {
                        arrayList.add(str2);
                        bundle3.putBundle(str2, bundleH);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle3);
                }
                if (!iiVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[iiVar.p];
                    Iterator<E> it = iiVar.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i2] = new c23((a23) it.next());
                        i2++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i3 = 0;
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        int iIntValue = ((Number) entry3.getKey()).intValue();
                        String str3 = (String) entry3.getValue();
                        iArr[i3] = iIntValue;
                        arrayList2.add(str3);
                        i3++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry4.getKey();
                        ii iiVar2 = (ii) entry4.getValue();
                        arrayList3.add(str4);
                        Parcelable[] parcelableArr2 = new Parcelable[iiVar2.p];
                        int i4 = 0;
                        for (Object obj2 : iiVar2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                gb.c0();
                                throw null;
                            }
                            parcelableArr2[i4] = (c23) obj2;
                            i4 = i5;
                        }
                        bundle.putParcelableArray(xa3.g("android-support-nav:controller:backStackStates:", str4), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (v23Var.f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", v23Var.f);
                }
                if (bundle != null) {
                    return bundle;
                }
                Bundle bundle4 = Bundle.EMPTY;
                bundle4.getClass();
                return bundle4;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int i6 = ((NavHostFragment) obj).n0;
                if (i6 != 0) {
                    return fh0.g(new kd3("android-support-nav:fragment:graphId", Integer.valueOf(i6)));
                }
                Bundle bundle5 = Bundle.EMPTY;
                bundle5.getClass();
                return bundle5;
            default:
                z40 z40Var = (z40) obj;
                for (Map.Entry entry5 : lg2.a0((LinkedHashMap) z40Var.q).entrySet()) {
                    z40Var.i(((nl4) entry5.getValue()).getValue(), (String) entry5.getKey());
                }
                for (Map.Entry entry6 : lg2.a0((LinkedHashMap) z40Var.o).entrySet()) {
                    z40Var.i(((i54) entry6.getValue()).a(), (String) entry6.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) z40Var.n;
                if (linkedHashMap3.isEmpty()) {
                    kd3VarArr = new kd3[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(linkedHashMap3.size());
                    for (Map.Entry entry7 : linkedHashMap3.entrySet()) {
                        arrayList4.add(new kd3((String) entry7.getKey(), entry7.getValue()));
                    }
                    kd3VarArr = (kd3[]) arrayList4.toArray(new kd3[0]);
                }
                return fh0.g((kd3[]) Arrays.copyOf(kd3VarArr, kd3VarArr.length));
        }
    }
}
