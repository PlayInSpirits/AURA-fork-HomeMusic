.class public Lcom/eddyizm/tempus/ui/fragment/HomeFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Lhd5;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lom1;

.field public o0:Lcom/google/android/material/appbar/MaterialToolbar;

.field public p0:Lcom/google/android/material/appbar/AppBarLayout;

.field public q0:Lcom/google/android/material/tabs/TabLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iget-object p3, p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->n0:Lom1;

    .line 12
    .line 13
    const p3, 0x7f0d006f

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const p2, 0x7f0a02b0

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    check-cast p3, Landroidx/viewpager2/widget/ViewPager2;

    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    new-instance p2, Lhd5;

    .line 33
    .line 34
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 35
    .line 36
    const/16 v0, 0x9

    .line 37
    .line 38
    invoke-direct {p2, v0, p1, p3}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "Missing required view with ID: "

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->J()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 2
    .line 3
    iget-object p1, p1, Lhd5;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 6
    .line 7
    const p2, 0x7f0a061c

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->p0:Lcom/google/android/material/appbar/AppBarLayout;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 19
    .line 20
    iget-object p1, p1, Lhd5;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 23
    .line 24
    const p2, 0x7f0a061b

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->o0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 34
    .line 35
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->n0:Lom1;

    .line 41
    .line 42
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->o0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 45
    .line 46
    invoke-virtual {p1, p2, v0}, Lom1;->n(Ldf;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->o0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    const v0, 0x7f06036c

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lcom/google/android/material/tabs/TabLayout;

    .line 78
    .line 79
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-direct {p1, p2}, Lcom/google/android/material/tabs/TabLayout;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->q0:Lcom/google/android/material/tabs/TabLayout;

    .line 87
    .line 88
    const/4 p2, 0x0

    .line 89
    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->setTabGravity(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->q0:Lcom/google/android/material/tabs/TabLayout;

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setTabMode(I)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->p0:Lcom/google/android/material/appbar/AppBarLayout;

    .line 99
    .line 100
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->q0:Lcom/google/android/material/tabs/TabLayout;

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Llo1;

    .line 106
    .line 107
    invoke-direct {p1, p0}, Llo1;-><init>(Lcom/eddyizm/tempus/ui/fragment/HomeFragment;)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Lcp1;

    .line 111
    .line 112
    invoke-direct {v1}, Lcp1;-><init>()V

    .line 113
    .line 114
    .line 115
    const v2, 0x7f130172

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    const v3, 0x7f080153

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v3, v1, v2}, Llo1;->w(ILkc1;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v2, "podcast_section_visibility"

    .line 140
    .line 141
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_0

    .line 146
    .line 147
    new-instance v1, Lgp1;

    .line 148
    .line 149
    invoke-direct {v1}, Lgp1;-><init>()V

    .line 150
    .line 151
    .line 152
    const v3, 0x7f130173

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    const v4, 0x7f080130

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v4, v1, v3}, Llo1;->w(ILkc1;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_0
    const-string v1, "radio_section_visibility"

    .line 166
    .line 167
    invoke-static {v1, v0}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_1

    .line 172
    .line 173
    new-instance v3, Lhp1;

    .line 174
    .line 175
    invoke-direct {v3}, Lhp1;-><init>()V

    .line 176
    .line 177
    .line 178
    const v4, 0x7f130174

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v4}, Lkc1;->s(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    const v5, 0x7f08020b

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v5, v3, v4}, Llo1;->w(ILkc1;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_1
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 192
    .line 193
    iget-object v3, v3, Lhd5;->p:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 196
    .line 197
    invoke-virtual {v3, p1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Ldw3;)V

    .line 198
    .line 199
    .line 200
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 201
    .line 202
    iget-object v3, v3, Lhd5;->p:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 205
    .line 206
    const/4 v4, 0x3

    .line 207
    invoke-virtual {v3, v4}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 208
    .line 209
    .line 210
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 211
    .line 212
    iget-object v3, v3, Lhd5;->p:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 215
    .line 216
    invoke-virtual {v3, p2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 217
    .line 218
    .line 219
    new-instance v3, Ljw;

    .line 220
    .line 221
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->q0:Lcom/google/android/material/tabs/TabLayout;

    .line 222
    .line 223
    iget-object v5, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 224
    .line 225
    iget-object v5, v5, Lhd5;->p:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v5, Landroidx/viewpager2/widget/ViewPager2;

    .line 228
    .line 229
    new-instance v6, Lcn;

    .line 230
    .line 231
    const/16 v7, 0xf

    .line 232
    .line 233
    invoke-direct {v6, v7, p1}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-direct {v3, v4, v5, v6}, Ljw;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcn;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Ljw;->l()V

    .line 240
    .line 241
    .line 242
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->q0:Lcom/google/android/material/tabs/TabLayout;

    .line 243
    .line 244
    invoke-static {v2, v0}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-nez v2, :cond_3

    .line 249
    .line 250
    invoke-static {v1, v0}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_2

    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_2
    const/16 p2, 0x8

    .line 258
    .line 259
    :cond_3
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 260
    .line 261
    .line 262
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Lhd5;

    .line 263
    .line 264
    iget-object p1, p1, Lhd5;->p:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 267
    .line 268
    new-instance p2, Lq80;

    .line 269
    .line 270
    const/4 v0, 0x2

    .line 271
    invoke-direct {p2, v0, p0}, Lq80;-><init>(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object p0, p1, Landroidx/viewpager2/widget/ViewPager2;->p:Lq80;

    .line 275
    .line 276
    iget-object p0, p0, Lq80;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p0, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    return-void
.end method
