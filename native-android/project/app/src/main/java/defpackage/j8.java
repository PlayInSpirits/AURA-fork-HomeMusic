package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.radiobrowser.RadioBrowserStation;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.AlbumInfo;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistInfo2;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ j8(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        int i = this.n;
        int i2 = 2;
        int i3 = 10;
        int i4 = 1;
        int i5 = 0;
        str = null;
        String str = null;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                AlbumPageFragment albumPageFragment = (AlbumPageFragment) obj2;
                int year = ((AlbumID3) obj).getYear();
                ik ikVarH = year > 0 ? l93.h("year", String.valueOf(year)) : null;
                if (ikVarH != null) {
                    albumPageFragment.m0.F(ikVarH, true);
                }
                break;
            case 1:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(((AlbumInfo) obj).getLastFmUrl()));
                ((AlbumPageFragment) obj2).g0(intent);
                break;
            case 2:
                ArtistBottomSheetDialog artistBottomSheetDialog = (ArtistBottomSheetDialog) obj2;
                String str2 = (String) obj;
                MainActivity mainActivity = (MainActivity) artistBottomSheetDialog.e();
                artistBottomSheetDialog.h0();
                if (mainActivity != null) {
                    b.m(mainActivity, str2, WaveOrigin.ARTIST_MENU);
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArtistPageFragment artistPageFragment = (ArtistPageFragment) obj2;
                List list = (List) obj;
                Bundle bundleH = b11.h("ALBUM_LIST_TITLE", artistPageFragment.s(R.string.artist_page_title_appears_on_section));
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AlbumID3) it.next()).strippedForNav());
                }
                bundleH.putParcelableArrayList("ALBUMS_OBJECT", arrayList);
                gb.x(artistPageFragment.a0()).m(R.id.albumListPageFragment, bundleH, null);
                break;
            case 4:
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(((ArtistInfo2) obj).getLastFmUrl()));
                ((ArtistPageFragment) obj2).g0(intent2);
                break;
            case 5:
                b.m(((ArtistPageFragment) obj2).m0, (String) obj, WaveOrigin.ARTIST_PAGE);
                break;
            case 6:
                f50 f50Var = (f50) obj2;
                Bundle bundle = new Bundle();
                bundle.putString("color_key", (String) ((jx3) obj).n);
                f50Var.q().Z("dialog_result_key", bundle);
                f50Var.i0(false, false);
                break;
            case 7:
                int i6 = DefaultErrorActivity.N;
                sg0.d((DefaultErrorActivity) obj2, (oz) obj);
                break;
            case 8:
                new Thread(new lf(((jo0) obj2).Z(), i2)).start();
                ((f9) obj).dismiss();
                break;
            case 9:
                FilterFragment filterFragment = (FilterFragment) obj2;
                Bundle bundle2 = (Bundle) obj;
                if (filterFragment.n0.d.size() <= 1) {
                    Toast.makeText(filterFragment.Z(), filterFragment.s(R.string.filter_info_selection), 0).show();
                } else {
                    filterFragment.l0.T.m(R.id.action_filterFragment_to_songListPageFragment, bundle2, null);
                }
                break;
            case 10:
                mo1 mo1Var = (mo1) obj;
                ClickCallback clickCallback = ((q7) obj2).u;
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("PLAYLIST_OBJECT", (Parcelable) mo1Var.x.t.get(mo1Var.c()));
                clickCallback.onPlaylistClick(bundle3);
                break;
            case 11:
                SongBottomSheetDialog songBottomSheetDialog = (SongBottomSheetDialog) obj2;
                ld1 ld1VarQ = songBottomSheetDialog.q();
                songBottomSheetDialog.h0();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("TRACK_OBJECT", (Child) obj);
                ld1VarQ.Z("homemusic_remove_from_liked", bundle4);
                break;
            case 12:
                ur1.a.execute(new k6(29, (fx3) obj2, (String) obj));
                break;
            case 13:
                wj3 wj3Var = (wj3) obj;
                Context context = ((View) obj2).getContext();
                context.getClass();
                qi3 qi3VarH = a.h();
                if (qi3VarH == null) {
                    qi3 qi3Var = (qi3) wj3Var.get();
                    if (qi3Var != null) {
                        qi3Var.s(!qi3Var.D0());
                    }
                    break;
                } else if (!a.d) {
                    boolean zD0 = qi3VarH.D0();
                    Object[] objArr = a.b != null;
                    od4.n.getClass();
                    od4 od4Var = od4.o;
                    od4 od4Var2 = od4.p;
                    od4 od4Var3 = od4.q;
                    od4 od4Var4 = objArr == true ? od4Var3 : zD0 ? od4Var2 : od4Var;
                    Object[] objArr2 = a.i(qi3VarH) != null;
                    int iOrdinal = od4Var4.ordinal();
                    if (iOrdinal == 0) {
                        od4Var = od4Var2;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            er1.n();
                        }
                    } else if (objArr2 != false) {
                        od4Var = od4Var3;
                    }
                    int iOrdinal2 = od4Var.ordinal();
                    if (iOrdinal2 == 0) {
                        if (od4Var4 == od4Var3) {
                            a.g(qi3VarH);
                        }
                        qi3VarH.s(false);
                        ud3.y0(false);
                    } else if (iOrdinal2 == 1) {
                        qi3VarH.s(true);
                    } else if (iOrdinal2 != 2) {
                        er1.n();
                        break;
                    } else {
                        ud3.y0(true);
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        String strI = a.i(qi3VarH);
                        ArrayList arrayListE = a.e(qi3VarH);
                        int iO0 = qi3VarH.o0();
                        if (strI == null || iO0 < 0 || iO0 >= arrayListE.size()) {
                            Toast.makeText(applicationContext, R.string.homemusic_smart_unavailable_list, 0).show();
                            qi3VarH.s(false);
                        } else {
                            ArrayList arrayList2 = new ArrayList(r40.k0(arrayListE, 10));
                            int size = arrayListE.size();
                            int i7 = 0;
                            while (i7 < size) {
                                Object obj3 = arrayListE.get(i7);
                                i7++;
                                arrayList2.add(((gn2) obj3).a);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i8 = 0;
                            while (i8 < size2) {
                                Object obj4 = arrayList2.get(i8);
                                i8++;
                                String str3 = (String) obj4;
                                rs1 rs1Var = rs1.a;
                                str3.getClass();
                                if (rs1.c(str3).equals(strI)) {
                                    arrayList3.add(obj4);
                                }
                            }
                            SmartContexts smartContexts = SmartContexts.INSTANCE;
                            ArrayList arrayList4 = new ArrayList(r40.k0(arrayList3, 10));
                            int size3 = arrayList3.size();
                            while (i5 < size3) {
                                Object obj5 = arrayList3.get(i5);
                                i5++;
                                arrayList4.add(smartContexts.hubId((String) obj5));
                            }
                            String str4 = ((gn2) arrayListE.get(iO0)).a;
                            String str5 = arrayList3.contains(str4) ? str4 : null;
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            Toast.makeText(applicationContext2, R.string.homemusic_smart_starting, 1).show();
                            a.d = true;
                            a.c();
                            io1.a.execute(new up(strI, arrayList4, str5, WaveOrigin.PLAYER, applicationContext2, (String) null));
                        }
                    }
                    a.c();
                    break;
                }
                break;
            case 14:
                View view2 = (View) obj;
                Child child = (Child) ((ad2) obj2).d();
                if (child != null) {
                    Context context2 = view2.getContext();
                    context2.getClass();
                    String id = child.getId();
                    WeakReference weakReference = a.a;
                    id.getClass();
                    SmartSession smartSession = a.b;
                    if (smartSession != null && smartSession.isRec(id)) {
                        Context applicationContext3 = context2.getApplicationContext();
                        qi3 qi3VarH2 = a.h();
                        if (qi3VarH2 != null) {
                            gn2 gn2VarA = qi3VarH2.a();
                            if (h12.c(gn2VarA != null ? gn2VarA.a : null, id) && qi3VarH2.f0()) {
                                qi3VarH2.c0();
                            }
                        }
                        io1.a.execute(new ct1(smartSession, id, applicationContext3, i4));
                    }
                }
                break;
            case 15:
                PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) obj2;
                xf4 xf4Var = new xf4();
                xf4Var.B0 = new pz1(playerControllerFragment, (bj2) obj);
                xf4Var.m0(playerControllerFragment.X().k(), null);
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                PlayerControllerFragment playerControllerFragment2 = (PlayerControllerFragment) obj2;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable("ARTIST_OBJECT", (ArtistID3) obj);
                q05.l(playerControllerFragment2).m(R.id.artistPageFragment, bundle5, null);
                playerControllerFragment2.K0.q();
                break;
            case 17:
                PlayerControllerFragment playerControllerFragment3 = (PlayerControllerFragment) obj2;
                playerControllerFragment3.L0.h(playerControllerFragment3.Z(), (Child) obj);
                break;
            case 18:
                PlayerControllerFragment playerControllerFragment4 = (PlayerControllerFragment) obj2;
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("ALBUM_OBJECT", (AlbumID3) obj);
                q05.l(playerControllerFragment4).m(R.id.albumPageFragment, bundle6, null);
                playerControllerFragment4.K0.q();
                break;
            case 19:
                new uv4((do2) obj).m0(((PlayerControllerFragment) obj2).K0.k(), null);
                break;
            case 20:
                yk3 yk3Var = (yk3) obj2;
                xk3 xk3Var = (xk3) obj;
                if (!u52.c().a) {
                    yk3Var.r.f(new ur2(i3, yk3Var, xk3Var), gq0.n);
                    break;
                } else {
                    int iC = xk3Var.c();
                    if (iC != -1) {
                        v52 v52VarC = u52.c();
                        if (iC != v52VarC.o) {
                            u52.q("select", iC, iC);
                        } else {
                            u52.a(v52VarC.k ? "pause" : "play", 0L);
                        }
                        break;
                    }
                }
                break;
            case 21:
                RadioBrowserStation radioBrowserStation = (RadioBrowserStation) obj;
                eu3 eu3Var = (eu3) ((ss2) ((zd0) obj2).s).o;
                String str6 = radioBrowserStation.urlResolved;
                if (str6 == null) {
                    str6 = radioBrowserStation.url;
                }
                ((TextInputEditText) eu3Var.B0.f).setText(radioBrowserStation.name);
                ((TextInputEditText) eu3Var.B0.g).setText(str6);
                ((TextInputEditText) eu3Var.B0.e).setText(radioBrowserStation.homepage);
                String str7 = radioBrowserStation.favicon;
                if (str7 != null && !str7.isEmpty()) {
                    str = radioBrowserStation.favicon;
                }
                ((TextInputEditText) eu3Var.B0.d).setText(str);
                eu3Var.I0.dismiss();
                break;
            case 22:
                f9 f9Var = (f9) obj;
                MainActivity mainActivity2 = (MainActivity) ((sa4) obj2).e();
                if (mainActivity2 != null) {
                    mainActivity2.H();
                }
                f9Var.dismiss();
                break;
            case 23:
                ((View.OnClickListener) obj).onClick(view);
                ((qg4) obj2).a(1);
                break;
            case 24:
                f9 f9Var2 = (f9) obj;
                ud3.z0(false);
                rb4 rb4Var = (rb4) ((zk4) obj2).D0;
                if (rb4Var != null) {
                    rb4Var.run();
                }
                f9Var2.dismiss();
                break;
            case 25:
                f9 f9Var3 = (f9) obj;
                xa3.t("sync_starred_artists_for_offline_use", false);
                rb4 rb4Var2 = (rb4) ((zk4) obj2).D0;
                if (rb4Var2 != null) {
                    rb4Var2.run();
                }
                f9Var3.dismiss();
                break;
            case 26:
                f9 f9Var4 = (f9) obj;
                ud3.A0(false);
                rb4 rb4Var3 = (rb4) ((zk4) obj2).D0;
                if (rb4Var3 != null) {
                    rb4Var3.run();
                }
                f9Var4.dismiss();
                break;
            default:
                uv4 uv4Var = (uv4) obj2;
                ik ikVar = (ik) obj;
                uv4Var.i0(true, false);
                ((MainActivity) uv4Var.X()).F(ikVar, !"song".equals(ikVar.c));
                break;
        }
    }
}
