package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubShareActivity;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.eddyizm.tempus.util.ClickablePreferenceCategory;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p6 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ p6(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.o;
        switch (i) {
            case 0:
                r6 r6Var = (r6) obj;
                Bundle bundle = new Bundle();
                s6 s6Var = r6Var.v;
                bundle.putParcelable("ALBUM_OBJECT", ((AlbumID3) s6Var.r.get(r6Var.c())).strippedForNav());
                s6Var.t.onAlbumClick(bundle);
                break;
            case 1:
                k7 k7Var = (k7) obj;
                Bundle bundle2 = new Bundle();
                l7 l7Var = k7Var.v;
                bundle2.putParcelable("ALBUM_OBJECT", ((AlbumID3) l7Var.r.get(k7Var.c())).strippedForNav());
                l7Var.q.onAlbumClick(bundle2);
                break;
            case 2:
                p7 p7Var = (p7) obj;
                Bundle bundle3 = new Bundle();
                q7 q7Var = p7Var.v;
                bundle3.putParcelable("ALBUM_OBJECT", ((AlbumID3) q7Var.s.get(p7Var.c())).strippedForNav());
                ((AlbumCatalogueFragment) q7Var.u).onAlbumClick(bundle3);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                u8 u8Var = (u8) obj;
                Bundle bundle4 = new Bundle();
                ss0 ss0Var = u8Var.u;
                bundle4.putString("ALBUM_LIST_TITLE", ((TextView) ss0Var.q).getText().toString());
                bundle4.putParcelableArrayList("ALBUMS_OBJECT", new ArrayList<>((List) u8Var.v.s.getOrDefault((String) ((TextView) ss0Var.p).getTag(), Collections.EMPTY_LIST)));
                gb.x(view).m(R.id.albumListPageFragment, bundle4, null);
                break;
            case 4:
                ui uiVar = (ui) obj;
                Bundle bundle5 = new Bundle();
                vi viVar = uiVar.v;
                bundle5.putParcelable("ARTIST_OBJECT", ((ArtistID3) viVar.u.get(uiVar.c())).strippedForNav());
                bundle5.putBoolean("MEDIA_MIX", viVar.r);
                bundle5.putBoolean("MEDIA_BEST_OF", viVar.s);
                viVar.q.onArtistClick(bundle5);
                break;
            case 5:
                cj cjVar = (cj) obj;
                Bundle bundle6 = new Bundle();
                s6 s6Var2 = cjVar.v;
                bundle6.putParcelable("ARTIST_OBJECT", (Parcelable) s6Var2.r.get(cjVar.c()));
                ((ArtistPageFragment) s6Var2.t).onArtistClick(bundle6);
                break;
            case 6:
                dj djVar = (dj) obj;
                Bundle bundle7 = new Bundle();
                ej ejVar = djVar.v;
                bundle7.putParcelable("ARTIST_OBJECT", (Parcelable) ejVar.r.get(djVar.c()));
                ((ArtistCatalogueFragment) ejVar.t).onArtistClick(bundle7);
                break;
            case 7:
                s30 s30Var = (s30) obj;
                EditText editText = s30Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    s30Var.p();
                    break;
                }
                break;
            case 8:
                ClickablePreferenceCategory clickablePreferenceCategory = (ClickablePreferenceCategory) obj;
                ss1 ss1Var = clickablePreferenceCategory.j0;
                if (ss1Var != null) {
                    vb4 vb4Var = ss1Var.o;
                    HashSet hashSet = vb4Var.A0;
                    String str = clickablePreferenceCategory.y;
                    if (!"lan_playback".equals(str)) {
                        if (hashSet.contains(str)) {
                            hashSet.remove(str);
                        } else {
                            hashSet.add(str);
                        }
                        vb4Var.l0();
                    } else {
                        vb4Var.g0(new Intent(vb4Var.Z(), (Class<?>) LanPlaybackActivity.class));
                    }
                }
                break;
            case 9:
                ((f50) obj).i0(false, false);
                break;
            case 10:
                xa3.t("data_saving_mode", true);
                Dialog dialog = ((ca0) obj).w0;
                Objects.requireNonNull(dialog);
                dialog.dismiss();
                break;
            case 11:
                yd0 yd0Var = (yd0) obj;
                zd0 zd0Var = yd0Var.v;
                int iC = yd0Var.c();
                if (iC >= 0 && iC < zd0Var.r.size()) {
                    sp3 sp3Var = (sp3) zd0Var.r.get(iC);
                    if (((bl2) zd0Var.s) != null) {
                        String str2 = sp3Var.f;
                        if (str2 != null) {
                            App.f(false).c().e(str2).enqueue(new gp3(i3, new xd0(i2, yd0Var, sp3Var), str2));
                        } else {
                            yd0Var.s(sp3Var);
                        }
                        break;
                    }
                }
                break;
            case 12:
                uq0 uq0Var = (uq0) obj;
                Bundle bundle8 = new Bundle();
                vq0 vq0Var = uq0Var.v;
                bundle8.putParcelable("TRACK_OBJECT", (Parcelable) vq0Var.r.get(uq0Var.c()));
                bundle8.putBoolean("MEDIA_MIX", true);
                vq0Var.q.onMediaClick(bundle8);
                break;
            case 13:
                ((ix0) obj).t();
                break;
            case 14:
                ((FilterFragment) obj).l0.T.o();
                break;
            case 15:
                dh1 dh1Var = (dh1) obj;
                Bundle bundleH = b11.h("MEDIA_BY_GENRE", "MEDIA_BY_GENRE");
                zd0 zd0Var2 = dh1Var.v;
                bundleH.putParcelable("GENRE_OBJECT", (Parcelable) zd0Var2.r.get(dh1Var.c()));
                ((LibraryFragment) zd0Var2.s).onGenreClick(bundleH);
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                eh1 eh1Var = (eh1) obj;
                Bundle bundleH2 = b11.h("MEDIA_BY_GENRE", "MEDIA_BY_GENRE");
                ej ejVar2 = eh1Var.v;
                bundleH2.putParcelable("GENRE_OBJECT", (Parcelable) ejVar2.r.get(eh1Var.c()));
                ((GenreCatalogueFragment) ejVar2.t).onGenreClick(bundleH2);
                break;
            case 17:
                App.b().getClass();
                App.c().edit().putBoolean("music_directory_section_visibility", true).apply();
                ((l92) obj).run();
                break;
            case 18:
                ((rm3) obj).z();
                break;
            case 19:
                hp1 hp1Var = (hp1) obj;
                new eu3(hp1Var).m0(hp1Var.m0.k(), null);
                break;
            case 20:
                ux3 ux3Var = HubShareActivity.P;
                ((HubShareActivity) obj).finish();
                break;
            case 21:
                ((IndexFragment) obj).m0.T.o();
                break;
            case 22:
                int i4 = LanPlaybackActivity.N;
                ((LanPlaybackActivity) obj).finish();
                break;
            case 23:
                int i5 = LoginActivity.R;
                ((LoginActivity) obj).finish();
                break;
            case 24:
                LoginFragment loginFragment = (LoginFragment) obj;
                Intent intent = new Intent(loginFragment.X(), (Class<?>) LoginActivity.class);
                intent.putExtra("HIDE_TAB_LAYOUT", true);
                intent.putExtra("HIDE_TOPAPPBAR_LAYOUT", false);
                intent.putExtra("SELECT_FRAGMENT", 3);
                loginFragment.g0(intent);
                break;
            case 25:
                ((fa) obj).invoke();
                break;
            case 26:
                xh2 xh2Var = (xh2) obj;
                xh2Var.W0.setEnabled(xh2Var.n0().n != null);
                xh2Var.U0.toggle();
                i2 = xh2Var.N0 != 1 ? 1 : 0;
                xh2Var.N0 = i2;
                CheckableImageButton checkableImageButton = xh2Var.U0;
                xh2Var.U0.setContentDescription(i2 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
                xh2Var.r0();
                break;
            case 27:
                ((ep2) obj).dismiss();
                break;
            case 28:
                ee3 ee3Var = (ee3) obj;
                EditText editText2 = ee3Var.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = ee3Var.f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        i2 = 1;
                    }
                    EditText editText4 = ee3Var.f;
                    if (i2 != 0) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        ee3Var.f.setSelection(selectionEnd);
                    }
                    ee3Var.p();
                    break;
                }
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                String str3 = playerControlView.C0;
                Drawable drawable = playerControlView.A0;
                String str4 = playerControlView.B0;
                Drawable drawable2 = playerControlView.z0;
                boolean z = playerControlView.E0;
                boolean z2 = !z;
                if (z != z2) {
                    playerControlView.E0 = z2;
                    ImageView imageView = playerControlView.R;
                    if (imageView != null) {
                        if (z) {
                            imageView.setImageDrawable(drawable);
                            imageView.setContentDescription(str3);
                        } else {
                            imageView.setImageDrawable(drawable2);
                            imageView.setContentDescription(str4);
                        }
                    }
                    ImageView imageView2 = playerControlView.S;
                    if (imageView2 != null) {
                        if (!z) {
                            imageView2.setImageDrawable(drawable2);
                            imageView2.setContentDescription(str4);
                        } else {
                            imageView2.setImageDrawable(drawable);
                            imageView2.setContentDescription(str3);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
