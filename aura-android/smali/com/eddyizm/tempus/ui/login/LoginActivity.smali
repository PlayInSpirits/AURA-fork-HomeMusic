.class public final Lcom/eddyizm/tempus/ui/login/LoginActivity;
.super Ldf;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic R:I


# instance fields
.field public N:Lna4;

.field public O:Z

.field public P:Z

.field public Q:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldf;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->P:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-static {p0}, Ljz4;->r(Ldf;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lnc1;->onCreate(Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lxy0;->a(Ldf;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const v0, 0x7f0d001e

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const v0, 0x7f0a00d6

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lcom/google/android/material/appbar/AppBarLayout;

    .line 31
    .line 32
    if-eqz v3, :cond_a

    .line 33
    .line 34
    move-object v5, p1

    .line 35
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 36
    .line 37
    const v0, 0x7f0a05e1

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    move-object v7, v3

    .line 45
    check-cast v7, Lcom/google/android/material/tabs/TabLayout;

    .line 46
    .line 47
    if-eqz v7, :cond_a

    .line 48
    .line 49
    const v0, 0x7f0a0620

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v8, v3

    .line 57
    check-cast v8, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 58
    .line 59
    if-eqz v8, :cond_a

    .line 60
    .line 61
    const v0, 0x7f0a0654

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    move-object v9, v3

    .line 69
    check-cast v9, Landroidx/viewpager2/widget/ViewPager2;

    .line 70
    .line 71
    if-eqz v9, :cond_a

    .line 72
    .line 73
    new-instance v4, Lna4;

    .line 74
    .line 75
    move-object v6, v5

    .line 76
    invoke-direct/range {v4 .. v9}, Lna4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 80
    .line 81
    invoke-virtual {p0, v5}, Ldf;->setContentView(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v0, "HIDE_TAB_LAYOUT"

    .line 89
    .line 90
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput-boolean p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->O:Z

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const-string v0, "HIDE_TOPAPPBAR_LAYOUT"

    .line 101
    .line 102
    const/4 v3, 0x1

    .line 103
    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iput-boolean p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->P:Z

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v0, "SELECT_FRAGMENT"

    .line 114
    .line 115
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iput p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->Q:I

    .line 120
    .line 121
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 122
    .line 123
    const-string v0, "binding"

    .line 124
    .line 125
    if-eqz p1, :cond_9

    .line 126
    .line 127
    iget-object p1, p1, Lna4;->n:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 130
    .line 131
    new-instance v3, Ler1;

    .line 132
    .line 133
    const/16 v4, 0xf

    .line 134
    .line 135
    invoke-direct {v3, v4}, Ler1;-><init>(I)V

    .line 136
    .line 137
    .line 138
    sget-object v4, Lj65;->a:Ljava/util/WeakHashMap;

    .line 139
    .line 140
    invoke-static {p1, v3}, La65;->c(Landroid/view/View;Lr83;)V

    .line 141
    .line 142
    .line 143
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->P:Z

    .line 144
    .line 145
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 146
    .line 147
    const/16 v4, 0x8

    .line 148
    .line 149
    if-eqz p1, :cond_1

    .line 150
    .line 151
    if-eqz v3, :cond_0

    .line 152
    .line 153
    iget-object p1, v3, Lna4;->p:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 156
    .line 157
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_0
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :cond_1
    if-eqz v3, :cond_8

    .line 166
    .line 167
    iget-object p1, v3, Lna4;->p:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 170
    .line 171
    new-instance v3, Lp6;

    .line 172
    .line 173
    const/16 v5, 0x17

    .line 174
    .line 175
    invoke-direct {v3, v5, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    .line 180
    .line 181
    :goto_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 182
    .line 183
    if-eqz p1, :cond_7

    .line 184
    .line 185
    iget-object p1, p1, Lna4;->q:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 188
    .line 189
    new-instance v3, Lhe2;

    .line 190
    .line 191
    invoke-direct {v3, p0, p0}, Lhe2;-><init>(Lcom/eddyizm/tempus/ui/login/LoginActivity;Lcom/eddyizm/tempus/ui/login/LoginActivity;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Ldw3;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 198
    .line 199
    if-eqz p1, :cond_6

    .line 200
    .line 201
    iget-object p1, p1, Lna4;->q:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 204
    .line 205
    iget v3, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->Q:I

    .line 206
    .line 207
    invoke-virtual {p1, v3, v2}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 208
    .line 209
    .line 210
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->O:Z

    .line 211
    .line 212
    if-eqz p1, :cond_4

    .line 213
    .line 214
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 215
    .line 216
    if-eqz p1, :cond_3

    .line 217
    .line 218
    iget-object p1, p1, Lna4;->o:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    .line 221
    .line 222
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 223
    .line 224
    .line 225
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 226
    .line 227
    if-eqz p1, :cond_2

    .line 228
    .line 229
    iget-object p1, p1, Lna4;->q:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 232
    .line 233
    invoke-virtual {p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 234
    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_2
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v1

    .line 241
    :cond_3
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :cond_4
    :goto_1
    new-instance p1, Ljw;

    .line 246
    .line 247
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->N:Lna4;

    .line 248
    .line 249
    if-eqz v2, :cond_5

    .line 250
    .line 251
    iget-object v0, v2, Lna4;->o:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    .line 254
    .line 255
    iget-object v1, v2, Lna4;->q:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 258
    .line 259
    new-instance v2, Lcn;

    .line 260
    .line 261
    const/16 v3, 0x15

    .line 262
    .line 263
    invoke-direct {v2, v3, p0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-direct {p1, v0, v1, v2}, Ljw;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcn;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1}, Ljw;->l()V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_5
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v1

    .line 277
    :cond_6
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v1

    .line 281
    :cond_7
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v1

    .line 285
    :cond_8
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v1

    .line 289
    :cond_9
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v1

    .line 293
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    const-string p1, "Missing required view with ID: "

    .line 302
    .line 303
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method
