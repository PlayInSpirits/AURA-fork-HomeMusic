package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase_Impl;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class c12 implements j4, nz1 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public c12(AppDatabase_Impl appDatabase_Impl) {
        this.n = 0;
        this.o = appDatabase_Impl;
        this.p = new q20(4);
        this.q = new h61(1);
    }

    public static c12 f(View view) {
        int i = R.id.item_song_placeholder_artist;
        View s = uo.s(view, R.id.item_song_placeholder_artist);
        if (s != null) {
            i = R.id.item_song_placeholder_artwork;
            View s2 = uo.s(view, R.id.item_song_placeholder_artwork);
            if (s2 != null) {
                i = R.id.item_song_placeholder_title;
                View s3 = uo.s(view, R.id.item_song_placeholder_title);
                if (s3 != null) {
                    return new c12(s, s2, s3, 7);
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.nz1
    public Uri a() {
        return (Uri) this.o;
    }

    @Override // defpackage.nz1
    public Uri c() {
        return (Uri) this.q;
    }

    @Override // defpackage.nz1
    public Object d() {
        return null;
    }

    @Override // defpackage.j4
    public boolean e() {
        return true;
    }

    public void g(int i, Bundle bundle) {
        ((MainActivity) this.o).runOnUiThread(new gk(this, i, bundle, 0));
    }

    @Override // defpackage.nz1
    public ClipDescription getDescription() {
        return (ClipDescription) this.p;
    }

    @Override // defpackage.j4
    public Context h() {
        return ((Toolbar) this.o).getContext();
    }

    public void i(ik ikVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        MainActivity mainActivity = (MainActivity) this.o;
        if (ikVar == null) {
        }
        str = ikVar.d;
        String str2 = ikVar.c;
        str2.getClass();
        i = 3;
        i2 = 2;
        i3 = 1;
        i4 = 0;
        switch (str2) {
            case "artist":
                ((pa) this.p).getClass();
                k03 v = pa.v(str);
                v.e(mainActivity, new hk(this, v, i2));
                break;
            case "song":
                k03 r = xi4.r(str);
                r.e(mainActivity, new hk(this, r, i4));
                break;
            case "year":
                try {
                    int parseInt = Integer.parseInt(str.trim());
                    Bundle bundle = new Bundle();
                    bundle.putInt("year_object", parseInt);
                    bundle.putString("MEDIA_BY_YEAR", "MEDIA_BY_YEAR");
                    g(R.id.songListPageFragment, bundle);
                    break;
                } catch (NumberFormatException unused) {
                    Toast.makeText(mainActivity, R.string.asset_link_error_unsupported, 0).show();
                    return;
                }
            case "album":
                k03 j = rv2.j(str);
                j.e(mainActivity, new hk(this, j, i3));
                break;
            case "genre":
                String trim = str.trim();
                if (!trim.isEmpty()) {
                    Genre genre = new Genre();
                    genre.setGenre(trim);
                    genre.setSongCount(0);
                    genre.setAlbumCount(0);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("GENRE_OBJECT", genre);
                    bundle2.putString("MEDIA_BY_GENRE", "MEDIA_BY_GENRE");
                    g(R.id.songListPageFragment, bundle2);
                    break;
                } else {
                    Toast.makeText(mainActivity, R.string.asset_link_error_unsupported, 0).show();
                    break;
                }
            case "playlist":
                mm3 mm3Var = (mm3) this.q;
                mm3Var.getClass();
                k03 k03Var = new k03();
                App.f(false).g().F(str).enqueue(new i61(mm3Var, k03Var, str, 9));
                k03Var.e(mainActivity, new hk(this, k03Var, i));
                break;
            default:
                Toast.makeText(mainActivity, R.string.asset_link_error_unsupported, 0).show();
                break;
        }
    }

    public void j(String str, String str2, boolean z, String str3) {
        String str4;
        if (str != null) {
            i61 i61Var = new i61(10);
            if (z) {
                i61Var.o = str;
            } else {
                i61Var.p = UUID.randomUUID().toString();
                StringBuilder i = xa3.i(str);
                i.append((String) i61Var.p);
                String sb = i.toString();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(sb.getBytes());
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b : digest) {
                        StringBuilder sb3 = new StringBuilder(Integer.toHexString(b & 255));
                        while (sb3.length() < 2) {
                            sb3.insert(0, "0");
                        }
                        sb2.append((CharSequence) sb3);
                    }
                    str4 = sb2.toString();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                    str4 = "";
                }
                i61Var.q = str4;
            }
            this.q = i61Var;
        }
        if (str2 == null || str3 == null) {
            return;
        }
        i61 i61Var2 = new i61(10);
        i61Var2.q = str2;
        i61Var2.p = str3;
        this.q = i61Var2;
    }

    public void k() {
        w03 w03Var = (w03) this.o;
        String str = (String) this.p;
        List list = (List) w03Var.j(str);
        if (list != null) {
            list.remove((gf1) this.q);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        w03Var.l(str, list);
    }

    @Override // defpackage.j4
    public void q(Drawable drawable, int i) {
        ((Toolbar) this.o).setNavigationIcon(drawable);
        u(i);
    }

    @Override // defpackage.j4
    public Drawable t() {
        return (Drawable) this.p;
    }

    public String toString() {
        switch (this.n) {
            case 8:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.o);
                sb.append('{');
                rm3 rm3Var = (rm3) ((rm3) this.p).o;
                String str = "";
                while (rm3Var != null) {
                    Object obj = rm3Var.n;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    rm3Var = (rm3) rm3Var.o;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.j4
    public void u(int i) {
        Toolbar toolbar = (Toolbar) this.o;
        if (i == 0) {
            toolbar.setNavigationContentDescription((CharSequence) this.q);
        } else {
            toolbar.setNavigationContentDescription(i);
        }
    }

    public /* synthetic */ c12(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // defpackage.nz1
    public void b() {
    }

    public /* synthetic */ c12(int i) {
        this.n = i;
    }

    public c12(MainActivity mainActivity) {
        this.n = 2;
        this.p = new pa(12);
        this.q = new mm3();
        this.o = mainActivity;
    }

    public c12() {
        this.n = 5;
        this.o = new w03();
    }

    public c12(String str) {
        this.n = 8;
        rm3 rm3Var = new rm3();
        this.p = rm3Var;
        this.q = rm3Var;
        this.o = str;
    }

    public c12(Toolbar toolbar) {
        this.n = 1;
        this.o = toolbar;
        this.p = toolbar.getNavigationIcon();
        this.q = toolbar.getNavigationContentDescription();
    }
}
