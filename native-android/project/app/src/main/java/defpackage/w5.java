package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends r5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ su3 d;

    public /* synthetic */ w5(j70 j70Var, String str, su3 su3Var, int i) {
        this.a = i;
        this.b = j70Var;
        this.c = str;
        this.d = su3Var;
    }

    @Override // defpackage.r5
    public final void a(Object obj) {
        int i = this.a;
        su3 su3Var = this.d;
        String str = this.c;
        j70 j70Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = j70Var.d;
                Object obj2 = j70Var.b.get(str);
                if (obj2 == null) {
                    nz2.p("Attempting to launch an unregistered ActivityResultLauncher with contract ", su3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    j70Var.b(iIntValue, su3Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = j70Var.d;
                Object obj3 = j70Var.b.get(str);
                if (obj3 == null) {
                    nz2.p("Attempting to launch an unregistered ActivityResultLauncher with contract ", su3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    j70Var.b(iIntValue2, su3Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.e(this.c);
    }
}
