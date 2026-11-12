/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  android.widget.Toast
 */
package com.eddyizm.tempus.ui.fragment;

import defpackage.*;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.helper.recyclerview.FastScrollbar;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class IndexFragment
extends kc1
implements ClickCallback {
    public ey l0;
    public MainActivity m0;
    public wx1 n0;
    public b03 o0;
    public bl2 p0;
    public om0 q0;
    public MusicFolder r0;
    public List s0 = new ArrayList();

    @Override
    public final View H(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        this.m0 = (MainActivity)this.l();
        viewGroup = object.inflate(2131558517, viewGroup, false);
        int n16 = 2131362010;
        Object object3 = (AppBarLayout)uo.s((View)viewGroup, 2131362010);
        if (object3 != null) {
            n16 = 2131362370;
            FastScrollbar fastScrollbar = (FastScrollbar)uo.s((View)viewGroup, 2131362370);
            if (fastScrollbar != null) {
                n16 = 2131362447;
                TextInputEditText textInputEditText = (TextInputEditText)uo.s((View)viewGroup, 2131362447);
                if (textInputEditText != null) {
                    n16 = 2131362448;
                    object = (TextView)uo.s((View)viewGroup, 2131362448);
                    if (object != null) {
                        n16 = 2131362449;
                        if ((TextInputLayout)uo.s((View)viewGroup, 2131362449) != null) {
                            n16 = 2131362568;
                            object2 = (ConstraintLayout)uo.s((View)viewGroup, 2131362568);
                            if (object2 != null) {
                                n16 = 2131362569;
                                RecyclerView recyclerView = (RecyclerView)uo.s((View)viewGroup, 2131362569);
                                if (recyclerView != null) {
                                    n16 = 2131362570;
                                    TextView textView = (TextView)uo.s((View)viewGroup, 2131362570);
                                    if (textView != null) {
                                        n16 = 2131363355;
                                        MaterialToolbar materialToolbar = (MaterialToolbar)uo.s((View)viewGroup, 2131363355);
                                        if (materialToolbar != null) {
                                            viewGroup = (LinearLayout)viewGroup;
                                            this.l0 = new ey((LinearLayout)viewGroup, (View)object3, (View)fastScrollbar, (TextView)textInputEditText, (TextView)object, (View)object2, (View)recyclerView, textView, (View)materialToolbar);
                                            object = this.X();
                                            object3 = ((l70)object).d();
                                            object2 = gh0.r((f75)object);
                                            object = new bq4((e75)object3, (b75)object2, b11.e((nc1)object, (b75)object2));
                                            object3 = kx3.a(wx1.class);
                                            object2 = ((i30)object3).b();
                                            if (object2 != null) {
                                                this.n0 = (wx1)((bq4)object).l((i30)object3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2));
                                                this.q0 = new om0(5);
                                                object = this.s;
                                                object = object != null ? (MusicFolder)object.getParcelable("MUSIC_FOLDER_OBJECT") : null;
                                                this.r0 = object;
                                                this.m0.o((MaterialToolbar)((Object)this.l0.h));
                                                if (this.m0.n() != null) {
                                                    this.m0.n().f0(true);
                                                    this.m0.n().g0();
                                                }
                                                ((MaterialToolbar)((Object)this.l0.h)).setNavigationOnClickListener(new p6(21, this));
                                                ((AppBarLayout)this.l0.a).a(new u7(6, this));
                                                object = (RecyclerView)this.l0.f;
                                                this.Z();
                                                ((RecyclerView)object).setLayoutManager(new LinearLayoutManager(1));
                                                ((RecyclerView)this.l0.f).setHasFixedSize(true);
                                                this.o0 = object = new b03(this);
                                                ((RecyclerView)this.l0.f).setAdapter((dw3)object);
                                                object2 = this.n0;
                                                object = this.r0;
                                                object = object != null ? ((MusicFolder)object).getId() : null;
                                                object2.c.getClass();
                                                object2 = new ad2();
                                                object3 = App.f(false).c();
                                                object3.getClass();
                                                Log.d((String)"BrowsingClient", (String)"getIndexes()");
                                                ((ov)((gp3)object3).p).b(((pn4)((gp3)object3).o).f(), (String)object, null).enqueue(new q8((k03)object2, 2));
                                                object2.e(this.v(), new d8(13, this));
                                                object2 = (TextInputEditText)this.l0.c;
                                                object = new x(18, this);
                                                object3 = qn1.a;
                                                object2.addTextChangedListener((TextWatcher)new pn1(0, object));
                                                object2.setOnEditorActionListener((TextView.OnEditorActionListener)new Object());
                                                object = this.l0;
                                                ((FastScrollbar)((Object)((ey)object).b)).setRecyclerView((RecyclerView)((ey)object).f);
                                                object = (FastScrollbar)((Object)this.l0.b);
                                                LayoutInflater.from((Context)object.getContext()).inflate(2131558585, (ViewGroup)object, true);
                                                object2 = (TextView)object.findViewById(2131362371);
                                                ((FastScrollbar)((Object)object)).n = object2;
                                                if (object2 != null) {
                                                    object2.setVisibility(4);
                                                }
                                                ((FastScrollbar)((Object)object)).o = object.findViewById(2131362372);
                                                object = this.r0;
                                                if (object != null) {
                                                    this.n0.d = object;
                                                    ((TextView)this.l0.g).setText((CharSequence)((MusicFolder)object).getName());
                                                }
                                                return viewGroup;
                                            }
                                            kf2.n("Local and anonymous classes can not be ViewModels");
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(n16)));
        return null;
    }

    @Override
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override
    public final void R() {
        this.R = true;
        Context context = this.Z();
        cb4 cb42 = new cb4(this.Z(), new ComponentName(this.Z(), MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        Object object = new Object();
        Looper looper = f35.x();
        bl2 bl22 = new bl2(looper);
        xc5 xc52 = cb42.a.e() ? new xc5(4, new fi0(new x7(context))) : null;
        b11.w(bl22, (bj2)new sk2(context, cb42, bundle, (qk2)object, looper, bl22, xc52), new Handler(looper));
        this.p0 = bl22;
    }

    @Override
    public final void S() {
        sk2.Z0(this.p0);
        this.R = true;
    }

    public final void h0() {
        Object object = this.l0;
        if (object == null) {
            return;
        }
        object = ((TextInputEditText)((ey)object).c).getText() != null ? ((TextInputEditText)this.l0.c).getText().toString() : "";
        b03 b032 = this.o0;
        List list = this.s0;
        TextView textView = (TextView)this.l0.d;
        Object object2 = qn1.a;
        list.getClass();
        object.getClass();
        if (qm4.u0((CharSequence)object)) {
            object2 = list;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = list.iterator();
            while (true) {
                object2 = arrayList;
                if (!iterator.hasNext()) break;
                Object t16 = iterator.next();
                Object object3 = (Artist)t16;
                object2 = qn1.a;
                object2 = object3 = ((Artist)object3).getName();
                if (object3 == null) {
                    object2 = "";
                }
                if (!qn1.a((String)object2, (String)object)) continue;
                arrayList.add(t16);
            }
        }
        int n16 = object2.isEmpty() && !qm4.u0((CharSequence)object) && !list.isEmpty() ? 0 : 8;
        textView.setVisibility(n16);
        b032.r = object2;
        b032.d();
    }

    @Override
    public final void onMusicIndexClick(Bundle bundle) {
        gb.x(this.a0()).m(2131362221, bundle, null);
    }

    @Override
    public final void onMusicIndexPlay(Bundle object) {
        String string = object.getString("MUSIC_DIRECTORY_ID");
        if (string != null) {
            Toast.makeText((Context)this.Z(), (CharSequence)this.s(2131951962), (int)0).show();
            object = new ArrayList();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            tx1 tx12 = new tx1(this, (ArrayList)object, 0);
            atomicInteger.incrementAndGet();
            this.q0.getClass();
            om0.W(string).e(this.v(), new oq0(this, (AbstractList)object, atomicInteger, tx12, 1));
        }
    }
}

