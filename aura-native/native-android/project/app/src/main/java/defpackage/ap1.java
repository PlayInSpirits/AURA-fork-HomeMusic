package defpackage;

import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp1 b;

    public /* synthetic */ ap1(cp1 cp1Var, int i) {
        this.a = i;
        this.b = cp1Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        int i5 = 5;
        cp1 cp1Var = this.b;
        int i6 = 0;
        switch (i4) {
            case 0:
                List<Child> list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    if (ud3.o() == null) {
                        eu0 eu0VarW = au0.w(cp1Var.Z());
                        i = 0;
                        for (Child child : list) {
                            String id = child.getId();
                            eu0VarW.getClass();
                            if (!eu0.d(id)) {
                                i++;
                                if (arrayList.size() < 3) {
                                    arrayList.add(child.getTitle());
                                }
                            }
                        }
                    } else {
                        i = 0;
                        for (Child child2 : list) {
                            if (g51.e(child2) == null) {
                                i++;
                                if (arrayList.size() < 3) {
                                    arrayList.add(child2.getTitle());
                                }
                            }
                        }
                    }
                    tc1 tc1Var = cp1Var.l0;
                    if (i > 0) {
                        tc1Var.H.setVisibility(0);
                        StringBuilder sb = new StringBuilder();
                        if (!arrayList.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                while (true) {
                                    sb2.append((CharSequence) it.next());
                                    if (it.hasNext()) {
                                        sb2.append((CharSequence) ", ");
                                    }
                                }
                            }
                            sb.append(sb2.toString());
                            if (i > 3) {
                                sb.append("...");
                            }
                        }
                        String quantityString = cp1Var.r().getQuantityString(R.plurals.home_sync_starred_songs_count, i, Integer.valueOf(i));
                        int length = sb.length();
                        tc1 tc1Var2 = cp1Var.l0;
                        if (length > 0) {
                            tc1Var2.J.setText(sb.toString() + "\n" + quantityString);
                        } else {
                            tc1Var2.J.setText(quantityString);
                        }
                        if (cp1Var.e() != null) {
                            cp1Var.e().runOnUiThread(new qa1(5, this));
                        }
                    } else {
                        tc1Var.H.setVisibility(8);
                    }
                    break;
                }
                break;
            case 1:
                List list2 = (List) obj;
                if (list2 != null && !list2.isEmpty()) {
                    bl4 bl4Var = cp1Var.n0.j;
                    bl4Var.c.getClass();
                    rv2.o(-1, false).f(new np0(4, bl4Var));
                    bl4Var.d.e(cp1Var.v(), new bp1(cp1Var, list2, i6));
                    break;
                }
                break;
            case 2:
                List<Child> list3 = (List) obj;
                if (list3 != null && !list3.isEmpty()) {
                    if (ud3.o() == null) {
                        eu0 eu0VarW2 = au0.w(cp1Var.Z());
                        i2 = 0;
                        for (Child child3 : list3) {
                            String id2 = child3.getId();
                            eu0VarW2.getClass();
                            if (!eu0.d(id2)) {
                                eu0VarW2.b(gi1.G(child3), new Download(child3), false);
                                i2++;
                            }
                        }
                    } else {
                        i2 = 0;
                        for (Child child4 : list3) {
                            if (g51.e(child4) == null) {
                                i51.a(cp1Var.Z(), child4);
                                i2++;
                            }
                        }
                    }
                    if (i2 > 0) {
                        Toast.makeText(cp1Var.Z(), cp1Var.r().getQuantityString(R.plurals.songs_download_started, i2, Integer.valueOf(i2)), 0).show();
                    }
                }
                cp1Var.l0.z.setVisibility(8);
                if (cp1Var.e() != null) {
                    cp1Var.e().runOnUiThread(new qa1(7, this));
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List list4 = (List) obj;
                if (list4 != null && !list4.isEmpty()) {
                    cl4 cl4Var = cp1Var.n0.k;
                    cl4Var.c.y(-1, false).f(new np0(i5, cl4Var));
                    cl4Var.d.e(cp1Var.v(), new bp1(cp1Var, list4, 1));
                    break;
                }
                break;
            default:
                List<Child> list5 = (List) obj;
                if (list5 != null && !list5.isEmpty()) {
                    if (ud3.o() == null) {
                        eu0 eu0VarW3 = au0.w(cp1Var.Z());
                        i3 = 0;
                        for (Child child5 : list5) {
                            String id3 = child5.getId();
                            eu0VarW3.getClass();
                            if (!eu0.d(id3)) {
                                eu0VarW3.b(gi1.G(child5), new Download(child5), false);
                                i3++;
                            }
                        }
                    } else {
                        i3 = 0;
                        for (Child child6 : list5) {
                            if (g51.e(child6) == null) {
                                i51.a(cp1Var.Z(), child6);
                                i3++;
                            }
                        }
                    }
                    if (i3 > 0) {
                        Toast.makeText(cp1Var.Z(), cp1Var.r().getQuantityString(R.plurals.songs_download_started, i3, Integer.valueOf(i3)), 0).show();
                    }
                }
                cp1Var.l0.D.setVisibility(8);
                if (cp1Var.e() != null) {
                    cp1Var.e().runOnUiThread(new qa1(9, this));
                }
                break;
        }
    }
}
