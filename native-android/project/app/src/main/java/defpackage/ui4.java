package defpackage;

import android.app.Application;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Genre;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ui4 extends hd {
    public final xi4 c;
    public final pa d;
    public String e;
    public String f;
    public Genre g;
    public ArtistID3 h;
    public AlbumID3 i;
    public k03 j;
    public ArrayList k;
    public ArrayList l;
    public int m;
    public final int n;
    public final int o;

    public ui4(Application application) {
        super(application);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        this.n = SmartPlan.MAX_QUEUE;
        this.o = SmartPlan.MAX_QUEUE;
        this.c = new xi4(2);
        this.d = new pa(12);
    }

    public final k03 c() {
        byte b;
        this.j = new k03(new ArrayList());
        String str = this.e;
        str.getClass();
        int i = 4;
        int i2 = 3;
        switch (str) {
            case "MEDIA_BY_GENRE":
                b = 0;
                break;
            case "MEDIA_STARRED":
                b = 1;
                break;
            case "MEDIA_BY_ARTIST":
                b = 2;
                break;
            case "MEDIA_BY_GENRES":
                b = 3;
                break;
            case "MEDIA_BY_YEAR":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        xi4 xi4Var = this.c;
        switch (b) {
            case 0:
                String genre = this.g.getGenre();
                xi4Var.getClass();
                k03 k03Var = new k03();
                xc5 xc5VarA = App.f(false).a();
                xc5VarA.getClass();
                Log.d("BrowsingClient", "getRandomSongs()");
                ((w8) xc5VarA.p).a(((pn4) xc5VarA.o).f(), this.o, 0, 3000, genre, ud3.k()).enqueue(new ck(k03Var, i));
                this.j = k03Var;
                break;
            case 1:
                xi4Var.getClass();
                this.j = xi4.s(-1, false, true);
                break;
            case 2:
                String name = this.h.getName();
                this.d.getClass();
                this.j = pa.z(50, name);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArrayList arrayList = this.k;
                xi4Var.getClass();
                k03 k03Var2 = new k03();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    String str2 = (String) obj;
                    xc5 xc5VarA2 = App.f(false).a();
                    xc5VarA2.getClass();
                    Log.d("BrowsingClient", "getSongsByGenre()");
                    ((w8) xc5VarA2.p).e(((pn4) xc5VarA2.o).f(), str2, SmartPlan.MAX_QUEUE, 0, ud3.k()).enqueue(new r8(k03Var2, i2));
                }
                this.j = k03Var2;
                break;
            case 4:
                Integer numValueOf = Integer.valueOf(this.m);
                Integer numValueOf2 = Integer.valueOf(this.m + 10);
                xi4Var.getClass();
                this.j = xi4.q(this.n, numValueOf, numValueOf2);
                break;
        }
        return this.j;
    }
}
