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

    public /* synthetic */ yi(ArtistBottomSheetDialog artistBottomSheetDialog, t6 t6Var, int i) {
        this.a = i;
        this.c = artistBottomSheetDialog;
        this.b = t6Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        ArtistBottomSheetDialog artistBottomSheetDialog = this.c;
        t6 t6Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                artistBottomSheetDialog.B0.c().j(this);
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            e03.o(list);
                            bo2.e(artistBottomSheetDialog.D0, list, true);
                            ((au) ((MainActivity) artistBottomSheetDialog.X()).V.n).d(true);
                            artistBottomSheetDialog.h0();
                            break;
                        }
                    } finally {
                        t6Var.run();
                    }
                }
                return;
            case 1:
                List list2 = (List) obj;
                artistBottomSheetDialog.B0.c().j(this);
                if (list2 != null) {
                    try {
                        if (!list2.isEmpty()) {
                            e03.o(list2);
                            bo2.e(artistBottomSheetDialog.D0, list2, false);
                            ((au) ((MainActivity) artistBottomSheetDialog.X()).V.n).d(true);
                            artistBottomSheetDialog.h0();
                            break;
                        }
                    } finally {
                        t6Var.run();
                    }
                }
                return;
            default:
                List list3 = (List) obj;
                artistBottomSheetDialog.B0.c().j(this);
                if (list3 != null) {
                    try {
                        if (!list3.isEmpty()) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list3));
                            fl3 fl3Var = new fl3();
                            fl3Var.c0(bundle);
                            fl3Var.m0(artistBottomSheetDialog.X().k(), null);
                            artistBottomSheetDialog.h0();
                            break;
                        }
                    } finally {
                        t6Var.run();
                    }
                }
                return;
        }
    }
}
