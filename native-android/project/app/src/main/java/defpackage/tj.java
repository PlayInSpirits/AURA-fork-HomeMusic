package defpackage;

import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tj(vs3 r1, List r2) {
        this.a = 6;
        this.b = r2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object r4) {
        int r0 = this.a;
        boolean r1 = false;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L33;
            case 1: goto L32;
            case 2: goto L25;
            case 3: goto L24;
            case 4: goto L21;
            case 5: goto L20;
            case 6: goto L12;
            default: goto L4;
        };
    L4:
        Child r5 = (Child) r3;
        Queue r6 = (Queue) r4;
        if (r6 != null) goto L7;
        return false;
    L7:
        if (r5.getId() != null) goto L9;
        return false;
    L9:
        if (r6.getId().equals(r5.getId()) == true) goto L11;
        return false;
    L11:
        return true;
    L12:
        List r7 = (List) r3;
        Child r8 = (Child) r4;
        if (r7 == null) goto L18;
        if (r8 == null) goto L18;
        r1 = r7.stream().anyMatch(new tj(7, r8));
    L18:
        return !r1;
    L21:
        im3 r9 = (im3) r3;
        r9.getClass();
        return ((gg3) r4).a.equals(r9.e.getId());
    L25:
        Child r10 = (Child) r4;
        String r2 = r10.getId();
        ((eu0) r3).getClass();
        if (eu0.d(r2) == false) goto L28;
        return false;
    L28:
        if (eu0.e.contains(r10.getId()) == false) goto L30;
        return false;
    L30:
        return true;
    L33:
        wj r11 = (wj) r3;
        r11.getClass();
        String r12 = ((AlbumID3) r4).getArtistId();
        String r13 = r11.e.getId();
        Objects.requireNonNull(r13);
        return Objects.equals(r12, r13);
    L20:
        return ((gg3) r4).a.equals(((PlaylistRowBottomSheetDialog) r3).C0.getId());
    L24:
        return !((HashSet) r3).contains(((Child) r4).getId());
    L32:
        return !((tj) r3).test((AlbumID3) r4);
    }

    public /* synthetic */ tj(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }
}
