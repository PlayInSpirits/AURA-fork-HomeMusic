.class public final Lnh2;
.super Lcg3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcg3;"
    }
.end annotation


# instance fields
.field public m0:I

.field public n0:Lze4;

.field public o0:Ldy;

.field public p0:Lix2;

.field public q0:I

.field public r0:Ley;

.field public s0:Landroidx/recyclerview/widget/RecyclerView;

.field public t0:Landroidx/recyclerview/widget/RecyclerView;

.field public u0:Landroid/view/View;

.field public v0:Landroid/view/View;

.field public w0:Landroid/view/View;

.field public x0:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcg3;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lkc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lnh2;->m0:I

    .line 15
    .line 16
    const-string v0, "GRID_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lze4;

    .line 23
    .line 24
    iput-object v0, p0, Lnh2;->n0:Lze4;

    .line 25
    .line 26
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ldy;

    .line 33
    .line 34
    iput-object v0, p0, Lnh2;->o0:Ldy;

    .line 35
    .line 36
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const-string v0, "CURRENT_MONTH_KEY"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lix2;

    .line 51
    .line 52
    iput-object p1, p0, Lnh2;->p0:Lix2;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-static {}, Lkf2;->k()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 1
    new-instance p3, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lnh2;->m0:I

    .line 8
    .line 9
    invoke-direct {p3, v0, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ley;

    .line 13
    .line 14
    invoke-direct {v0, p3}, Ley;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lnh2;->r0:Ley;

    .line 18
    .line 19
    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lnh2;->o0:Ldy;

    .line 24
    .line 25
    iget-object v0, v0, Ldy;->n:Lix2;

    .line 26
    .line 27
    const v1, 0x101020d

    .line 28
    .line 29
    .line 30
    invoke-static {p3, v1}, Lxh2;->q0(Landroid/content/Context;I)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const v2, 0x7f0d00f4

    .line 39
    .line 40
    .line 41
    move v5, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const v2, 0x7f0d00ef

    .line 44
    .line 45
    .line 46
    move v5, v3

    .line 47
    :goto_0
    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const v2, 0x7f07055f

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const v6, 0x7f070560

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    add-int/2addr v6, v2

    .line 74
    const v2, 0x7f07055e

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    add-int/2addr v2, v6

    .line 82
    const v6, 0x7f07054f

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    sget v7, Ljx2;->s:I

    .line 90
    .line 91
    const v8, 0x7f07054a

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    mul-int/2addr v8, v7

    .line 99
    sub-int/2addr v7, v4

    .line 100
    const v9, 0x7f07055d

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    mul-int/2addr v9, v7

    .line 108
    add-int/2addr v9, v8

    .line 109
    const v7, 0x7f070547

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    add-int/2addr v2, v6

    .line 117
    add-int/2addr v2, v9

    .line 118
    add-int/2addr v2, p2

    .line 119
    invoke-virtual {p1, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 120
    .line 121
    .line 122
    const p2, 0x7f0a03e9

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p2, Landroid/widget/GridView;

    .line 130
    .line 131
    new-instance v2, Lfw0;

    .line 132
    .line 133
    invoke-direct {v2, v4}, Lfw0;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-static {p2, v2}, Lj65;->o(Landroid/view/View;Lz2;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, Lnh2;->o0:Ldy;

    .line 140
    .line 141
    iget v2, v2, Ldy;->r:I

    .line 142
    .line 143
    new-instance v6, Lqi0;

    .line 144
    .line 145
    if-lez v2, :cond_1

    .line 146
    .line 147
    invoke-direct {v6, v2}, Lqi0;-><init>(I)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    invoke-direct {v6}, Lqi0;-><init>()V

    .line 152
    .line 153
    .line 154
    :goto_1
    invoke-virtual {p2, v6}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 155
    .line 156
    .line 157
    iget v0, v0, Lix2;->q:I

    .line 158
    .line 159
    invoke-virtual {p2, v0}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 163
    .line 164
    .line 165
    const p2, 0x7f0a03ec

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 173
    .line 174
    iput-object p2, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 175
    .line 176
    new-instance p2, Lkh2;

    .line 177
    .line 178
    invoke-direct {p2, p0, v5, v5}, Lkh2;-><init>(Lnh2;II)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 182
    .line 183
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 184
    .line 185
    .line 186
    iget-object p2, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 187
    .line 188
    const-string v0, "MONTHS_VIEW_GROUP_TAG"

    .line 189
    .line 190
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    new-instance p2, Llx2;

    .line 194
    .line 195
    iget-object v0, p0, Lnh2;->n0:Lze4;

    .line 196
    .line 197
    iget-object v2, p0, Lnh2;->o0:Ldy;

    .line 198
    .line 199
    new-instance v5, Lom1;

    .line 200
    .line 201
    const/4 v6, 0x6

    .line 202
    invoke-direct {v5, v6, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-direct {p2, p3, v0, v2, v5}, Llx2;-><init>(Landroid/view/ContextThemeWrapper;Lze4;Ldy;Lom1;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const v2, 0x7f0b003c

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    const v2, 0x7f0a03ef

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    iput-object v5, p0, Lnh2;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 234
    .line 235
    if-eqz v5, :cond_2

    .line 236
    .line 237
    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 238
    .line 239
    .line 240
    iget-object v5, p0, Lnh2;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 241
    .line 242
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 243
    .line 244
    invoke-direct {v6, v0, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Lnh2;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    new-instance v5, Lke5;

    .line 253
    .line 254
    invoke-direct {v5, p0}, Lke5;-><init>(Lnh2;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 258
    .line 259
    .line 260
    iget-object v0, p0, Lnh2;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 261
    .line 262
    new-instance v5, Llh2;

    .line 263
    .line 264
    invoke-direct {v5, p0}, Llh2;-><init>(Lnh2;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 268
    .line 269
    .line 270
    :cond_2
    const v0, 0x7f0a039c

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    if-eqz v5, :cond_3

    .line 278
    .line 279
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 284
    .line 285
    const-string v5, "SELECTOR_TOGGLE_TAG"

    .line 286
    .line 287
    invoke-virtual {v0, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    new-instance v5, Lar;

    .line 291
    .line 292
    const/4 v6, 0x5

    .line 293
    invoke-direct {v5, v6, p0}, Lar;-><init>(ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v5}, Lj65;->o(Landroid/view/View;Lz2;)V

    .line 297
    .line 298
    .line 299
    const v5, 0x7f0a039e

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    iput-object v5, p0, Lnh2;->u0:Landroid/view/View;

    .line 307
    .line 308
    const-string v7, "NAVIGATION_PREV_TAG"

    .line 309
    .line 310
    invoke-virtual {v5, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    const v5, 0x7f0a039d

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iput-object v5, p0, Lnh2;->v0:Landroid/view/View;

    .line 321
    .line 322
    const-string v7, "NAVIGATION_NEXT_TAG"

    .line 323
    .line 324
    invoke-virtual {v5, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    iput-object v2, p0, Lnh2;->w0:Landroid/view/View;

    .line 332
    .line 333
    const v2, 0x7f0a03e8

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    iput-object v2, p0, Lnh2;->x0:Landroid/view/View;

    .line 341
    .line 342
    invoke-virtual {p0, v4}, Lnh2;->j0(I)V

    .line 343
    .line 344
    .line 345
    iget-object v2, p0, Lnh2;->p0:Lix2;

    .line 346
    .line 347
    invoke-virtual {v2}, Lix2;->d()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 352
    .line 353
    .line 354
    iget-object v2, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 355
    .line 356
    new-instance v5, Lmh2;

    .line 357
    .line 358
    invoke-direct {v5, p0, p2, v0}, Lmh2;-><init>(Lnh2;Llx2;Lcom/google/android/material/button/MaterialButton;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->j(Lrw3;)V

    .line 362
    .line 363
    .line 364
    new-instance v2, Li4;

    .line 365
    .line 366
    invoke-direct {v2, v6, p0}, Li4;-><init>(ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, p0, Lnh2;->v0:Landroid/view/View;

    .line 373
    .line 374
    new-instance v2, Ljh2;

    .line 375
    .line 376
    invoke-direct {v2, p0, p2, v4}, Ljh2;-><init>(Lnh2;Llx2;I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, p0, Lnh2;->u0:Landroid/view/View;

    .line 383
    .line 384
    new-instance v2, Ljh2;

    .line 385
    .line 386
    invoke-direct {v2, p0, p2, v3}, Ljh2;-><init>(Lnh2;Llx2;I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 390
    .line 391
    .line 392
    :cond_3
    invoke-static {p3, v1}, Lxh2;->q0(Landroid/content/Context;I)Z

    .line 393
    .line 394
    .line 395
    move-result p3

    .line 396
    if-nez p3, :cond_4

    .line 397
    .line 398
    new-instance p3, Lxg0;

    .line 399
    .line 400
    invoke-direct {p3, v4}, Lxg0;-><init>(I)V

    .line 401
    .line 402
    .line 403
    iget-object v0, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 404
    .line 405
    invoke-virtual {p3, v0}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 406
    .line 407
    .line 408
    :cond_4
    iget-object p3, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 409
    .line 410
    iget-object v0, p0, Lnh2;->p0:Lix2;

    .line 411
    .line 412
    iget-object p2, p2, Llx2;->q:Ldy;

    .line 413
    .line 414
    iget-object p2, p2, Ldy;->n:Lix2;

    .line 415
    .line 416
    invoke-virtual {p2, v0}, Lix2;->e(Lix2;)I

    .line 417
    .line 418
    .line 419
    move-result p2

    .line 420
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 421
    .line 422
    .line 423
    iget-object p0, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 424
    .line 425
    new-instance p2, Lfw0;

    .line 426
    .line 427
    const/4 p3, 0x2

    .line 428
    invoke-direct {p2, p3}, Lfw0;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-static {p0, p2}, Lj65;->o(Landroid/view/View;Lz2;)V

    .line 432
    .line 433
    .line 434
    return-object p1
.end method

.method public final Q(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lnh2;->m0:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    iget-object v1, p0, Lnh2;->n0:Lze4;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 16
    .line 17
    iget-object v1, p0, Lnh2;->o0:Ldy;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "CURRENT_MONTH_KEY"

    .line 29
    .line 30
    iget-object p0, p0, Lnh2;->p0:Lix2;

    .line 31
    .line 32
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final h0(Lwh2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcg3;->l0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i0(Lix2;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llx2;

    .line 8
    .line 9
    iget-object v1, v0, Llx2;->q:Ldy;

    .line 10
    .line 11
    iget-object v1, v1, Ldy;->n:Lix2;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lix2;->e(Lix2;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lnh2;->p0:Lix2;

    .line 18
    .line 19
    iget-object v0, v0, Llx2;->q:Ldy;

    .line 20
    .line 21
    iget-object v0, v0, Ldy;->n:Lix2;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lix2;->e(Lix2;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sub-int v0, v1, v0

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x3

    .line 36
    if-le v2, v5, :cond_0

    .line 37
    .line 38
    move v2, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v2, v3

    .line 41
    :goto_0
    if-lez v0, :cond_1

    .line 42
    .line 43
    move v3, v4

    .line 44
    :cond_1
    iput-object p1, p0, Lnh2;->p0:Lix2;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    add-int/lit8 v0, v1, -0x3

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    new-instance v0, Lrq;

    .line 60
    .line 61
    invoke-direct {v0, v1, v5, p0}, Lrq;-><init>(IILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    iget-object p1, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    add-int/lit8 v0, v1, 0x3

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 78
    .line 79
    new-instance v0, Lrq;

    .line 80
    .line 81
    invoke-direct {v0, v1, v5, p0}, Lrq;-><init>(IILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    new-instance v0, Lrq;

    .line 89
    .line 90
    invoke-direct {v0, v1, v5, p0}, Lrq;-><init>(IILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final j0(I)V
    .locals 4

    .line 1
    iput p1, p0, Lnh2;->q0:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lnh2;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lnh2;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lke5;

    .line 22
    .line 23
    iget-object v3, p0, Lnh2;->p0:Lix2;

    .line 24
    .line 25
    iget v3, v3, Lix2;->p:I

    .line 26
    .line 27
    iget-object v0, v0, Lke5;->q:Lnh2;

    .line 28
    .line 29
    iget-object v0, v0, Lnh2;->o0:Ldy;

    .line 30
    .line 31
    iget-object v0, v0, Ldy;->n:Lix2;

    .line 32
    .line 33
    iget v0, v0, Lix2;->p:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    invoke-virtual {p1, v3}, Lmw3;->s0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lnh2;->w0:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lnh2;->x0:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lnh2;->u0:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lnh2;->v0:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x1

    .line 61
    if-ne p1, v0, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lnh2;->w0:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lnh2;->x0:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lnh2;->u0:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lnh2;->v0:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lnh2;->p0:Lix2;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lnh2;->i0(Lix2;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method
