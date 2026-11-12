package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ cp1 c;

    public /* synthetic */ bp1(cp1 cp1Var, List list, int i) {
        this.a = i;
        this.c = cp1Var;
        this.b = list;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i;
        int i2;
        int i3 = this.a;
        cp1 cp1Var = this.c;
        int i4 = 0;
        List<AlbumID3> list = this.b;
        switch (i3) {
            case 0:
                List<Child> list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    if (ud3.o() == null) {
                        eu0 eu0VarW = au0.w(cp1Var.Z());
                        i = 0;
                        for (AlbumID3 albumID3 : list) {
                            int i5 = i4;
                            for (Child child : list2) {
                                if (child.getAlbumId() != null && child.getAlbumId().equals(albumID3.getId())) {
                                    String id = child.getId();
                                    eu0VarW.getClass();
                                    if (!eu0.d(id)) {
                                        i++;
                                        i5 = 1;
                                    }
                                }
                            }
                            if (i5 != 0) {
                                arrayList.add(albumID3.getName());
                            }
                            i4 = 0;
                        }
                    } else {
                        i = 0;
                        for (AlbumID3 albumID4 : list) {
                            boolean z = false;
                            for (Child child2 : list2) {
                                if (child2.getAlbumId() != null && child2.getAlbumId().equals(albumID4.getId()) && g51.e(child2) == null) {
                                    i++;
                                    z = true;
                                }
                            }
                            if (z) {
                                arrayList.add(albumID4.getName());
                            }
                        }
                    }
                    tc1 tc1Var = cp1Var.l0;
                    if (i > 0) {
                        tc1Var.z.setVisibility(0);
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i6 = 0; i6 < Math.min(arrayList.size(), 3); i6++) {
                            arrayList2.add((String) arrayList.get(i6));
                        }
                        if (!arrayList2.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = arrayList2.iterator();
                            if (it.hasNext()) {
                                while (true) {
                                    sb2.append((CharSequence) it.next());
                                    if (it.hasNext()) {
                                        sb2.append((CharSequence) ", ");
                                    }
                                }
                            }
                            sb.append(sb2.toString());
                            if (arrayList.size() > 3) {
                                sb.append("...");
                            }
                        }
                        String quantityString = cp1Var.r().getQuantityString(R.plurals.home_sync_starred_albums_count, arrayList.size(), Integer.valueOf(arrayList.size()));
                        int length = sb.length();
                        tc1 tc1Var2 = cp1Var.l0;
                        if (length > 0) {
                            tc1Var2.B.setText(sb.toString() + "\n" + quantityString);
                        } else {
                            tc1Var2.B.setText(quantityString);
                        }
                        if (cp1Var.e() != null) {
                            cp1Var.e().runOnUiThread(new qa1(8, this));
                        }
                    } else {
                        tc1Var.z.setVisibility(8);
                    }
                }
                break;
            default:
                List<Child> list3 = (List) obj;
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    if (ud3.o() == null) {
                        eu0 eu0VarW2 = au0.w(cp1Var.Z());
                        Iterator it2 = list.iterator();
                        i2 = 0;
                        while (it2.hasNext()) {
                            ArtistID3 artistID3 = (ArtistID3) it2.next();
                            boolean z2 = false;
                            for (Child child3 : list3) {
                                if (child3.getArtistId() != null && child3.getArtistId().equals(artistID3.getId())) {
                                    String id2 = child3.getId();
                                    eu0VarW2.getClass();
                                    if (!eu0.d(id2)) {
                                        i2++;
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                arrayList3.add(artistID3.getName());
                            }
                        }
                    } else {
                        Iterator it3 = list.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            ArtistID3 artistID4 = (ArtistID3) it3.next();
                            boolean z3 = false;
                            for (Child child4 : list3) {
                                if (child4.getArtistId() != null && child4.getArtistId().equals(artistID4.getId()) && g51.e(child4) == null) {
                                    i2++;
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                arrayList3.add(artistID4.getName());
                            }
                        }
                    }
                    tc1 tc1Var3 = cp1Var.l0;
                    if (i2 > 0) {
                        tc1Var3.D.setVisibility(0);
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList4 = new ArrayList();
                        while (i4 < Math.min(arrayList3.size(), 3)) {
                            arrayList4.add((String) arrayList3.get(i4));
                            i4++;
                        }
                        if (!arrayList4.isEmpty()) {
                            StringBuilder sb4 = new StringBuilder();
                            Iterator it4 = arrayList4.iterator();
                            if (it4.hasNext()) {
                                while (true) {
                                    sb4.append((CharSequence) it4.next());
                                    if (it4.hasNext()) {
                                        sb4.append((CharSequence) ", ");
                                    }
                                }
                            }
                            sb3.append(sb4.toString());
                            if (arrayList3.size() > 3) {
                                sb3.append("...");
                            }
                        }
                        String quantityString2 = cp1Var.r().getQuantityString(R.plurals.home_sync_starred_artists_count, arrayList3.size(), Integer.valueOf(arrayList3.size()));
                        int length2 = sb3.length();
                        tc1 tc1Var4 = cp1Var.l0;
                        if (length2 > 0) {
                            tc1Var4.F.setText(sb3.toString() + "\n" + quantityString2);
                        } else {
                            tc1Var4.F.setText(quantityString2);
                        }
                        if (cp1Var.e() != null) {
                            cp1Var.e().runOnUiThread(new qa1(10, this));
                        }
                    } else {
                        tc1Var3.D.setVisibility(8);
                    }
                }
                break;
        }
    }
}
