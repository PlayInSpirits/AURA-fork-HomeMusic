.class public Lcom/eddyizm/tempus/ui/fragment/SearchFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/ae1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/d84;

.field public o0:Ldefpackage/li3;

.field public p0:Ldefpackage/vi;

.field public q0:Ldefpackage/s6;

.field public r0:Ldefpackage/ni4;

.field public s0:Ldefpackage/ej;

.field public t0:Ldefpackage/bl2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 22

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-virtual {v2}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v0, 0x7f0d0085

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    move-object/from16 v3, p2

    .line 18
    .line 19
    invoke-virtual {v1, v0, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f0a00c4

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    move-object v9, v3

    .line 31
    check-cast v9, Landroid/widget/TextView;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v9, :cond_3

    .line 35
    .line 36
    const v1, 0x7f0a00c7

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    move-object v10, v4

    .line 44
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    if-eqz v10, :cond_3

    .line 47
    .line 48
    const v1, 0x7f0a01ea

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    move-object v11, v4

    .line 56
    check-cast v11, Landroid/widget/LinearLayout;

    .line 57
    .line 58
    if-eqz v11, :cond_3

    .line 59
    .line 60
    const v1, 0x7f0a0536

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    move-object v12, v4

    .line 68
    check-cast v12, Landroid/widget/LinearLayout;

    .line 69
    .line 70
    if-eqz v12, :cond_3

    .line 71
    .line 72
    const v1, 0x7f0a0537

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    move-object v13, v4

    .line 80
    check-cast v13, Landroid/widget/LinearLayout;

    .line 81
    .line 82
    if-eqz v13, :cond_3

    .line 83
    .line 84
    const v1, 0x7f0a0539

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    move-object v14, v4

    .line 92
    check-cast v14, Lcom/google/android/material/search/SearchBar;

    .line 93
    .line 94
    if-eqz v14, :cond_3

    .line 95
    .line 96
    const v1, 0x7f0a0541

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    move-object v15, v4

    .line 104
    check-cast v15, Landroidx/recyclerview/widget/RecyclerView;

    .line 105
    .line 106
    if-eqz v15, :cond_3

    .line 107
    .line 108
    const v1, 0x7f0a0542

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    move-object/from16 v16, v4

    .line 116
    .line 117
    check-cast v16, Landroidx/recyclerview/widget/RecyclerView;

    .line 118
    .line 119
    if-eqz v16, :cond_3

    .line 120
    .line 121
    const v1, 0x7f0a0544

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    move-object/from16 v17, v4

    .line 129
    .line 130
    check-cast v17, Landroid/widget/LinearLayout;

    .line 131
    .line 132
    if-eqz v17, :cond_3

    .line 133
    .line 134
    const v1, 0x7f0a0545

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Landroidx/core/widget/NestedScrollView;

    .line 142
    .line 143
    if-eqz v4, :cond_3

    .line 144
    .line 145
    const v1, 0x7f0a0549

    .line 146
    .line 147
    .line 148
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    move-object/from16 v18, v4

    .line 153
    .line 154
    check-cast v18, Landroidx/recyclerview/widget/RecyclerView;

    .line 155
    .line 156
    if-eqz v18, :cond_3

    .line 157
    .line 158
    const v1, 0x7f0a054a

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    move-object/from16 v19, v4

    .line 166
    .line 167
    check-cast v19, Landroid/widget/LinearLayout;

    .line 168
    .line 169
    if-eqz v19, :cond_3

    .line 170
    .line 171
    const v1, 0x7f0a054f

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    move-object/from16 v20, v4

    .line 179
    .line 180
    check-cast v20, Lcom/google/android/material/search/SearchView;

    .line 181
    .line 182
    if-eqz v20, :cond_3

    .line 183
    .line 184
    const v1, 0x7f0a0550

    .line 185
    .line 186
    .line 187
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    move-object/from16 v21, v4

    .line 192
    .line 193
    check-cast v21, Landroid/widget/LinearLayout;

    .line 194
    .line 195
    if-eqz v21, :cond_3

    .line 196
    .line 197
    new-instance v7, Ldefpackage/ae1;

    .line 198
    .line 199
    move-object v8, v0

    .line 200
    check-cast v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 201
    .line 202
    invoke-direct/range {v7 .. v21}, Ldefpackage/ae1;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/google/android/material/search/SearchBar;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Lcom/google/android/material/search/SearchView;Landroid/widget/LinearLayout;)V

    .line 203
    .line 204
    .line 205
    iput-object v7, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 206
    .line 207
    invoke-virtual {v2}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {v0}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-static {v0, v4}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v5, Ldefpackage/bq4;

    .line 224
    .line 225
    invoke-direct {v5, v1, v4, v0}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 226
    .line 227
    .line 228
    const-class v0, Ldefpackage/d84;

    .line 229
    .line 230
    invoke-static {v0}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    const-string v4, "Local and anonymous classes can not be ViewModels"

    .line 239
    .line 240
    if-eqz v1, :cond_2

    .line 241
    .line 242
    const-string v7, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 243
    .line 244
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v5, v0, v1}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    check-cast v0, Ldefpackage/d84;

    .line 253
    .line 254
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->n0:Ldefpackage/d84;

    .line 255
    .line 256
    invoke-virtual {v2}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-static {v0}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    invoke-static {v0, v5}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v9, Ldefpackage/bq4;

    .line 273
    .line 274
    invoke-direct {v9, v1, v5, v0}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 275
    .line 276
    .line 277
    const-class v0, Ldefpackage/li3;

    .line 278
    .line 279
    invoke-static {v0}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    if-eqz v1, :cond_1

    .line 288
    .line 289
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v9, v0, v1}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, Ldefpackage/li3;

    .line 298
    .line 299
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 300
    .line 301
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 302
    .line 303
    iget-object v0, v0, Ldefpackage/ae1;->d:Landroid/view/View;

    .line 304
    .line 305
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 306
    .line 307
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 308
    .line 309
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 310
    .line 311
    .line 312
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 316
    .line 317
    .line 318
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 319
    .line 320
    iget-object v0, v0, Ldefpackage/ae1;->d:Landroid/view/View;

    .line 321
    .line 322
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 323
    .line 324
    const/4 v7, 0x1

    .line 325
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 326
    .line 327
    .line 328
    new-instance v0, Ldefpackage/vi;

    .line 329
    .line 330
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-direct {v0, v2, v1, v1}, Ldefpackage/vi;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 333
    .line 334
    .line 335
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->p0:Ldefpackage/vi;

    .line 336
    .line 337
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 338
    .line 339
    iget-object v1, v1, Ldefpackage/ae1;->d:Landroid/view/View;

    .line 340
    .line 341
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 342
    .line 343
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 344
    .line 345
    .line 346
    new-instance v0, Ldefpackage/xg0;

    .line 347
    .line 348
    invoke-direct {v0, v6}, Ldefpackage/xg0;-><init>(I)V

    .line 349
    .line 350
    .line 351
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 352
    .line 353
    iget-object v1, v1, Ldefpackage/ae1;->d:Landroid/view/View;

    .line 354
    .line 355
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 356
    .line 357
    invoke-virtual {v0, v1}, Ldefpackage/xg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 358
    .line 359
    .line 360
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 361
    .line 362
    iget-object v0, v0, Ldefpackage/ae1;->c:Landroid/view/View;

    .line 363
    .line 364
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 365
    .line 366
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 367
    .line 368
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 369
    .line 370
    .line 371
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 375
    .line 376
    .line 377
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 378
    .line 379
    iget-object v0, v0, Ldefpackage/ae1;->c:Landroid/view/View;

    .line 380
    .line 381
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 382
    .line 383
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 384
    .line 385
    .line 386
    new-instance v0, Ldefpackage/s6;

    .line 387
    .line 388
    invoke-direct {v0, v2}, Ldefpackage/s6;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 389
    .line 390
    .line 391
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->q0:Ldefpackage/s6;

    .line 392
    .line 393
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 394
    .line 395
    iget-object v1, v1, Ldefpackage/ae1;->c:Landroid/view/View;

    .line 396
    .line 397
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 398
    .line 399
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 400
    .line 401
    .line 402
    new-instance v0, Ldefpackage/xg0;

    .line 403
    .line 404
    invoke-direct {v0, v6}, Ldefpackage/xg0;-><init>(I)V

    .line 405
    .line 406
    .line 407
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 408
    .line 409
    iget-object v1, v1, Ldefpackage/ae1;->c:Landroid/view/View;

    .line 410
    .line 411
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 412
    .line 413
    invoke-virtual {v0, v1}, Ldefpackage/xg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 414
    .line 415
    .line 416
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 417
    .line 418
    iget-object v0, v0, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 419
    .line 420
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 421
    .line 422
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 423
    .line 424
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 425
    .line 426
    .line 427
    invoke-direct {v1, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 431
    .line 432
    .line 433
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 434
    .line 435
    iget-object v0, v0, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 436
    .line 437
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 438
    .line 439
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 440
    .line 441
    .line 442
    new-instance v0, Ldefpackage/ni4;

    .line 443
    .line 444
    invoke-virtual {v2}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    const/4 v4, 0x0

    .line 449
    const/4 v5, 0x0

    .line 450
    const/4 v3, 0x1

    .line 451
    invoke-direct/range {v0 .. v5}, Ldefpackage/ni4;-><init>(Ldefpackage/le1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V

    .line 452
    .line 453
    .line 454
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 455
    .line 456
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->t0:Ldefpackage/bl2;

    .line 457
    .line 458
    iput-object v1, v0, Ldefpackage/ni4;->A:Ldefpackage/bl2;

    .line 459
    .line 460
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 461
    .line 462
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 463
    .line 464
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    check-cast v0, Ljava/lang/String;

    .line 469
    .line 470
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 471
    .line 472
    iget-object v1, v1, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 473
    .line 474
    invoke-virtual {v1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    check-cast v1, Ljava/lang/Boolean;

    .line 479
    .line 480
    iget-object v3, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 481
    .line 482
    if-eqz v1, :cond_0

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    if-eqz v1, :cond_0

    .line 489
    .line 490
    move v6, v7

    .line 491
    :cond_0
    invoke-virtual {v3, v0, v6}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 492
    .line 493
    .line 494
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 495
    .line 496
    iget-object v0, v0, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 497
    .line 498
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 499
    .line 500
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 501
    .line 502
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 503
    .line 504
    .line 505
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 506
    .line 507
    iget-object v0, v0, Ldefpackage/ae1;->b:Landroid/view/ViewGroup;

    .line 508
    .line 509
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 510
    .line 511
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 512
    .line 513
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 514
    .line 515
    .line 516
    invoke-direct {v1, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 520
    .line 521
    .line 522
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 523
    .line 524
    iget-object v0, v0, Ldefpackage/ae1;->b:Landroid/view/ViewGroup;

    .line 525
    .line 526
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 527
    .line 528
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 529
    .line 530
    .line 531
    new-instance v0, Ldefpackage/ej;

    .line 532
    .line 533
    invoke-direct {v0, v2}, Ldefpackage/ej;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 534
    .line 535
    .line 536
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->s0:Ldefpackage/ej;

    .line 537
    .line 538
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 539
    .line 540
    iget-object v1, v1, Ldefpackage/ae1;->b:Landroid/view/ViewGroup;

    .line 541
    .line 542
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 543
    .line 544
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->i0()V

    .line 548
    .line 549
    .line 550
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 551
    .line 552
    iget-object v0, v0, Ldefpackage/ae1;->m:Landroid/view/View;

    .line 553
    .line 554
    check-cast v0, Lcom/google/android/material/search/SearchView;

    .line 555
    .line 556
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->getEditText()Landroid/widget/EditText;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    new-instance v1, Ldefpackage/zn1;

    .line 561
    .line 562
    invoke-direct {v1, v7, v2}, Ldefpackage/zn1;-><init>(ILjava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 566
    .line 567
    .line 568
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 569
    .line 570
    iget-object v0, v0, Ldefpackage/ae1;->m:Landroid/view/View;

    .line 571
    .line 572
    check-cast v0, Lcom/google/android/material/search/SearchView;

    .line 573
    .line 574
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->getEditText()Landroid/widget/EditText;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    new-instance v1, Ldefpackage/pn1;

    .line 579
    .line 580
    const/4 v3, 0x2

    .line 581
    invoke-direct {v1, v3, v2}, Ldefpackage/pn1;-><init>(ILjava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 585
    .line 586
    .line 587
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 588
    .line 589
    iget-object v0, v0, Ldefpackage/ae1;->m:Landroid/view/View;

    .line 590
    .line 591
    check-cast v0, Lcom/google/android/material/search/SearchView;

    .line 592
    .line 593
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->l()V

    .line 594
    .line 595
    .line 596
    return-object v8

    .line 597
    :cond_1
    invoke-static {v4}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    return-object v3

    .line 601
    :cond_2
    invoke-static {v4}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    return-object v3

    .line 605
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    const-string v1, "Missing required view with ID: "

    .line 614
    .line 615
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {v0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    return-object v3
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 6
    .line 7
    return-void
.end method

.method public final P()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->t0:Ldefpackage/bl2;

    .line 9
    .line 10
    iput-object p0, v0, Ldefpackage/ni4;->A:Ldefpackage/bl2;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final R()V
    .locals 10

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
    move-result-object v1

    .line 14
    new-instance v4, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const-class v6, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v1, v4}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

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
    iget-object v1, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 45
    .line 46
    invoke-interface {v1}, Ldefpackage/bb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    new-instance v1, Ldefpackage/xc5;

    .line 53
    .line 54
    new-instance v8, Ldefpackage/x7;

    .line 55
    .line 56
    invoke-direct {v8, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v9, Ldefpackage/fi0;

    .line 60
    .line 61
    invoke-direct {v9, v8}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x4

    .line 65
    invoke-direct {v1, v8, v9}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v1, 0x0

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
    new-instance v2, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v2, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v2}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->t0:Ldefpackage/bl2;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 88
    .line 89
    invoke-static {v7, v1}, Ldefpackage/bo2;->j(Ldefpackage/bl2;Ldefpackage/li3;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 93
    .line 94
    iget-object v1, v1, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 95
    .line 96
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    new-instance v3, Ldefpackage/k74;

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    invoke-direct {v3, p0, v4}, Ldefpackage/k74;-><init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 110
    .line 111
    iget-object v1, v1, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 112
    .line 113
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    new-instance v3, Ldefpackage/k74;

    .line 118
    .line 119
    invoke-direct {v3, p0, v0}, Ldefpackage/k74;-><init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->t0:Ldefpackage/bl2;

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

.method public final h0(Ljava/lang/String;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->n0:Ldefpackage/d84;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/d84;->c:Ldefpackage/rm2;

    .line 13
    .line 14
    new-instance v1, Lcom/eddyizm/tempus/model/RecentSearch;

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    const-wide/16 v4, 0x3e8

    .line 21
    .line 22
    div-long/2addr v2, v4

    .line 23
    invoke-direct {v1, p1, v2, v3}, Lcom/eddyizm/tempus/model/RecentSearch;-><init>(Ljava/lang/String;J)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Ldefpackage/e84;

    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ldefpackage/jv3;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, v0, v1, v3}, Ldefpackage/e84;-><init>(Ldefpackage/jv3;Lcom/eddyizm/tempus/model/RecentSearch;I)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljava/lang/Thread;

    .line 37
    .line 38
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 45
    .line 46
    iget-object v0, v0, Ldefpackage/ae1;->a:Landroid/widget/TextView;

    .line 47
    .line 48
    iget-object v1, p0, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const v2, 0x7f130448

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->s0:Ldefpackage/ej;

    .line 65
    .line 66
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ldefpackage/ej;->p(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 72
    .line 73
    iget-object v0, v0, Ldefpackage/ae1;->l:Landroid/view/View;

    .line 74
    .line 75
    check-cast v0, Lcom/google/android/material/search/SearchBar;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lcom/google/android/material/search/SearchBar;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 81
    .line 82
    iget-object v0, v0, Ldefpackage/ae1;->m:Landroid/view/View;

    .line 83
    .line 84
    check-cast v0, Lcom/google/android/material/search/SearchView;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->g()V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->n0:Ldefpackage/d84;

    .line 90
    .line 91
    iget-object v0, v0, Ldefpackage/d84;->c:Ldefpackage/rm2;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v0, Ldefpackage/k03;

    .line 97
    .line 98
    invoke-direct {v0}, Ldefpackage/ad2;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, Ldefpackage/ur2;

    .line 106
    .line 107
    const/16 v3, 0x14

    .line 108
    .line 109
    invoke-direct {v2, v3, p1, p0}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v3, v2, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 121
    .line 122
    if-nez v3, :cond_1

    .line 123
    .line 124
    new-instance v3, Ldefpackage/hd5;

    .line 125
    .line 126
    invoke-direct {v3, v2}, Ldefpackage/hd5;-><init>(Ldefpackage/pn4;)V

    .line 127
    .line 128
    .line 129
    iput-object v3, v2, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 130
    .line 131
    :cond_1
    iget-object v4, v2, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 132
    .line 133
    const/16 v8, 0x14

    .line 134
    .line 135
    const/16 v9, 0x14

    .line 136
    .line 137
    const/16 v6, 0x14

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    move-object v5, p1

    .line 141
    invoke-virtual/range {v4 .. v9}, Ldefpackage/hd5;->m(Ljava/lang/String;IIII)Lretrofit2/Call;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v2, Ldefpackage/ck;

    .line 146
    .line 147
    const/4 v3, 0x2

    .line 148
    invoke-direct {v2, v0, v3}, Ldefpackage/ck;-><init>(Ldefpackage/k03;I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    new-instance v2, Ldefpackage/k74;

    .line 159
    .line 160
    const/4 v3, 0x3

    .line 161
    invoke-direct {v2, p0, v3}, Ldefpackage/k74;-><init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 165
    .line 166
    .line 167
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 168
    .line 169
    iget-object p0, p0, Ldefpackage/ae1;->i:Landroid/view/View;

    .line 170
    .line 171
    check-cast p0, Landroid/widget/LinearLayout;

    .line 172
    .line 173
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final i0()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->n0:Ldefpackage/d84;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Ldefpackage/d84;->c:Ldefpackage/rm2;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v3, Ldefpackage/lg1;

    .line 31
    .line 32
    iget-object v0, v0, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ldefpackage/jv3;

    .line 35
    .line 36
    invoke-direct {v3, v0}, Ldefpackage/lg1;-><init>(Ldefpackage/jv3;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/lang/Thread;

    .line 40
    .line 41
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 45
    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 48
    .line 49
    .line 50
    iget-object v0, v3, Ldefpackage/lg1;->p:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v2, 0x0

    .line 68
    move v3, v2

    .line 69
    :goto_1
    if-ge v3, v0, :cond_0

    .line 70
    .line 71
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    iget-object v5, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 80
    .line 81
    iget-object v5, v5, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 82
    .line 83
    check-cast v5, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 94
    .line 95
    iget-object v6, v6, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 96
    .line 97
    check-cast v6, Landroid/widget/LinearLayout;

    .line 98
    .line 99
    const v7, 0x7f0d00b7

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v7, v6, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const v6, 0x7f0a054d

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Landroid/widget/ImageView;

    .line 114
    .line 115
    const v7, 0x7f0a054e

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    check-cast v7, Landroid/widget/TextView;

    .line 123
    .line 124
    const v8, 0x7f0a054c

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    check-cast v8, Landroid/widget/ImageView;

    .line 132
    .line 133
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    const v10, 0x7f080152

    .line 138
    .line 139
    .line 140
    const/4 v11, 0x0

    .line 141
    invoke-virtual {v9, v10, v11}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v6, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    new-instance v6, Ldefpackage/l74;

    .line 152
    .line 153
    invoke-direct {v6, p0, v4, v2}, Ldefpackage/l74;-><init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    .line 158
    .line 159
    new-instance v6, Ldefpackage/l74;

    .line 160
    .line 161
    const/4 v7, 0x1

    .line 162
    invoke-direct {v6, p0, v4, v7}, Ldefpackage/l74;-><init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    .line 167
    .line 168
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 169
    .line 170
    iget-object v4, v4, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 171
    .line 172
    check-cast v4, Landroid/widget/LinearLayout;

    .line 173
    .line 174
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_0
    return-void
.end method

.method public final onAlbumClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a009f

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

.method public final onAlbumLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a009b

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

.method public final onArtistClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a00e2

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

.method public final onArtistLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a00df

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

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->t0:Ldefpackage/bl2;

    .line 2
    .line 3
    const-string v1, "TRACKS_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "ITEM_POSITION"

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v0, v1, p1}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 19
    .line 20
    invoke-virtual {p1}, Ldefpackage/dw3;->d()V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ldefpackage/au;

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    invoke-virtual {p0, p1}, Ldefpackage/au;->d(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final onMediaLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a0595

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

.method public final onPlaylistClick(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "PLAYLIST_OBJECT"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->t0:Ldefpackage/bl2;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;->getEntries()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p0, p1, v0}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onPlaylistLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a049d

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
