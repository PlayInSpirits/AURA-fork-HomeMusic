package defpackage;

import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tj(vs3 vs3Var, List list) {
        this.a = 6;
        this.b = list;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        boolean zAnyMatch = false;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wj wjVar = (wj) obj2;
                wjVar.getClass();
                String artistId = ((AlbumID3) obj).getArtistId();
                String id = wjVar.e.getId();
                Objects.requireNonNull(id);
                return Objects.equals(artistId, id);
            case 1:
                return !((tj) obj2).test((AlbumID3) obj);
            case 2:
                Child child = (Child) obj;
                String id2 = child.getId();
                ((eu0) obj2).getClass();
                if (eu0.d(id2)) {
                    return false;
                }
                return !eu0.e.contains(child.getId());
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return !((HashSet) obj2).contains(((Child) obj).getId());
            case 4:
                im3 im3Var = (im3) obj2;
                im3Var.getClass();
                return ((gg3) obj).a.equals(im3Var.e.getId());
            case 5:
                return ((gg3) obj).a.equals(((PlaylistRowBottomSheetDialog) obj2).C0.getId());
            case 6:
                List list = (List) obj2;
                Child child2 = (Child) obj;
                if (list != null && child2 != null) {
                    zAnyMatch = list.stream().anyMatch(new tj(7, child2));
                }
                return !zAnyMatch;
            default:
                Child child3 = (Child) obj2;
                Queue queue = (Queue) obj;
                return (queue == null || child3.getId() == null || !queue.getId().equals(child3.getId())) ? false : true;
        }
    }

    public /* synthetic */ tj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
