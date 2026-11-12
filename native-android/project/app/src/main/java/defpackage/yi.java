package defpackage;

import android.os.Bundle;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yi implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;
    public final /* synthetic */ ArtistBottomSheetDialog c;

    public /* synthetic */ yi(ArtistBottomSheetDialog r1, t6 r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // defpackage.a83
    public final void b(Object r5) {
        int r0 = this.a;
        ArtistBottomSheetDialog r2 = this.c;
        t6 r3 = this.b;
        switch(r0) {
            case 0: goto L26;
            case 1: goto L15;
            default: goto L4;
        };
    L4:
        List r6 = (List) r5;
        r2.B0.c().j(this);
        if (r6 != null) goto L39;
    L10:
        r3.run();
        return;
    L39:
    L11:
        th = move-exception;
        r3.run();
        throw th;
    L7:
        if (r6.isEmpty() == true) goto L10;
        Bundle r4 = new Bundle();     // Catch: Throwable -> L11
        r4.putParcelableArrayList("TRACKS_OBJECT", new ArrayList(r6));     // Catch: Throwable -> L11
        fl3 r7 = new fl3();     // Catch: Throwable -> L11
        r7.c0(r4);     // Catch: Throwable -> L11
        r7.m0(r2.X().k(), null);     // Catch: Throwable -> L11
        r2.h0();     // Catch: Throwable -> L11
        goto L10
    L15:
        List r8 = (List) r5;
        r2.B0.c().j(this);
        if (r8 != null) goto L37;
    L21:
        r3.run();
        return;
    L37:
    L22:
        th = move-exception;
        r3.run();
        throw th;
    L18:
        if (r8.isEmpty() == true) goto L21;
        e03.o(r8);     // Catch: Throwable -> L22
        bo2.e(r2.D0, r8, false);     // Catch: Throwable -> L22
        ((au) ((MainActivity) r2.X()).V.n).d(true);     // Catch: Throwable -> L22
        r2.h0();     // Catch: Throwable -> L22
        goto L21
    L26:
        List r9 = (List) r5;
        r2.B0.c().j(this);
        if (r9 != null) goto L41;
    L32:
        r3.run();
        return;
    L41:
    L33:
        th = move-exception;
        r3.run();
        throw th;
    L29:
        if (r9.isEmpty() == true) goto L32;
        e03.o(r9);     // Catch: Throwable -> L33
        bo2.e(r2.D0, r9, true);     // Catch: Throwable -> L33
        ((au) ((MainActivity) r2.X()).V.n).d(true);     // Catch: Throwable -> L33
        r2.h0();     // Catch: Throwable -> L33
        goto L32
    }
}
