package defpackage;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.SearchView;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o7 extends Filter {
    public final /* synthetic */ int a;
    public Filterable b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o7(dw3 dw3Var, int i) {
        this.a = i;
        this.b = (Filterable) dw3Var;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.a) {
            case 4:
                return ((pg0) this.b).c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0189  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorF;
        int i = 0;
        switch (this.a) {
            case 0:
                q7 q7Var = (q7) this.b;
                ArrayList arrayList = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList.addAll(q7Var.t);
                } else {
                    String strTrim = charSequence.toString().toLowerCase().trim();
                    for (AlbumID3 albumID3 : q7Var.t) {
                        if (albumID3.getName().toLowerCase().contains(strTrim)) {
                            arrayList.add(albumID3);
                        }
                    }
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = arrayList;
                return filterResults;
            case 1:
                b8 b8Var = (b8) this.b;
                ArrayList arrayList2 = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList2.addAll(b8Var.s);
                } else {
                    String strTrim2 = charSequence.toString().toLowerCase().trim();
                    b8Var.u = strTrim2;
                    for (AlbumID3 albumID4 : b8Var.s) {
                        if (albumID4.getName().toLowerCase().contains(strTrim2)) {
                            arrayList2.add(albumID4);
                        }
                    }
                }
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                filterResults2.values = arrayList2;
                return filterResults2;
            case 2:
                ej ejVar = (ej) this.b;
                ArrayList arrayList3 = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList3.addAll(ejVar.s);
                } else {
                    String strTrim3 = charSequence.toString().toLowerCase().trim();
                    ArrayList arrayList4 = ejVar.s;
                    int size = arrayList4.size();
                    while (i < size) {
                        Object obj = arrayList4.get(i);
                        i++;
                        ArtistID3 artistID3 = (ArtistID3) obj;
                        if (artistID3.getName().toLowerCase().contains(strTrim3)) {
                            arrayList3.add(artistID3);
                        }
                    }
                }
                Filter.FilterResults filterResults3 = new Filter.FilterResults();
                filterResults3.values = arrayList3;
                return filterResults3;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                b8 b8Var2 = (b8) this.b;
                ArrayList arrayList5 = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList5.addAll(b8Var2.s);
                } else {
                    String strTrim4 = charSequence.toString().toLowerCase().trim();
                    b8Var2.u = strTrim4;
                    for (ArtistID3 artistID4 : b8Var2.s) {
                        if (artistID4.getName().toLowerCase().contains(strTrim4)) {
                            arrayList5.add(artistID4);
                        }
                    }
                }
                Filter.FilterResults filterResults4 = new Filter.FilterResults();
                filterResults4.values = arrayList5;
                return filterResults4;
            case 4:
                co4 co4Var = (co4) ((pg0) this.b);
                SearchView searchView = co4Var.x;
                String string = charSequence != null ? charSequence.toString() : "";
                if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
                    try {
                        cursorF = co4Var.f(co4Var.y, string);
                        if (cursorF != null) {
                            cursorF.getCount();
                        } else {
                            cursorF = null;
                        }
                    } catch (RuntimeException e) {
                        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
                    }
                    break;
                } else {
                    cursorF = null;
                }
                Filter.FilterResults filterResults5 = new Filter.FilterResults();
                if (cursorF != null) {
                    filterResults5.count = cursorF.getCount();
                    filterResults5.values = cursorF;
                } else {
                    filterResults5.count = 0;
                    filterResults5.values = null;
                }
                return filterResults5;
            case 5:
                ej ejVar2 = (ej) this.b;
                ArrayList arrayList6 = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList6.addAll(ejVar2.s);
                } else {
                    String strTrim5 = charSequence.toString().toLowerCase().trim();
                    ArrayList arrayList7 = ejVar2.s;
                    int size2 = arrayList7.size();
                    while (i < size2) {
                        Object obj2 = arrayList7.get(i);
                        i++;
                        Genre genre = (Genre) obj2;
                        if (genre.getGenre().toLowerCase().contains(strTrim5)) {
                            arrayList6.add(genre);
                        }
                    }
                }
                Filter.FilterResults filterResults6 = new Filter.FilterResults();
                filterResults6.values = arrayList6;
                return filterResults6;
            case 6:
                Filter.FilterResults filterResults7 = new Filter.FilterResults();
                String string2 = charSequence != null ? charSequence.toString() : null;
                filterResults7.values = string2 != null ? string2 : "";
                return filterResults7;
            case 7:
                ej ejVar3 = (ej) this.b;
                ArrayList arrayList8 = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList8.addAll(ejVar3.s);
                } else {
                    String strTrim6 = charSequence.toString().toLowerCase().trim();
                    ArrayList arrayList9 = ejVar3.s;
                    int size3 = arrayList9.size();
                    while (i < size3) {
                        Object obj3 = arrayList9.get(i);
                        i++;
                        Playlist playlist = (Playlist) obj3;
                        if (playlist.getName().toLowerCase().contains(strTrim6)) {
                            arrayList8.add(playlist);
                        }
                    }
                }
                Filter.FilterResults filterResults8 = new Filter.FilterResults();
                filterResults8.values = arrayList8;
                filterResults8.count = arrayList8.size();
                return filterResults8;
            case 8:
                ej ejVar4 = (ej) this.b;
                ArrayList arrayList10 = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList10.addAll(ejVar4.s);
                } else {
                    String strTrim7 = charSequence.toString().toLowerCase().trim();
                    ArrayList arrayList11 = ejVar4.s;
                    int size4 = arrayList11.size();
                    while (i < size4) {
                        Object obj4 = arrayList11.get(i);
                        i++;
                        PodcastChannel podcastChannel = (PodcastChannel) obj4;
                        if (podcastChannel.getTitle().toLowerCase().contains(strTrim7)) {
                            arrayList10.add(podcastChannel);
                        }
                    }
                }
                Filter.FilterResults filterResults9 = new Filter.FilterResults();
                filterResults9.values = arrayList10;
                return filterResults9;
            default:
                ni4 ni4Var = (ni4) this.b;
                ArrayList arrayList12 = new ArrayList();
                if (charSequence == null || charSequence.length() == 0) {
                    arrayList12.addAll(ni4Var.u);
                } else {
                    String strTrim8 = charSequence.toString().toLowerCase().trim();
                    ni4Var.w = strTrim8;
                    for (Child child : ni4Var.u) {
                        if (child.getTitle().toLowerCase().contains(strTrim8)) {
                            arrayList12.add(child);
                        }
                    }
                }
                Filter.FilterResults filterResults10 = new Filter.FilterResults();
                filterResults10.values = arrayList12;
                return filterResults10;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.a) {
            case 0:
                q7 q7Var = (q7) this.b;
                q7Var.s = (List) filterResults.values;
                q7Var.d();
                break;
            case 1:
                b8 b8Var = (b8) this.b;
                b8Var.t = (List) filterResults.values;
                b8Var.d();
                break;
            case 2:
                ej ejVar = (ej) this.b;
                ejVar.r.clear();
                if (filterResults.count > 0) {
                    ejVar.r.addAll((List) filterResults.values);
                }
                ejVar.d();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                b8 b8Var2 = (b8) this.b;
                b8Var2.t = (List) filterResults.values;
                b8Var2.d();
                break;
            case 4:
                pg0 pg0Var = (pg0) this.b;
                Cursor cursor = pg0Var.p;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    pg0Var.b((Cursor) obj);
                    break;
                }
                break;
            case 5:
                ej ejVar2 = (ej) this.b;
                ejVar2.r = (ArrayList) filterResults.values;
                ejVar2.d();
                break;
            case 6:
                q7 q7Var2 = (q7) this.b;
                Object obj2 = filterResults != null ? filterResults.values : null;
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str == null) {
                    str = "";
                }
                q7Var2.v = str;
                q7Var2.t = su3.q(str, q7Var2.s);
                q7Var2.d();
                break;
            case 7:
                ej ejVar3 = (ej) this.b;
                ejVar3.r.clear();
                Object obj3 = filterResults.values;
                if (obj3 != null) {
                    ejVar3.r.addAll((List) obj3);
                }
                ejVar3.d();
                break;
            case 8:
                ej ejVar4 = (ej) this.b;
                ejVar4.r.clear();
                if (filterResults.count > 0) {
                    ejVar4.r.addAll((List) filterResults.values);
                }
                ejVar4.d();
                break;
            default:
                ((ni4) this.b).v.b((List) filterResults.values, new jq3(9, this));
                break;
        }
    }

    public /* synthetic */ o7() {
        this.a = 4;
    }
}
