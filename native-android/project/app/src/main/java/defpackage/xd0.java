package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd0(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object r6) {
        int r0 = this.a;
        int r1 = 0;
        Object r2 = this.c;
        Object r5 = this.b;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        PlaylistRowBottomSheetDialog r7 = (PlaylistRowBottomSheetDialog) r5;
        i51.b((MainActivity) r2, (Child) r6, r7.C0.getId(), r7.C0.getName(), false);
        return;
    L6:
        ((BiConsumer) r5).accept((MainActivity) r2, (List) r6);
        return;
    L8:
        yd0 r8 = (yd0) r5;
        sp3 r3 = (sp3) r2;
        List r9 = (List) r6;
        if (r9 != null) goto L11;
    L22:
        r8.s(r3);
        return;
    L11:
        if (r9.isEmpty() == true) goto L22;
        int r4 = 0;
    L15:
        if (r4 >= r9.size()) goto L20;
        if (r3.a.equals(((Child) r9.get(r4)).getId()) == true) goto L18;
        r4 = r4 + 1;
        goto L15
    L18:
        long r10 = r3.b;
        ((Child) r9.get(r4)).setType(r3.h);
        r1 = r4;
    L21:
        bo2.p((bl2) r8.v.s, r9, r1, r10);
        return;
    L20:
        r10 = 0;
        goto L21
    }
}
