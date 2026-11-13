.class public Lcom/eddyizm/tempus/ui/fragment/IndexFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/ey;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/wx1;

.field public o0:Ldefpackage/b03;

.field public p0:Ldefpackage/bl2;

.field public q0:Ldefpackage/om0;

.field public r0:Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

.field public s0:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->s0:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0075

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0a00da

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    move-object v3, p3

    .line 25
    check-cast v3, Lcom/google/android/material/appbar/AppBarLayout;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    if-eqz v3, :cond_6

    .line 29
    .line 30
    const p2, 0x7f0a0242

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v4, v1

    .line 38
    check-cast v4, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;

    .line 39
    .line 40
    if-eqz v4, :cond_6

    .line 41
    .line 42
    const p2, 0x7f0a028f

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v5, v1

    .line 50
    check-cast v5, Lcom/google/android/material/textfield/TextInputEditText;

    .line 51
    .line 52
    if-eqz v5, :cond_6

    .line 53
    .line 54
    const p2, 0x7f0a0290

    .line 55
    .line 56
    .line 57
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v6, v1

    .line 62
    check-cast v6, Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v6, :cond_6

    .line 65
    .line 66
    const p2, 0x7f0a0291

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    const p2, 0x7f0a0308

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    move-object v7, v1

    .line 85
    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 86
    .line 87
    if-eqz v7, :cond_6

    .line 88
    .line 89
    const p2, 0x7f0a0309

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v8, v1

    .line 97
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 98
    .line 99
    if-eqz v8, :cond_6

    .line 100
    .line 101
    const p2, 0x7f0a030a

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    move-object v9, v1

    .line 109
    check-cast v9, Landroid/widget/TextView;

    .line 110
    .line 111
    if-eqz v9, :cond_6

    .line 112
    .line 113
    const p2, 0x7f0a061b

    .line 114
    .line 115
    .line 116
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move-object v10, v1

    .line 121
    check-cast v10, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 122
    .line 123
    if-eqz v10, :cond_6

    .line 124
    .line 125
    new-instance v1, Ldefpackage/ey;

    .line 126
    .line 127
    move-object v2, p1

    .line 128
    check-cast v2, Landroid/widget/LinearLayout;

    .line 129
    .line 130
    invoke-direct/range {v1 .. v10}, Ldefpackage/ey;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 134
    .line 135
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    new-instance v3, Ldefpackage/bq4;

    .line 152
    .line 153
    invoke-direct {v3, p2, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 154
    .line 155
    .line 156
    const-class p1, Ldefpackage/wx1;

    .line 157
    .line 158
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    if-eqz p2, :cond_5

    .line 167
    .line 168
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 169
    .line 170
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {v3, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Ldefpackage/wx1;

    .line 179
    .line 180
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->n0:Ldefpackage/wx1;

    .line 181
    .line 182
    new-instance p1, Ldefpackage/om0;

    .line 183
    .line 184
    const/4 p2, 0x5

    .line 185
    invoke-direct {p1, p2}, Ldefpackage/om0;-><init>(I)V

    .line 186
    .line 187
    .line 188
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->q0:Ldefpackage/om0;

    .line 189
    .line 190
    iget-object p1, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 191
    .line 192
    if-eqz p1, :cond_0

    .line 193
    .line 194
    const-string p2, "MUSIC_FOLDER_OBJECT"

    .line 195
    .line 196
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_0
    move-object p1, p3

    .line 204
    :goto_0
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->r0:Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 205
    .line 206
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 207
    .line 208
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 209
    .line 210
    iget-object p2, p2, Ldefpackage/ey;->h:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 213
    .line 214
    invoke-virtual {p1, p2}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 218
    .line 219
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    const/4 p2, 0x1

    .line 224
    if-eqz p1, :cond_1

    .line 225
    .line 226
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 227
    .line 228
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1, p2}, Ldefpackage/l93;->f0(Z)V

    .line 233
    .line 234
    .line 235
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 236
    .line 237
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1}, Ldefpackage/l93;->g0()V

    .line 242
    .line 243
    .line 244
    :cond_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 245
    .line 246
    iget-object p1, p1, Ldefpackage/ey;->h:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 249
    .line 250
    new-instance v1, Ldefpackage/p6;

    .line 251
    .line 252
    const/16 v3, 0x15

    .line 253
    .line 254
    invoke-direct {v1, v3, p0}, Ldefpackage/p6;-><init>(ILjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    .line 259
    .line 260
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 261
    .line 262
    iget-object p1, p1, Ldefpackage/ey;->a:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 265
    .line 266
    new-instance v1, Ldefpackage/u7;

    .line 267
    .line 268
    const/4 v3, 0x6

    .line 269
    invoke-direct {v1, v3, p0}, Ldefpackage/u7;-><init>(ILdefpackage/kc1;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/AppBarLayout;->a(Ldefpackage/af;)V

    .line 273
    .line 274
    .line 275
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 276
    .line 277
    iget-object p1, p1, Ldefpackage/ey;->f:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 280
    .line 281
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 282
    .line 283
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 284
    .line 285
    .line 286
    invoke-direct {v1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 290
    .line 291
    .line 292
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 293
    .line 294
    iget-object p1, p1, Ldefpackage/ey;->f:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 297
    .line 298
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 299
    .line 300
    .line 301
    new-instance p1, Ldefpackage/b03;

    .line 302
    .line 303
    invoke-direct {p1, p0}, Ldefpackage/b03;-><init>(Lcom/eddyizm/tempus/ui/fragment/IndexFragment;)V

    .line 304
    .line 305
    .line 306
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->o0:Ldefpackage/b03;

    .line 307
    .line 308
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 309
    .line 310
    iget-object v1, v1, Ldefpackage/ey;->f:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 313
    .line 314
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 315
    .line 316
    .line 317
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->n0:Ldefpackage/wx1;

    .line 318
    .line 319
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->r0:Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 320
    .line 321
    if-eqz v1, :cond_2

    .line 322
    .line 323
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    goto :goto_1

    .line 328
    :cond_2
    move-object v1, p3

    .line 329
    :goto_1
    iget-object p1, p1, Ldefpackage/wx1;->c:Ldefpackage/om0;

    .line 330
    .line 331
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    new-instance p1, Ldefpackage/k03;

    .line 335
    .line 336
    invoke-direct {p1}, Ldefpackage/ad2;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v3}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    const-string v4, "BrowsingClient"

    .line 351
    .line 352
    const-string v5, "getIndexes()"

    .line 353
    .line 354
    invoke-static {v4, v5}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 355
    .line 356
    .line 357
    iget-object v4, v3, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v4, Ldefpackage/ov;

    .line 360
    .line 361
    iget-object v3, v3, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v3, Ldefpackage/pn4;

    .line 364
    .line 365
    invoke-virtual {v3}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-interface {v4, v3, v1, p3}, Ldefpackage/ov;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)Lretrofit2/Call;

    .line 370
    .line 371
    .line 372
    move-result-object p3

    .line 373
    new-instance v1, Ldefpackage/q8;

    .line 374
    .line 375
    const/4 v3, 0x2

    .line 376
    invoke-direct {v1, p1, v3}, Ldefpackage/q8;-><init>(Ldefpackage/k03;I)V

    .line 377
    .line 378
    .line 379
    invoke-interface {p3, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 383
    .line 384
    .line 385
    move-result-object p3

    .line 386
    new-instance v1, Ldefpackage/d8;

    .line 387
    .line 388
    const/16 v3, 0xd

    .line 389
    .line 390
    invoke-direct {v1, v3, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1, p3, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 394
    .line 395
    .line 396
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 397
    .line 398
    iget-object p1, p1, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 401
    .line 402
    new-instance p3, Ldefpackage/x;

    .line 403
    .line 404
    const/16 v1, 0x12

    .line 405
    .line 406
    invoke-direct {p3, v1, p0}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    sget-object v1, Ldefpackage/qn1;->a:Ldefpackage/ux3;

    .line 410
    .line 411
    new-instance v1, Ldefpackage/pn1;

    .line 412
    .line 413
    invoke-direct {v1, v0, p3}, Ldefpackage/pn1;-><init>(ILjava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 417
    .line 418
    .line 419
    new-instance p3, Ldefpackage/on1;

    .line 420
    .line 421
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 425
    .line 426
    .line 427
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 428
    .line 429
    iget-object p3, p1, Ldefpackage/ey;->b:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast p3, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;

    .line 432
    .line 433
    iget-object p1, p1, Ldefpackage/ey;->f:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 436
    .line 437
    invoke-virtual {p3, p1}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 438
    .line 439
    .line 440
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 441
    .line 442
    iget-object p1, p1, Ldefpackage/ey;->b:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast p1, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;

    .line 445
    .line 446
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 447
    .line 448
    .line 449
    move-result-object p3

    .line 450
    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 451
    .line 452
    .line 453
    move-result-object p3

    .line 454
    const v0, 0x7f0d00b9

    .line 455
    .line 456
    .line 457
    invoke-virtual {p3, v0, p1, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 458
    .line 459
    .line 460
    const p2, 0x7f0a0243

    .line 461
    .line 462
    .line 463
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 464
    .line 465
    .line 466
    move-result-object p2

    .line 467
    check-cast p2, Landroid/widget/TextView;

    .line 468
    .line 469
    iput-object p2, p1, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 470
    .line 471
    if-eqz p2, :cond_3

    .line 472
    .line 473
    const/4 p3, 0x4

    .line 474
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 475
    .line 476
    .line 477
    :cond_3
    const p2, 0x7f0a0244

    .line 478
    .line 479
    .line 480
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 481
    .line 482
    .line 483
    move-result-object p2

    .line 484
    iput-object p2, p1, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 485
    .line 486
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->r0:Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 487
    .line 488
    if-eqz p1, :cond_4

    .line 489
    .line 490
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->n0:Ldefpackage/wx1;

    .line 491
    .line 492
    iput-object p1, p2, Ldefpackage/wx1;->d:Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 493
    .line 494
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 495
    .line 496
    iget-object p0, p0, Ldefpackage/ey;->g:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast p0, Landroid/widget/TextView;

    .line 499
    .line 500
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    .line 506
    .line 507
    :cond_4
    return-object v2

    .line 508
    :cond_5
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 509
    .line 510
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    return-object p3

    .line 514
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    const-string p1, "Missing required view with ID: "

    .line 523
    .line 524
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    return-object p3
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Ldefpackage/cb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Ldefpackage/aj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Ldefpackage/bl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 45
    .line 46
    invoke-interface {v0}, Ldefpackage/bb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Ldefpackage/xc5;

    .line 53
    .line 54
    new-instance v1, Ldefpackage/x7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Ldefpackage/fi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    new-instance v1, Ldefpackage/bj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->p0:Ldefpackage/bl2;

    .line 86
    .line 87
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->p0:Ldefpackage/bl2;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final h0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 9
    .line 10
    invoke-virtual {v0}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, ""

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 19
    .line 20
    iget-object v0, v0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 23
    .line 24
    invoke-virtual {v0}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v0, v1

    .line 34
    :goto_0
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->o0:Ldefpackage/b03;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->s0:Ljava/util/List;

    .line 37
    .line 38
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ldefpackage/ey;

    .line 39
    .line 40
    iget-object p0, p0, Ldefpackage/ey;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Landroid/widget/TextView;

    .line 43
    .line 44
    sget-object v4, Ldefpackage/qn1;->a:Ldefpackage/ux3;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    move-object v4, v3

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_5

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    move-object v7, v6

    .line 80
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 81
    .line 82
    sget-object v8, Ldefpackage/qn1;->a:Ldefpackage/ux3;

    .line 83
    .line 84
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    if-nez v7, :cond_4

    .line 89
    .line 90
    move-object v7, v1

    .line 91
    :cond_4
    invoke-static {v7, v0}, Ldefpackage/qn1;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_6

    .line 118
    .line 119
    const/4 v0, 0x0

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    const/16 v0, 0x8

    .line 122
    .line 123
    :goto_3
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    iput-object v4, v2, Ldefpackage/b03;->r:Ljava/util/List;

    .line 127
    .line 128
    invoke-virtual {v2}, Ldefpackage/dw3;->d()V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final onMusicIndexClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a01ad

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onMusicIndexPlay(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    const-string v0, "MUSIC_DIRECTORY_ID"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f13015a

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 26
    .line 27
    .line 28
    new-instance v5, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-direct {v6, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v7, Ldefpackage/tx1;

    .line 39
    .line 40
    invoke-direct {v7, p0, v5, v2}, Ldefpackage/tx1;-><init>(Lcom/eddyizm/tempus/ui/fragment/IndexFragment;Ljava/util/ArrayList;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->q0:Ldefpackage/om0;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Ldefpackage/om0;->W(Ljava/lang/String;)Ldefpackage/k03;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v3, Ldefpackage/oq0;

    .line 60
    .line 61
    const/4 v8, 0x1

    .line 62
    move-object v4, p0

    .line 63
    invoke-direct/range {v3 .. v8}, Ldefpackage/oq0;-><init>(Ljava/lang/Object;Ljava/util/AbstractList;Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    return-void
.end method
