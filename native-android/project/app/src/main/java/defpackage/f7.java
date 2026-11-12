package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.model.DownloadStack;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        byte b = 4;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                ((TextView) obj2).setOnClickListener(new a7((AlbumBottomSheetDialog) obj3, gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), list, 0));
                break;
            case 1:
                DownloadFragment downloadFragment = (DownloadFragment) obj3;
                List list2 = (List) obj2;
                ArrayList arrayList = (ArrayList) obj;
                RecyclerView recyclerView = (RecyclerView) downloadFragment.l0.f;
                downloadFragment.Z();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                DownloadStack downloadStack = (DownloadStack) arrayList.get(arrayList.size() - 1);
                String id = downloadStack.getId();
                id.getClass();
                int i2 = 3;
                switch (id.hashCode()) {
                    case -2125974859:
                        b = !id.equals("download_type_artist") ? (byte) -1 : (byte) 0;
                        break;
                    case -940056789:
                        b = !id.equals("download_type_year") ? (byte) -1 : (byte) 1;
                        break;
                    case 155496896:
                        b = !id.equals("download_type_playlist") ? (byte) -1 : (byte) 2;
                        break;
                    case 901055809:
                        b = !id.equals("download_type_album") ? (byte) -1 : (byte) 3;
                        break;
                    case 906399829:
                        if (!id.equals("download_type_genre")) {
                            b = -1;
                        }
                        break;
                    case 918779933:
                        b = !id.equals("download_type_track") ? (byte) -1 : (byte) 5;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        downloadFragment.p0.s("download_type_album", downloadStack.getId(), downloadStack.getView(), list2);
                        break;
                    case 1:
                        downloadFragment.p0.s("download_type_track", downloadStack.getId(), downloadStack.getView(), list2);
                        break;
                    case 2:
                        downloadFragment.p0.s("download_type_track", downloadStack.getId(), downloadStack.getView(), list2);
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        downloadFragment.p0.s("download_type_track", downloadStack.getId(), downloadStack.getView(), list2);
                        break;
                    case 4:
                        downloadFragment.p0.s("download_type_track", downloadStack.getId(), downloadStack.getView(), list2);
                        break;
                    case 5:
                        downloadFragment.p0.s("download_type_track", downloadStack.getId(), downloadStack.getView(), list2);
                        break;
                }
                ((ImageView) downloadFragment.l0.d).setVisibility(arrayList.size() <= 1 ? 8 : 0);
                downloadFragment.X().i().a(downloadFragment.v(), new xs0(downloadFragment, arrayList.size()));
                ((TextView) downloadFragment.l0.i).setOnClickListener(new ws0(downloadFragment, i2));
                break;
            case 2:
                cp1 cp1Var = (cp1) obj3;
                boolean[] zArr = (boolean[]) obj2;
                List list3 = (List) obj;
                if (!zArr[0] && list3 != null && !list3.isEmpty()) {
                    new Handler(Looper.getMainLooper()).postDelayed(new v6(cp1Var, zArr, list3, 14), 300L);
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                aj3 aj3Var = (aj3) obj3;
                Child child = (Child) obj;
                if (Objects.equals(aj3Var.u, (String) obj2)) {
                    aj3Var.n.i(child);
                }
                break;
            default:
                im3 im3Var = (im3) obj3;
                im3Var.getClass();
                ((k03) obj2).i(Boolean.valueOf(((List) obj).stream().anyMatch(new tj(4, im3Var))));
                break;
        }
    }
}
