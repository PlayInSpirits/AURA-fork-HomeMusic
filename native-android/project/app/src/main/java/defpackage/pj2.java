package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pj2 extends uj2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ om1 f;

    public pj2(sj2 r1, String r2, om1 r3, Bundle r4) {
        this.e = 2;
        this.f = r3;
        super(r2);
    }

    @Override // defpackage.uj2
    public final void a() {
        int r0 = this.e;
        om1 r1 = this.f;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((MediaBrowserService.Result) r1.o).detach();
        return;
    L6:
        ((MediaBrowserService.Result) r1.o).detach();
        return;
    L8:
        ((MediaBrowserService.Result) r1.o).detach();
    }

    @Override // defpackage.uj2
    public final void d(Object r5) {
        int r0 = this.e;
        ArrayList r2 = null;
        om1 r4 = this.f;
        switch(r0) {
            case 0: goto L18;
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        List r6 = (List) r5;
        if (r6 != null) goto L7;
        r4.l(null);
        return;
    L7:
        ArrayList r1 = new ArrayList(r6.size());
        Iterator r7 = r6.iterator();
    L9:
        if (r7.hasNext() == false) goto L11;
        ij2 r3 = (ij2) r7.next();
        Parcel r8 = Parcel.obtain();
        r3.writeToParcel(r8, 0);
        r1.add(r8);
        goto L9
    L11:
        r4.l(r1);
        return;
    L13:
        ij2 r9 = (ij2) r5;
        if (r9 != null) goto L16;
        r4.l(null);
        return;
    L16:
        Parcel r10 = Parcel.obtain();
        r9.writeToParcel(r10, 0);
        r4.l(r10);
        return;
    L18:
        List r11 = (List) r5;
        if (r11 == null) goto L25;
        r2 = new ArrayList(r11.size());
        Iterator r12 = r11.iterator();
    L23:
        if (r12.hasNext() == false) goto L25;
        ij2 r13 = (ij2) r12.next();
        Parcel r14 = Parcel.obtain();
        r13.writeToParcel(r14, 0);
        r2.add(r14);
    L25:
        r4.l(r2);
    }

    public /* synthetic */ pj2(String r1, om1 r2, int r3) {
        this.e = r3;
        this.f = r2;
        super(r1);
    }
}
