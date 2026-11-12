package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pj2 extends uj2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ om1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj2(sj2 sj2Var, String str, om1 om1Var, Bundle bundle) {
        super(str);
        this.e = 2;
        this.f = om1Var;
    }

    @Override // defpackage.uj2
    public final void a() {
        int i = this.e;
        om1 om1Var = this.f;
        switch (i) {
            case 0:
                ((MediaBrowserService.Result) om1Var.o).detach();
                break;
            case 1:
                ((MediaBrowserService.Result) om1Var.o).detach();
                break;
            default:
                ((MediaBrowserService.Result) om1Var.o).detach();
                break;
        }
    }

    @Override // defpackage.uj2
    public final void d(Object obj) {
        int i = this.e;
        ArrayList arrayList = null;
        om1 om1Var = this.f;
        switch (i) {
            case 0:
                List<ij2> list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (ij2 ij2Var : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        ij2Var.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                }
                om1Var.l(arrayList);
                break;
            case 1:
                ij2 ij2Var2 = (ij2) obj;
                if (ij2Var2 == null) {
                    om1Var.l(null);
                } else {
                    Parcel parcelObtain2 = Parcel.obtain();
                    ij2Var2.writeToParcel(parcelObtain2, 0);
                    om1Var.l(parcelObtain2);
                }
                break;
            default:
                List<ij2> list2 = (List) obj;
                if (list2 == null) {
                    om1Var.l(null);
                } else {
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (ij2 ij2Var3 : list2) {
                        Parcel parcelObtain3 = Parcel.obtain();
                        ij2Var3.writeToParcel(parcelObtain3, 0);
                        arrayList2.add(parcelObtain3);
                    }
                    om1Var.l(arrayList2);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj2(String str, om1 om1Var, int i) {
        super(str);
        this.e = i;
        this.f = om1Var;
    }
}
