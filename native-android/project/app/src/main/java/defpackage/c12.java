package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class c12 implements j4, nz1 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public c12(AppDatabase_Impl r2) {
        this.n = 0;
        this.o = r2;
        this.p = new q20(4);
        this.q = new h61(1);
    }

    public static c12 f(View r4) {
        int r0 = R.id.item_song_placeholder_artist;
        View r1 = uo.s(r4, R.id.item_song_placeholder_artist);
        if (r1 == null) goto L10;
        r0 = R.id.item_song_placeholder_artwork;
        View r2 = uo.s(r4, R.id.item_song_placeholder_artwork);
        if (r2 == null) goto L10;
        r0 = R.id.item_song_placeholder_title;
        View r3 = uo.s(r4, R.id.item_song_placeholder_title);
        if (r3 == null) goto L10;
        LinearLayout r5 = (LinearLayout) r4;
        return new c12(r1, r2, r3, 7);
    L10:
        nz2.n("Missing required view with ID: ".concat(r4.getResources().getResourceName(r0)));
        return null;
    }

    @Override // defpackage.nz1
    public Uri a() {
        return (Uri) this.o;
    }

    @Override // defpackage.nz1
    public void b() {
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

    public void g(int r4, Bundle r5) {
        ((MainActivity) this.o).runOnUiThread(new gk(this, r4, r5, 0));
    }

    @Override // defpackage.nz1
    public ClipDescription getDescription() {
        return (ClipDescription) this.p;
    }

    @Override // defpackage.j4
    public Context h() {
        return ((Toolbar) this.o).getContext();
    }

    public void i(ik r9) {
        MainActivity r0 = (MainActivity) this.o;
        if (r9 != null) goto L5;
        return;
    L5:
        String r1 = r9.d;
        String r10 = r9.c;
        r10.getClass();
        int r3 = 3;
        int r4 = 2;
        int r5 = 1;
        int r6 = 0;
        byte r7 = -1;
        switch(r10.hashCode()) {
            case -1409097913: goto L29;
            case 3536149: goto L25;
            case 3704893: goto L21;
            case 92896879: goto L17;
            case 98240899: goto L13;
            case 1879474642: goto L9;
            default: goto L33;
        };
    L9:
        if (r10.equals("playlist") == false) goto L33;
        r7 = 5;
        goto L33
    L13:
        if (r10.equals("genre") == false) goto L33;
        r7 = 4;
        goto L33
    L17:
        if (r10.equals("album") == false) goto L33;
        r7 = 3;
        goto L33
    L21:
        if (r10.equals("year") == false) goto L33;
        r7 = 2;
        goto L33
    L25:
        if (r10.equals("song") == false) goto L33;
        r7 = 1;
        goto L33
    L29:
        if (r10.equals("artist") == false) goto L33;
        r7 = 0;
    L33:
        switch(r7) {
            case 0: goto L53;
            case 1: goto L51;
            case 2: goto L55;
            case 3: goto L44;
            case 4: goto L38;
            case 5: goto L36;
            default: goto L34;
        };
    L34:
        Toast.makeText(r0, R.string.asset_link_error_unsupported, 0).show();
        return;
    L36:
        mm3 r11 = (mm3) this.q;
        r11.getClass();
        k03 r2 = new k03();
        App.f(false).g().F(r1).enqueue(new i61(r11, r2, r1, 9));
        r2.e(r0, new hk(this, r2, r3));
        return;
    L38:
        String r8 = r1.trim();
        if (r8.isEmpty() == false) goto L42;
        Toast.makeText(r0, R.string.asset_link_error_unsupported, 0).show();
        return;
    L42:
        Genre r12 = new Genre();
        r12.setGenre(r8);
        r12.setSongCount(0);
        r12.setAlbumCount(0);
        Bundle r13 = new Bundle();
        r13.putParcelable("GENRE_OBJECT", r12);
        r13.putString("MEDIA_BY_GENRE", "MEDIA_BY_GENRE");
        g(R.id.songListPageFragment, r13);
        return;
    L44:
        k03 r14 = rv2.j(r1);
        r14.e(r0, new hk(this, r14, r5));
        return;
    L51:
        k03 r15 = xi4.r(r1);
        r15.e(r0, new hk(this, r15, r6));
        return;
    L53:
        ((pa) this.p).getClass();
        k03 r16 = pa.v(r1);
        r16.e(r0, new hk(this, r16, r4));
        return;
    L55:
        int r17 = Integer.parseInt(r1.trim());     // Catch: NumberFormatException -> L49
        Bundle r18 = new Bundle();     // Catch: NumberFormatException -> L49
        r18.putInt("year_object", r17);     // Catch: NumberFormatException -> L49
        r18.putString("MEDIA_BY_YEAR", "MEDIA_BY_YEAR");     // Catch: NumberFormatException -> L49
        g(R.id.songListPageFragment, r18);     // Catch: NumberFormatException -> L49
        return;
    L49:
        Toast.makeText(r0, R.string.asset_link_error_unsupported, 0).show();
    }

    public void j(String r9, String r10, boolean r11, String r12) {
        if (r9 == null) goto L22;
        i61 r1 = new i61(10);
        if (r11 == false) goto L7;
        r1.o = r9;
    L21:
        this.q = r1;
        goto L22
    L7:
        r1.p = UUID.randomUUID().toString();
        StringBuilder r13 = xa3.i(r9);
        r13.append((String) r1.p);
        String r14 = r13.toString();
        MessageDigest r15 = MessageDigest.getInstance("MD5");     // Catch: NoSuchAlgorithmException -> L14
        r15.update(r14.getBytes());     // Catch: NoSuchAlgorithmException -> L14
        byte[] r16 = r15.digest();     // Catch: NoSuchAlgorithmException -> L14
        StringBuilder r17 = new StringBuilder();     // Catch: NoSuchAlgorithmException -> L14
        int r2 = r16.length;     // Catch: NoSuchAlgorithmException -> L14
        int r4 = 0;
    L9:
        if (r4 >= r2) goto L17;
        StringBuilder r6 = new StringBuilder(Integer.toHexString(r16[r4] & 255));     // Catch: NoSuchAlgorithmException -> L14
    L12:
        if (r6.length() >= 2) goto L16;
        r6.insert(0, "0");     // Catch: NoSuchAlgorithmException -> L14
        goto L12
    L16:
        r17.append(r6);     // Catch: NoSuchAlgorithmException -> L14
        r4 = r4 + 1;     // Catch: NoSuchAlgorithmException -> L14
        goto L9
    L17:
        String r18 = r17.toString();     // Catch: NoSuchAlgorithmException -> L14
    L20:
        r1.q = r18;
    L14:
        e = move-exception;
        e.printStackTrace();
        r18 = "";
    L22:
        if (r10 == null) goto L30;
        if (r12 == null) goto L31;
        i61 r19 = new i61(10);
        r19.q = r10;
        r19.p = r12;
        this.q = r19;
        return;
    L31:
        return;
    }

    public void k() {
        w03 r0 = (w03) this.o;
        String r1 = (String) this.p;
        List r2 = (List) r0.j(r1);
        if (r2 == null) goto L5;
        r2.remove((gf1) this.q);
    L5:
        if (r2 != null) goto L7;
        return;
    L7:
        if (r2.isEmpty() == true) goto L12;
        r0.l(r1, r2);
        return;
    }

    @Override // defpackage.j4
    public void q(Drawable r2, int r3) {
        ((Toolbar) this.o).setNavigationIcon(r2);
        u(r3);
    }

    @Override // defpackage.j4
    public Drawable t() {
        return (Drawable) this.p;
    }

    public String toString() {
        switch(this.n) {
            case 8: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder(32);
        r0.append((String) this.o);
        r0.append('{');
        rm3 r4 = (rm3) ((rm3) this.p).o;
        String r1 = "";
    L7:
        if (r4 == null) goto L15;
        Object r2 = r4.n;
        r0.append(r1);
        if (r2 != null) goto L11;
    L13:
        r0.append(r2);
    L14:
        r4 = (rm3) r4.o;
        r1 = ", ";
        goto L7
    L11:
        if (r2.getClass().isArray() == false) goto L13;
        String r3 = Arrays.deepToString(new Object[]{r2});
        r0.append(r3, 1, r3.length() - 1);
        goto L14
    L15:
        r0.append('}');
        return r0.toString();
    L5:
        return super.toString();
    }

    @Override // defpackage.j4
    public void u(int r2) {
        Toolbar r0 = (Toolbar) this.o;
        if (r2 != 0) goto L6;
        r0.setNavigationContentDescription((CharSequence) this.q);
        return;
    L6:
        r0.setNavigationContentDescription(r2);
    }

    public /* synthetic */ c12(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    public /* synthetic */ c12(int r1) {
        this.n = r1;
    }

    public c12(MainActivity r3) {
        this.n = 2;
        this.p = new pa(12);
        this.q = new mm3();
        this.o = r3;
    }

    public c12() {
        this.n = 5;
        this.o = new w03();
    }

    public c12(String r2) {
        this.n = 8;
        rm3 r0 = new rm3();
        this.p = r0;
        this.q = r0;
        this.o = r2;
    }

    public c12(Toolbar r2) {
        this.n = 1;
        this.o = r2;
        this.p = r2.getNavigationIcon();
        this.q = r2.getNavigationContentDescription();
    }
}
